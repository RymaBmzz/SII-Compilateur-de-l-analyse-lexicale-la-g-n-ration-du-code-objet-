import org.antlr.v4.runtime.*;
import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.tool.Rule;

import javax.print.DocFlavor;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;
public class ElementQuadd
{
   String opt;
   String op1;
   String op2;
   String res;
    public ElementQuadd(){ this.op1 = null; this.op2=null; this.res=null; this.opt=null;}

    public ElementQuadd(String s1,String s2,String s3,String s4)
    { opt = s1;op1 = s2;op2 = s3;res = s4; }
    public String getopt()
    { return opt; }
    public String getop1()
    {
        return op1;
    }
    public String getop2()
    {
        return op2;
    }
    public String getres()
    {
        return res;
    }
    public void setQuad(int x, String s)
    {
       // x = 1 c opt
        if(x == 1)
        { opt = s; }
        //x=2 c op1
        if(x == 2)
            op1 = s;
        //x=3 c op2
        if(x == 3)
            op2 = s;
        //x=4 c res
        if(x == 4)
            res = s;
    }
    public String toString()
    {
        return "("+opt+","+op1+","+op2+","+res+")";
    }
}

