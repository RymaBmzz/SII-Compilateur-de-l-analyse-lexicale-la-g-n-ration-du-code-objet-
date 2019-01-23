// Generated from C:/Users/Litissia/IdeaProjects/TinyLanguage\Tiny.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TinyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NBINT=27, NBFLOAT=28, IDF=29, WHITESPACE=30, CHAINE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "NBINT", "NBFLOAT", "IDF", "WHITESPACE", "CHAINE"
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


	public TinyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tiny.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\5\34\u00b4\n\34\3\34\3\34\7\34\u00b8\n\34\f\34\16\34"+
		"\u00bb\13\34\5\34\u00bd\n\34\3\35\3\35\5\35\u00c1\n\35\3\35\3\35\7\35"+
		"\u00c5\n\35\f\35\16\35\u00c8\13\35\3\35\3\35\7\35\u00cc\n\35\f\35\16\35"+
		"\u00cf\13\35\5\35\u00d1\n\35\3\36\3\36\7\36\u00d5\n\36\f\36\16\36\u00d8"+
		"\13\36\3\37\3\37\3\37\3\37\3 \3 \7 \u00e0\n \f \16 \u00e3\13 \3 \3 \2"+
		"\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!\3\2\t\4\2--//\3\2\63;\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2\13\f"+
		"\17\17\"\"\3\2$$\2\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5H\3\2\2"+
		"\2\7J\3\2\2\2\tL\3\2\2\2\13N\3\2\2\2\rT\3\2\2\2\17V\3\2\2\2\21X\3\2\2"+
		"\2\23Z\3\2\2\2\25d\3\2\2\2\27p\3\2\2\2\31{\3\2\2\2\33\u0087\3\2\2\2\35"+
		"\u008a\3\2\2\2\37\u008f\3\2\2\2!\u0095\3\2\2\2#\u009a\3\2\2\2%\u009c\3"+
		"\2\2\2\'\u009e\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3\2\2\2/\u00a9"+
		"\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2\2\2\67\u00bc\3"+
		"\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d9\3\2\2\2?\u00dd\3\2\2\2AB\7"+
		"e\2\2BC\7q\2\2CD\7o\2\2DE\7r\2\2EF\7k\2\2FG\7n\2\2G\4\3\2\2\2HI\7*\2\2"+
		"I\6\3\2\2\2JK\7+\2\2K\b\3\2\2\2LM\7}\2\2M\n\3\2\2\2NO\7u\2\2OP\7v\2\2"+
		"PQ\7c\2\2QR\7t\2\2RS\7v\2\2S\f\3\2\2\2TU\7\177\2\2U\16\3\2\2\2VW\7=\2"+
		"\2W\20\3\2\2\2XY\7.\2\2Y\22\3\2\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2]^\7e"+
		"\2\2^_\7q\2\2_`\7o\2\2`a\7r\2\2ab\7k\2\2bc\7n\2\2c\24\3\2\2\2de\7h\2\2"+
		"ef\7n\2\2fg\7q\2\2gh\7c\2\2hi\7v\2\2ij\7e\2\2jk\7q\2\2kl\7o\2\2lm\7r\2"+
		"\2mn\7k\2\2no\7n\2\2o\26\3\2\2\2pq\7u\2\2qr\7e\2\2rs\7c\2\2st\7p\2\2t"+
		"u\7e\2\2uv\7q\2\2vw\7o\2\2wx\7r\2\2xy\7k\2\2yz\7n\2\2z\30\3\2\2\2{|\7"+
		"r\2\2|}\7t\2\2}~\7k\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7e\2"+
		"\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7r\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7n\2\2\u0086\32\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7h\2\2\u0089\34\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7j\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7p\2\2\u008e\36\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7f\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2\u0094"+
		" \3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7g\2\2\u0099\"\3\2\2\2\u009a\u009b\7@\2\2\u009b$\3\2\2\2\u009c"+
		"\u009d\7>\2\2\u009d&\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"(\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3*\3\2\2\2\u00a4\u00a5"+
		"\7#\2\2\u00a5\u00a6\7?\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8.\3"+
		"\2\2\2\u00a9\u00aa\7-\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\62"+
		"\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0"+
		"\66\3\2\2\2\u00b1\u00bd\7\62\2\2\u00b2\u00b4\t\2\2\2\u00b3\u00b2\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\t\3\2\2\u00b6\u00b8"+
		"\t\4\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00b1\3\2"+
		"\2\2\u00bc\u00b3\3\2\2\2\u00bd8\3\2\2\2\u00be\u00d1\7\62\2\2\u00bf\u00c1"+
		"\t\2\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c6\t\3\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00cd\7\60\2\2\u00ca\u00cc\t\4\2\2\u00cb\u00ca\3"+
		"\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00be\3\2\2\2\u00d0\u00c0\3\2"+
		"\2\2\u00d1:\3\2\2\2\u00d2\u00d6\t\5\2\2\u00d3\u00d5\t\6\2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"<\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\t\7\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00dc\b\37\2\2\u00dc>\3\2\2\2\u00dd\u00e1\7$\2\2\u00de\u00e0\n"+
		"\b\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$"+
		"\2\2\u00e5@\3\2\2\2\f\2\u00b3\u00b9\u00bc\u00c0\u00c6\u00cd\u00d0\u00d6"+
		"\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}