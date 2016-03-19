package custom_codes;

import org.antlr.v4.runtime.RecognitionException;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by hannah on 3/20/16.
 */
public class SyntaxErrorItem {

    private int line;                   // which line of the code
    private Object offendingSymbol;     // what symbol offended thee?
    private int column;                 // character position in line
    private String msg;                 // ???
    private RecognitionException oops;  // ???

    public SyntaxErrorItem(int line, Object offendingSymbol, int column, String msg, RecognitionException oops)
    {
        this.line = line;
        this.offendingSymbol = offendingSymbol;
        this.column = column;
        this.msg = msg;
        this.oops = oops;
    }

    @Override
    public String toString()
    {
        if (oops == null)
        {
            return String.format("[%d:%d] %s\n", line, column, msg);
        }
        else
        {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            //oops.printStackTrace(pw);
            pw.close();
            return String.format("[%d:%d] %s\n%s", line, column, msg, sw.toString());
        }

        //return super.toString();
    }
}
