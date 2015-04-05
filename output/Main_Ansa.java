import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplate;



public class Main_Ansa {

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
        System.out.println(((Tree)result.tree).toStringTree());
        ArrayList<Symbole> sym = new ArrayList<Symbole>();
        TDS tds = new TDS();
        tds.getSymboleFct2(ast,0,0,sym);
        tds.getSymboleVar(ast, 0,0, sym);
        TDSGlobal tteTds= tds.merge(sym);
        TDSGlobal tdsFinal = tteTds.addNoExistTDS(ast);
        tdsFinal.display();
        //tds.getSymboleArray(ast, 0, 0, sym);
        Pro pile = new Pro(tdsFinal);
        pile.doPro(ast,0);
        pile.displayPRO();
        //Semantic controle = new Semantic(pile, tdsFinal);
        //controle.CheckVisibilityVariable(ast, 0);
        SemanticsFunct controlef = new SemanticsFunct(pile, tdsFinal);
        controlef.CheckVisibilityFunct(ast, 0);
        controlef.CheckRetourFonct(ast, 0, 0);
        controlef.CheckSameFonct();
        System.out.println("bang bang");
        controlef.CheckSameFonct();
        SemanticsTab sem=new SemanticsTab();
        sem.printSemanticsErrorDecl(tdsFinal);
        sem.printSemanticsBound(tdsFinal);
        sem.printSemanticsAffect(ast);
        //sem.printSemanticDecl(ast, tdsFinal);
	}

}
