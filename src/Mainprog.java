import com.sun.corba.se.impl.orb.ParserTable;
import org.antlr.v4.gui.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.print.PrintException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
public class Mainprog
{
    public static void main(String[] args) throws Exception
    {
        String inputFile=null;
        if(args.length>0){

            inputFile=args[3];
        }
        InputStream is=System.in;
        if(inputFile!=null)
        {
            is=new FileInputStream(inputFile);
        }
        CharStream input=new UnbufferedCharStream(is);
        TinyLexer lex=new TinyLexer(input);
        lex.setTokenFactory(new CommonTokenFactory(true));
        //POUR RECUPERER les entitées lexicales
        TokenStream tokens =new UnbufferedTokenStream<CommonToken>(lex);
        //instanciation de la classe parser avec les tokens reconnu
        TinyParser parser=new TinyParser(tokens);
        //realisation d'un arbre syntaxique avec les tokens
        //program represente la premiere regle de la grammaire
        ParseTree tree = parser.program();
        //affichage de l'arbre a l'execution
        Trees.inspect(tree,parser);
        ParseTreeWalker walker = new ParseTreeWalker();
        //instanciation de la classe listener la classe des routines semantiques
        Listener list = new Listener();
        walker.walk(list,tree);
        if(list.nberreur == 0) {
            //nberreur si pas d'erreurs semantiques, on affiche les quadruplets sinon on les affiche pas
            //instanciation de la classe quadruplets
            Quadruplet p = new Quadruplet();
            parser.addParseListener(p);
            ParseTreeWalker walker2 = new ParseTreeWalker();
            walker2.walk(p, tree);
            //instanciation de la classe code Objet et l'execution des ses methodes
            CodeObjet cod = new CodeObjet(p.quad);
            cod.CObjet();
            cod.affiche();
        }

    }
}

