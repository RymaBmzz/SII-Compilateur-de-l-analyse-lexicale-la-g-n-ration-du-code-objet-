// Generated from C:/Users/Litissia/IdeaProjects/TinyLanguage\Tiny.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TinyParser}.
 */
public interface TinyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TinyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TinyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TinyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#dv}.
	 * @param ctx the parse tree
	 */
	void enterDv(TinyParser.DvContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#dv}.
	 * @param ctx the parse tree
	 */
	void exitDv(TinyParser.DvContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(TinyParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(TinyParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TinyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TinyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#dp}.
	 * @param ctx the parse tree
	 */
	void enterDp(TinyParser.DpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#dp}.
	 * @param ctx the parse tree
	 */
	void exitDp(TinyParser.DpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(TinyParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(TinyParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(TinyParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(TinyParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(TinyParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(TinyParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(TinyParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(TinyParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#inif}.
	 * @param ctx the parse tree
	 */
	void enterInif(TinyParser.InifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#inif}.
	 * @param ctx the parse tree
	 */
	void exitInif(TinyParser.InifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#sinon}.
	 * @param ctx the parse tree
	 */
	void enterSinon(TinyParser.SinonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#sinon}.
	 * @param ctx the parse tree
	 */
	void exitSinon(TinyParser.SinonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#oprtf}.
	 * @param ctx the parse tree
	 */
	void enterOprtf(TinyParser.OprtfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#oprtf}.
	 * @param ctx the parse tree
	 */
	void exitOprtf(TinyParser.OprtfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 */
	void enterAff(TinyParser.AffContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 */
	void exitAff(TinyParser.AffContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#oprt}.
	 * @param ctx the parse tree
	 */
	void enterOprt(TinyParser.OprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#oprt}.
	 * @param ctx the parse tree
	 */
	void exitOprt(TinyParser.OprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#oprt1}.
	 * @param ctx the parse tree
	 */
	void enterOprt1(TinyParser.Oprt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#oprt1}.
	 * @param ctx the parse tree
	 */
	void exitOprt1(TinyParser.Oprt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#oprt2}.
	 * @param ctx the parse tree
	 */
	void enterOprt2(TinyParser.Oprt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#oprt2}.
	 * @param ctx the parse tree
	 */
	void exitOprt2(TinyParser.Oprt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#oprt3}.
	 * @param ctx the parse tree
	 */
	void enterOprt3(TinyParser.Oprt3Context ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#oprt3}.
	 * @param ctx the parse tree
	 */
	void exitOprt3(TinyParser.Oprt3Context ctx);
	/**
	 * Enter a parse tree produced by {@link TinyParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(TinyParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TinyParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(TinyParser.CommentContext ctx);
}