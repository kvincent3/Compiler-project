import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
<<<<<<< HEAD
        compLexer lex = new compLexer(new ANTLRFileStream("/home/katana/Desktop/compile/vincent66u/output/__Test___input.txt", "UTF8"));
=======
        compLexer lex = new compLexer(new ANTLRFileStream("/home/vincent/Bureau/output/__Test___input.txt", "UTF8"));
>>>>>>> cf87bb54330e63d2b70fa25c172eaf9a561796cd
        CommonTokenStream tokens = new CommonTokenStream(lex);

        compParser g = new compParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}