import org.antlr.v4.runtime.*;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.Rule;

import javax.print.DocFlavor;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;

public class Listener extends TinyBaseListener {
    //l objet table pour pouvoir ajouter dans la ts
    private TS table = new TS();
    public int nberreur;
    //table de hashage pour pouvoir range le type et la regle
    private HashMap<ParserRuleContext,Integer> Ruletype = new HashMap<>();
    LinkedList<String> erreur = new LinkedList<>();
    //elle nous permet de parcourir l'arbre et a chaque regle on fait un traitement
    //ajout dans la ts par exemple
    //exitdv parceque je doit recuperer le type 0 si float et 1  sinon
    public void exitProgram(TinyParser.ProgramContext ctx) {

        if(erreur.size() == 0)
        {   nberreur = 0;
            System.out.println("\t \t la table des symboles \n");
            System.out.println("\t IDF \t Type");
            table.afficheTS();
        }
        else
        { int j;
         System.out.println("\n\t\t les différentes erreurs de votre programme \n");
            nberreur = erreur.size();
            for(j=0;j<erreur.size();j++)
            {
                System.out.println(erreur.get(j));
            }
        }

    }
   public void exitDv(TinyParser.DvContext ctx) {
        int k;
        TinyParser.TypeContext var = ctx.type();
        if (var.getText().equals("intcompil")) {
            k = 1; // intcompil = 1

        } else {
            k = 2; // floatcompil=2
        }
       TinyParser.PContext vars= ctx.p();
        String nom = vars.getText();
        //cette instruction c pour les double declaration
       String Tab[]=nom.split(",");

        int i;
        for(i=0;i<Tab.length;i++) {

            if(!table.containsElement(Tab[i]))
            {
                table.addElement(new TS.Element(new TS.Element(Tab[i],k)));

            }
            else {
                erreur.add("Erreur double declaration de la variable " + Tab[i]);
            }
        }
    }
    //affectation
    public void exitAff(TinyParser.AffContext ctx) {
        //aff : IDF '=' oprt ';' ;
        //on verifie si IDF a etait saisi
        if(ctx.IDF() != null) {
            if (!table.containsElement(ctx.IDF().getText())) {
                //on verifie si l'identificateur existe dans la TS si on ajouter dans la liste erreur
                //la variable n'est pas declarer
                erreur.add("Ereeur la variable " + ctx.IDF().getText() + " n'est pas declaree");
            } else {
              //dans le cas ou la variable et declarer on verifie le type de l'idf et la variable affecter
                //on recuperer le type de la variable de la table de hachage Ruletype
                if ((table.getElement(ctx.IDF().getText()).type) != (Ruletype.get(ctx.oprt()))) {
                    String typevar;//juste pour l'affichage
                    if(Ruletype.get(ctx.oprt())== 1)
                        typevar =" int";
                    else
                        typevar = "float";
                    erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.IDF().getText())+ " et la variable "+ctx.oprt().getText()+" type :"+typevar);
                }
            }
        }

    }
 //oprt4 : '(' oprt ')' | IDF | NBINT | NBFLOAT
    public void exitOprt4(TinyParser.Oprt4Context ctx) {
        //verifier si c est IDF qui est inserer
        //verifier si il est declarer
        //sinon ajouter cette idf et son types dans Ruletype
        if(ctx.IDF()!=null) {
            if (!table.containsElement(ctx.IDF().getText())) {
                erreur.add(" la variable " + ctx.IDF().getText() + " n'est pas declaree");
            } else {
                Ruletype.put(ctx, table.getElement(ctx.IDF().getText()).type); } }
        else
            //si c'est un float alors ajouter ce float avec type 2 dans Ruletype
        if (ctx.NBFLOAT() != null) {
            Ruletype.put(ctx, 2);
        }
        else  //si c'est un int alors ajouter cet entier avec type 1 dans Ruletype
        if (ctx.NBINT() != null) {
            Ruletype.put(ctx, 1);
        }
        else // sinon c oprt donc il faut ajouter son contexte et recupere son type dans
            //Ruletype car surement il a etait devellope avant
        {
            Ruletype.put(ctx,Ruletype.get(ctx.oprt()));
        }
    }
    //oprt3 : oprt3 '/' oprt4 | oprt4
    public void exitOprt3(TinyParser.Oprt3Context ctx) {
        if(ctx.oprt3() == null)
        {
            Ruletype.put(ctx,Ruletype.get(ctx.oprt4()));
        }
        else { //il faut verifier si le diviseur n'est pas 0
            if(ctx.oprt4().getText().equals("0"))
            {
                erreur.add("Erreur semantique : division par 0");
            }//recuperer les types dans le hashmap et les comparer
            if ((Ruletype.get(ctx.oprt3())) == (Ruletype.get(ctx.oprt4()))) {
                //sauvegarder le type dans Ruletype
                    Ruletype.put(ctx, Ruletype.get(ctx.oprt3())); }
                else {
                    String typevar; //pour l'affichage
                    if(Ruletype.get(ctx.oprt4())== 1)
                        typevar =" int";
                    else
                        typevar = "float";
                    //les types ne sont pas compatible ajouter une erreur dans la liste des erreur
                //et ajouter dans le hashmap 0 pour savoir que c pas compatible
                    erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.oprt3().getText())+" et la variable "+ctx.oprt4().getText()+" type :"+typevar);
                    Ruletype.put(ctx, 0);

            }
        }
    }
    //oprt2 : oprt2 '*' oprt3 | oprt3
    public void exitOprt2(TinyParser.Oprt2Context ctx) {
         //si dans le cas oprt2 == null donc c le deuxiéme fils de la regle qui est derivé
        //comme ce n'est pas une operation on l'ajouter directe avec son type dans Ruletype(oprt3)
        if(ctx.oprt2() == null)
        {
            Ruletype.put(ctx,Ruletype.get(ctx.oprt3()));
        }
        else
        { //dans le cas c une operation de multiplication on verifie la compatibilité des types
            if((Ruletype.get(ctx.oprt2())) == (Ruletype.get(ctx.oprt3())))
            {
                Ruletype.put(ctx,Ruletype.get(ctx.oprt3()));
            }
            else
            {
                erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.oprt2().getText())+" et la variable "+ctx.oprt3().getText()+" type :");
                Ruletype.put(ctx,0);//on ajouter le ctx et le 0 dans le cas c'est pas compatible
            }
        }
    }
    public void exitOprtf(TinyParser.OprtfContext ctx) {

        if(Ruletype.get(ctx.getChild(0)) != Ruletype.get(ctx.getChild(2)))
        {
            String typevar1;
            if(Ruletype.get(ctx.getChild(0))== 1)
             typevar1 =" int";

            else
                typevar1 = "float";



            erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.getChild(0).getText())+" et la variable "+ctx.getChild(2).getText()+" type :"+typevar1);
        }
    }
    //read : 'scancompil' '(' IDF ',' IDF  ')' ';' x ;
    public void exitRead(TinyParser.ReadContext ctx) {
        if(table.getElement(ctx.getChild(2).getText())==null)
        { //verifier si les identificateurs sont declarer
            erreur.add("Erreur la variable "+ ctx.getChild(2).getText()+" n'est pas declarée");
        }
        if(table.getElement(ctx.getChild(4).getText())==null)
        {
            erreur.add("Erreur la variable "+ ctx.getChild(4).getText()+" n'est pas declarée");
        }
    }
    //ooprt1 : oprt1 '-' oprt2 |oprt2 ;
    public void exitOprt1(TinyParser.Oprt1Context ctx) {
        if(ctx.oprt1() == null) //dans le cas ou se n'est pas la soustraction
        {
            Ruletype.put(ctx,Ruletype.get(ctx.oprt2()));
        }
        else
        {
            if((Ruletype.get(ctx.oprt2())) == (Ruletype.get(ctx.oprt1())))
            { //l'operation rencontrer c la soustraction vrification des type et la sauvegarde
                Ruletype.put(ctx,Ruletype.get(ctx.oprt2()));
            }
            else
            {  String typevar;
                if(Ruletype.get(ctx.oprt2())== 1)
                    typevar =" int";
                else
                    typevar = "float";
                erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.oprt1().getText())+" et la variable"+ctx.oprt2().getText()+"type :"+typevar);
             Ruletype.put(ctx,0);}
        }
    }
    //oprt : oprt '+' oprt1 | oprt1
    public void exitOprt(TinyParser.OprtContext ctx) {
        if(ctx.oprt() == null) // dans le cas c pas l'operation d'addition
        {
            Ruletype.put(ctx,Ruletype.get(ctx.oprt1()));
        }
        else
        {  //c est une addition verification des type
            if((Ruletype.get(ctx.oprt())) == (Ruletype.get(ctx.oprt1())))
            {
                Ruletype.put(ctx,Ruletype.get(ctx.oprt1()));

            }
            else //les type ne sont pas compatible l'ajout du ctx dans Ruletype avec type 0
            {   String typevar;
                if(Ruletype.get(ctx.oprt1())== 1)
                    typevar =" int";
                else
                    typevar = "float";
                erreur.add("Incompatibilité des types de la variable "+table.getElement(ctx.oprt1().getText())+" et la variable "+ctx.oprt().getText()+" type :"+typevar);
                Ruletype.put(ctx,0);}
        }

    }
//write : 'printcompil' '(' t ')' ';' dp | 'printcompil' '('  t  ')' ';'   	;
    public void exitWrite(TinyParser.WriteContext ctx) {
        if(ctx.t().IDF()!=null) {
            //si c un idf qui va etre afficher c est pas une chaine de caractére on verifie s'il est declarée
            if (!table.containsElement(ctx.t().getText())) {
                erreur.add("Erreur la variable " + ctx.t().getText() + " n'est pas declaree");
            }
        }
    }

        }

 /* public void exitOprt3(TinyParser.Oprt3Context ctx) {
        /*oprt3 : '(' oprt ')' | IDF | NBINT | NBFLOAT 	 ;
       if(ctx.IDF()!=null) {
           if (!table.containsElement(ctx.IDF().getText())) {
               erreur.add(" la variable" + ctx.IDF().getText() + " n'a pas etait declarer");
           } else { // System.out.println("idffff ");
               //System.out.println(ctx.IDF());
               Ruletype.put(ctx, table.getElement(ctx.IDF().getText()).type);
               //Ruletype.put(ctx.IDF().getText(),table.getElement(ctx.IDF().getText()).type);
           }
       }
     else
           if (ctx.NBFLOAT() != null) {    //System.out.println("float   ");
               //System.out.println(ctx.NBFLOAT());
               Ruletype.put(ctx, 2);
           }
       else
           if (ctx.NBINT() != null) {  // System.out.println("entier   ");
               //System.out.println(ctx.NBINT());
               Ruletype.put(ctx, 1);
           }
           else
           {
               Ruletype.put(ctx,Ruletype.get(ctx.oprt()));
           }


    }
    //oprt2 : oprt2 / oprt3 | oprt3 a = 3/2
    public void exitOprt2(TinyParser.Oprt2Context ctx){
       // System.out.println(ctx.oprt3().getText());
     if(ctx.oprt2() == null)
     {
      Ruletype.put(ctx,Ruletype.get(ctx.oprt3()));
     }
     else
     {
         if((Ruletype.get(ctx.oprt3())) == (Ruletype.get(ctx.oprt2())))
         {
           // System.out.println(ctx.oprt2().getText());
             Ruletype.put(ctx,Ruletype.get(ctx.oprt3()));

         }
         else
             erreur.add("Erreur incompatibilite des types");
     }
     }

         //System.out.println(ctx.getText());
//            int type1 = Ruletype.get(ctx.oprt3());
  //          System.out.println(type1);

        /*Set cle = Ruletype.keySet();
        Iterator it =cle.iterator();
         while(it.hasNext())
         {
             Object clee = it.next();
             Object valeur = Ruletype.get(clee);
             System.out.println(clee+" , "+valeur);
         }*/




