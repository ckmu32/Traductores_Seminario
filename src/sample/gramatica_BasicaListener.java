// Generated from /home/ckmu32/IdeaProjects/Traductores_Seminario/src/sample/gramatica_Basica.g4 by ANTLR 4.5.3
package sample;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramatica_BasicaParser}.
 */
public interface gramatica_BasicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#auxiliar}.
	 * @param ctx the parse tree
	 */
	void enterAuxiliar(gramatica_BasicaParser.AuxiliarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#auxiliar}.
	 * @param ctx the parse tree
	 */
	void exitAuxiliar(gramatica_BasicaParser.AuxiliarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(gramatica_BasicaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(gramatica_BasicaParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gramatica_BasicaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gramatica_BasicaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(gramatica_BasicaParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(gramatica_BasicaParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#reservadas_operadores}.
	 * @param ctx the parse tree
	 */
	void enterReservadas_operadores(gramatica_BasicaParser.Reservadas_operadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#reservadas_operadores}.
	 * @param ctx the parse tree
	 */
	void exitReservadas_operadores(gramatica_BasicaParser.Reservadas_operadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(gramatica_BasicaParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(gramatica_BasicaParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#comando_selectivo}.
	 * @param ctx the parse tree
	 */
	void enterComando_selectivo(gramatica_BasicaParser.Comando_selectivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#comando_selectivo}.
	 * @param ctx the parse tree
	 */
	void exitComando_selectivo(gramatica_BasicaParser.Comando_selectivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#comando_recursivo}.
	 * @param ctx the parse tree
	 */
	void enterComando_recursivo(gramatica_BasicaParser.Comando_recursivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#comando_recursivo}.
	 * @param ctx the parse tree
	 */
	void exitComando_recursivo(gramatica_BasicaParser.Comando_recursivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#reservadas}.
	 * @param ctx the parse tree
	 */
	void enterReservadas(gramatica_BasicaParser.ReservadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#reservadas}.
	 * @param ctx the parse tree
	 */
	void exitReservadas(gramatica_BasicaParser.ReservadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#operadorL}.
	 * @param ctx the parse tree
	 */
	void enterOperadorL(gramatica_BasicaParser.OperadorLContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#operadorL}.
	 * @param ctx the parse tree
	 */
	void exitOperadorL(gramatica_BasicaParser.OperadorLContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#operadorN}.
	 * @param ctx the parse tree
	 */
	void enterOperadorN(gramatica_BasicaParser.OperadorNContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#operadorN}.
	 * @param ctx the parse tree
	 */
	void exitOperadorN(gramatica_BasicaParser.OperadorNContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#asignarValor}.
	 * @param ctx the parse tree
	 */
	void enterAsignarValor(gramatica_BasicaParser.AsignarValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#asignarValor}.
	 * @param ctx the parse tree
	 */
	void exitAsignarValor(gramatica_BasicaParser.AsignarValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(gramatica_BasicaParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(gramatica_BasicaParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#caracter}.
	 * @param ctx the parse tree
	 */
	void enterCaracter(gramatica_BasicaParser.CaracterContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#caracter}.
	 * @param ctx the parse tree
	 */
	void exitCaracter(gramatica_BasicaParser.CaracterContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(gramatica_BasicaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(gramatica_BasicaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(gramatica_BasicaParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(gramatica_BasicaParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#flotante}.
	 * @param ctx the parse tree
	 */
	void enterFlotante(gramatica_BasicaParser.FlotanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#flotante}.
	 * @param ctx the parse tree
	 */
	void exitFlotante(gramatica_BasicaParser.FlotanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#comando_si}.
	 * @param ctx the parse tree
	 */
	void enterComando_si(gramatica_BasicaParser.Comando_siContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#comando_si}.
	 * @param ctx the parse tree
	 */
	void exitComando_si(gramatica_BasicaParser.Comando_siContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramatica_BasicaParser#comando_while}.
	 * @param ctx the parse tree
	 */
	void enterComando_while(gramatica_BasicaParser.Comando_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramatica_BasicaParser#comando_while}.
	 * @param ctx the parse tree
	 */
	void exitComando_while(gramatica_BasicaParser.Comando_whileContext ctx);
}