import java.io.*;
import java.util.ArrayList;

import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;



public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CommonTree ast;
		
		compParser.prog_return result = null;
		compLexer lex = new compLexer(new ANTLRFileStream("__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        tokens.setTokenSource(lex);
        compParser g = new compParser(tokens);
        
        try {
           result = g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        /*CommonTree tree = (CommonTree)parser.javaSource().getTree();
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);*/
        ast = (CommonTree) result.getTree();
        ArrayList<Symbole> sym = new ArrayList<Symbole>();
        new TDS().getSymboleFct(ast,0,0,sym);
        //System.out.println(((Tree)result.tree).toStringTree());
        
        
        
	}

}
