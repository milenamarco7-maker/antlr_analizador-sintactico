// Generated from c:/Users/Milena/OneDrive/Desktop/analizador_sintactico/Analizador.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AnalizadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TEXTLITERAL=12, NUMBER=13, IDENTIFIER=14, LETTER=15, 
		DIGIT=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TEXTLITERAL", "NUMBER", "IDENTIFIER", "LETTER", "DIGIT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'switch'", "'('", "')'", "'{'", "'}'", "'case'", "':'", "'default'", 
			"'='", "';'", "'output'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TEXTLITERAL", "NUMBER", "IDENTIFIER", "LETTER", "DIGIT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public AnalizadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analizador.g4"; }

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
		"\u0004\u0000\u0011l\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bO\b\u000b\n\u000b\f\u000bR\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fW\b\f\u000b\f\f\fX\u0001\r\u0001\r\u0005\r"+
		"]\b\r\n\r\f\r`\t\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0004\u0010g\b\u0010\u000b\u0010\f\u0010h\u0001\u0010\u0001\u0010"+
		"\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0006\u0001"+
		"\u0000\"\"\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002\u0000"+
		"AZaz\u0003\u0000\t\n\r\r  o\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000"+
		"\u0000\u0003*\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007"+
		".\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000"+
		"\u0000\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011A\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015E"+
		"\u0001\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019V\u0001\u0000"+
		"\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001da\u0001\u0000\u0000\u0000"+
		"\u001fc\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#$\u0005s\u0000"+
		"\u0000$%\u0005w\u0000\u0000%&\u0005i\u0000\u0000&\'\u0005t\u0000\u0000"+
		"\'(\u0005c\u0000\u0000()\u0005h\u0000\u0000)\u0002\u0001\u0000\u0000\u0000"+
		"*+\u0005(\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005)\u0000\u0000"+
		"-\u0006\u0001\u0000\u0000\u0000./\u0005{\u0000\u0000/\b\u0001\u0000\u0000"+
		"\u000001\u0005}\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005c\u0000"+
		"\u000034\u0005a\u0000\u000045\u0005s\u0000\u000056\u0005e\u0000\u0000"+
		"6\f\u0001\u0000\u0000\u000078\u0005:\u0000\u00008\u000e\u0001\u0000\u0000"+
		"\u00009:\u0005d\u0000\u0000:;\u0005e\u0000\u0000;<\u0005f\u0000\u0000"+
		"<=\u0005a\u0000\u0000=>\u0005u\u0000\u0000>?\u0005l\u0000\u0000?@\u0005"+
		"t\u0000\u0000@\u0010\u0001\u0000\u0000\u0000AB\u0005=\u0000\u0000B\u0012"+
		"\u0001\u0000\u0000\u0000CD\u0005;\u0000\u0000D\u0014\u0001\u0000\u0000"+
		"\u0000EF\u0005o\u0000\u0000FG\u0005u\u0000\u0000GH\u0005t\u0000\u0000"+
		"HI\u0005p\u0000\u0000IJ\u0005u\u0000\u0000JK\u0005t\u0000\u0000K\u0016"+
		"\u0001\u0000\u0000\u0000LP\u0005\"\u0000\u0000MO\b\u0000\u0000\u0000N"+
		"M\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000ST\u0005\"\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UW\u0007"+
		"\u0001\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u001a\u0001\u0000"+
		"\u0000\u0000Z^\u0007\u0002\u0000\u0000[]\u0007\u0003\u0000\u0000\\[\u0001"+
		"\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_\u001c\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000ab\u0007\u0004\u0000\u0000b\u001e\u0001\u0000\u0000\u0000"+
		"cd\u0007\u0001\u0000\u0000d \u0001\u0000\u0000\u0000eg\u0007\u0005\u0000"+
		"\u0000fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006"+
		"\u0010\u0000\u0000k\"\u0001\u0000\u0000\u0000\u0005\u0000PX^h\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}