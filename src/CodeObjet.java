import java.util.*;
import java.util.LinkedList;
import java.io.File;
import  java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CodeObjet {
    ListQuad Qd;
    LinkedList<String> Code = new LinkedList<>();
    public CodeObjet(ListQuad qd)
    {
        this.Qd = qd;
    }
   public void CObjet ()
   {   // parcourir toute la liste du Quadruplet pour pouvoir generer le code OBjet de chaque element de ses quad
       int i;
       for(i=0;i<Qd.size();i++)
       {  //pour l'addition
           if(Qd.getQuad(i).getopt().equals("+"))
       {
           Code.add("Mov Ax ,"+Qd.getQuad(i).getop1());
           Code.add("Add Ax ,"+Qd.getQuad(i).getop2());
           Code.add("Mov "+Qd.getQuad(i).getres()+", Ax");
       }
       //la soustraction
           if(Qd.getQuad(i).getopt().equals("-"))
           {
               Code.add("Mov Ax ,"+Qd.getQuad(i).getop1());
               Code.add("Sub Ax ,"+Qd.getQuad(i).getop2());
               Code.add("Mov "+Qd.getQuad(i).getres()+", Ax");
           }
       //la multiplication
           if(Qd.getQuad(i).getopt().equals("*"))
           {
               Code.add("Mov Ax ,"+Qd.getQuad(i).getop1());
               Code.add("Mul Ax ,"+Qd.getQuad(i).getop2());
               Code.add("Mov "+Qd.getQuad(i).getres()+", Ax");
           }
       //division
           if(Qd.getQuad(i).getopt().equals("/"))
           {
               Code.add("Mov Ax ,"+Qd.getQuad(i).getop1());
               Code.add("Div Ax ,"+Qd.getQuad(i).getop2());
               Code.add("Mov "+Qd.getQuad(i).getres()+", Ax");
           }
       //affectation on affecte dirrectement sans passer par le registre ax
           if(Qd.getQuad(i).getopt().equals("="))
           {
               Code.add("Mov "+Qd.getQuad(i).getres()+","+Qd.getQuad(i).getop2());

           }
           //les branchements : "jump"
           if(Qd.getQuad(i).getopt().equals("BR"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BG"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BGE"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BL"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BLE"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BE"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
           if(Qd.getQuad(i).getopt().equals("BNE"))
           {
               Code.add("Jump "+Qd.getQuad(i).getop1());

           }
       }

   }
   //affichage des quadruplet
    public void affiche(){
        int j;
        File fichier =new File("C:\\Users\\Litissia\\IdeaProjects\\TinyLanguage\\code.txt");
        try {
            try(BufferedWriter writee = new BufferedWriter(new FileWriter(fichier)))
            {  for(j = 0;j<Code.size();j++) {
                writee.write(Code.get(j));
                writee.newLine();
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\t\t Le Code Objet \t ");
        for(int i=0;i<Code.size();i++)
        {
            System.out.println(Code.get(i));

        }
    }
  }
