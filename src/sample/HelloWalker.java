package sample;

/**
 * Created by ckmu32 on 12/5/16.
 */
public class HelloWalker extends gramatica_BasicaBaseListener {
    public void enterR(gramatica_BasicaParser.DeclarationContext ctx ) {
        System.out.println( "Entering R : " + ctx.asignarValor().getText() );
        System.out.println( "Entering R : " + ctx.comando_selectivo().getText() );
        System.out.println( "Entering R : " + ctx.reservadas_operadores().getText() );
        System.out.println( "Entering R : " + ctx.tipoDato().getText() );
    }

    public void exitR(gramatica_BasicaParser.ParseContext ctx ) {
        System.out.println( "Exiting R" );
    }
}