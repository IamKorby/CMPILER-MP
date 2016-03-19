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
public class ParserErrorListener extends BaseErrorListener{

    private List<SyntaxErrorItem> items;

    public ParserErrorListener()
    {
        this.items = new ArrayList<SyntaxErrorItem>();
    }

    /*
    RecognitionException:
    The root of the ANTLR exception hierarchy. In general, ANTLR tracks just 3 kinds of errors:
    prediction errors, failed predicate errors, and mismatched input errors.
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
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

    // Checks if an error is found
    public boolean hasErrors ( )
    {
        if(this.items.size()>0)
            return true;

        return false;
    }

    // Return the errors in string if there are any
    @Override
    public String toString()
    {
        if(!hasErrors())
        {
            return "0 errors";
        }

        StringBuilder builder = new StringBuilder();

        for(SyntaxErrorItem s : items)
        {
            builder.append(String.format("%s", s));
        }

        return builder.toString();
    }
}
