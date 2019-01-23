import org.antlr.v4.runtime.*;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.Rule;
import javax.print.DocFlavor;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
public class Quadruplet extends TinyBaseListener
{   Stack <String> pile = new Stack<>(); ListQuad quad = new ListQuad();
    String temp; int cpt =0;
    //quadruplet de affectation
    public void exitProgram(TinyParser.ProgramContext ctx)
    {   System.out.println("\n \t\t les Quadruplets \t");
        quad.AfficheQuand();
    }
    public void exitAff(TinyParser.AffContext ctx) {
        if(ctx.IDF() != null)
        {
            String s = pile.pop();
            //pour affiche temp1,temp2......
            quad.ajoutquad("="," " ,s,ctx.IDF().getText());

        }
    }
    public void exitOprt4(TinyParser.Oprt4Context ctx) {
        if(ctx.oprt() == null)
        {   //dans ce cas c un operande donc on l'empile
           pile.push(ctx.getText());
        }
    }
    public void exitOprt3(TinyParser.Oprt3Context ctx) {

        if (ctx.oprt3() != null) { //on depile les deux elements premier de la pile
            String s1 = pile.pop();
            String s2 = pile.pop();
            cpt = cpt +1;
            temp = "temp"+cpt ;//pour affiche temp1,temp2......
            quad.ajoutquad("/", s1, s2, temp);//generation du quadruplets
            pile.push(temp);//empiler temporarire dans le cas ou on va l'utiliser
        }
    }
    public void exitOprt2(TinyParser.Oprt2Context ctx) {
        if(ctx.oprt2() != null)
        {//empiler les deux operandes
        String s1 = pile.pop();
        String s2 = pile.pop();
            cpt = cpt +1;
            temp = "temp"+cpt ;//pour affiche temp1,temp2......
        quad.ajoutquad("*",s1,s2,temp);//generation des quadruplets
            pile.push(temp);
    }}
    public void exitOprt1(TinyParser.Oprt1Context ctx) {
        if(ctx.oprt1()!=null)
        {//empiler les deux operandes
        String s1 = pile.pop();
        String s2 = pile.pop();
        cpt = cpt +1;
        temp = "temp"+cpt ;//pour affiche temp1,temp2......
        quad.ajoutquad("-",s1,s2,temp);
            pile.push(temp);
    }}
    public void exitOprt(TinyParser.OprtContext ctx) {
        if(ctx.oprt()!= null)
        {//empiler les deux operandes
        String s1 = pile.pop();
        String s2 = pile.pop();
            cpt = cpt +1;
            temp = "temp"+cpt ;//pour affiche temp1,temp2......
        quad.ajoutquad("+",s1,s2,temp);
            pile.push(temp);
    }}
    int sauvcaud;
    /*cond : 'if' '(' oprtf ')' 'then' inif sinon  	;
inif : dp | oprt 		;
sinon : els inif 'endif' ';' | 'endif' ';'  		;
els : 'else' ;
oprtf : oprt op oprt 	;
op:'>'|'<'| '>=' |'<='|'!='|'=' ;*/
    public void exitOprtf(TinyParser.OprtfContext ctx) {
        String s1 = pile.pop();//empiler les deux operandes
        String s2 = pile.pop();
        // on se branche dans else condition non verifier
        //sauvegarder la position du quadruplet
        if(ctx.op().getText().equals(">"))//BG
        {
          quad.ajoutquad("BLE"," ",s2,s1);
            sauvcaud = quad.qd;
        }
        if(ctx.op().getText().equals("<"))//BL
        {
          quad.ajoutquad("BGE"," ",s2,s1);
            sauvcaud = quad.qd;
        }
        if(ctx.op().getText().equals(">="))//BGE
        {
            quad.ajoutquad("BG"," ",s2,s1);
            sauvcaud = quad.qd;
        }
        if(ctx.op().getText().equals("<="))//BLE
        {
            quad.ajoutquad("BL"," ",s2,s1);
            sauvcaud = quad.qd;
        }
        if(ctx.op().getText().equals("!="))
        {
            quad.ajoutquad("BE"," ",s2,s1);
            sauvcaud = quad.qd;
        }
        if(ctx.op().getText().equals("="))
        {
            quad.ajoutquad("BNE"," ",s2,s1);
            sauvcaud = quad.qd;
        }
    }
    int quadelse;
    public void exitEls(TinyParser.ElsContext ctx) {
        quad.ajoutquad("BR","","","");
        quadelse = quad.qd;
    }
    public void exitSinon(TinyParser.SinonContext ctx) {
        if(ctx.els() == null)
        {
            quadelse = quad.qd; //recuperer la position du else

        }
        else {
       //mettre à jour le quadruplet
            quad.getQuad(quadelse-1).setQuad(2,""+(quad.size()+1));
        }

    }
    public void exitCond(TinyParser.CondContext ctx) {
       //mettre a jours
   quad.getQuad(sauvcaud-1).setQuad(2,""+(quadelse+1));
    }

}
