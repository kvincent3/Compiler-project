// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/oussama/Desktop/Compil/vincent66u/comp.g 2015-04-06 19:43:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class compParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FONCTION", "PROCEDURE", "AFFECTATION", "DECLARATION", "INSTRUCTION", "BLOC", "ITERATION", "CONDITION", "RETOUR", "READ", "WRITE", "APPEL", "CALL", "PARAM", "LISTPARAM", "DEC_VAR", "ARRAY", "INTERVAL", "BOUNDS", "CASE", "VAL", "TABLEAU", "IDF", "CST_ENT", "CSTE_CHAINE", "WS", "'do'", "'end'", "','", "'integer'", "'boolean'", "'array'", "'['", "']'", "'..'", "'('", "')'", "'adr'", "':'", "'begin'", "'='", "'for'", "'in'", "'if'", "'then'", "'else'", "'fi'", "'return'", "'+'", "'-'", "'true'", "'false'", "'*'", "'/'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int INSTRUCTION=9;
    public static final int T__64=64;
    public static final int IDF=27;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int CASE=24;
    public static final int PARAM=18;
    public static final int CONDITION=12;
    public static final int T__61=61;
    public static final int CSTE_CHAINE=29;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int DECLARATION=8;
    public static final int INTERVAL=22;
    public static final int CST_ENT=28;
    public static final int LISTPARAM=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int VAL=25;
    public static final int APPEL=16;
    public static final int VAR=4;
    public static final int T__50=50;
    public static final int ARRAY=21;
    public static final int ITERATION=11;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int BLOC=10;
    public static final int T__45=45;
    public static final int FONCTION=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int TABLEAU=26;
    public static final int WRITE=15;
    public static final int PROCEDURE=6;
    public static final int RETOUR=13;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=30;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int BOUNDS=23;
    public static final int T__37=37;
    public static final int READ=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int AFFECTATION=7;
    public static final int CALL=17;
    public static final int DEC_VAR=20;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "param", "dec_proc", "exp", "dec_var", "exp2", "iteration", 
        "appel", "declaration", "plus", "ent_proc", "bounds", "condition", 
        "bloc", "read", "exp4", "formal", "array", "atom", "type", "prog", 
        "fois", "instruction", "retour", "dec_func", "write", "ent_func", 
        "affectation"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public compParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public compParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public compParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return compParser.tokenNames; }
    public String getGrammarFileName() { return "/home/oussama/Desktop/Compil/vincent66u/comp.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:1: prog : 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' ) ;
    public final compParser.prog_return prog() throws RecognitionException {
        compParser.prog_return retval = new compParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token string_literal4=null;
        compParser.declaration_return declaration2 = null;

        compParser.instruction_return instruction3 = null;


        CommonTree string_literal1_tree=null;
        CommonTree string_literal4_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:11: ( 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:14: 'do' ( declaration )* ( instruction )* 'end'
            {
            dbg.location(32,14);
            string_literal1=(Token)match(input,31,FOLLOW_31_in_prog140);  
            stream_31.add(string_literal1);

            dbg.location(32,20);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:20: ( declaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FONCTION && LA1_0<=PROCEDURE)||(LA1_0>=34 && LA1_0<=36)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:21: declaration
            	    {
            	    dbg.location(32,21);
            	    pushFollow(FOLLOW_declaration_in_prog144);
            	    declaration2=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(32,37);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:37: ( instruction )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=READ && LA2_0<=WRITE)||LA2_0==IDF||LA2_0==44||LA2_0==46||LA2_0==48||LA2_0==52) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:38: instruction
            	    {
            	    dbg.location(32,38);
            	    pushFollow(FOLLOW_instruction_in_prog151);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(32,54);
            string_literal4=(Token)match(input,32,FOLLOW_32_in_prog157);  
            stream_32.add(string_literal4);



            // AST REWRITE
            // elements: instruction, 31, declaration, 32
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 32:60: -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' )
            {
                dbg.location(32,63);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:63: ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(32,65);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_31.nextNode(), root_1);

                dbg.location(32,70);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:70: ^( DECLARATION ( ( declaration )* )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(32,72);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATION, "DECLARATION"), root_2);

                dbg.location(32,84);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:84: ( ( declaration )* )?
                if ( stream_declaration.hasNext() ) {
                    dbg.location(32,85);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:85: ( declaration )*
                    while ( stream_declaration.hasNext() ) {
                        dbg.location(32,86);
                        adaptor.addChild(root_2, stream_declaration.nextTree());

                    }
                    stream_declaration.reset();

                }
                stream_declaration.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(32,104);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:104: ^( INSTRUCTION ( instruction )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(32,106);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_2);

                dbg.location(32,118);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:118: ( instruction )*
                while ( stream_instruction.hasNext() ) {
                    dbg.location(32,119);
                    adaptor.addChild(root_2, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(32,134);
                adaptor.addChild(root_1, stream_32.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(33, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:34:1: declaration : ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc );
    public final compParser.declaration_return declaration() throws RecognitionException {
        compParser.declaration_return retval = new compParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        compParser.dec_var_return dec_var5 = null;

        compParser.dec_func_return dec_func6 = null;

        compParser.dec_proc_return dec_proc7 = null;


        RewriteRuleSubtreeStream stream_dec_func=new RewriteRuleSubtreeStream(adaptor,"rule dec_func");
        RewriteRuleSubtreeStream stream_dec_proc=new RewriteRuleSubtreeStream(adaptor,"rule dec_proc");
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:34:13: ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc )
            int alt3=3;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
                {
                alt3=1;
                }
                break;
            case FONCTION:
                {
                alt3=2;
                }
                break;
            case PROCEDURE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:34:16: dec_var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(34,16);
                    pushFollow(FOLLOW_dec_var_in_declaration213);
                    dec_var5=dec_var();

                    state._fsp--;

                    adaptor.addChild(root_0, dec_var5.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:35:5: dec_func
                    {
                    dbg.location(35,5);
                    pushFollow(FOLLOW_dec_func_in_declaration220);
                    dec_func6=dec_func();

                    state._fsp--;

                    stream_dec_func.add(dec_func6.getTree());


                    // AST REWRITE
                    // elements: dec_func
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 35:14: -> dec_func
                    {
                        dbg.location(35,16);
                        adaptor.addChild(root_0, stream_dec_func.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:36:5: dec_proc
                    {
                    dbg.location(36,5);
                    pushFollow(FOLLOW_dec_proc_in_declaration229);
                    dec_proc7=dec_proc();

                    state._fsp--;

                    stream_dec_proc.add(dec_proc7.getTree());


                    // AST REWRITE
                    // elements: dec_proc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 36:14: -> dec_proc
                    {
                        dbg.location(36,16);
                        adaptor.addChild(root_0, stream_dec_proc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"

    public static class dec_var_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_var"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:1: dec_var : type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) ;
    public final compParser.dec_var_return dec_var() throws RecognitionException {
        compParser.dec_var_return retval = new compParser.dec_var_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF9=null;
        Token char_literal10=null;
        Token IDF11=null;
        compParser.type_return type8 = null;


        CommonTree IDF9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree IDF11_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "dec_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:13: ( type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:16: type IDF ( ',' IDF )*
            {
            dbg.location(38,16);
            pushFollow(FOLLOW_type_in_dec_var246);
            type8=type();

            state._fsp--;

            stream_type.add(type8.getTree());
            dbg.location(38,24);
            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var251);  
            stream_IDF.add(IDF9);

            dbg.location(38,28);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:28: ( ',' IDF )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:29: ',' IDF
            	    {
            	    dbg.location(38,29);
            	    char_literal10=(Token)match(input,33,FOLLOW_33_in_dec_var254);  
            	    stream_33.add(char_literal10);

            	    dbg.location(38,35);
            	    IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var258);  
            	    stream_IDF.add(IDF11);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: IDF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:40: -> ^( VAR type ( IDF )+ )
            {
                dbg.location(38,42);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:42: ^( VAR type ( IDF )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(38,44);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                dbg.location(38,48);
                adaptor.addChild(root_1, stream_type.nextTree());
                dbg.location(38,53);
                if ( !(stream_IDF.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDF.hasNext() ) {
                    dbg.location(38,53);
                    adaptor.addChild(root_1, stream_IDF.nextNode());

                }
                stream_IDF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dec_var");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dec_var"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:1: type : ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | array -> ^( array ) );
    public final compParser.type_return type() throws RecognitionException {
        compParser.type_return retval = new compParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal12=null;
        Token string_literal13=null;
        compParser.array_return array14 = null;


        CommonTree string_literal12_tree=null;
        CommonTree string_literal13_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_array=new RewriteRuleSubtreeStream(adaptor,"rule array");
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:13: ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | array -> ^( array ) )
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:17: 'integer'
                    {
                    dbg.location(40,17);
                    string_literal12=(Token)match(input,34,FOLLOW_34_in_type287);  
                    stream_34.add(string_literal12);



                    // AST REWRITE
                    // elements: 34
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:26: -> ^( 'integer' )
                    {
                        dbg.location(40,28);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:28: ^( 'integer' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(40,30);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:41:27: 'boolean'
                    {
                    dbg.location(41,27);
                    string_literal13=(Token)match(input,35,FOLLOW_35_in_type321);  
                    stream_35.add(string_literal13);



                    // AST REWRITE
                    // elements: 35
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 41:36: -> ^( 'boolean' )
                    {
                        dbg.location(41,38);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:41:38: ^( 'boolean' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(41,40);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:42:28: array
                    {
                    dbg.location(42,28);
                    pushFollow(FOLLOW_array_in_type356);
                    array14=array();

                    state._fsp--;

                    stream_array.add(array14.getTree());


                    // AST REWRITE
                    // elements: array
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:34: -> ^( array )
                    {
                        dbg.location(42,36);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:42:36: ^( array )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(42,38);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_array.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(42, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class dec_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_func"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:1: dec_func : ent_func ( declaration )* ( instruction )* 'end' -> ^( ent_func ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' ) ;
    public final compParser.dec_func_return dec_func() throws RecognitionException {
        compParser.dec_func_return retval = new compParser.dec_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal18=null;
        compParser.ent_func_return ent_func15 = null;

        compParser.declaration_return declaration16 = null;

        compParser.instruction_return instruction17 = null;


        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_func=new RewriteRuleSubtreeStream(adaptor,"rule ent_func");
        try { dbg.enterRule(getGrammarFileName(), "dec_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:13: ( ent_func ( declaration )* ( instruction )* 'end' -> ^( ent_func ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:16: ent_func ( declaration )* ( instruction )* 'end'
            {
            dbg.location(43,16);
            pushFollow(FOLLOW_ent_func_in_dec_func372);
            ent_func15=ent_func();

            state._fsp--;

            stream_ent_func.add(ent_func15.getTree());
            dbg.location(43,26);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:26: ( declaration )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=FONCTION && LA6_0<=PROCEDURE)||(LA6_0>=34 && LA6_0<=36)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:27: declaration
            	    {
            	    dbg.location(43,27);
            	    pushFollow(FOLLOW_declaration_in_dec_func376);
            	    declaration16=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(43,43);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:43: ( instruction )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=READ && LA7_0<=WRITE)||LA7_0==IDF||LA7_0==44||LA7_0==46||LA7_0==48||LA7_0==52) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:45: instruction
            	    {
            	    dbg.location(43,45);
            	    pushFollow(FOLLOW_instruction_in_dec_func384);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(43,59);
            string_literal18=(Token)match(input,32,FOLLOW_32_in_dec_func388);  
            stream_32.add(string_literal18);



            // AST REWRITE
            // elements: declaration, 32, ent_func, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 43:65: -> ^( ent_func ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' )
            {
                dbg.location(43,67);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:67: ^( ent_func ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(43,69);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ent_func.nextNode(), root_1);

                dbg.location(43,78);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:78: ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(43,80);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_2);

                dbg.location(43,85);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:85: ^( DECLARATION ( declaration )* )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(43,87);
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATION, "DECLARATION"), root_3);

                dbg.location(43,99);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:99: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    dbg.location(43,101);
                    adaptor.addChild(root_3, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(43,116);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:116: ^( INSTRUCTION ( instruction )+ )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(43,118);
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_3);

                dbg.location(43,130);
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    dbg.location(43,131);
                    adaptor.addChild(root_3, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(43,147);
                adaptor.addChild(root_1, stream_32.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(45, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dec_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dec_func"

    public static class dec_proc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_proc"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:1: dec_proc : ent_proc ( declaration )* ( instruction )* 'end' -> ^( ent_proc ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' ) ;
    public final compParser.dec_proc_return dec_proc() throws RecognitionException {
        compParser.dec_proc_return retval = new compParser.dec_proc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal22=null;
        compParser.ent_proc_return ent_proc19 = null;

        compParser.declaration_return declaration20 = null;

        compParser.instruction_return instruction21 = null;


        CommonTree string_literal22_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_proc=new RewriteRuleSubtreeStream(adaptor,"rule ent_proc");
        try { dbg.enterRule(getGrammarFileName(), "dec_proc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:13: ( ent_proc ( declaration )* ( instruction )* 'end' -> ^( ent_proc ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:16: ent_proc ( declaration )* ( instruction )* 'end'
            {
            dbg.location(46,16);
            pushFollow(FOLLOW_ent_proc_in_dec_proc431);
            ent_proc19=ent_proc();

            state._fsp--;

            stream_ent_proc.add(ent_proc19.getTree());
            dbg.location(46,26);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:26: ( declaration )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=FONCTION && LA8_0<=PROCEDURE)||(LA8_0>=34 && LA8_0<=36)) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:27: declaration
            	    {
            	    dbg.location(46,27);
            	    pushFollow(FOLLOW_declaration_in_dec_proc435);
            	    declaration20=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration20.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}

            dbg.location(46,43);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:43: ( instruction )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=READ && LA9_0<=WRITE)||LA9_0==IDF||LA9_0==44||LA9_0==46||LA9_0==48||LA9_0==52) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:45: instruction
            	    {
            	    dbg.location(46,45);
            	    pushFollow(FOLLOW_instruction_in_dec_proc443);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(46,59);
            string_literal22=(Token)match(input,32,FOLLOW_32_in_dec_proc447);  
            stream_32.add(string_literal22);



            // AST REWRITE
            // elements: ent_proc, instruction, declaration, 32
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:65: -> ^( ent_proc ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' )
            {
                dbg.location(46,67);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:67: ^( ent_proc ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) ) 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(46,69);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ent_proc.nextNode(), root_1);

                dbg.location(46,78);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:78: ^( BLOC ^( DECLARATION ( declaration )* ) ^( INSTRUCTION ( instruction )+ ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(46,80);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOC, "BLOC"), root_2);

                dbg.location(46,86);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:86: ^( DECLARATION ( declaration )* )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(46,88);
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATION, "DECLARATION"), root_3);

                dbg.location(46,100);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:100: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    dbg.location(46,102);
                    adaptor.addChild(root_3, stream_declaration.nextTree());

                }
                stream_declaration.reset();

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(46,117);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:46:117: ^( INSTRUCTION ( instruction )+ )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(46,119);
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_3);

                dbg.location(46,131);
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    dbg.location(46,132);
                    adaptor.addChild(root_3, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(46,148);
                adaptor.addChild(root_1, stream_32.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(47, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dec_proc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dec_proc"

    public static class ent_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_func"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:48:1: ent_func : 'function' type IDF param -> ^( FONCTION IDF type param ) ;
    public final compParser.ent_func_return ent_func() throws RecognitionException {
        compParser.ent_func_return retval = new compParser.ent_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal23=null;
        Token IDF25=null;
        compParser.type_return type24 = null;

        compParser.param_return param26 = null;


        CommonTree string_literal23_tree=null;
        CommonTree IDF25_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_FONCTION=new RewriteRuleTokenStream(adaptor,"token FONCTION");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "ent_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:48:13: ( 'function' type IDF param -> ^( FONCTION IDF type param ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:48:15: 'function' type IDF param
            {
            dbg.location(48,15);
            string_literal23=(Token)match(input,FONCTION,FOLLOW_FONCTION_in_ent_func489);  
            stream_FONCTION.add(string_literal23);

            dbg.location(48,29);
            pushFollow(FOLLOW_type_in_ent_func494);
            type24=type();

            state._fsp--;

            stream_type.add(type24.getTree());
            dbg.location(48,36);
            IDF25=(Token)match(input,IDF,FOLLOW_IDF_in_ent_func498);  
            stream_IDF.add(IDF25);

            dbg.location(48,42);
            pushFollow(FOLLOW_param_in_ent_func502);
            param26=param();

            state._fsp--;

            stream_param.add(param26.getTree());


            // AST REWRITE
            // elements: param, type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:48: -> ^( FONCTION IDF type param )
            {
                dbg.location(48,51);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:48:51: ^( FONCTION IDF type param )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(48,53);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FONCTION, "FONCTION"), root_1);

                dbg.location(48,62);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(48,66);
                adaptor.addChild(root_1, stream_type.nextTree());
                dbg.location(48,72);
                adaptor.addChild(root_1, stream_param.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(49, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ent_func");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ent_func"

    public static class ent_proc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_proc"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:50:1: ent_proc : 'procedure' IDF param -> ^( PROCEDURE IDF param ) ;
    public final compParser.ent_proc_return ent_proc() throws RecognitionException {
        compParser.ent_proc_return retval = new compParser.ent_proc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal27=null;
        Token IDF28=null;
        compParser.param_return param29 = null;


        CommonTree string_literal27_tree=null;
        CommonTree IDF28_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try { dbg.enterRule(getGrammarFileName(), "ent_proc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:50:13: ( 'procedure' IDF param -> ^( PROCEDURE IDF param ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:50:15: 'procedure' IDF param
            {
            dbg.location(50,15);
            string_literal27=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_ent_proc526);  
            stream_PROCEDURE.add(string_literal27);

            dbg.location(50,29);
            IDF28=(Token)match(input,IDF,FOLLOW_IDF_in_ent_proc530);  
            stream_IDF.add(IDF28);

            dbg.location(50,34);
            pushFollow(FOLLOW_param_in_ent_proc533);
            param29=param();

            state._fsp--;

            stream_param.add(param29.getTree());


            // AST REWRITE
            // elements: IDF, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 50:40: -> ^( PROCEDURE IDF param )
            {
                dbg.location(50,42);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:50:42: ^( PROCEDURE IDF param )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(50,44);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                dbg.location(50,54);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(50,58);
                adaptor.addChild(root_1, stream_param.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(51, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ent_proc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ent_proc"

    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:52:1: array : 'array' '[' bounds ']' -> ^( ARRAY bounds ) ;
    public final compParser.array_return array() throws RecognitionException {
        compParser.array_return retval = new compParser.array_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        compParser.bounds_return bounds32 = null;


        CommonTree string_literal30_tree=null;
        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_bounds=new RewriteRuleSubtreeStream(adaptor,"rule bounds");
        try { dbg.enterRule(getGrammarFileName(), "array");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:52:12: ( 'array' '[' bounds ']' -> ^( ARRAY bounds ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:52:14: 'array' '[' bounds ']'
            {
            dbg.location(52,14);
            string_literal30=(Token)match(input,36,FOLLOW_36_in_array555);  
            stream_36.add(string_literal30);

            dbg.location(52,22);
            char_literal31=(Token)match(input,37,FOLLOW_37_in_array557);  
            stream_37.add(char_literal31);

            dbg.location(52,26);
            pushFollow(FOLLOW_bounds_in_array559);
            bounds32=bounds();

            state._fsp--;

            stream_bounds.add(bounds32.getTree());
            dbg.location(52,32);
            char_literal33=(Token)match(input,38,FOLLOW_38_in_array560);  
            stream_38.add(char_literal33);



            // AST REWRITE
            // elements: bounds
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 52:36: -> ^( ARRAY bounds )
            {
                dbg.location(52,39);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:52:39: ^( ARRAY bounds )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(52,41);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                dbg.location(52,47);
                adaptor.addChild(root_1, stream_bounds.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(53, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "array");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "array"

    public static class bounds_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:1: bounds : CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* -> ^( INTERVAL ( ^( BOUNDS CST_ENT CST_ENT ) )+ ) ;
    public final compParser.bounds_return bounds() throws RecognitionException {
        compParser.bounds_return retval = new compParser.bounds_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CST_ENT34=null;
        Token string_literal35=null;
        Token CST_ENT36=null;
        Token char_literal37=null;
        Token CST_ENT38=null;
        Token string_literal39=null;
        Token CST_ENT40=null;

        CommonTree CST_ENT34_tree=null;
        CommonTree string_literal35_tree=null;
        CommonTree CST_ENT36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree CST_ENT38_tree=null;
        CommonTree string_literal39_tree=null;
        CommonTree CST_ENT40_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_CST_ENT=new RewriteRuleTokenStream(adaptor,"token CST_ENT");

        try { dbg.enterRule(getGrammarFileName(), "bounds");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(54, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:13: ( CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* -> ^( INTERVAL ( ^( BOUNDS CST_ENT CST_ENT ) )+ ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:16: CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )*
            {
            dbg.location(54,16);
            CST_ENT34=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds582);  
            stream_CST_ENT.add(CST_ENT34);

            dbg.location(54,24);
            string_literal35=(Token)match(input,39,FOLLOW_39_in_bounds584);  
            stream_39.add(string_literal35);

            dbg.location(54,29);
            CST_ENT36=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds586);  
            stream_CST_ENT.add(CST_ENT36);

            dbg.location(54,37);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:37: ( ',' CST_ENT '..' CST_ENT )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:38: ',' CST_ENT '..' CST_ENT
            	    {
            	    dbg.location(54,38);
            	    char_literal37=(Token)match(input,33,FOLLOW_33_in_bounds589);  
            	    stream_33.add(char_literal37);

            	    dbg.location(54,43);
            	    CST_ENT38=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds592);  
            	    stream_CST_ENT.add(CST_ENT38);

            	    dbg.location(54,51);
            	    string_literal39=(Token)match(input,39,FOLLOW_39_in_bounds594);  
            	    stream_39.add(string_literal39);

            	    dbg.location(54,57);
            	    CST_ENT40=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds597);  
            	    stream_CST_ENT.add(CST_ENT40);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}



            // AST REWRITE
            // elements: CST_ENT, CST_ENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 54:67: -> ^( INTERVAL ( ^( BOUNDS CST_ENT CST_ENT ) )+ )
            {
                dbg.location(54,69);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:69: ^( INTERVAL ( ^( BOUNDS CST_ENT CST_ENT ) )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(54,71);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERVAL, "INTERVAL"), root_1);

                dbg.location(54,80);
                if ( !(stream_CST_ENT.hasNext()||stream_CST_ENT.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_CST_ENT.hasNext()||stream_CST_ENT.hasNext() ) {
                    dbg.location(54,80);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:54:80: ^( BOUNDS CST_ENT CST_ENT )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(54,82);
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BOUNDS, "BOUNDS"), root_2);

                    dbg.location(54,89);
                    adaptor.addChild(root_2, stream_CST_ENT.nextNode());
                    dbg.location(54,97);
                    adaptor.addChild(root_2, stream_CST_ENT.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_CST_ENT.reset();
                stream_CST_ENT.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(54, 107);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bounds");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bounds"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:1: param : '(' ( formal ( ',' formal )* )? ')' -> ^( LISTPARAM ( formal )* ) ;
    public final compParser.param_return param() throws RecognitionException {
        compParser.param_return retval = new compParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        compParser.formal_return formal42 = null;

        compParser.formal_return formal44 = null;


        CommonTree char_literal41_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_formal=new RewriteRuleSubtreeStream(adaptor,"rule formal");
        try { dbg.enterRule(getGrammarFileName(), "param");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:13: ( '(' ( formal ( ',' formal )* )? ')' -> ^( LISTPARAM ( formal )* ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:16: '(' ( formal ( ',' formal )* )? ')'
            {
            dbg.location(55,16);
            char_literal41=(Token)match(input,40,FOLLOW_40_in_param627);  
            stream_40.add(char_literal41);

            dbg.location(55,20);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:20: ( formal ( ',' formal )* )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDF||LA12_0==42) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:21: formal ( ',' formal )*
                    {
                    dbg.location(55,21);
                    pushFollow(FOLLOW_formal_in_param630);
                    formal42=formal();

                    state._fsp--;

                    stream_formal.add(formal42.getTree());
                    dbg.location(55,30);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:30: ( ',' formal )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==33) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:31: ',' formal
                    	    {
                    	    dbg.location(55,31);
                    	    char_literal43=(Token)match(input,33,FOLLOW_33_in_param635);  
                    	    stream_33.add(char_literal43);

                    	    dbg.location(55,35);
                    	    pushFollow(FOLLOW_formal_in_param637);
                    	    formal44=formal();

                    	    state._fsp--;

                    	    stream_formal.add(formal44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(11);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(55,49);
            char_literal45=(Token)match(input,41,FOLLOW_41_in_param646);  
            stream_41.add(char_literal45);



            // AST REWRITE
            // elements: formal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 55:52: -> ^( LISTPARAM ( formal )* )
            {
                dbg.location(55,54);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:54: ^( LISTPARAM ( formal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(55,56);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARAM, "LISTPARAM"), root_1);

                dbg.location(55,66);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:55:66: ( formal )*
                while ( stream_formal.hasNext() ) {
                    dbg.location(55,66);
                    adaptor.addChild(root_1, stream_formal.nextTree());

                }
                stream_formal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "param"

    public static class formal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:1: formal : ( 'adr' )? IDF ':' type -> ^( PARAM ( 'adr' )? IDF type ) ;
    public final compParser.formal_return formal() throws RecognitionException {
        compParser.formal_return retval = new compParser.formal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal46=null;
        Token IDF47=null;
        Token char_literal48=null;
        compParser.type_return type49 = null;


        CommonTree string_literal46_tree=null;
        CommonTree IDF47_tree=null;
        CommonTree char_literal48_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "formal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:13: ( ( 'adr' )? IDF ':' type -> ^( PARAM ( 'adr' )? IDF type ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:15: ( 'adr' )? IDF ':' type
            {
            dbg.location(58,15);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:15: ( 'adr' )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==42) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:16: 'adr'
                    {
                    dbg.location(58,16);
                    string_literal46=(Token)match(input,42,FOLLOW_42_in_formal669);  
                    stream_42.add(string_literal46);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(58,24);
            IDF47=(Token)match(input,IDF,FOLLOW_IDF_in_formal673);  
            stream_IDF.add(IDF47);

            dbg.location(58,30);
            char_literal48=(Token)match(input,43,FOLLOW_43_in_formal677);  
            stream_43.add(char_literal48);

            dbg.location(58,36);
            pushFollow(FOLLOW_type_in_formal681);
            type49=type();

            state._fsp--;

            stream_type.add(type49.getTree());


            // AST REWRITE
            // elements: type, 42, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 58:43: -> ^( PARAM ( 'adr' )? IDF type )
            {
                dbg.location(58,45);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:45: ^( PARAM ( 'adr' )? IDF type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(58,47);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                dbg.location(58,53);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:58:53: ( 'adr' )?
                if ( stream_42.hasNext() ) {
                    dbg.location(58,53);
                    adaptor.addChild(root_1, stream_42.nextNode());

                }
                stream_42.reset();
                dbg.location(58,60);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(58,64);
                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formal"

    public static class instruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:59:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );
    public final compParser.instruction_return instruction() throws RecognitionException {
        compParser.instruction_return retval = new compParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        compParser.affectation_return affectation50 = null;

        compParser.bloc_return bloc51 = null;

        compParser.iteration_return iteration52 = null;

        compParser.condition_return condition53 = null;

        compParser.retour_return retour54 = null;

        compParser.read_return read55 = null;

        compParser.write_return write56 = null;

        compParser.appel_return appel57 = null;


        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_retour=new RewriteRuleSubtreeStream(adaptor,"rule retour");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");
        RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
        RewriteRuleSubtreeStream stream_appel=new RewriteRuleSubtreeStream(adaptor,"rule appel");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        RewriteRuleSubtreeStream stream_iteration=new RewriteRuleSubtreeStream(adaptor,"rule iteration");
        try { dbg.enterRule(getGrammarFileName(), "instruction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:59:13: ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel )
            int alt14=8;
            try { dbg.enterDecision(14);

            try {
                isCyclicDecision = true;
                alt14 = dfa14.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:59:17: affectation
                    {
                    dbg.location(59,17);
                    pushFollow(FOLLOW_affectation_in_instruction704);
                    affectation50=affectation();

                    state._fsp--;

                    stream_affectation.add(affectation50.getTree());


                    // AST REWRITE
                    // elements: affectation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 59:29: -> affectation
                    {
                        dbg.location(59,31);
                        adaptor.addChild(root_0, stream_affectation.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:60:10: bloc
                    {
                    dbg.location(60,10);
                    pushFollow(FOLLOW_bloc_in_instruction718);
                    bloc51=bloc();

                    state._fsp--;

                    stream_bloc.add(bloc51.getTree());


                    // AST REWRITE
                    // elements: bloc
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 60:16: -> bloc
                    {
                        dbg.location(60,18);
                        adaptor.addChild(root_0, stream_bloc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:61:10: iteration
                    {
                    dbg.location(61,10);
                    pushFollow(FOLLOW_iteration_in_instruction733);
                    iteration52=iteration();

                    state._fsp--;

                    stream_iteration.add(iteration52.getTree());


                    // AST REWRITE
                    // elements: iteration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 61:20: -> iteration
                    {
                        dbg.location(61,22);
                        adaptor.addChild(root_0, stream_iteration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:62:10: condition
                    {
                    dbg.location(62,10);
                    pushFollow(FOLLOW_condition_in_instruction747);
                    condition53=condition();

                    state._fsp--;

                    stream_condition.add(condition53.getTree());


                    // AST REWRITE
                    // elements: condition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 62:20: -> condition
                    {
                        dbg.location(62,22);
                        adaptor.addChild(root_0, stream_condition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:63:10: retour
                    {
                    dbg.location(63,10);
                    pushFollow(FOLLOW_retour_in_instruction761);
                    retour54=retour();

                    state._fsp--;

                    stream_retour.add(retour54.getTree());


                    // AST REWRITE
                    // elements: retour
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 63:17: -> retour
                    {
                        dbg.location(63,19);
                        adaptor.addChild(root_0, stream_retour.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:64:10: read
                    {
                    dbg.location(64,10);
                    pushFollow(FOLLOW_read_in_instruction775);
                    read55=read();

                    state._fsp--;

                    stream_read.add(read55.getTree());


                    // AST REWRITE
                    // elements: read
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:15: -> read
                    {
                        dbg.location(64,17);
                        adaptor.addChild(root_0, stream_read.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:65:10: write
                    {
                    dbg.location(65,10);
                    pushFollow(FOLLOW_write_in_instruction789);
                    write56=write();

                    state._fsp--;

                    stream_write.add(write56.getTree());


                    // AST REWRITE
                    // elements: write
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 65:16: -> write
                    {
                        dbg.location(65,18);
                        adaptor.addChild(root_0, stream_write.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:66:9: appel
                    {
                    dbg.location(66,9);
                    pushFollow(FOLLOW_appel_in_instruction802);
                    appel57=appel();

                    state._fsp--;

                    stream_appel.add(appel57.getTree());


                    // AST REWRITE
                    // elements: appel
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 66:14: -> appel
                    {
                        dbg.location(66,16);
                        adaptor.addChild(root_0, stream_appel.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(66, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "instruction");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "instruction"

    public static class appel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "appel"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:1: appel : IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) ;
    public final compParser.appel_return appel() throws RecognitionException {
        compParser.appel_return retval = new compParser.appel_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        compParser.exp_return exp60 = null;

        compParser.exp_return exp62 = null;


        CommonTree IDF58_tree=null;
        CommonTree char_literal59_tree=null;
        CommonTree char_literal61_tree=null;
        CommonTree char_literal63_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "appel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:12: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:16: IDF '(' ( exp ( ',' exp )* )? ')'
            {
            dbg.location(67,16);
            IDF58=(Token)match(input,IDF,FOLLOW_IDF_in_appel818);  
            stream_IDF.add(IDF58);

            dbg.location(67,20);
            char_literal59=(Token)match(input,40,FOLLOW_40_in_appel820);  
            stream_40.add(char_literal59);

            dbg.location(67,24);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:24: ( exp ( ',' exp )* )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=IDF && LA16_0<=CST_ENT)||LA16_0==40||(LA16_0>=54 && LA16_0<=56)) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:26: exp ( ',' exp )*
                    {
                    dbg.location(67,26);
                    pushFollow(FOLLOW_exp_in_appel824);
                    exp60=exp();

                    state._fsp--;

                    stream_exp.add(exp60.getTree());
                    dbg.location(67,29);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:29: ( ',' exp )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==33) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:31: ',' exp
                    	    {
                    	    dbg.location(67,31);
                    	    char_literal61=(Token)match(input,33,FOLLOW_33_in_appel827);  
                    	    stream_33.add(char_literal61);

                    	    dbg.location(67,34);
                    	    pushFollow(FOLLOW_exp_in_appel828);
                    	    exp62=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(15);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(67,43);
            char_literal63=(Token)match(input,41,FOLLOW_41_in_appel835);  
            stream_41.add(char_literal63);



            // AST REWRITE
            // elements: IDF, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:47: -> ^( APPEL IDF ( exp )* )
            {
                dbg.location(67,50);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:50: ^( APPEL IDF ( exp )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(67,52);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL, "APPEL"), root_1);

                dbg.location(67,58);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(67,62);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:67:62: ( exp )*
                while ( stream_exp.hasNext() ) {
                    dbg.location(67,62);
                    adaptor.addChild(root_1, stream_exp.nextTree());

                }
                stream_exp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "appel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "appel"

    public static class bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:1: bloc : 'begin' ( declaration )* ( instruction )+ 'end' ;
    public final compParser.bloc_return bloc() throws RecognitionException {
        compParser.bloc_return retval = new compParser.bloc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal64=null;
        Token string_literal67=null;
        compParser.declaration_return declaration65 = null;

        compParser.instruction_return instruction66 = null;


        CommonTree string_literal64_tree=null;
        CommonTree string_literal67_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bloc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:9: ( 'begin' ( declaration )* ( instruction )+ 'end' )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:13: 'begin' ( declaration )* ( instruction )+ 'end'
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(68,13);
            string_literal64=(Token)match(input,44,FOLLOW_44_in_bloc859); 
            string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
            adaptor.addChild(root_0, string_literal64_tree);

            dbg.location(68,22);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:22: ( declaration )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=FONCTION && LA17_0<=PROCEDURE)||(LA17_0>=34 && LA17_0<=36)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:23: declaration
            	    {
            	    dbg.location(68,23);
            	    pushFollow(FOLLOW_declaration_in_bloc863);
            	    declaration65=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration65.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}

            dbg.location(68,39);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:39: ( instruction )+
            int cnt18=0;
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=READ && LA18_0<=WRITE)||LA18_0==IDF||LA18_0==44||LA18_0==46||LA18_0==48||LA18_0==52) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:68:40: instruction
            	    {
            	    dbg.location(68,40);
            	    pushFollow(FOLLOW_instruction_in_bloc870);
            	    instruction66=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction66.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt18++;
            } while (true);
            } finally {dbg.exitSubRule(18);}

            dbg.location(68,56);
            string_literal67=(Token)match(input,32,FOLLOW_32_in_bloc876); 
            string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
            adaptor.addChild(root_0, string_literal67_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(68, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bloc");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bloc"

    public static class affectation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:69:1: affectation : ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp4 ( ',' exp4 )* ']' '=' exp -> ^( '=' IDF ^( CASE ( exp4 )+ ) ^( VAL exp ) ) );
    public final compParser.affectation_return affectation() throws RecognitionException {
        compParser.affectation_return retval = new compParser.affectation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF68=null;
        Token char_literal69=null;
        Token IDF71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        compParser.exp_return exp70 = null;

        compParser.exp4_return exp473 = null;

        compParser.exp4_return exp475 = null;

        compParser.exp_return exp78 = null;


        CommonTree IDF68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree IDF71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_exp4=new RewriteRuleSubtreeStream(adaptor,"rule exp4");
        try { dbg.enterRule(getGrammarFileName(), "affectation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:69:12: ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp4 ( ',' exp4 )* ']' '=' exp -> ^( '=' IDF ^( CASE ( exp4 )+ ) ^( VAL exp ) ) )
            int alt20=2;
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==45) ) {
                    alt20=1;
                }
                else if ( (LA20_1==37) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:69:17: IDF '=' exp
                    {
                    dbg.location(69,17);
                    IDF68=(Token)match(input,IDF,FOLLOW_IDF_in_affectation885);  
                    stream_IDF.add(IDF68);

                    dbg.location(69,23);
                    char_literal69=(Token)match(input,45,FOLLOW_45_in_affectation889);  
                    stream_45.add(char_literal69);

                    dbg.location(69,29);
                    pushFollow(FOLLOW_exp_in_affectation893);
                    exp70=exp();

                    state._fsp--;

                    stream_exp.add(exp70.getTree());


                    // AST REWRITE
                    // elements: exp, 45, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 69:33: -> ^( '=' IDF exp )
                    {
                        dbg.location(69,36);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:69:36: ^( '=' IDF exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(69,38);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);

                        dbg.location(69,42);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(69,46);
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:19: IDF '[' exp4 ( ',' exp4 )* ']' '=' exp
                    {
                    dbg.location(70,19);
                    IDF71=(Token)match(input,IDF,FOLLOW_IDF_in_affectation923);  
                    stream_IDF.add(IDF71);

                    dbg.location(70,23);
                    char_literal72=(Token)match(input,37,FOLLOW_37_in_affectation925);  
                    stream_37.add(char_literal72);

                    dbg.location(70,27);
                    pushFollow(FOLLOW_exp4_in_affectation927);
                    exp473=exp4();

                    state._fsp--;

                    stream_exp4.add(exp473.getTree());
                    dbg.location(70,32);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:32: ( ',' exp4 )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==33) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:33: ',' exp4
                    	    {
                    	    dbg.location(70,33);
                    	    char_literal74=(Token)match(input,33,FOLLOW_33_in_affectation930);  
                    	    stream_33.add(char_literal74);

                    	    dbg.location(70,37);
                    	    pushFollow(FOLLOW_exp4_in_affectation932);
                    	    exp475=exp4();

                    	    state._fsp--;

                    	    stream_exp4.add(exp475.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(70,45);
                    char_literal76=(Token)match(input,38,FOLLOW_38_in_affectation937);  
                    stream_38.add(char_literal76);

                    dbg.location(70,49);
                    char_literal77=(Token)match(input,45,FOLLOW_45_in_affectation939);  
                    stream_45.add(char_literal77);

                    dbg.location(70,53);
                    pushFollow(FOLLOW_exp_in_affectation941);
                    exp78=exp();

                    state._fsp--;

                    stream_exp.add(exp78.getTree());


                    // AST REWRITE
                    // elements: IDF, 45, exp4, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:57: -> ^( '=' IDF ^( CASE ( exp4 )+ ) ^( VAL exp ) )
                    {
                        dbg.location(70,59);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:59: ^( '=' IDF ^( CASE ( exp4 )+ ) ^( VAL exp ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(70,61);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);

                        dbg.location(70,65);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(70,70);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:70: ^( CASE ( exp4 )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(70,72);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASE, "CASE"), root_2);

                        dbg.location(70,77);
                        if ( !(stream_exp4.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp4.hasNext() ) {
                            dbg.location(70,77);
                            adaptor.addChild(root_2, stream_exp4.nextTree());

                        }
                        stream_exp4.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(70,85);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:70:85: ^( VAL exp )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(70,87);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAL, "VAL"), root_2);

                        dbg.location(70,91);
                        adaptor.addChild(root_2, stream_exp.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(70, 97);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "affectation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "affectation"

    public static class exp4_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp4"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:71:1: exp4 : exp ;
    public final compParser.exp4_return exp4() throws RecognitionException {
        compParser.exp4_return retval = new compParser.exp4_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        compParser.exp_return exp79 = null;



        try { dbg.enterRule(getGrammarFileName(), "exp4");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:72:2: ( exp )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:72:4: exp
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(72,4);
            pushFollow(FOLLOW_exp_in_exp4978);
            exp79=exp();

            state._fsp--;

            adaptor.addChild(root_0, exp79.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(72, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exp4");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exp4"

    public static class iteration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteration"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:1: iteration : 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF exp exp ^( INSTRUCTION ( instruction )* ) ) ;
    public final compParser.iteration_return iteration() throws RecognitionException {
        compParser.iteration_return retval = new compParser.iteration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal80=null;
        Token IDF81=null;
        Token string_literal82=null;
        Token string_literal84=null;
        Token string_literal86=null;
        Token string_literal88=null;
        compParser.exp_return exp83 = null;

        compParser.exp_return exp85 = null;

        compParser.instruction_return instruction87 = null;


        CommonTree string_literal80_tree=null;
        CommonTree IDF81_tree=null;
        CommonTree string_literal82_tree=null;
        CommonTree string_literal84_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal88_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try { dbg.enterRule(getGrammarFileName(), "iteration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:12: ( 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF exp exp ^( INSTRUCTION ( instruction )* ) ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:16: 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end'
            {
            dbg.location(73,16);
            string_literal80=(Token)match(input,46,FOLLOW_46_in_iteration988);  
            stream_46.add(string_literal80);

            dbg.location(73,24);
            IDF81=(Token)match(input,IDF,FOLLOW_IDF_in_iteration992);  
            stream_IDF.add(IDF81);

            dbg.location(73,30);
            string_literal82=(Token)match(input,47,FOLLOW_47_in_iteration996);  
            stream_47.add(string_literal82);

            dbg.location(73,37);
            pushFollow(FOLLOW_exp_in_iteration1000);
            exp83=exp();

            state._fsp--;

            stream_exp.add(exp83.getTree());
            dbg.location(73,43);
            string_literal84=(Token)match(input,39,FOLLOW_39_in_iteration1004);  
            stream_39.add(string_literal84);

            dbg.location(73,50);
            pushFollow(FOLLOW_exp_in_iteration1008);
            exp85=exp();

            state._fsp--;

            stream_exp.add(exp85.getTree());
            dbg.location(73,56);
            string_literal86=(Token)match(input,31,FOLLOW_31_in_iteration1012);  
            stream_31.add(string_literal86);

            dbg.location(73,63);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:63: ( instruction )+
            int cnt21=0;
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=READ && LA21_0<=WRITE)||LA21_0==IDF||LA21_0==44||LA21_0==46||LA21_0==48||LA21_0==52) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:65: instruction
            	    {
            	    dbg.location(73,65);
            	    pushFollow(FOLLOW_instruction_in_iteration1018);
            	    instruction87=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction87.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt21++;
            } while (true);
            } finally {dbg.exitSubRule(21);}

            dbg.location(73,82);
            string_literal88=(Token)match(input,32,FOLLOW_32_in_iteration1025);  
            stream_32.add(string_literal88);



            // AST REWRITE
            // elements: IDF, exp, instruction, 46, exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 73:87: -> ^( 'for' IDF exp exp ^( INSTRUCTION ( instruction )* ) )
            {
                dbg.location(73,89);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:89: ^( 'for' IDF exp exp ^( INSTRUCTION ( instruction )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(73,91);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_46.nextNode(), root_1);

                dbg.location(73,97);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(73,102);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(73,107);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(73,112);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:112: ^( INSTRUCTION ( instruction )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(73,114);
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_2);

                dbg.location(73,126);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:73:126: ( instruction )*
                while ( stream_instruction.hasNext() ) {
                    dbg.location(73,126);
                    adaptor.addChild(root_2, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(73, 143);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iteration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "iteration"

    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:1: condition : 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? ) ;
    public final compParser.condition_return condition() throws RecognitionException {
        compParser.condition_return retval = new compParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal89=null;
        Token string_literal91=null;
        Token string_literal93=null;
        Token string_literal95=null;
        compParser.exp_return exp90 = null;

        compParser.instruction_return instruction92 = null;

        compParser.instruction_return instruction94 = null;


        CommonTree string_literal89_tree=null;
        CommonTree string_literal91_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal95_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(74, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:12: ( 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:16: 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi'
            {
            dbg.location(74,16);
            string_literal89=(Token)match(input,48,FOLLOW_48_in_condition1058);  
            stream_48.add(string_literal89);

            dbg.location(74,23);
            pushFollow(FOLLOW_exp_in_condition1062);
            exp90=exp();

            state._fsp--;

            stream_exp.add(exp90.getTree());
            dbg.location(74,29);
            string_literal91=(Token)match(input,49,FOLLOW_49_in_condition1066);  
            stream_49.add(string_literal91);

            dbg.location(74,38);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:38: ( instruction )+
            int cnt22=0;
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=READ && LA22_0<=WRITE)||LA22_0==IDF||LA22_0==44||LA22_0==46||LA22_0==48||LA22_0==52) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:40: instruction
            	    {
            	    dbg.location(74,40);
            	    pushFollow(FOLLOW_instruction_in_condition1072);
            	    instruction92=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction92.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt22++;
            } while (true);
            } finally {dbg.exitSubRule(22);}

            dbg.location(74,55);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:55: ( 'else' ( instruction )+ )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:56: 'else' ( instruction )+
                    {
                    dbg.location(74,56);
                    string_literal93=(Token)match(input,50,FOLLOW_50_in_condition1078);  
                    stream_50.add(string_literal93);

                    dbg.location(74,65);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:65: ( instruction )+
                    int cnt23=0;
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23);

                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=READ && LA23_0<=WRITE)||LA23_0==IDF||LA23_0==44||LA23_0==46||LA23_0==48||LA23_0==52) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:66: instruction
                    	    {
                    	    dbg.location(74,66);
                    	    pushFollow(FOLLOW_instruction_in_condition1083);
                    	    instruction94=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction94.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt23++;
                    } while (true);
                    } finally {dbg.exitSubRule(23);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(74,85);
            string_literal95=(Token)match(input,51,FOLLOW_51_in_condition1092);  
            stream_51.add(string_literal95);



            // AST REWRITE
            // elements: 49, instruction, 48, 50, exp, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 74:90: -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? )
            {
                dbg.location(74,92);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:92: ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(74,94);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);

                dbg.location(74,99);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(74,103);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:103: ^( 'then' instruction )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(74,105);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_49.nextNode(), root_2);

                dbg.location(74,112);
                adaptor.addChild(root_2, stream_instruction.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(74,125);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:125: ( ^( 'else' ( instruction )+ ) )?
                if ( stream_instruction.hasNext()||stream_50.hasNext() ) {
                    dbg.location(74,125);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:74:125: ^( 'else' ( instruction )+ )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(74,127);
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_50.nextNode(), root_2);

                    dbg.location(74,134);
                    if ( !(stream_instruction.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_instruction.hasNext() ) {
                        dbg.location(74,135);
                        adaptor.addChild(root_2, stream_instruction.nextTree());

                    }
                    stream_instruction.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_instruction.reset();
                stream_50.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(74, 151);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condition"

    public static class retour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retour"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:75:1: retour : 'return' '(' exp ')' -> ^( RETOUR exp ) ;
    public final compParser.retour_return retour() throws RecognitionException {
        compParser.retour_return retval = new compParser.retour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        compParser.exp_return exp98 = null;


        CommonTree string_literal96_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree char_literal99_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "retour");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:75:12: ( 'return' '(' exp ')' -> ^( RETOUR exp ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:75:16: 'return' '(' exp ')'
            {
            dbg.location(75,16);
            string_literal96=(Token)match(input,52,FOLLOW_52_in_retour1128);  
            stream_52.add(string_literal96);

            dbg.location(75,25);
            char_literal97=(Token)match(input,40,FOLLOW_40_in_retour1130);  
            stream_40.add(char_literal97);

            dbg.location(75,31);
            pushFollow(FOLLOW_exp_in_retour1134);
            exp98=exp();

            state._fsp--;

            stream_exp.add(exp98.getTree());
            dbg.location(75,38);
            char_literal99=(Token)match(input,41,FOLLOW_41_in_retour1139);  
            stream_41.add(char_literal99);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 75:41: -> ^( RETOUR exp )
            {
                dbg.location(75,43);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:75:43: ^( RETOUR exp )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(75,45);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETOUR, "RETOUR"), root_1);

                dbg.location(75,52);
                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "retour");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "retour"

    public static class read_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:76:1: read : 'read' IDF -> ^( READ IDF ) ;
    public final compParser.read_return read() throws RecognitionException {
        compParser.read_return retval = new compParser.read_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal100=null;
        Token IDF101=null;

        CommonTree string_literal100_tree=null;
        CommonTree IDF101_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:76:12: ( 'read' IDF -> ^( READ IDF ) )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:76:16: 'read' IDF
            {
            dbg.location(76,16);
            string_literal100=(Token)match(input,READ,FOLLOW_READ_in_read1161);  
            stream_READ.add(string_literal100);

            dbg.location(76,26);
            IDF101=(Token)match(input,IDF,FOLLOW_IDF_in_read1166);  
            stream_IDF.add(IDF101);



            // AST REWRITE
            // elements: IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 76:30: -> ^( READ IDF )
            {
                dbg.location(76,32);
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:76:32: ^( READ IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(76,34);
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ, "READ"), root_1);

                dbg.location(76,39);
                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read"

    public static class write_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "write"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:77:1: write : ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) );
    public final compParser.write_return write() throws RecognitionException {
        compParser.write_return retval = new compParser.write_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal102=null;
        Token string_literal104=null;
        Token CSTE_CHAINE105=null;
        compParser.exp_return exp103 = null;


        CommonTree string_literal102_tree=null;
        CommonTree string_literal104_tree=null;
        CommonTree CSTE_CHAINE105_tree=null;
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "write");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:77:10: ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) )
            int alt25=2;
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==WRITE) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==CSTE_CHAINE) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=IDF && LA25_1<=CST_ENT)||LA25_1==40||(LA25_1>=54 && LA25_1<=56)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:77:14: 'write' exp
                    {
                    dbg.location(77,14);
                    string_literal102=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1185);  
                    stream_WRITE.add(string_literal102);

                    dbg.location(77,22);
                    pushFollow(FOLLOW_exp_in_write1187);
                    exp103=exp();

                    state._fsp--;

                    stream_exp.add(exp103.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 77:25: -> ^( WRITE exp )
                    {
                        dbg.location(77,27);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:77:27: ^( WRITE exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(77,29);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WRITE, "WRITE"), root_1);

                        dbg.location(77,35);
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:78:10: 'write' CSTE_CHAINE
                    {
                    dbg.location(78,10);
                    string_literal104=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1204);  
                    stream_WRITE.add(string_literal104);

                    dbg.location(78,18);
                    CSTE_CHAINE105=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_write1206);  
                    stream_CSTE_CHAINE.add(CSTE_CHAINE105);



                    // AST REWRITE
                    // elements: CSTE_CHAINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:30: -> ^( WRITE CSTE_CHAINE )
                    {
                        dbg.location(78,32);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:78:32: ^( WRITE CSTE_CHAINE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(78,34);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WRITE, "WRITE"), root_1);

                        dbg.location(78,40);
                        adaptor.addChild(root_1, stream_CSTE_CHAINE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(79, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "write");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "write"

    public static class exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:80:2: exp : ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 );
    public final compParser.exp_return exp() throws RecognitionException {
        compParser.exp_return retval = new compParser.exp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set107=null;
        Token string_literal109=null;
        Token string_literal110=null;
        compParser.plus_return plus106 = null;

        compParser.plus_return plus108 = null;

        compParser.exp2_return exp2111 = null;


        CommonTree set107_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree string_literal110_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(80, 2);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:80:9: ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 )
            int alt27=4;
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case CST_ENT:
            case 40:
            case 54:
                {
                alt27=1;
                }
                break;
            case IDF:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==37||LA27_2==40) ) {
                    alt27=4;
                }
                else if ( ((LA27_2>=READ && LA27_2<=WRITE)||LA27_2==IDF||(LA27_2>=31 && LA27_2<=33)||(LA27_2>=38 && LA27_2<=39)||LA27_2==41||LA27_2==44||LA27_2==46||(LA27_2>=48 && LA27_2<=54)||(LA27_2>=57 && LA27_2<=64)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case 55:
                {
                alt27=2;
                }
                break;
            case 56:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:80:14: plus ( ( '+' | '-' ) plus )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(80,14);
                    pushFollow(FOLLOW_plus_in_exp1236);
                    plus106=plus();

                    state._fsp--;

                    adaptor.addChild(root_0, plus106.getTree());
                    dbg.location(80,19);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:80:19: ( ( '+' | '-' ) plus )*
                    try { dbg.enterSubRule(26);

                    loop26:
                    do {
                        int alt26=2;
                        try { dbg.enterDecision(26);

                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                            alt26=1;
                        }


                        } finally {dbg.exitDecision(26);}

                        switch (alt26) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:80:20: ( '+' | '-' ) plus
                    	    {
                    	    dbg.location(80,20);
                    	    set107=(Token)input.LT(1);
                    	    set107=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=53 && input.LA(1)<=54) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set107), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        dbg.recognitionException(mse);
                    	        throw mse;
                    	    }

                    	    dbg.location(80,31);
                    	    pushFollow(FOLLOW_plus_in_exp1246);
                    	    plus108=plus();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, plus108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(26);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:81:12: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(81,12);
                    string_literal109=(Token)match(input,55,FOLLOW_55_in_exp1261); 
                    string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:82:12: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(82,12);
                    string_literal110=(Token)match(input,56,FOLLOW_56_in_exp1274); 
                    string_literal110_tree = (CommonTree)adaptor.create(string_literal110);
                    adaptor.addChild(root_0, string_literal110_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:83:12: exp2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(83,12);
                    pushFollow(FOLLOW_exp2_in_exp1287);
                    exp2111=exp2();

                    state._fsp--;

                    adaptor.addChild(root_0, exp2111.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(83, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exp"

    public static class exp2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp2"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:1: exp2 : ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) | IDF '[' exp ( ',' exp )* ']' -> ^( TABLEAU IDF ^( CASE ( exp )+ ) ) );
    public final compParser.exp2_return exp2() throws RecognitionException {
        compParser.exp2_return retval = new compParser.exp2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token IDF118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token char_literal123=null;
        compParser.exp_return exp114 = null;

        compParser.exp_return exp116 = null;

        compParser.exp_return exp120 = null;

        compParser.exp_return exp122 = null;


        CommonTree IDF112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree IDF118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree char_literal123_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "exp2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:11: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) | IDF '[' exp ( ',' exp )* ']' -> ^( TABLEAU IDF ^( CASE ( exp )+ ) ) )
            int alt31=2;
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDF) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==40) ) {
                    alt31=1;
                }
                else if ( (LA31_1==37) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:17: IDF '(' ( exp ( ',' exp )* )? ')'
                    {
                    dbg.location(84,17);
                    IDF112=(Token)match(input,IDF,FOLLOW_IDF_in_exp21303);  
                    stream_IDF.add(IDF112);

                    dbg.location(84,21);
                    char_literal113=(Token)match(input,40,FOLLOW_40_in_exp21305);  
                    stream_40.add(char_literal113);

                    dbg.location(84,25);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:25: ( exp ( ',' exp )* )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=IDF && LA29_0<=CST_ENT)||LA29_0==40||(LA29_0>=54 && LA29_0<=56)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:26: exp ( ',' exp )*
                            {
                            dbg.location(84,26);
                            pushFollow(FOLLOW_exp_in_exp21308);
                            exp114=exp();

                            state._fsp--;

                            stream_exp.add(exp114.getTree());
                            dbg.location(84,30);
                            // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:30: ( ',' exp )*
                            try { dbg.enterSubRule(28);

                            loop28:
                            do {
                                int alt28=2;
                                try { dbg.enterDecision(28);

                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==33) ) {
                                    alt28=1;
                                }


                                } finally {dbg.exitDecision(28);}

                                switch (alt28) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:31: ',' exp
                            	    {
                            	    dbg.location(84,31);
                            	    char_literal115=(Token)match(input,33,FOLLOW_33_in_exp21311);  
                            	    stream_33.add(char_literal115);

                            	    dbg.location(84,35);
                            	    pushFollow(FOLLOW_exp_in_exp21313);
                            	    exp116=exp();

                            	    state._fsp--;

                            	    stream_exp.add(exp116.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);
                            } finally {dbg.exitSubRule(28);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(84,44);
                    char_literal117=(Token)match(input,41,FOLLOW_41_in_exp21320);  
                    stream_41.add(char_literal117);



                    // AST REWRITE
                    // elements: exp, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:47: -> ^( APPEL IDF ( exp )* )
                    {
                        dbg.location(84,49);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:49: ^( APPEL IDF ( exp )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(84,51);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL, "APPEL"), root_1);

                        dbg.location(84,57);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(84,61);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:84:61: ( exp )*
                        while ( stream_exp.hasNext() ) {
                            dbg.location(84,61);
                            adaptor.addChild(root_1, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:85:18: IDF '[' exp ( ',' exp )* ']'
                    {
                    dbg.location(85,18);
                    IDF118=(Token)match(input,IDF,FOLLOW_IDF_in_exp21348);  
                    stream_IDF.add(IDF118);

                    dbg.location(85,22);
                    char_literal119=(Token)match(input,37,FOLLOW_37_in_exp21350);  
                    stream_37.add(char_literal119);

                    dbg.location(85,26);
                    pushFollow(FOLLOW_exp_in_exp21352);
                    exp120=exp();

                    state._fsp--;

                    stream_exp.add(exp120.getTree());
                    dbg.location(85,30);
                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:85:30: ( ',' exp )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==33) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:85:31: ',' exp
                    	    {
                    	    dbg.location(85,31);
                    	    char_literal121=(Token)match(input,33,FOLLOW_33_in_exp21355);  
                    	    stream_33.add(char_literal121);

                    	    dbg.location(85,35);
                    	    pushFollow(FOLLOW_exp_in_exp21357);
                    	    exp122=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp122.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(85,42);
                    char_literal123=(Token)match(input,38,FOLLOW_38_in_exp21362);  
                    stream_38.add(char_literal123);



                    // AST REWRITE
                    // elements: IDF, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:45: -> ^( TABLEAU IDF ^( CASE ( exp )+ ) )
                    {
                        dbg.location(85,47);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:85:47: ^( TABLEAU IDF ^( CASE ( exp )+ ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(85,49);
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TABLEAU, "TABLEAU"), root_1);

                        dbg.location(85,57);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(85,61);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:85:61: ^( CASE ( exp )+ )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(85,63);
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CASE, "CASE"), root_2);

                        dbg.location(85,68);
                        if ( !(stream_exp.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_exp.hasNext() ) {
                            dbg.location(85,68);
                            adaptor.addChild(root_2, stream_exp.nextTree());

                        }
                        stream_exp.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(86, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exp2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exp2"

    public static class plus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:87:1: plus : fois ( ( '*' | '/' ) fois )* ;
    public final compParser.plus_return plus() throws RecognitionException {
        compParser.plus_return retval = new compParser.plus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set125=null;
        compParser.fois_return fois124 = null;

        compParser.fois_return fois126 = null;


        CommonTree set125_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "plus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:87:12: ( fois ( ( '*' | '/' ) fois )* )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:87:16: fois ( ( '*' | '/' ) fois )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(87,16);
            pushFollow(FOLLOW_fois_in_plus1407);
            fois124=fois();

            state._fsp--;

            adaptor.addChild(root_0, fois124.getTree());
            dbg.location(87,21);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:87:21: ( ( '*' | '/' ) fois )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=57 && LA32_0<=58)) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:87:23: ( '*' | '/' ) fois
            	    {
            	    dbg.location(87,23);
            	    set125=(Token)input.LT(1);
            	    set125=(Token)input.LT(1);
            	    if ( (input.LA(1)>=57 && input.LA(1)<=58) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set125), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(87,34);
            	    pushFollow(FOLLOW_fois_in_plus1418);
            	    fois126=fois();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fois126.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(87, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "plus");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "plus"

    public static class fois_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fois"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:1: fois : atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* ;
    public final compParser.fois_return fois() throws RecognitionException {
        compParser.fois_return retval = new compParser.fois_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal128=null;
        Token string_literal129=null;
        Token string_literal130=null;
        Token string_literal131=null;
        Token char_literal132=null;
        Token char_literal133=null;
        compParser.atom_return atom127 = null;

        compParser.atom_return atom134 = null;


        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree string_literal131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal133_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fois");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:12: ( atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* )
            dbg.enterAlt(1);

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:16: atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(88,16);
            pushFollow(FOLLOW_atom_in_fois1435);
            atom127=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom127.getTree());
            dbg.location(88,21);
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:21: ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=2;
                try { dbg.enterDecision(34);

                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=59 && LA34_0<=64)) ) {
                    alt34=1;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom
            	    {
            	    dbg.location(88,24);
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            	    int alt33=6;
            	    try { dbg.enterSubRule(33);
            	    try { dbg.enterDecision(33);

            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(33);}

            	    switch (alt33) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:25: '=='
            	            {
            	            dbg.location(88,29);
            	            string_literal128=(Token)match(input,59,FOLLOW_59_in_fois1441); 
            	            string_literal128_tree = (CommonTree)adaptor.create(string_literal128);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal128_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:33: '!='
            	            {
            	            dbg.location(88,37);
            	            string_literal129=(Token)match(input,60,FOLLOW_60_in_fois1446); 
            	            string_literal129_tree = (CommonTree)adaptor.create(string_literal129);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal129_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:41: '<='
            	            {
            	            dbg.location(88,45);
            	            string_literal130=(Token)match(input,61,FOLLOW_61_in_fois1451); 
            	            string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal130_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:49: '>='
            	            {
            	            dbg.location(88,53);
            	            string_literal131=(Token)match(input,62,FOLLOW_62_in_fois1456); 
            	            string_literal131_tree = (CommonTree)adaptor.create(string_literal131);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal131_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:57: '<'
            	            {
            	            dbg.location(88,60);
            	            char_literal132=(Token)match(input,63,FOLLOW_63_in_fois1461); 
            	            char_literal132_tree = (CommonTree)adaptor.create(char_literal132);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal132_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // /home/oussama/Desktop/Compil/vincent66u/comp.g:88:64: '>'
            	            {
            	            dbg.location(88,67);
            	            char_literal133=(Token)match(input,64,FOLLOW_64_in_fois1466); 
            	            char_literal133_tree = (CommonTree)adaptor.create(char_literal133);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal133_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(33);}

            	    dbg.location(88,72);
            	    pushFollow(FOLLOW_atom_in_fois1472);
            	    atom134=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom134.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(88, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fois");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fois"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/oussama/Desktop/Compil/vincent66u/comp.g:89:1: atom : ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( '-' atom ) );
    public final compParser.atom_return atom() throws RecognitionException {
        compParser.atom_return retval = new compParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CST_ENT135=null;
        Token IDF136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Token char_literal140=null;
        compParser.exp_return exp138 = null;

        compParser.atom_return atom141 = null;


        CommonTree CST_ENT135_tree=null;
        CommonTree IDF136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:89:12: ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( '-' atom ) )
            int alt35=4;
            try { dbg.enterDecision(35);

            switch ( input.LA(1) ) {
            case CST_ENT:
                {
                alt35=1;
                }
                break;
            case IDF:
                {
                alt35=2;
                }
                break;
            case 40:
                {
                alt35=3;
                }
                break;
            case 54:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:89:16: CST_ENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(89,16);
                    CST_ENT135=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_atom1490); 
                    CST_ENT135_tree = (CommonTree)adaptor.create(CST_ENT135);
                    adaptor.addChild(root_0, CST_ENT135_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:90:5: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(90,5);
                    IDF136=(Token)match(input,IDF,FOLLOW_IDF_in_atom1497); 
                    IDF136_tree = (CommonTree)adaptor.create(IDF136);
                    adaptor.addChild(root_0, IDF136_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:91:5: '(' exp ')'
                    {
                    dbg.location(91,5);
                    char_literal137=(Token)match(input,40,FOLLOW_40_in_atom1504);  
                    stream_40.add(char_literal137);

                    dbg.location(91,9);
                    pushFollow(FOLLOW_exp_in_atom1506);
                    exp138=exp();

                    state._fsp--;

                    stream_exp.add(exp138.getTree());
                    dbg.location(91,13);
                    char_literal139=(Token)match(input,41,FOLLOW_41_in_atom1508);  
                    stream_41.add(char_literal139);



                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:17: -> exp
                    {
                        dbg.location(91,20);
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/oussama/Desktop/Compil/vincent66u/comp.g:92:5: '-' atom
                    {
                    dbg.location(92,5);
                    char_literal140=(Token)match(input,54,FOLLOW_54_in_atom1518);  
                    stream_54.add(char_literal140);

                    dbg.location(92,9);
                    pushFollow(FOLLOW_atom_in_atom1520);
                    atom141=atom();

                    state._fsp--;

                    stream_atom.add(atom141.getTree());


                    // AST REWRITE
                    // elements: 54, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 92:14: -> ^( '-' atom )
                    {
                        dbg.location(92,16);
                        // /home/oussama/Desktop/Compil/vincent66u/comp.g:92:16: ^( '-' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(92,19);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);

                        dbg.location(92,23);
                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(93, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\12\uffff";
    static final String DFA14_eofS =
        "\12\uffff";
    static final String DFA14_minS =
        "\1\16\1\45\10\uffff";
    static final String DFA14_maxS =
        "\1\64\1\55\10\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\10";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\1\7\13\uffff\1\1\20\uffff\1\2\1\uffff\1\3\1\uffff\1\4\3"+
            "\uffff\1\5",
            "\1\10\2\uffff\1\11\4\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "59:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_31_in_prog140 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_declaration_in_prog144 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_instruction_in_prog151 = new BitSet(new long[]{0x001150010800C000L});
    public static final BitSet FOLLOW_32_in_prog157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_declaration213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_declaration220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_proc_in_declaration229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_dec_var246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_dec_var251 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_dec_var254 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_dec_var258 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_34_in_type287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_type356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_func_in_dec_func372 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_declaration_in_dec_func376 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_instruction_in_dec_func384 = new BitSet(new long[]{0x001150010800C000L});
    public static final BitSet FOLLOW_32_in_dec_func388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_proc_in_dec_proc431 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_declaration_in_dec_proc435 = new BitSet(new long[]{0x0011501D0800C060L});
    public static final BitSet FOLLOW_instruction_in_dec_proc443 = new BitSet(new long[]{0x001150010800C000L});
    public static final BitSet FOLLOW_32_in_dec_proc447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FONCTION_in_ent_func489 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_type_in_ent_func494 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_ent_func498 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_param_in_ent_func502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_ent_proc526 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_ent_proc530 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_param_in_ent_proc533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_array555 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_array557 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_bounds_in_array559 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_array560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds582 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_bounds584 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds586 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_bounds589 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds592 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_bounds594 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds597 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_40_in_param627 = new BitSet(new long[]{0x0000060008000000L});
    public static final BitSet FOLLOW_formal_in_param630 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_param635 = new BitSet(new long[]{0x0000040008000000L});
    public static final BitSet FOLLOW_formal_in_param637 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_param646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_formal669 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_formal673 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_formal677 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_type_in_formal681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_instruction747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retour_in_instruction761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_instruction802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_appel818 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_appel820 = new BitSet(new long[]{0x01C0030018000000L});
    public static final BitSet FOLLOW_exp_in_appel824 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_appel827 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_appel828 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_appel835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_bloc859 = new BitSet(new long[]{0x0011501C0800C060L});
    public static final BitSet FOLLOW_declaration_in_bloc863 = new BitSet(new long[]{0x0011501C0800C060L});
    public static final BitSet FOLLOW_instruction_in_bloc870 = new BitSet(new long[]{0x001150010800C000L});
    public static final BitSet FOLLOW_32_in_bloc876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation885 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_affectation889 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_affectation893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation923 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_affectation925 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp4_in_affectation927 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_affectation930 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp4_in_affectation932 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_38_in_affectation937 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_affectation939 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_affectation941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp_in_exp4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_iteration988 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_iteration992 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_iteration996 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_iteration1000 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_iteration1004 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_iteration1008 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_iteration1012 = new BitSet(new long[]{0x001150000800C000L});
    public static final BitSet FOLLOW_instruction_in_iteration1018 = new BitSet(new long[]{0x001150010800C000L});
    public static final BitSet FOLLOW_32_in_iteration1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_condition1058 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_condition1062 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_condition1066 = new BitSet(new long[]{0x001150000800C000L});
    public static final BitSet FOLLOW_instruction_in_condition1072 = new BitSet(new long[]{0x001D50000800C000L});
    public static final BitSet FOLLOW_50_in_condition1078 = new BitSet(new long[]{0x001150000800C000L});
    public static final BitSet FOLLOW_instruction_in_condition1083 = new BitSet(new long[]{0x001950000800C000L});
    public static final BitSet FOLLOW_51_in_condition1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_retour1128 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_retour1130 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_retour1134 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_retour1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1161 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_IDF_in_read1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1185 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_write1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1204 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_write1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_in_exp1236 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_set_in_exp1239 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_plus_in_exp1246 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_55_in_exp1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_exp1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp2_in_exp1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_exp21305 = new BitSet(new long[]{0x01C0030018000000L});
    public static final BitSet FOLLOW_exp_in_exp21308 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_exp21311 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_exp21313 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_41_in_exp21320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21348 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_exp21350 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_exp21352 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_33_in_exp21355 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_exp21357 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_38_in_exp21362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fois_in_plus1407 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_set_in_plus1411 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_fois_in_plus1418 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_atom_in_fois1435 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_59_in_fois1441 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_60_in_fois1446 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_61_in_fois1451 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_62_in_fois1456 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_63_in_fois1461 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_64_in_fois1466 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_atom_in_fois1472 = new BitSet(new long[]{0xF800000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_CST_ENT_in_atom1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_atom1504 = new BitSet(new long[]{0x01C0010018000000L});
    public static final BitSet FOLLOW_exp_in_atom1506 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_atom1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom1518 = new BitSet(new long[]{0x0040010018000000L});
    public static final BitSet FOLLOW_atom_in_atom1520 = new BitSet(new long[]{0x0000000000000002L});

}