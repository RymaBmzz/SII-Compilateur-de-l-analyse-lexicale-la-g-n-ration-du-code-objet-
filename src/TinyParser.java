// Generated from C:/Users/Litissia/IdeaProjects/TinyLanguage\Tiny.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NBINT=27, NBFLOAT=28, IDF=29, WHITESPACE=30, CHAINE=31;
	public static final int
		RULE_program = 0, RULE_dv = 1, RULE_p = 2, RULE_type = 3, RULE_dp = 4, 
		RULE_read = 5, RULE_x = 6, RULE_write = 7, RULE_t = 8, RULE_cond = 9, 
		RULE_inif = 10, RULE_sinon = 11, RULE_els = 12, RULE_oprtf = 13, RULE_op = 14, 
		RULE_aff = 15, RULE_oprt = 16, RULE_oprt1 = 17, RULE_oprt2 = 18, RULE_oprt3 = 19, 
		RULE_oprt4 = 20, RULE_comment = 21;
	public static final String[] ruleNames = {
		"program", "dv", "p", "type", "dp", "read", "x", "write", "t", "cond", 
		"inif", "sinon", "els", "oprtf", "op", "aff", "oprt", "oprt1", "oprt2", 
		"oprt3", "oprt4", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'compil'", "'('", "')'", "'{'", "'start'", "'}'", "';'", "','", 
		"'intcompil'", "'floatcompil'", "'scancompil'", "'printcompil'", "'if'", 
		"'then'", "'endif'", "'else'", "'>'", "'<'", "'>='", "'<='", "'!='", "'='", 
		"'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NBINT", "NBFLOAT", "IDF", "WHITESPACE", "CHAINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Tiny.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TinyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(TinyParser.IDF, 0); }
		public DvContext dv() {
			return getRuleContext(DvContext.class,0);
		}
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(IDF);
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			dv();
			setState(50);
			match(T__4);
			setState(51);
			dp();
			setState(52);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DvContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public DvContext dv() {
			return getRuleContext(DvContext.class,0);
		}
		public DvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterDv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitDv(this);
		}
	}

	public final DvContext dv() throws RecognitionException {
		DvContext _localctx = new DvContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dv);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				type();
				setState(55);
				p();
				setState(56);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				type();
				setState(59);
				p();
				setState(60);
				match(T__6);
				setState(61);
				dv();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(TinyParser.IDF, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_p);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(IDF);
				setState(66);
				match(T__7);
				setState(67);
				p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IDF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpContext extends ParserRuleContext {
		public AffContext aff() {
			return getRuleContext(AffContext.class,0);
		}
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterDp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitDp(this);
		}
	}

	public final DpContext dp() throws RecognitionException {
		DpContext _localctx = new DpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dp);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				aff();
				setState(74);
				dp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				read();
				setState(77);
				dp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				write();
				setState(80);
				dp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				cond();
				setState(83);
				dp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				aff();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				read();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				write();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				cond();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadContext extends ParserRuleContext {
		public List<TerminalNode> IDF() { return getTokens(TinyParser.IDF); }
		public TerminalNode IDF(int i) {
			return getToken(TinyParser.IDF, i);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
			setState(92);
			match(T__1);
			setState(93);
			match(IDF);
			setState(94);
			match(T__7);
			setState(95);
			match(IDF);
			setState(96);
			match(T__2);
			setState(97);
			match(T__6);
			setState(98);
			x();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class XContext extends ParserRuleContext {
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitX(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_x);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				dp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteContext extends ParserRuleContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__11);
				setState(105);
				match(T__1);
				setState(106);
				t();
				setState(107);
				match(T__2);
				setState(108);
				match(T__6);
				setState(109);
				dp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__11);
				setState(112);
				match(T__1);
				setState(113);
				t();
				setState(114);
				match(T__2);
				setState(115);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TContext extends ParserRuleContext {
		public TerminalNode CHAINE() { return getToken(TinyParser.CHAINE, 0); }
		public TerminalNode IDF() { return getToken(TinyParser.IDF, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitT(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==IDF || _la==CHAINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public OprtfContext oprtf() {
			return getRuleContext(OprtfContext.class,0);
		}
		public InifContext inif() {
			return getRuleContext(InifContext.class,0);
		}
		public SinonContext sinon() {
			return getRuleContext(SinonContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(122);
			match(T__1);
			setState(123);
			oprtf();
			setState(124);
			match(T__2);
			setState(125);
			match(T__13);
			setState(126);
			inif();
			setState(127);
			sinon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InifContext extends ParserRuleContext {
		public DpContext dp() {
			return getRuleContext(DpContext.class,0);
		}
		public OprtContext oprt() {
			return getRuleContext(OprtContext.class,0);
		}
		public InifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterInif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitInif(this);
		}
	}

	public final InifContext inif() throws RecognitionException {
		InifContext _localctx = new InifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inif);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				dp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				oprt(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinonContext extends ParserRuleContext {
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public InifContext inif() {
			return getRuleContext(InifContext.class,0);
		}
		public SinonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterSinon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitSinon(this);
		}
	}

	public final SinonContext sinon() throws RecognitionException {
		SinonContext _localctx = new SinonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sinon);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				els();
				setState(134);
				inif();
				setState(135);
				match(T__14);
				setState(136);
				match(T__6);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__14);
				setState(139);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsContext extends ParserRuleContext {
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitEls(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_els);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprtfContext extends ParserRuleContext {
		public List<OprtContext> oprt() {
			return getRuleContexts(OprtContext.class);
		}
		public OprtContext oprt(int i) {
			return getRuleContext(OprtContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public OprtfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprtf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprtf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprtf(this);
		}
	}

	public final OprtfContext oprtf() throws RecognitionException {
		OprtfContext _localctx = new OprtfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_oprtf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			oprt(0);
			setState(145);
			op();
			setState(146);
			oprt(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AffContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(TinyParser.IDF, 0); }
		public OprtContext oprt() {
			return getRuleContext(OprtContext.class,0);
		}
		public AffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterAff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitAff(this);
		}
	}

	public final AffContext aff() throws RecognitionException {
		AffContext _localctx = new AffContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDF);
			setState(151);
			match(T__21);
			setState(152);
			oprt(0);
			setState(153);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprtContext extends ParserRuleContext {
		public Oprt1Context oprt1() {
			return getRuleContext(Oprt1Context.class,0);
		}
		public OprtContext oprt() {
			return getRuleContext(OprtContext.class,0);
		}
		public OprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprt(this);
		}
	}

	public final OprtContext oprt() throws RecognitionException {
		return oprt(0);
	}

	private OprtContext oprt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OprtContext _localctx = new OprtContext(_ctx, _parentState);
		OprtContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_oprt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			oprt1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OprtContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oprt);
					setState(158);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(159);
					match(T__22);
					setState(160);
					oprt1(0);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Oprt1Context extends ParserRuleContext {
		public Oprt2Context oprt2() {
			return getRuleContext(Oprt2Context.class,0);
		}
		public Oprt1Context oprt1() {
			return getRuleContext(Oprt1Context.class,0);
		}
		public Oprt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprt1(this);
		}
	}

	public final Oprt1Context oprt1() throws RecognitionException {
		return oprt1(0);
	}

	private Oprt1Context oprt1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oprt1Context _localctx = new Oprt1Context(_ctx, _parentState);
		Oprt1Context _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_oprt1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			oprt2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oprt1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oprt1);
					setState(169);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(170);
					match(T__23);
					setState(171);
					oprt2(0);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Oprt2Context extends ParserRuleContext {
		public Oprt3Context oprt3() {
			return getRuleContext(Oprt3Context.class,0);
		}
		public Oprt2Context oprt2() {
			return getRuleContext(Oprt2Context.class,0);
		}
		public Oprt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprt2(this);
		}
	}

	public final Oprt2Context oprt2() throws RecognitionException {
		return oprt2(0);
	}

	private Oprt2Context oprt2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oprt2Context _localctx = new Oprt2Context(_ctx, _parentState);
		Oprt2Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_oprt2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			oprt3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oprt2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oprt2);
					setState(180);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(181);
					match(T__24);
					setState(182);
					oprt3(0);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Oprt3Context extends ParserRuleContext {
		public Oprt4Context oprt4() {
			return getRuleContext(Oprt4Context.class,0);
		}
		public Oprt3Context oprt3() {
			return getRuleContext(Oprt3Context.class,0);
		}
		public Oprt3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprt3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprt3(this);
		}
	}

	public final Oprt3Context oprt3() throws RecognitionException {
		return oprt3(0);
	}

	private Oprt3Context oprt3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Oprt3Context _localctx = new Oprt3Context(_ctx, _parentState);
		Oprt3Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_oprt3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			oprt4();
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Oprt3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oprt3);
					setState(191);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(192);
					match(T__25);
					setState(193);
					oprt4();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Oprt4Context extends ParserRuleContext {
		public OprtContext oprt() {
			return getRuleContext(OprtContext.class,0);
		}
		public TerminalNode IDF() { return getToken(TinyParser.IDF, 0); }
		public TerminalNode NBINT() { return getToken(TinyParser.NBINT, 0); }
		public TerminalNode NBFLOAT() { return getToken(TinyParser.NBFLOAT, 0); }
		public Oprt4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprt4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterOprt4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitOprt4(this);
		}
	}

	public final Oprt4Context oprt4() throws RecognitionException {
		Oprt4Context _localctx = new Oprt4Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_oprt4);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__1);
				setState(200);
				oprt(0);
				setState(201);
				match(T__2);
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(IDF);
				}
				break;
			case NBINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(NBINT);
				}
				break;
			case NBFLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(NBFLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode CHAINE() { return getToken(TinyParser.CHAINE, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TinyListener ) ((TinyListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comment);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__25);
				setState(209);
				match(T__24);
				setState(210);
				match(CHAINE);
				setState(211);
				match(T__24);
				setState(212);
				match(T__25);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__25);
				setState(214);
				match(T__25);
				setState(215);
				match(CHAINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return oprt_sempred((OprtContext)_localctx, predIndex);
		case 17:
			return oprt1_sempred((Oprt1Context)_localctx, predIndex);
		case 18:
			return oprt2_sempred((Oprt2Context)_localctx, predIndex);
		case 19:
			return oprt3_sempred((Oprt3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean oprt_sempred(OprtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean oprt1_sempred(Oprt1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean oprt2_sempred(Oprt2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean oprt3_sempred(Oprt3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4"+
		"\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\tx\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f"+
		"\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\7\22\u00a4\n\22\f\22\16\22\u00a7\13\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00af\n\23\f\23\16\23\u00b2\13\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00ba\n\24\f\24\16\24\u00bd\13\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u00c5\n\25\f\25\16\25\u00c8\13\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u00d1\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00db\n\27\3\27\2\6\"$&(\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,\2\5\3\2\13\f\4\2\37\37!!\3\2\23\30\2\u00db\2.\3\2\2\2\4A\3"+
		"\2\2\2\6G\3\2\2\2\bI\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16h\3\2\2\2\20w\3\2"+
		"\2\2\22y\3\2\2\2\24{\3\2\2\2\26\u0085\3\2\2\2\30\u008e\3\2\2\2\32\u0090"+
		"\3\2\2\2\34\u0092\3\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u009d\3\2"+
		"\2\2$\u00a8\3\2\2\2&\u00b3\3\2\2\2(\u00be\3\2\2\2*\u00d0\3\2\2\2,\u00da"+
		"\3\2\2\2./\7\3\2\2/\60\7\37\2\2\60\61\7\4\2\2\61\62\7\5\2\2\62\63\7\6"+
		"\2\2\63\64\5\4\3\2\64\65\7\7\2\2\65\66\5\n\6\2\66\67\7\b\2\2\67\3\3\2"+
		"\2\289\5\b\5\29:\5\6\4\2:;\7\t\2\2;B\3\2\2\2<=\5\b\5\2=>\5\6\4\2>?\7\t"+
		"\2\2?@\5\4\3\2@B\3\2\2\2A8\3\2\2\2A<\3\2\2\2B\5\3\2\2\2CD\7\37\2\2DE\7"+
		"\n\2\2EH\5\6\4\2FH\7\37\2\2GC\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\t\2\2\2J"+
		"\t\3\2\2\2KL\5 \21\2LM\5\n\6\2M\\\3\2\2\2NO\5\f\7\2OP\5\n\6\2P\\\3\2\2"+
		"\2QR\5\20\t\2RS\5\n\6\2S\\\3\2\2\2TU\5\24\13\2UV\5\n\6\2V\\\3\2\2\2W\\"+
		"\5 \21\2X\\\5\f\7\2Y\\\5\20\t\2Z\\\5\24\13\2[K\3\2\2\2[N\3\2\2\2[Q\3\2"+
		"\2\2[T\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2]^"+
		"\7\r\2\2^_\7\4\2\2_`\7\37\2\2`a\7\n\2\2ab\7\37\2\2bc\7\5\2\2cd\7\t\2\2"+
		"de\5\16\b\2e\r\3\2\2\2fi\5\n\6\2gi\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\17\3\2"+
		"\2\2jk\7\16\2\2kl\7\4\2\2lm\5\22\n\2mn\7\5\2\2no\7\t\2\2op\5\n\6\2px\3"+
		"\2\2\2qr\7\16\2\2rs\7\4\2\2st\5\22\n\2tu\7\5\2\2uv\7\t\2\2vx\3\2\2\2w"+
		"j\3\2\2\2wq\3\2\2\2x\21\3\2\2\2yz\t\3\2\2z\23\3\2\2\2{|\7\17\2\2|}\7\4"+
		"\2\2}~\5\34\17\2~\177\7\5\2\2\177\u0080\7\20\2\2\u0080\u0081\5\26\f\2"+
		"\u0081\u0082\5\30\r\2\u0082\25\3\2\2\2\u0083\u0086\5\n\6\2\u0084\u0086"+
		"\5\"\22\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\27\3\2\2\2\u0087"+
		"\u0088\5\32\16\2\u0088\u0089\5\26\f\2\u0089\u008a\7\21\2\2\u008a\u008b"+
		"\7\t\2\2\u008b\u008f\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008f\7\t\2\2"+
		"\u008e\u0087\3\2\2\2\u008e\u008c\3\2\2\2\u008f\31\3\2\2\2\u0090\u0091"+
		"\7\22\2\2\u0091\33\3\2\2\2\u0092\u0093\5\"\22\2\u0093\u0094\5\36\20\2"+
		"\u0094\u0095\5\"\22\2\u0095\35\3\2\2\2\u0096\u0097\t\4\2\2\u0097\37\3"+
		"\2\2\2\u0098\u0099\7\37\2\2\u0099\u009a\7\30\2\2\u009a\u009b\5\"\22\2"+
		"\u009b\u009c\7\t\2\2\u009c!\3\2\2\2\u009d\u009e\b\22\1\2\u009e\u009f\5"+
		"$\23\2\u009f\u00a5\3\2\2\2\u00a0\u00a1\f\4\2\2\u00a1\u00a2\7\31\2\2\u00a2"+
		"\u00a4\5$\23\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6#\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\b\23\1\2\u00a9\u00aa\5&\24\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\f\4\2\2"+
		"\u00ac\u00ad\7\32\2\2\u00ad\u00af\5&\24\2\u00ae\u00ab\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1%\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\b\24\1\2\u00b4\u00b5\5(\25\2\u00b5\u00bb\3"+
		"\2\2\2\u00b6\u00b7\f\4\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00ba\5(\25\2\u00b9"+
		"\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\'\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\25\1\2\u00bf\u00c0"+
		"\5*\26\2\u00c0\u00c6\3\2\2\2\u00c1\u00c2\f\4\2\2\u00c2\u00c3\7\34\2\2"+
		"\u00c3\u00c5\5*\26\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7)\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\4\2\2\u00ca\u00cb\5\"\22\2\u00cb\u00cc\7\5\2\2\u00cc\u00d1\3"+
		"\2\2\2\u00cd\u00d1\7\37\2\2\u00ce\u00d1\7\35\2\2\u00cf\u00d1\7\36\2\2"+
		"\u00d0\u00c9\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4\7\33\2\2\u00d4"+
		"\u00d5\7!\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00db\7\34\2\2\u00d7\u00d8\7"+
		"\34\2\2\u00d8\u00d9\7\34\2\2\u00d9\u00db\7!\2\2\u00da\u00d2\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00db-\3\2\2\2\17AG[hw\u0085\u008e\u00a5\u00b0\u00bb\u00c6"+
		"\u00d0\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}