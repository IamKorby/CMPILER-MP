package custom_codes;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by hannah on 3/20/16.
 */
public class LexerErrorListener extends BaseErrorListener{

    private List<SyntaxErrorItem> items;
    private int errorCount;

    public LexerErrorListener()
    {
        this.items = new ArrayList<SyntaxErrorItem>();
        errorCount = 0;
    }

    /*
    RecognitionException:
    The root of the ANTLR exception hierarchy. In general, ANTLR tracks just 3 kinds of errors:
    prediction errors, failed predicate errors, and mismatched input errors.
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errorCount ++;
        this.items.add (new SyntaxErrorItem(line, offendingSymbol, charPositionInLine, msg, e));
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        super.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        super.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    }

    public void setErrorCount(int count)
    {
        this.errorCount = count;
    }

    public int getErrorCountNum()
    {
        return errorCount;
    }

    public int getErrorCount()
    {
        return this.items.size();
    }

    // Checks if an error is found
    public boolean hasErrors ()
    {
        boolean isResult;

        if(this.errorCount!= 0) {
            isResult = true;
        }
        else
        {
            isResult = false;
        }

        return isResult;
    }

    // Return the errors in string if there are any
    @Override
    public String toString()
    {
        if (!hasErrors())
        {
            return "0 errors";
        }

        StringBuilder builder = new StringBuilder();

        for(SyntaxErrorItem s : items)
        {
            builder.append(String.format("%s",s));
        }

        return builder.toString();
    }
}
