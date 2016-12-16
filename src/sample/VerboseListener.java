package sample;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

/**
 * Created by Raúl on 06/12/2016.
 */


public class VerboseListener extends BaseErrorListener{
    //Controller antlrErrors;
    public static String error, errorLine;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        error = "rule stack: "  + stack;
        errorLine = "\nline " + line + ":" + charPositionInLine + "at " + offendingSymbol + ": " + msg;
        //antlrErrors.setError(error);
        //antlrErrors.setErrorLine(errorLine);
        System.err.println("rule stack: " + stack);
        System.err.println("line "+line+":" + charPositionInLine+" at "+
                offendingSymbol+": "+msg);
    }


}
