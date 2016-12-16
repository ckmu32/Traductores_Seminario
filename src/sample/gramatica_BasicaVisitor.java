// Generated from /home/ckmu32/IdeaProjects/Traductores_Seminario/src/sample/gramatica_Basica.g4 by ANTLR 4.5.3
package sample;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramatica_BasicaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramatica_BasicaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#auxiliar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxiliar(gramatica_BasicaParser.AuxiliarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(gramatica_BasicaParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gramatica_BasicaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(gramatica_BasicaParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#reservadas_operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservadas_operadores(gramatica_BasicaParser.Reservadas_operadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(gramatica_BasicaParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#comando_selectivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_selectivo(gramatica_BasicaParser.Comando_selectivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#comando_recursivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_recursivo(gramatica_BasicaParser.Comando_recursivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#reservadas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservadas(gramatica_BasicaParser.ReservadasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#operadorL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorL(gramatica_BasicaParser.OperadorLContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#operadorN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorN(gramatica_BasicaParser.OperadorNContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#asignarValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignarValor(gramatica_BasicaParser.AsignarValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(gramatica_BasicaParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#caracter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracter(gramatica_BasicaParser.CaracterContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(gramatica_BasicaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#entero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero(gramatica_BasicaParser.EnteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#flotante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlotante(gramatica_BasicaParser.FlotanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#comando_si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_si(gramatica_BasicaParser.Comando_siContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramatica_BasicaParser#comando_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando_while(gramatica_BasicaParser.Comando_whileContext ctx);
}