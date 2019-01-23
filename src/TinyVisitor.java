// Generated from C:/Users/Litissia/IdeaProjects/TinyLanguage\Tiny.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TinyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TinyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TinyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TinyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#dv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDv(TinyParser.DvContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(TinyParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TinyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#dp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDp(TinyParser.DpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(TinyParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(TinyParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(TinyParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(TinyParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#inif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInif(TinyParser.InifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#sinon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinon(TinyParser.SinonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#oprtf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprtf(TinyParser.OprtfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#aff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAff(TinyParser.AffContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#oprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt(TinyParser.OprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#oprt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt1(TinyParser.Oprt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#oprt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt2(TinyParser.Oprt2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#oprt3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprt3(TinyParser.Oprt3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TinyParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(TinyParser.CommentContext ctx);
}