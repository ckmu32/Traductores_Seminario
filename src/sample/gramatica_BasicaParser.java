// Generated from /home/ckmu32/IdeaProjects/Traductores_Seminario/src/sample/gramatica_Basica.g4 by ANTLR 4.5.3
package sample;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramatica_BasicaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, RESERVADAS=23, OPERADORES_LOGICOS=24, 
		OPERADOR_NEGACION=25, CONDICION=26, COMPARADORES=27, CARACTER=28, LETRA=29, 
		COMENTARIO=30, IDENTIFICADOR=31, NUMERO=32, FLOTANTE=33, TIPO_DATO=34, 
		WS=35;
	public static final int
		RULE_auxiliar = 0, RULE_parse = 1, RULE_declaration = 2, RULE_tipoDato = 3, 
		RULE_reservadas_operadores = 4, RULE_operaciones = 5, RULE_comando_selectivo = 6, 
		RULE_comando_recursivo = 7, RULE_reservadas = 8, RULE_operadorL = 9, RULE_operadorN = 10, 
		RULE_asignarValor = 11, RULE_booleano = 12, RULE_caracter = 13, RULE_string = 14, 
		RULE_entero = 15, RULE_flotante = 16, RULE_comando_si = 17, RULE_comando_while = 18;
	public static final String[] ruleNames = {
		"auxiliar", "parse", "declaration", "tipoDato", "reservadas_operadores", 
		"operaciones", "comando_selectivo", "comando_recursivo", "reservadas", 
		"operadorL", "operadorN", "asignarValor", "booleano", "caracter", "string", 
		"entero", "flotante", "comando_si", "comando_while"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'*'", "'/'", "'\n'", "'='", "'true'", "'false'", 
		"'bool'", "'char'", "'string'", "'entero'", "'flotante'", "'si'", "'('", 
		"')'", "'entonces'", "'rompe'", "'sino'", "'terminasi'", "'mientras'", 
		"'terminamientras'", null, null, "'no'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "RESERVADAS", 
		"OPERADORES_LOGICOS", "OPERADOR_NEGACION", "CONDICION", "COMPARADORES", 
		"CARACTER", "LETRA", "COMENTARIO", "IDENTIFICADOR", "NUMERO", "FLOTANTE", 
		"TIPO_DATO", "WS"
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
	public String getGrammarFileName() { return "gramatica_Basica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramatica_BasicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AuxiliarContext extends ParserRuleContext {
		public ParseContext parse() {
			return getRuleContext(ParseContext.class,0);
		}
		public AuxiliarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxiliar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterAuxiliar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitAuxiliar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitAuxiliar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxiliarContext auxiliar() throws RecognitionException {
		AuxiliarContext _localctx = new AuxiliarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_auxiliar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			parse();
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

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramatica_BasicaParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				declaration();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0) );
			setState(45);
			match(EOF);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public Reservadas_operadoresContext reservadas_operadores() {
			return getRuleContext(Reservadas_operadoresContext.class,0);
		}
		public Comando_selectivoContext comando_selectivo() {
			return getRuleContext(Comando_selectivoContext.class,0);
		}
		public Comando_recursivoContext comando_recursivo() {
			return getRuleContext(Comando_recursivoContext.class,0);
		}
		public AsignarValorContext asignarValor() {
			return getRuleContext(AsignarValorContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(53);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				tipoDato();
				}
				break;
			case RESERVADAS:
			case OPERADORES_LOGICOS:
			case OPERADOR_NEGACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				reservadas_operadores();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				comando_selectivo();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				comando_recursivo();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				asignarValor();
				}
				break;
			case NUMERO:
			case FLOTANTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				operaciones();
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

	public static class TipoDatoContext extends ParserRuleContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<CaracterContext> caracter() {
			return getRuleContexts(CaracterContext.class);
		}
		public CaracterContext caracter(int i) {
			return getRuleContext(CaracterContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public List<FlotanteContext> flotante() {
			return getRuleContexts(FlotanteContext.class);
		}
		public FlotanteContext flotante(int i) {
			return getRuleContext(FlotanteContext.class,i);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoDato);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(60);
					switch (_input.LA(1)) {
					case T__8:
						{
						setState(55);
						booleano();
						}
						break;
					case T__9:
						{
						setState(56);
						caracter();
						}
						break;
					case T__10:
						{
						setState(57);
						string();
						}
						break;
					case T__11:
						{
						setState(58);
						entero();
						}
						break;
					case T__12:
						{
						setState(59);
						flotante();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Reservadas_operadoresContext extends ParserRuleContext {
		public List<ReservadasContext> reservadas() {
			return getRuleContexts(ReservadasContext.class);
		}
		public ReservadasContext reservadas(int i) {
			return getRuleContext(ReservadasContext.class,i);
		}
		public List<OperadorLContext> operadorL() {
			return getRuleContexts(OperadorLContext.class);
		}
		public OperadorLContext operadorL(int i) {
			return getRuleContext(OperadorLContext.class,i);
		}
		public List<OperadorNContext> operadorN() {
			return getRuleContexts(OperadorNContext.class);
		}
		public OperadorNContext operadorN(int i) {
			return getRuleContext(OperadorNContext.class,i);
		}
		public Reservadas_operadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservadas_operadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterReservadas_operadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitReservadas_operadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitReservadas_operadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reservadas_operadoresContext reservadas_operadores() throws RecognitionException {
		Reservadas_operadoresContext _localctx = new Reservadas_operadoresContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reservadas_operadores);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(67);
					switch (_input.LA(1)) {
					case RESERVADAS:
						{
						setState(64);
						reservadas();
						}
						break;
					case OPERADORES_LOGICOS:
						{
						setState(65);
						operadorL();
						}
						break;
					case OPERADOR_NEGACION:
						{
						setState(66);
						operadorN();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class OperacionesContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(gramatica_BasicaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(gramatica_BasicaParser.NUMERO, i);
		}
		public List<TerminalNode> FLOTANTE() { return getTokens(gramatica_BasicaParser.FLOTANTE); }
		public TerminalNode FLOTANTE(int i) {
			return getToken(gramatica_BasicaParser.FLOTANTE, i);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operaciones);
		int _la;
		try {
			int _alt;
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(72);
				match(T__0);
				setState(73);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(75);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(78); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(80);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(82);
				match(T__3);
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(84);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(86);
				match(T__2);
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(88);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(90);
				match(T__1);
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(92);
				match(T__4);
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

	public static class Comando_selectivoContext extends ParserRuleContext {
		public List<Comando_siContext> comando_si() {
			return getRuleContexts(Comando_siContext.class);
		}
		public Comando_siContext comando_si(int i) {
			return getRuleContext(Comando_siContext.class,i);
		}
		public Comando_selectivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_selectivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterComando_selectivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitComando_selectivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitComando_selectivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_selectivoContext comando_selectivo() throws RecognitionException {
		Comando_selectivoContext _localctx = new Comando_selectivoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comando_selectivo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(95);
					comando_si();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Comando_recursivoContext extends ParserRuleContext {
		public List<Comando_whileContext> comando_while() {
			return getRuleContexts(Comando_whileContext.class);
		}
		public Comando_whileContext comando_while(int i) {
			return getRuleContext(Comando_whileContext.class,i);
		}
		public Comando_recursivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_recursivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterComando_recursivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitComando_recursivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitComando_recursivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_recursivoContext comando_recursivo() throws RecognitionException {
		Comando_recursivoContext _localctx = new Comando_recursivoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comando_recursivo);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(100);
					comando_while();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ReservadasContext extends ParserRuleContext {
		public TerminalNode RESERVADAS() { return getToken(gramatica_BasicaParser.RESERVADAS, 0); }
		public ReservadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterReservadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitReservadas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitReservadas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservadasContext reservadas() throws RecognitionException {
		ReservadasContext _localctx = new ReservadasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_reservadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(RESERVADAS);
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

	public static class OperadorLContext extends ParserRuleContext {
		public TerminalNode OPERADORES_LOGICOS() { return getToken(gramatica_BasicaParser.OPERADORES_LOGICOS, 0); }
		public OperadorLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterOperadorL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitOperadorL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitOperadorL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLContext operadorL() throws RecognitionException {
		OperadorLContext _localctx = new OperadorLContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operadorL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(OPERADORES_LOGICOS);
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

	public static class OperadorNContext extends ParserRuleContext {
		public TerminalNode OPERADOR_NEGACION() { return getToken(gramatica_BasicaParser.OPERADOR_NEGACION, 0); }
		public OperadorNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterOperadorN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitOperadorN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitOperadorN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorNContext operadorN() throws RecognitionException {
		OperadorNContext _localctx = new OperadorNContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operadorN);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(OPERADOR_NEGACION);
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

	public static class AsignarValorContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(gramatica_BasicaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(gramatica_BasicaParser.IDENTIFICADOR, i);
		}
		public TerminalNode CARACTER() { return getToken(gramatica_BasicaParser.CARACTER, 0); }
		public TerminalNode COMENTARIO() { return getToken(gramatica_BasicaParser.COMENTARIO, 0); }
		public TerminalNode NUMERO() { return getToken(gramatica_BasicaParser.NUMERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(gramatica_BasicaParser.FLOTANTE, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public AsignarValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignarValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterAsignarValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitAsignarValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitAsignarValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignarValorContext asignarValor() throws RecognitionException {
		AsignarValorContext _localctx = new AsignarValorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignarValor);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IDENTIFICADOR);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(112);
					match(T__5);
					setState(113);
					match(T__6);
					}
					break;
				case 2:
					{
					setState(114);
					match(T__5);
					setState(115);
					match(T__7);
					}
					break;
				}
				setState(118);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(IDENTIFICADOR);
				setState(122);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(120);
					match(T__5);
					setState(121);
					match(IDENTIFICADOR);
					}
				}

				setState(124);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(IDENTIFICADOR);
				setState(128);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(126);
					match(T__5);
					setState(127);
					match(CARACTER);
					}
				}

				setState(130);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(IDENTIFICADOR);
				setState(134);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(132);
					match(T__5);
					setState(133);
					match(COMENTARIO);
					}
				}

				setState(136);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(IDENTIFICADOR);
				setState(140);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(138);
					match(T__5);
					setState(139);
					match(NUMERO);
					}
				}

				setState(142);
				match(T__4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				match(IDENTIFICADOR);
				setState(146);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(144);
					match(T__5);
					setState(145);
					match(FLOTANTE);
					}
				}

				setState(148);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				match(IDENTIFICADOR);
				{
				setState(150);
				match(T__5);
				setState(151);
				operaciones();
				}
				setState(153);
				match(T__4);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramatica_BasicaParser.IDENTIFICADOR, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__8);
			setState(158);
			match(IDENTIFICADOR);
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T__5);
				setState(160);
				match(T__6);
				}
				break;
			case 2:
				{
				setState(161);
				match(T__5);
				setState(162);
				match(T__7);
				}
				break;
			}
			setState(165);
			match(T__4);
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

	public static class CaracterContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramatica_BasicaParser.IDENTIFICADOR, 0); }
		public TerminalNode CARACTER() { return getToken(gramatica_BasicaParser.CARACTER, 0); }
		public CaracterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitCaracter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitCaracter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaracterContext caracter() throws RecognitionException {
		CaracterContext _localctx = new CaracterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caracter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__9);
			setState(168);
			match(IDENTIFICADOR);
			setState(171);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(169);
				match(T__5);
				setState(170);
				match(CARACTER);
				}
			}

			setState(173);
			match(T__4);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramatica_BasicaParser.IDENTIFICADOR, 0); }
		public TerminalNode COMENTARIO() { return getToken(gramatica_BasicaParser.COMENTARIO, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__10);
			setState(176);
			match(IDENTIFICADOR);
			setState(179);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(177);
				match(T__5);
				setState(178);
				match(COMENTARIO);
				}
			}

			setState(181);
			match(T__4);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramatica_BasicaParser.IDENTIFICADOR, 0); }
		public TerminalNode NUMERO() { return getToken(gramatica_BasicaParser.NUMERO, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_entero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__11);
			setState(184);
			match(IDENTIFICADOR);
			setState(187);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(185);
				match(T__5);
				setState(186);
				match(NUMERO);
				}
			}

			setState(189);
			match(T__4);
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

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramatica_BasicaParser.IDENTIFICADOR, 0); }
		public TerminalNode FLOTANTE() { return getToken(gramatica_BasicaParser.FLOTANTE, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitFlotante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitFlotante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_flotante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__12);
			setState(192);
			match(IDENTIFICADOR);
			setState(195);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(193);
				match(T__5);
				setState(194);
				match(FLOTANTE);
				}
			}

			setState(197);
			match(T__4);
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

	public static class Comando_siContext extends ParserRuleContext {
		public List<TerminalNode> COMPARADORES() { return getTokens(gramatica_BasicaParser.COMPARADORES); }
		public TerminalNode COMPARADORES(int i) {
			return getToken(gramatica_BasicaParser.COMPARADORES, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(gramatica_BasicaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(gramatica_BasicaParser.NUMERO, i);
		}
		public List<TerminalNode> FLOTANTE() { return getTokens(gramatica_BasicaParser.FLOTANTE); }
		public TerminalNode FLOTANTE(int i) {
			return getToken(gramatica_BasicaParser.FLOTANTE, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(gramatica_BasicaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(gramatica_BasicaParser.IDENTIFICADOR, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode OPERADORES_LOGICOS() { return getToken(gramatica_BasicaParser.OPERADORES_LOGICOS, 0); }
		public Comando_siContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterComando_si(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitComando_si(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitComando_si(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_siContext comando_si() throws RecognitionException {
		Comando_siContext _localctx = new Comando_siContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comando_si);
		int _la;
		try {
			int _alt;
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(T__13);
				setState(200);
				match(T__14);
				setState(201);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(202);
				match(COMPARADORES);
				setState(203);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(204);
				match(T__15);
				setState(206);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(205);
					match(T__4);
					}
				}

				setState(208);
				match(T__16);
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(209);
					match(T__4);
					}
					break;
				}
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(212);
					match(T__17);
					setState(214); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(213);
							match(T__4);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(216); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(221); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(220);
							declaration();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(223); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(227);
					match(T__4);
					}
					break;
				}
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(230);
					match(T__17);
					setState(231);
					match(T__4);
					}
					break;
				}
				setState(256);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(234);
					match(T__18);
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(235);
						match(T__4);
						}
						break;
					}
					setState(240);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(238);
						match(T__17);
						setState(239);
						match(T__4);
						}
						break;
					}
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(243); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(242);
								declaration();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(245); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(249);
						match(T__4);
						}
						break;
					}
					setState(254);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(252);
						match(T__17);
						setState(253);
						match(T__4);
						}
						break;
					}
					}
				}

				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(258);
					match(T__17);
					setState(259);
					match(T__4);
					}
					break;
				}
				setState(274);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(262);
					match(T__13);
					setState(263);
					match(T__16);
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						setState(264);
						match(T__4);
						}
						break;
					}
					setState(272);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) {
						{
						setState(268); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(267);
							declaration();
							}
							}
							setState(270); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0) );
						}
					}

					}
				}

				setState(277);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(276);
					match(T__4);
					}
				}

				setState(281);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(279);
					match(T__17);
					setState(280);
					match(T__4);
					}
				}

				setState(283);
				match(T__19);
				setState(285);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(284);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(T__13);
				setState(288);
				match(T__14);
				setState(289);
				match(IDENTIFICADOR);
				setState(290);
				match(COMPARADORES);
				setState(291);
				match(IDENTIFICADOR);
				setState(292);
				match(OPERADORES_LOGICOS);
				setState(293);
				match(IDENTIFICADOR);
				setState(294);
				match(COMPARADORES);
				setState(295);
				match(IDENTIFICADOR);
				setState(296);
				match(T__15);
				setState(300);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(297);
					match(T__17);
					setState(298);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(299);
					match(T__4);
					}
					break;
				case T__16:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(302);
				match(T__16);
				setState(306);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(303);
					match(T__17);
					setState(304);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(305);
					match(T__4);
					}
					break;
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__20:
				case RESERVADAS:
				case OPERADORES_LOGICOS:
				case OPERADOR_NEGACION:
				case IDENTIFICADOR:
				case NUMERO:
				case FLOTANTE:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(308);
					declaration();
					}
					}
					setState(311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0) );
				setState(316);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(313);
					match(T__17);
					setState(314);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(315);
					match(T__4);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(318);
					match(T__18);
					setState(322);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(319);
						match(T__17);
						setState(320);
						match(T__4);
						}
						break;
					case T__4:
						{
						setState(321);
						match(T__4);
						}
						break;
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__20:
					case RESERVADAS:
					case OPERADORES_LOGICOS:
					case OPERADOR_NEGACION:
					case IDENTIFICADOR:
					case NUMERO:
					case FLOTANTE:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(325); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(324);
							declaration();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(327); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(331);
					match(T__17);
					setState(332);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(333);
					match(T__4);
					}
					break;
				}
				setState(342);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(336);
					match(T__13);
					setState(338); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(337);
						declaration();
						}
						}
						setState(340); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0) );
					}
				}

				setState(347);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(344);
					match(T__17);
					setState(345);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(346);
					match(T__4);
					}
					break;
				case T__19:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349);
				match(T__19);
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(350);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				match(T__13);
				setState(354);
				match(T__14);
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(356);
				match(COMPARADORES);
				setState(357);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(358);
				match(OPERADORES_LOGICOS);
				setState(359);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(360);
				match(COMPARADORES);
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(362);
				match(T__15);
				setState(363);
				match(T__16);
				setState(367);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(364);
					match(T__17);
					setState(365);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(366);
					match(T__4);
					}
					break;
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__20:
				case RESERVADAS:
				case OPERADORES_LOGICOS:
				case OPERADOR_NEGACION:
				case IDENTIFICADOR:
				case NUMERO:
				case FLOTANTE:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(370); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(369);
						declaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(372); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(374);
					match(T__17);
					setState(375);
					match(T__4);
					}
					break;
				case 2:
					{
					setState(376);
					match(T__4);
					}
					break;
				}
				setState(390);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(379);
					match(T__18);
					setState(383);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(380);
						match(T__17);
						setState(381);
						match(T__4);
						}
						break;
					case T__4:
						{
						setState(382);
						match(T__4);
						}
						break;
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__20:
					case RESERVADAS:
					case OPERADORES_LOGICOS:
					case OPERADOR_NEGACION:
					case IDENTIFICADOR:
					case NUMERO:
					case FLOTANTE:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(386); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(385);
							declaration();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(388); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
				}

				setState(395);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(392);
					match(T__17);
					setState(393);
					match(T__4);
					}
					break;
				case T__4:
					{
					setState(394);
					match(T__4);
					}
					break;
				case T__13:
				case T__19:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(408);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(397);
					match(T__13);
					setState(401);
					switch (_input.LA(1)) {
					case T__17:
						{
						setState(398);
						match(T__17);
						setState(399);
						match(T__4);
						}
						break;
					case T__4:
						{
						setState(400);
						match(T__4);
						}
						break;
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__20:
					case RESERVADAS:
					case OPERADORES_LOGICOS:
					case OPERADOR_NEGACION:
					case IDENTIFICADOR:
					case NUMERO:
					case FLOTANTE:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(404); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(403);
						declaration();
						}
						}
						setState(406); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__20) | (1L << RESERVADAS) | (1L << OPERADORES_LOGICOS) | (1L << OPERADOR_NEGACION) | (1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0) );
					}
				}

				setState(410);
				match(T__19);
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(411);
					match(T__4);
					}
					break;
				}
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

	public static class Comando_whileContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(gramatica_BasicaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(gramatica_BasicaParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMPARADORES() { return getTokens(gramatica_BasicaParser.COMPARADORES); }
		public TerminalNode COMPARADORES(int i) {
			return getToken(gramatica_BasicaParser.COMPARADORES, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(gramatica_BasicaParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(gramatica_BasicaParser.NUMERO, i);
		}
		public List<TerminalNode> FLOTANTE() { return getTokens(gramatica_BasicaParser.FLOTANTE); }
		public TerminalNode FLOTANTE(int i) {
			return getToken(gramatica_BasicaParser.FLOTANTE, i);
		}
		public TerminalNode OPERADORES_LOGICOS() { return getToken(gramatica_BasicaParser.OPERADORES_LOGICOS, 0); }
		public Comando_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).enterComando_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramatica_BasicaListener ) ((gramatica_BasicaListener)listener).exitComando_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramatica_BasicaVisitor ) return ((gramatica_BasicaVisitor<? extends T>)visitor).visitComando_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comando_whileContext comando_while() throws RecognitionException {
		Comando_whileContext _localctx = new Comando_whileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comando_while);
		int _la;
		try {
			int _alt;
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(T__20);
				setState(417);
				match(T__14);
				setState(418);
				match(IDENTIFICADOR);
				setState(419);
				match(COMPARADORES);
				setState(420);
				match(IDENTIFICADOR);
				setState(421);
				match(T__15);
				setState(423);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(422);
					match(T__4);
					}
				}

				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(425);
					match(T__17);
					setState(426);
					match(T__4);
					}
					break;
				}
				setState(435); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(435);
						switch (_input.LA(1)) {
						case T__8:
						case T__9:
						case T__10:
						case T__11:
						case T__12:
						case T__13:
						case T__20:
						case RESERVADAS:
						case OPERADORES_LOGICOS:
						case OPERADOR_NEGACION:
						case IDENTIFICADOR:
						case NUMERO:
						case FLOTANTE:
							{
							setState(429);
							declaration();
							setState(431);
							_la = _input.LA(1);
							if (_la==T__4) {
								{
								setState(430);
								match(T__4);
								}
							}

							}
							break;
						case T__17:
							{
							setState(433);
							match(T__17);
							setState(434);
							match(T__4);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(437); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(441);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(439);
					match(T__17);
					setState(440);
					match(T__4);
					}
				}

				setState(443);
				match(T__21);
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(444);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(T__20);
				setState(448);
				match(T__14);
				setState(449);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(450);
				match(COMPARADORES);
				setState(451);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(452);
				match(T__15);
				setState(454);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(453);
					match(T__4);
					}
				}

				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(456);
					match(T__17);
					setState(457);
					match(T__4);
					}
					break;
				}
				setState(463); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						setState(463);
						switch (_input.LA(1)) {
						case T__8:
						case T__9:
						case T__10:
						case T__11:
						case T__12:
						case T__13:
						case T__20:
						case RESERVADAS:
						case OPERADORES_LOGICOS:
						case OPERADOR_NEGACION:
						case IDENTIFICADOR:
						case NUMERO:
						case FLOTANTE:
							{
							setState(460);
							declaration();
							}
							break;
						case T__17:
							{
							setState(461);
							match(T__17);
							setState(462);
							match(T__4);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(469);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(467);
					match(T__17);
					setState(468);
					match(T__4);
					}
				}

				setState(471);
				match(T__21);
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(472);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				match(T__20);
				setState(476);
				match(T__14);
				setState(477);
				match(IDENTIFICADOR);
				setState(478);
				match(COMPARADORES);
				setState(479);
				match(IDENTIFICADOR);
				setState(480);
				match(OPERADORES_LOGICOS);
				setState(481);
				match(IDENTIFICADOR);
				setState(482);
				match(COMPARADORES);
				setState(483);
				match(IDENTIFICADOR);
				setState(484);
				match(T__15);
				setState(486);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(485);
					match(T__4);
					}
				}

				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(488);
					match(T__17);
					setState(489);
					match(T__4);
					}
					break;
				}
				setState(495); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(495);
						switch (_input.LA(1)) {
						case T__8:
						case T__9:
						case T__10:
						case T__11:
						case T__12:
						case T__13:
						case T__20:
						case RESERVADAS:
						case OPERADORES_LOGICOS:
						case OPERADOR_NEGACION:
						case IDENTIFICADOR:
						case NUMERO:
						case FLOTANTE:
							{
							setState(492);
							declaration();
							}
							break;
						case T__17:
							{
							setState(493);
							match(T__17);
							setState(494);
							match(T__4);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(497); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(501);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(499);
					match(T__17);
					setState(500);
					match(T__4);
					}
				}

				setState(503);
				match(T__21);
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(504);
					match(T__4);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				match(T__20);
				setState(508);
				match(T__14);
				setState(509);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(510);
				match(COMPARADORES);
				setState(511);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFICADOR) | (1L << NUMERO) | (1L << FLOTANTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(512);
				match(OPERADORES_LOGICOS);
				setState(513);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(514);
				match(COMPARADORES);
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==NUMERO || _la==FLOTANTE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(516);
				match(T__15);
				setState(518);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(517);
					match(T__4);
					}
				}

				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(520);
					match(T__17);
					setState(521);
					match(T__4);
					}
					break;
				}
				setState(527); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(527);
						switch (_input.LA(1)) {
						case T__8:
						case T__9:
						case T__10:
						case T__11:
						case T__12:
						case T__13:
						case T__20:
						case RESERVADAS:
						case OPERADORES_LOGICOS:
						case OPERADOR_NEGACION:
						case IDENTIFICADOR:
						case NUMERO:
						case FLOTANTE:
							{
							setState(524);
							declaration();
							}
							break;
						case T__17:
							{
							setState(525);
							match(T__17);
							setState(526);
							match(T__4);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(529); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(533);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(531);
					match(T__17);
					setState(532);
					match(T__4);
					}
				}

				setState(535);
				match(T__21);
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(536);
					match(T__4);
					}
					break;
				}
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0220\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\6\3,\n\3\r\3\16\3-\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\6\5?\n\5\r\5\16\5@\3\6\3\6"+
		"\3\6\6\6F\n\6\r\6\16\6G\3\7\3\7\3\7\3\7\3\7\6\7O\n\7\r\7\16\7P\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\6\bc\n\b\r\b"+
		"\16\bd\3\t\6\th\n\t\r\t\16\ti\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\5\rw\n\r\3\r\3\r\3\r\3\r\5\r}\n\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0095\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\5\17\u00ae\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b6\n\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\5\21\u00be\n\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00c6\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d1"+
		"\n\23\3\23\3\23\5\23\u00d5\n\23\3\23\3\23\6\23\u00d9\n\23\r\23\16\23\u00da"+
		"\5\23\u00dd\n\23\3\23\6\23\u00e0\n\23\r\23\16\23\u00e1\5\23\u00e4\n\23"+
		"\3\23\5\23\u00e7\n\23\3\23\3\23\5\23\u00eb\n\23\3\23\3\23\5\23\u00ef\n"+
		"\23\3\23\3\23\5\23\u00f3\n\23\3\23\6\23\u00f6\n\23\r\23\16\23\u00f7\5"+
		"\23\u00fa\n\23\3\23\5\23\u00fd\n\23\3\23\3\23\5\23\u0101\n\23\5\23\u0103"+
		"\n\23\3\23\3\23\5\23\u0107\n\23\3\23\3\23\3\23\5\23\u010c\n\23\3\23\6"+
		"\23\u010f\n\23\r\23\16\23\u0110\5\23\u0113\n\23\5\23\u0115\n\23\3\23\5"+
		"\23\u0118\n\23\3\23\3\23\5\23\u011c\n\23\3\23\3\23\5\23\u0120\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012f"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u0135\n\23\3\23\6\23\u0138\n\23\r\23\16"+
		"\23\u0139\3\23\3\23\3\23\5\23\u013f\n\23\3\23\3\23\3\23\3\23\5\23\u0145"+
		"\n\23\3\23\6\23\u0148\n\23\r\23\16\23\u0149\5\23\u014c\n\23\3\23\3\23"+
		"\3\23\5\23\u0151\n\23\3\23\3\23\6\23\u0155\n\23\r\23\16\23\u0156\5\23"+
		"\u0159\n\23\3\23\3\23\3\23\5\23\u015e\n\23\3\23\3\23\5\23\u0162\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u0172\n\23\3\23\6\23\u0175\n\23\r\23\16\23\u0176\3\23\3\23\3\23\5"+
		"\23\u017c\n\23\3\23\3\23\3\23\3\23\5\23\u0182\n\23\3\23\6\23\u0185\n\23"+
		"\r\23\16\23\u0186\5\23\u0189\n\23\3\23\3\23\3\23\5\23\u018e\n\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0194\n\23\3\23\6\23\u0197\n\23\r\23\16\23\u0198"+
		"\5\23\u019b\n\23\3\23\3\23\5\23\u019f\n\23\5\23\u01a1\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u01aa\n\24\3\24\3\24\5\24\u01ae\n\24\3\24"+
		"\3\24\5\24\u01b2\n\24\3\24\3\24\6\24\u01b6\n\24\r\24\16\24\u01b7\3\24"+
		"\3\24\5\24\u01bc\n\24\3\24\3\24\5\24\u01c0\n\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u01c9\n\24\3\24\3\24\5\24\u01cd\n\24\3\24\3\24\3\24"+
		"\6\24\u01d2\n\24\r\24\16\24\u01d3\3\24\3\24\5\24\u01d8\n\24\3\24\3\24"+
		"\5\24\u01dc\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u01e9\n\24\3\24\3\24\5\24\u01ed\n\24\3\24\3\24\3\24\6\24\u01f2\n"+
		"\24\r\24\16\24\u01f3\3\24\3\24\5\24\u01f8\n\24\3\24\3\24\5\24\u01fc\n"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0209"+
		"\n\24\3\24\3\24\5\24\u020d\n\24\3\24\3\24\3\24\6\24\u0212\n\24\r\24\16"+
		"\24\u0213\3\24\3\24\5\24\u0218\n\24\3\24\3\24\5\24\u021c\n\24\5\24\u021e"+
		"\n\24\3\24\4P\u01d3\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2"+
		"\5\3\2\"#\3\2\3\6\3\2!#\u0289\2(\3\2\2\2\4+\3\2\2\2\6\67\3\2\2\2\b>\3"+
		"\2\2\2\nE\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20g\3\2\2\2\22k\3\2\2\2\24m\3"+
		"\2\2\2\26o\3\2\2\2\30\u009d\3\2\2\2\32\u009f\3\2\2\2\34\u00a9\3\2\2\2"+
		"\36\u00b1\3\2\2\2 \u00b9\3\2\2\2\"\u00c1\3\2\2\2$\u01a0\3\2\2\2&\u021d"+
		"\3\2\2\2()\5\4\3\2)\3\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2"+
		"-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\5\3\2\2\2\618\5\b\5\2\628\5\n\6\2"+
		"\638\5\16\b\2\648\5\20\t\2\658\5\30\r\2\668\5\f\7\2\67\61\3\2\2\2\67\62"+
		"\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\7\3"+
		"\2\2\29?\5\32\16\2:?\5\34\17\2;?\5\36\20\2<?\5 \21\2=?\5\"\22\2>9\3\2"+
		"\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2"+
		"\2\2A\t\3\2\2\2BF\5\22\n\2CF\5\24\13\2DF\5\26\f\2EB\3\2\2\2EC\3\2\2\2"+
		"ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IJ\t\2\2\2JK\7\3\2"+
		"\2KL\t\2\2\2LN\3\2\2\2MO\t\3\2\2NM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2PN\3\2\2"+
		"\2QR\3\2\2\2R`\7\7\2\2ST\t\2\2\2TU\7\6\2\2UV\t\2\2\2V`\7\7\2\2WX\t\2\2"+
		"\2XY\7\5\2\2YZ\t\2\2\2Z`\7\7\2\2[\\\t\2\2\2\\]\7\4\2\2]^\t\2\2\2^`\7\7"+
		"\2\2_I\3\2\2\2_S\3\2\2\2_W\3\2\2\2_[\3\2\2\2`\r\3\2\2\2ac\5$\23\2ba\3"+
		"\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\17\3\2\2\2fh\5&\24\2gf\3\2\2\2h"+
		"i\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\21\3\2\2\2kl\7\31\2\2l\23\3\2\2\2mn\7\32"+
		"\2\2n\25\3\2\2\2op\7\33\2\2p\27\3\2\2\2qv\7!\2\2rs\7\b\2\2sw\7\t\2\2t"+
		"u\7\b\2\2uw\7\n\2\2vr\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u009e\7\7"+
		"\2\2y|\7!\2\2z{\7\b\2\2{}\7!\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u009e"+
		"\7\7\2\2\177\u0082\7!\2\2\u0080\u0081\7\b\2\2\u0081\u0083\7\36\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u009e\7\7"+
		"\2\2\u0085\u0088\7!\2\2\u0086\u0087\7\b\2\2\u0087\u0089\7 \2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009e\7\7\2\2\u008b"+
		"\u008e\7!\2\2\u008c\u008d\7\b\2\2\u008d\u008f\7\"\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u009e\7\7\2\2\u0091"+
		"\u0094\7!\2\2\u0092\u0093\7\b\2\2\u0093\u0095\7#\2\2\u0094\u0092\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009e\7\7\2\2\u0097\u0098"+
		"\7!\2\2\u0098\u0099\7\b\2\2\u0099\u009a\5\f\7\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\7\7\2\2\u009c\u009e\3\2\2\2\u009dq\3\2\2\2\u009dy\3\2\2\2\u009d"+
		"\177\3\2\2\2\u009d\u0085\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u0091\3\2\2"+
		"\2\u009d\u0097\3\2\2\2\u009e\31\3\2\2\2\u009f\u00a0\7\13\2\2\u00a0\u00a5"+
		"\7!\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a6\7\t\2\2\u00a3\u00a4\7\b\2\2\u00a4"+
		"\u00a6\7\n\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\7\2\2\u00a8\33\3\2\2\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\u00ad\7!\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ae\7\36\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\7"+
		"\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2\u00b5\7!\2\2\u00b3\u00b4"+
		"\7\b\2\2\u00b4\u00b6\7 \2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\16\2"+
		"\2\u00ba\u00bd\7!\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00be\7\"\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\7\2\2\u00c0"+
		"!\3\2\2\2\u00c1\u00c2\7\17\2\2\u00c2\u00c5\7!\2\2\u00c3\u00c4\7\b\2\2"+
		"\u00c4\u00c6\7#\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\7\7\2\2\u00c8#\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca"+
		"\u00cb\7\21\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\t"+
		"\4\2\2\u00ce\u00d0\7\22\2\2\u00cf\u00d1\7\7\2\2\u00d0\u00cf\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\23\2\2\u00d3\u00d5\7"+
		"\7\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\3\2\2\2\u00d6"+
		"\u00d8\7\24\2\2\u00d7\u00d9\7\7\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de\u00e0\5\6"+
		"\4\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e7\7\7\2\2\u00e6\u00e5\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00eb\7"+
		"\7\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u0102\3\2\2\2\u00ec"+
		"\u00ee\7\25\2\2\u00ed\u00ef\7\7\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f3\7\7\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f6\5\6"+
		"\4\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f5\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\7\7\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00ff\7\24\2\2\u00ff\u0101\7"+
		"\7\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00ec\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0105\7\24"+
		"\2\2\u0105\u0107\7\7\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0114\3\2\2\2\u0108\u0109\7\20\2\2\u0109\u010b\7\23\2\2\u010a\u010c\7"+
		"\7\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0112\3\2\2\2\u010d"+
		"\u010f\5\6\4\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0108\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0118\7\7\2\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u011a\7\24\2\2\u011a\u011c\7"+
		"\7\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\7\26\2\2\u011e\u0120\7\7\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u01a1\3\2\2\2\u0121\u0122\7\20\2\2\u0122\u0123\7\21\2\2\u0123"+
		"\u0124\7!\2\2\u0124\u0125\7\35\2\2\u0125\u0126\7!\2\2\u0126\u0127\7\32"+
		"\2\2\u0127\u0128\7!\2\2\u0128\u0129\7\35\2\2\u0129\u012a\7!\2\2\u012a"+
		"\u012e\7\22\2\2\u012b\u012c\7\24\2\2\u012c\u012f\7\7\2\2\u012d\u012f\7"+
		"\7\2\2\u012e\u012b\3\2\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0134\7\23\2\2\u0131\u0132\7\24\2\2\u0132\u0135\7"+
		"\7\2\2\u0133\u0135\7\7\2\2\u0134\u0131\3\2\2\2\u0134\u0133\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\5\6\4\2\u0137\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013e\3\2\2\2\u013b\u013c\7\24\2\2\u013c\u013f\7\7\2\2\u013d\u013f\7"+
		"\7\2\2\u013e\u013b\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u014b\3\2\2\2\u0140"+
		"\u0144\7\25\2\2\u0141\u0142\7\24\2\2\u0142\u0145\7\7\2\2\u0143\u0145\7"+
		"\7\2\2\u0144\u0141\3\2\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0148\5\6\4\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0140\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2\2\2\u014d\u014e\7\24"+
		"\2\2\u014e\u0151\7\7\2\2\u014f\u0151\7\7\2\2\u0150\u014d\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0158\3\2\2\2\u0152\u0154\7\20"+
		"\2\2\u0153\u0155\5\6\4\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0152\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u015d\3\2\2\2\u015a\u015b\7\24\2\2\u015b"+
		"\u015e\7\7\2\2\u015c\u015e\7\7\2\2\u015d\u015a\3\2\2\2\u015d\u015c\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\26\2\2\u0160"+
		"\u0162\7\7\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u01a1\3\2"+
		"\2\2\u0163\u0164\7\20\2\2\u0164\u0165\7\21\2\2\u0165\u0166\t\4\2\2\u0166"+
		"\u0167\7\35\2\2\u0167\u0168\t\4\2\2\u0168\u0169\7\32\2\2\u0169\u016a\t"+
		"\2\2\2\u016a\u016b\7\35\2\2\u016b\u016c\t\2\2\2\u016c\u016d\7\22\2\2\u016d"+
		"\u0171\7\23\2\2\u016e\u016f\7\24\2\2\u016f\u0172\7\7\2\2\u0170\u0172\7"+
		"\7\2\2\u0171\u016e\3\2\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0174\3\2\2\2\u0173\u0175\5\6\4\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017b\3\2\2\2\u0178"+
		"\u0179\7\24\2\2\u0179\u017c\7\7\2\2\u017a\u017c\7\7\2\2\u017b\u0178\3"+
		"\2\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0188\3\2\2\2\u017d"+
		"\u0181\7\25\2\2\u017e\u017f\7\24\2\2\u017f\u0182\7\7\2\2\u0180\u0182\7"+
		"\7\2\2\u0181\u017e\3\2\2\2\u0181\u0180\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0185\5\6\4\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2\2\2\u0188"+
		"\u017d\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018d\3\2\2\2\u018a\u018b\7\24"+
		"\2\2\u018b\u018e\7\7\2\2\u018c\u018e\7\7\2\2\u018d\u018a\3\2\2\2\u018d"+
		"\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u019a\3\2\2\2\u018f\u0193\7\20"+
		"\2\2\u0190\u0191\7\24\2\2\u0191\u0194\7\7\2\2\u0192\u0194\7\7\2\2\u0193"+
		"\u0190\3\2\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2"+
		"\2\2\u0195\u0197\5\6\4\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u018f\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\7\26\2\2\u019d"+
		"\u019f\7\7\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2"+
		"\2\2\u01a0\u00c9\3\2\2\2\u01a0\u0121\3\2\2\2\u01a0\u0163\3\2\2\2\u01a1"+
		"%\3\2\2\2\u01a2\u01a3\7\27\2\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\7!\2\2"+
		"\u01a5\u01a6\7\35\2\2\u01a6\u01a7\7!\2\2\u01a7\u01a9\7\22\2\2\u01a8\u01aa"+
		"\7\7\2\2\u01a9\u01a8\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01ac\7\24\2\2\u01ac\u01ae\7\7\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3"+
		"\2\2\2\u01ae\u01b5\3\2\2\2\u01af\u01b1\5\6\4\2\u01b0\u01b2\7\7\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b6\3\2\2\2\u01b3\u01b4\7\24"+
		"\2\2\u01b4\u01b6\7\7\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01ba\7\24\2\2\u01ba\u01bc\7\7\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7\30\2\2\u01be\u01c0\7"+
		"\7\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u021e\3\2\2\2\u01c1"+
		"\u01c2\7\27\2\2\u01c2\u01c3\7\21\2\2\u01c3\u01c4\t\4\2\2\u01c4\u01c5\7"+
		"\35\2\2\u01c5\u01c6\t\4\2\2\u01c6\u01c8\7\22\2\2\u01c7\u01c9\7\7\2\2\u01c8"+
		"\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cb\7\24"+
		"\2\2\u01cb\u01cd\7\7\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01d1\3\2\2\2\u01ce\u01d2\5\6\4\2\u01cf\u01d0\7\24\2\2\u01d0\u01d2\7"+
		"\7\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d6\7\24"+
		"\2\2\u01d6\u01d8\7\7\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01db\7\30\2\2\u01da\u01dc\7\7\2\2\u01db\u01da\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u021e\3\2\2\2\u01dd\u01de\7\27\2\2\u01de"+
		"\u01df\7\21\2\2\u01df\u01e0\7!\2\2\u01e0\u01e1\7\35\2\2\u01e1\u01e2\7"+
		"!\2\2\u01e2\u01e3\7\32\2\2\u01e3\u01e4\7!\2\2\u01e4\u01e5\7\35\2\2\u01e5"+
		"\u01e6\7!\2\2\u01e6\u01e8\7\22\2\2\u01e7\u01e9\7\7\2\2\u01e8\u01e7\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01eb\7\24\2\2\u01eb"+
		"\u01ed\7\7\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f1\3\2"+
		"\2\2\u01ee\u01f2\5\6\4\2\u01ef\u01f0\7\24\2\2\u01f0\u01f2\7\7\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2"+
		"\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f6\7\24\2\2\u01f6"+
		"\u01f8\7\7\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fb\7\30\2\2\u01fa\u01fc\7\7\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u021e\3\2\2\2\u01fd\u01fe\7\27\2\2\u01fe\u01ff\7"+
		"\21\2\2\u01ff\u0200\t\4\2\2\u0200\u0201\7\35\2\2\u0201\u0202\t\4\2\2\u0202"+
		"\u0203\7\32\2\2\u0203\u0204\t\2\2\2\u0204\u0205\7\35\2\2\u0205\u0206\t"+
		"\2\2\2\u0206\u0208\7\22\2\2\u0207\u0209\7\7\2\2\u0208\u0207\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u020b\7\24\2\2\u020b\u020d\7"+
		"\7\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e"+
		"\u0212\5\6\4\2\u020f\u0210\7\24\2\2\u0210\u0212\7\7\2\2\u0211\u020e\3"+
		"\2\2\2\u0211\u020f\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0216\7\24\2\2\u0216\u0218\7"+
		"\7\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021b\7\30\2\2\u021a\u021c\7\7\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3"+
		"\2\2\2\u021c\u021e\3\2\2\2\u021d\u01a2\3\2\2\2\u021d\u01c1\3\2\2\2\u021d"+
		"\u01dd\3\2\2\2\u021d\u01fd\3\2\2\2\u021e\'\3\2\2\2a-\67>@EGP_div|\u0082"+
		"\u0088\u008e\u0094\u009d\u00a5\u00ad\u00b5\u00bd\u00c5\u00d0\u00d4\u00da"+
		"\u00dc\u00e1\u00e3\u00e6\u00ea\u00ee\u00f2\u00f7\u00f9\u00fc\u0100\u0102"+
		"\u0106\u010b\u0110\u0112\u0114\u0117\u011b\u011f\u012e\u0134\u0139\u013e"+
		"\u0144\u0149\u014b\u0150\u0156\u0158\u015d\u0161\u0171\u0176\u017b\u0181"+
		"\u0186\u0188\u018d\u0193\u0198\u019a\u019e\u01a0\u01a9\u01ad\u01b1\u01b5"+
		"\u01b7\u01bb\u01bf\u01c8\u01cc\u01d1\u01d3\u01d7\u01db\u01e8\u01ec\u01f1"+
		"\u01f3\u01f7\u01fb\u0208\u020c\u0211\u0213\u0217\u021b\u021d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}