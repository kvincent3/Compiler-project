// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g 2015-02-23 17:25:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class compParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FONCTION", "PROCEDURE", "AFFECTATION", "BLOC", "ITERATION", "CONDITION", "RETOUR", "READ", "WRITE", "APPEL", "CALL", "PARAM", "DEC_VAR", "IDF", "CST_ENT", "CSTE_CHAINE", "WS", "'do'", "'end'", "','", "'integer'", "'boolean'", "'array'", "'['", "']'", "'..'", "'('", "')'", "'adr'", "':'", "'begin'", "'='", "'for'", "'in'", "'if'", "'then'", "'else'", "'fi'", "'+'", "'-'", "'true'", "'false'", "'*'", "'/'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int AFFECTATION=7;
    public static final int BLOC=8;
    public static final int T__50=50;
    public static final int VAR=4;
    public static final int IDF=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int ITERATION=9;
    public static final int READ=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int CONDITION=10;
    public static final int T__25=25;
    public static final int CALL=15;
    public static final int FONCTION=5;
    public static final int CSTE_CHAINE=20;
    public static final int WRITE=13;
    public static final int APPEL=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=21;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int CST_ENT=19;
    public static final int PROCEDURE=6;
    public static final int DEC_VAR=17;
    public static final int RETOUR=11;
    public static final int PARAM=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "prog", "exp2", "bounds", "write", "dec_func", "formal", 
        "affectation", "exp", "instruction", "condition", "plus", "fois", 
        "array", "type", "retour", "dec_var", "atom", "ent_proc", "param", 
        "iteration", "read", "dec_proc", "ent_func", "bloc", "appel", "declaration"
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
    public String getGrammarFileName() { return "/home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:1: prog : 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ( ( declaration )* )? ( instruction )* 'end' ) ;
    public final compParser.prog_return prog() throws RecognitionException {
        compParser.prog_return retval = new compParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token string_literal4=null;
        compParser.declaration_return declaration2 = null;

        compParser.instruction_return instruction3 = null;


        Object string_literal1_tree=null;
        Object string_literal4_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:11: ( 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ( ( declaration )* )? ( instruction )* 'end' ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:14: 'do' ( declaration )* ( instruction )* 'end'
            {
            dbg.location(22,14);
            string_literal1=(Token)match(input,22,FOLLOW_22_in_prog101);  
            stream_22.add(string_literal1);

            dbg.location(22,20);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:20: ( declaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FONCTION && LA1_0<=PROCEDURE)||(LA1_0>=25 && LA1_0<=27)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:21: declaration
            	    {
            	    dbg.location(22,21);
            	    pushFollow(FOLLOW_declaration_in_prog105);
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

            dbg.location(22,37);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:37: ( instruction )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RETOUR && LA2_0<=WRITE)||LA2_0==IDF||LA2_0==35||LA2_0==37||LA2_0==39) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:38: instruction
            	    {
            	    dbg.location(22,38);
            	    pushFollow(FOLLOW_instruction_in_prog112);
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

            dbg.location(22,54);
            string_literal4=(Token)match(input,23,FOLLOW_23_in_prog118);  
            stream_23.add(string_literal4);



            // AST REWRITE
            // elements: 23, 22, instruction, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:60: -> ^( 'do' ( ( declaration )* )? ( instruction )* 'end' )
            {
                dbg.location(22,63);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:63: ^( 'do' ( ( declaration )* )? ( instruction )* 'end' )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,65);
                root_1 = (Object)adaptor.becomeRoot(stream_22.nextNode(), root_1);

                dbg.location(22,70);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:70: ( ( declaration )* )?
                if ( stream_declaration.hasNext() ) {
                    dbg.location(22,71);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:71: ( declaration )*
                    while ( stream_declaration.hasNext() ) {
                        dbg.location(22,72);
                        adaptor.addChild(root_1, stream_declaration.nextTree());

                    }
                    stream_declaration.reset();

                }
                stream_declaration.reset();
                dbg.location(22,88);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:88: ( instruction )*
                while ( stream_instruction.hasNext() ) {
                    dbg.location(22,89);
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();
                dbg.location(22,103);
                adaptor.addChild(root_1, stream_23.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(23, 17);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:24:1: declaration : ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc );
    public final compParser.declaration_return declaration() throws RecognitionException {
        compParser.declaration_return retval = new compParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        compParser.dec_var_return dec_var5 = null;

        compParser.dec_func_return dec_func6 = null;

        compParser.dec_proc_return dec_proc7 = null;


        RewriteRuleSubtreeStream stream_dec_func=new RewriteRuleSubtreeStream(adaptor,"rule dec_func");
        RewriteRuleSubtreeStream stream_dec_proc=new RewriteRuleSubtreeStream(adaptor,"rule dec_proc");
        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:24:13: ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc )
            int alt3=3;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case 25:
            case 26:
            case 27:
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:24:16: dec_var
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(24,16);
                    pushFollow(FOLLOW_dec_var_in_declaration165);
                    dec_var5=dec_var();

                    state._fsp--;

                    adaptor.addChild(root_0, dec_var5.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:25:5: dec_func
                    {
                    dbg.location(25,5);
                    pushFollow(FOLLOW_dec_func_in_declaration172);
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

                    root_0 = (Object)adaptor.nil();
                    // 25:14: -> dec_func
                    {
                        dbg.location(25,16);
                        adaptor.addChild(root_0, stream_dec_func.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:26:5: dec_proc
                    {
                    dbg.location(26,5);
                    pushFollow(FOLLOW_dec_proc_in_declaration181);
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

                    root_0 = (Object)adaptor.nil();
                    // 26:14: -> dec_proc
                    {
                        dbg.location(26,16);
                        adaptor.addChild(root_0, stream_dec_proc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(27, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_var"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:1: dec_var : type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) ;
    public final compParser.dec_var_return dec_var() throws RecognitionException {
        compParser.dec_var_return retval = new compParser.dec_var_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF9=null;
        Token char_literal10=null;
        Token IDF11=null;
        compParser.type_return type8 = null;


        Object IDF9_tree=null;
        Object char_literal10_tree=null;
        Object IDF11_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "dec_var");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:13: ( type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:16: type IDF ( ',' IDF )*
            {
            dbg.location(28,16);
            pushFollow(FOLLOW_type_in_dec_var198);
            type8=type();

            state._fsp--;

            stream_type.add(type8.getTree());
            dbg.location(28,24);
            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var203);  
            stream_IDF.add(IDF9);

            dbg.location(28,28);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:28: ( ',' IDF )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:29: ',' IDF
            	    {
            	    dbg.location(28,29);
            	    char_literal10=(Token)match(input,24,FOLLOW_24_in_dec_var206);  
            	    stream_24.add(char_literal10);

            	    dbg.location(28,35);
            	    IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var210);  
            	    stream_IDF.add(IDF11);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}



            // AST REWRITE
            // elements: type, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 28:40: -> ^( VAR type ( IDF )+ )
            {
                dbg.location(28,42);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:42: ^( VAR type ( IDF )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(28,44);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                dbg.location(28,48);
                adaptor.addChild(root_1, stream_type.nextTree());
                dbg.location(28,53);
                if ( !(stream_IDF.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDF.hasNext() ) {
                    dbg.location(28,53);
                    adaptor.addChild(root_1, stream_IDF.nextNode());

                }
                stream_IDF.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(29, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:1: type : ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) );
    public final compParser.type_return type() throws RecognitionException {
        compParser.type_return retval = new compParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;

        Object string_literal12_tree=null;
        Object string_literal13_tree=null;
        Object string_literal14_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:13: ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) )
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case 26:
                {
                alt5=2;
                }
                break;
            case 27:
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:15: 'integer'
                    {
                    dbg.location(30,15);
                    string_literal12=(Token)match(input,25,FOLLOW_25_in_type237);  
                    stream_25.add(string_literal12);



                    // AST REWRITE
                    // elements: 25
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 30:24: -> ^( 'integer' )
                    {
                        dbg.location(30,26);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:26: ^( 'integer' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(30,28);
                        root_1 = (Object)adaptor.becomeRoot(stream_25.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:31:27: 'boolean'
                    {
                    dbg.location(31,27);
                    string_literal13=(Token)match(input,26,FOLLOW_26_in_type271);  
                    stream_26.add(string_literal13);



                    // AST REWRITE
                    // elements: 26
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 31:36: -> ^( 'boolean' )
                    {
                        dbg.location(31,38);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:31:38: ^( 'boolean' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(31,40);
                        root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:32:28: 'array'
                    {
                    dbg.location(32,28);
                    string_literal14=(Token)match(input,27,FOLLOW_27_in_type306);  
                    stream_27.add(string_literal14);



                    // AST REWRITE
                    // elements: 27
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 32:36: -> ^( 'array' )
                    {
                        dbg.location(32,38);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:32:38: ^( 'array' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(32,40);
                        root_1 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(32, 48);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_func"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:1: dec_func : ent_func ( declaration )* ( instruction )+ 'end' -> ^( FONCTION ) ;
    public final compParser.dec_func_return dec_func() throws RecognitionException {
        compParser.dec_func_return retval = new compParser.dec_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        compParser.ent_func_return ent_func15 = null;

        compParser.declaration_return declaration16 = null;

        compParser.instruction_return instruction17 = null;


        Object string_literal18_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_func=new RewriteRuleSubtreeStream(adaptor,"rule ent_func");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try { dbg.enterRule(getGrammarFileName(), "dec_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:13: ( ent_func ( declaration )* ( instruction )+ 'end' -> ^( FONCTION ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:16: ent_func ( declaration )* ( instruction )+ 'end'
            {
            dbg.location(33,16);
            pushFollow(FOLLOW_ent_func_in_dec_func322);
            ent_func15=ent_func();

            state._fsp--;

            stream_ent_func.add(ent_func15.getTree());
            dbg.location(33,26);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:26: ( declaration )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=FONCTION && LA6_0<=PROCEDURE)||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:27: declaration
            	    {
            	    dbg.location(33,27);
            	    pushFollow(FOLLOW_declaration_in_dec_func326);
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

            dbg.location(33,43);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:43: ( instruction )+
            int cnt7=0;
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RETOUR && LA7_0<=WRITE)||LA7_0==IDF||LA7_0==35||LA7_0==37||LA7_0==39) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:45: instruction
            	    {
            	    dbg.location(33,45);
            	    pushFollow(FOLLOW_instruction_in_dec_func334);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt7++;
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(33,59);
            string_literal18=(Token)match(input,23,FOLLOW_23_in_dec_func338);  
            stream_23.add(string_literal18);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 33:65: -> ^( FONCTION )
            {
                dbg.location(33,67);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:67: ^( FONCTION )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(33,69);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FONCTION, "FONCTION"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(35, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_proc"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:1: dec_proc : ent_proc ( declaration )* ( instruction )+ 'end' -> ^( PROCEDURE ) ;
    public final compParser.dec_proc_return dec_proc() throws RecognitionException {
        compParser.dec_proc_return retval = new compParser.dec_proc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal22=null;
        compParser.ent_proc_return ent_proc19 = null;

        compParser.declaration_return declaration20 = null;

        compParser.instruction_return instruction21 = null;


        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_ent_proc=new RewriteRuleSubtreeStream(adaptor,"rule ent_proc");
        try { dbg.enterRule(getGrammarFileName(), "dec_proc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:13: ( ent_proc ( declaration )* ( instruction )+ 'end' -> ^( PROCEDURE ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:16: ent_proc ( declaration )* ( instruction )+ 'end'
            {
            dbg.location(36,16);
            pushFollow(FOLLOW_ent_proc_in_dec_proc356);
            ent_proc19=ent_proc();

            state._fsp--;

            stream_ent_proc.add(ent_proc19.getTree());
            dbg.location(36,26);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:26: ( declaration )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=FONCTION && LA8_0<=PROCEDURE)||(LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:27: declaration
            	    {
            	    dbg.location(36,27);
            	    pushFollow(FOLLOW_declaration_in_dec_proc360);
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

            dbg.location(36,43);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:43: ( instruction )+
            int cnt9=0;
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9);

                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RETOUR && LA9_0<=WRITE)||LA9_0==IDF||LA9_0==35||LA9_0==37||LA9_0==39) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:45: instruction
            	    {
            	    dbg.location(36,45);
            	    pushFollow(FOLLOW_instruction_in_dec_proc368);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt9++;
            } while (true);
            } finally {dbg.exitSubRule(9);}

            dbg.location(36,59);
            string_literal22=(Token)match(input,23,FOLLOW_23_in_dec_proc372);  
            stream_23.add(string_literal22);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 36:65: -> ^( PROCEDURE )
            {
                dbg.location(36,67);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:67: ^( PROCEDURE )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(36,69);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(37, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_func"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:1: ent_func : 'function' type IDF param -> ^( 'function' ^( type IDF param ) ) ;
    public final compParser.ent_func_return ent_func() throws RecognitionException {
        compParser.ent_func_return retval = new compParser.ent_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token IDF25=null;
        compParser.type_return type24 = null;

        compParser.param_return param26 = null;


        Object string_literal23_tree=null;
        Object IDF25_tree=null;
        RewriteRuleTokenStream stream_FONCTION=new RewriteRuleTokenStream(adaptor,"token FONCTION");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "ent_func");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:13: ( 'function' type IDF param -> ^( 'function' ^( type IDF param ) ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:15: 'function' type IDF param
            {
            dbg.location(38,15);
            string_literal23=(Token)match(input,FONCTION,FOLLOW_FONCTION_in_ent_func388);  
            stream_FONCTION.add(string_literal23);

            dbg.location(38,29);
            pushFollow(FOLLOW_type_in_ent_func393);
            type24=type();

            state._fsp--;

            stream_type.add(type24.getTree());
            dbg.location(38,36);
            IDF25=(Token)match(input,IDF,FOLLOW_IDF_in_ent_func397);  
            stream_IDF.add(IDF25);

            dbg.location(38,42);
            pushFollow(FOLLOW_param_in_ent_func401);
            param26=param();

            state._fsp--;

            stream_param.add(param26.getTree());


            // AST REWRITE
            // elements: type, param, IDF, FONCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:48: -> ^( 'function' ^( type IDF param ) )
            {
                dbg.location(38,51);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:51: ^( 'function' ^( type IDF param ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(38,53);
                root_1 = (Object)adaptor.becomeRoot(stream_FONCTION.nextNode(), root_1);

                dbg.location(38,64);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:64: ^( type IDF param )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(38,66);
                root_2 = (Object)adaptor.becomeRoot(stream_type.nextNode(), root_2);

                dbg.location(38,71);
                adaptor.addChild(root_2, stream_IDF.nextNode());
                dbg.location(38,75);
                adaptor.addChild(root_2, stream_param.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(39, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_proc"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:1: ent_proc : 'procedure' IDF param -> ^( 'procedure' ^( IDF param ) ) ;
    public final compParser.ent_proc_return ent_proc() throws RecognitionException {
        compParser.ent_proc_return retval = new compParser.ent_proc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token IDF28=null;
        compParser.param_return param29 = null;


        Object string_literal27_tree=null;
        Object IDF28_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try { dbg.enterRule(getGrammarFileName(), "ent_proc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:13: ( 'procedure' IDF param -> ^( 'procedure' ^( IDF param ) ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:15: 'procedure' IDF param
            {
            dbg.location(40,15);
            string_literal27=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_ent_proc426);  
            stream_PROCEDURE.add(string_literal27);

            dbg.location(40,29);
            IDF28=(Token)match(input,IDF,FOLLOW_IDF_in_ent_proc430);  
            stream_IDF.add(IDF28);

            dbg.location(40,34);
            pushFollow(FOLLOW_param_in_ent_proc433);
            param29=param();

            state._fsp--;

            stream_param.add(param29.getTree());


            // AST REWRITE
            // elements: PROCEDURE, IDF, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 40:40: -> ^( 'procedure' ^( IDF param ) )
            {
                dbg.location(40,42);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:42: ^( 'procedure' ^( IDF param ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(40,44);
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                dbg.location(40,56);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:56: ^( IDF param )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(40,58);
                root_2 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);

                dbg.location(40,62);
                adaptor.addChild(root_2, stream_param.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(41, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:42:1: array : 'array' '[' bounds ']' -> ^( 'array' ^( bounds ) ) ;
    public final compParser.array_return array() throws RecognitionException {
        compParser.array_return retval = new compParser.array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal30=null;
        Token char_literal31=null;
        Token char_literal33=null;
        compParser.bounds_return bounds32 = null;


        Object string_literal30_tree=null;
        Object char_literal31_tree=null;
        Object char_literal33_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_bounds=new RewriteRuleSubtreeStream(adaptor,"rule bounds");
        try { dbg.enterRule(getGrammarFileName(), "array");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:42:12: ( 'array' '[' bounds ']' -> ^( 'array' ^( bounds ) ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:42:14: 'array' '[' bounds ']'
            {
            dbg.location(42,14);
            string_literal30=(Token)match(input,27,FOLLOW_27_in_array457);  
            stream_27.add(string_literal30);

            dbg.location(42,22);
            char_literal31=(Token)match(input,28,FOLLOW_28_in_array459);  
            stream_28.add(char_literal31);

            dbg.location(42,26);
            pushFollow(FOLLOW_bounds_in_array461);
            bounds32=bounds();

            state._fsp--;

            stream_bounds.add(bounds32.getTree());
            dbg.location(42,32);
            char_literal33=(Token)match(input,29,FOLLOW_29_in_array462);  
            stream_29.add(char_literal33);



            // AST REWRITE
            // elements: 27, bounds
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 42:36: -> ^( 'array' ^( bounds ) )
            {
                dbg.location(42,39);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:42:39: ^( 'array' ^( bounds ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(42,41);
                root_1 = (Object)adaptor.becomeRoot(stream_27.nextNode(), root_1);

                dbg.location(42,49);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:42:49: ^( bounds )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(42,51);
                root_2 = (Object)adaptor.becomeRoot(stream_bounds.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(43, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:44:1: bounds : CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* ;
    public final compParser.bounds_return bounds() throws RecognitionException {
        compParser.bounds_return retval = new compParser.bounds_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CST_ENT34=null;
        Token string_literal35=null;
        Token CST_ENT36=null;
        Token char_literal37=null;
        Token CST_ENT38=null;
        Token string_literal39=null;
        Token CST_ENT40=null;

        Object CST_ENT34_tree=null;
        Object string_literal35_tree=null;
        Object CST_ENT36_tree=null;
        Object char_literal37_tree=null;
        Object CST_ENT38_tree=null;
        Object string_literal39_tree=null;
        Object CST_ENT40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bounds");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:44:13: ( CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:44:16: CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,16);
            CST_ENT34=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds486); 
            CST_ENT34_tree = (Object)adaptor.create(CST_ENT34);
            adaptor.addChild(root_0, CST_ENT34_tree);

            dbg.location(44,24);
            string_literal35=(Token)match(input,30,FOLLOW_30_in_bounds488); 
            string_literal35_tree = (Object)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            dbg.location(44,29);
            CST_ENT36=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds490); 
            CST_ENT36_tree = (Object)adaptor.create(CST_ENT36);
            adaptor.addChild(root_0, CST_ENT36_tree);

            dbg.location(44,37);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:44:37: ( ',' CST_ENT '..' CST_ENT )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:44:38: ',' CST_ENT '..' CST_ENT
            	    {
            	    dbg.location(44,38);
            	    char_literal37=(Token)match(input,24,FOLLOW_24_in_bounds493); 
            	    char_literal37_tree = (Object)adaptor.create(char_literal37);
            	    adaptor.addChild(root_0, char_literal37_tree);

            	    dbg.location(44,43);
            	    CST_ENT38=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds496); 
            	    CST_ENT38_tree = (Object)adaptor.create(CST_ENT38);
            	    adaptor.addChild(root_0, CST_ENT38_tree);

            	    dbg.location(44,51);
            	    string_literal39=(Token)match(input,30,FOLLOW_30_in_bounds498); 
            	    string_literal39_tree = (Object)adaptor.create(string_literal39);
            	    adaptor.addChild(root_0, string_literal39_tree);

            	    dbg.location(44,57);
            	    CST_ENT40=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds501); 
            	    CST_ENT40_tree = (Object)adaptor.create(CST_ENT40);
            	    adaptor.addChild(root_0, CST_ENT40_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(44, 67);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:1: param : '(' ( formal ( ',' formal )* )? ')' -> ^( PARAM ( formal )* ) ;
    public final compParser.param_return param() throws RecognitionException {
        compParser.param_return retval = new compParser.param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal41=null;
        Token char_literal43=null;
        Token char_literal45=null;
        compParser.formal_return formal42 = null;

        compParser.formal_return formal44 = null;


        Object char_literal41_tree=null;
        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_formal=new RewriteRuleSubtreeStream(adaptor,"rule formal");
        try { dbg.enterRule(getGrammarFileName(), "param");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:13: ( '(' ( formal ( ',' formal )* )? ')' -> ^( PARAM ( formal )* ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:16: '(' ( formal ( ',' formal )* )? ')'
            {
            dbg.location(45,16);
            char_literal41=(Token)match(input,31,FOLLOW_31_in_param518);  
            stream_31.add(char_literal41);

            dbg.location(45,20);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:20: ( formal ( ',' formal )* )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDF||LA12_0==33) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:21: formal ( ',' formal )*
                    {
                    dbg.location(45,21);
                    pushFollow(FOLLOW_formal_in_param521);
                    formal42=formal();

                    state._fsp--;

                    stream_formal.add(formal42.getTree());
                    dbg.location(45,30);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:30: ( ',' formal )*
                    try { dbg.enterSubRule(11);

                    loop11:
                    do {
                        int alt11=2;
                        try { dbg.enterDecision(11);

                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        } finally {dbg.exitDecision(11);}

                        switch (alt11) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:31: ',' formal
                    	    {
                    	    dbg.location(45,31);
                    	    char_literal43=(Token)match(input,24,FOLLOW_24_in_param526);  
                    	    stream_24.add(char_literal43);

                    	    dbg.location(45,35);
                    	    pushFollow(FOLLOW_formal_in_param528);
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

            dbg.location(45,49);
            char_literal45=(Token)match(input,32,FOLLOW_32_in_param537);  
            stream_32.add(char_literal45);



            // AST REWRITE
            // elements: formal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 45:52: -> ^( PARAM ( formal )* )
            {
                dbg.location(45,54);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:54: ^( PARAM ( formal )* )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(45,56);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                dbg.location(45,62);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:45:62: ( formal )*
                while ( stream_formal.hasNext() ) {
                    dbg.location(45,62);
                    adaptor.addChild(root_1, stream_formal.nextTree());

                }
                stream_formal.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(46, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:48:1: formal : ( 'adr' )? IDF ':' type ;
    public final compParser.formal_return formal() throws RecognitionException {
        compParser.formal_return retval = new compParser.formal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal46=null;
        Token IDF47=null;
        Token char_literal48=null;
        compParser.type_return type49 = null;


        Object string_literal46_tree=null;
        Object IDF47_tree=null;
        Object char_literal48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:48:13: ( ( 'adr' )? IDF ':' type )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:48:15: ( 'adr' )? IDF ':' type
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(48,15);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:48:15: ( 'adr' )?
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:48:16: 'adr'
                    {
                    dbg.location(48,16);
                    string_literal46=(Token)match(input,33,FOLLOW_33_in_formal559); 
                    string_literal46_tree = (Object)adaptor.create(string_literal46);
                    adaptor.addChild(root_0, string_literal46_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}

            dbg.location(48,24);
            IDF47=(Token)match(input,IDF,FOLLOW_IDF_in_formal563); 
            IDF47_tree = (Object)adaptor.create(IDF47);
            adaptor.addChild(root_0, IDF47_tree);

            dbg.location(48,30);
            char_literal48=(Token)match(input,34,FOLLOW_34_in_formal567); 
            char_literal48_tree = (Object)adaptor.create(char_literal48);
            adaptor.addChild(root_0, char_literal48_tree);

            dbg.location(48,36);
            pushFollow(FOLLOW_type_in_formal571);
            type49=type();

            state._fsp--;

            adaptor.addChild(root_0, type49.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(48, 43);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:49:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );
    public final compParser.instruction_return instruction() throws RecognitionException {
        compParser.instruction_return retval = new compParser.instruction_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        compParser.affectation_return affectation50 = null;

        compParser.bloc_return bloc51 = null;

        compParser.iteration_return iteration52 = null;

        compParser.condition_return condition53 = null;

        compParser.retour_return retour54 = null;

        compParser.read_return read55 = null;

        compParser.write_return write56 = null;

        compParser.appel_return appel57 = null;


        RewriteRuleSubtreeStream stream_bloc=new RewriteRuleSubtreeStream(adaptor,"rule bloc");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
        RewriteRuleSubtreeStream stream_appel=new RewriteRuleSubtreeStream(adaptor,"rule appel");
        RewriteRuleSubtreeStream stream_retour=new RewriteRuleSubtreeStream(adaptor,"rule retour");
        RewriteRuleSubtreeStream stream_iteration=new RewriteRuleSubtreeStream(adaptor,"rule iteration");
        RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");
        RewriteRuleSubtreeStream stream_affectation=new RewriteRuleSubtreeStream(adaptor,"rule affectation");
        try { dbg.enterRule(getGrammarFileName(), "instruction");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:49:13: ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel )
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:49:17: affectation
                    {
                    dbg.location(49,17);
                    pushFollow(FOLLOW_affectation_in_instruction583);
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

                    root_0 = (Object)adaptor.nil();
                    // 49:29: -> affectation
                    {
                        dbg.location(49,31);
                        adaptor.addChild(root_0, stream_affectation.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:50:10: bloc
                    {
                    dbg.location(50,10);
                    pushFollow(FOLLOW_bloc_in_instruction597);
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

                    root_0 = (Object)adaptor.nil();
                    // 50:16: -> bloc
                    {
                        dbg.location(50,18);
                        adaptor.addChild(root_0, stream_bloc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:51:10: iteration
                    {
                    dbg.location(51,10);
                    pushFollow(FOLLOW_iteration_in_instruction612);
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

                    root_0 = (Object)adaptor.nil();
                    // 51:20: -> iteration
                    {
                        dbg.location(51,22);
                        adaptor.addChild(root_0, stream_iteration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:52:10: condition
                    {
                    dbg.location(52,10);
                    pushFollow(FOLLOW_condition_in_instruction626);
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

                    root_0 = (Object)adaptor.nil();
                    // 52:20: -> condition
                    {
                        dbg.location(52,22);
                        adaptor.addChild(root_0, stream_condition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:53:10: retour
                    {
                    dbg.location(53,10);
                    pushFollow(FOLLOW_retour_in_instruction640);
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

                    root_0 = (Object)adaptor.nil();
                    // 53:17: -> retour
                    {
                        dbg.location(53,19);
                        adaptor.addChild(root_0, stream_retour.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:54:10: read
                    {
                    dbg.location(54,10);
                    pushFollow(FOLLOW_read_in_instruction654);
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

                    root_0 = (Object)adaptor.nil();
                    // 54:15: -> read
                    {
                        dbg.location(54,17);
                        adaptor.addChild(root_0, stream_read.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:55:10: write
                    {
                    dbg.location(55,10);
                    pushFollow(FOLLOW_write_in_instruction668);
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

                    root_0 = (Object)adaptor.nil();
                    // 55:16: -> write
                    {
                        dbg.location(55,18);
                        adaptor.addChild(root_0, stream_write.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:56:9: appel
                    {
                    dbg.location(56,9);
                    pushFollow(FOLLOW_appel_in_instruction681);
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

                    root_0 = (Object)adaptor.nil();
                    // 56:14: -> appel
                    {
                        dbg.location(56,16);
                        adaptor.addChild(root_0, stream_appel.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(56, 21);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "appel"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:1: appel : IDF '(' ( exp ( ',' exp )* )? ')' ;
    public final compParser.appel_return appel() throws RecognitionException {
        compParser.appel_return retval = new compParser.appel_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF58=null;
        Token char_literal59=null;
        Token char_literal61=null;
        Token char_literal63=null;
        compParser.exp_return exp60 = null;

        compParser.exp_return exp62 = null;


        Object IDF58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "appel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(57, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:12: ( IDF '(' ( exp ( ',' exp )* )? ')' )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:16: IDF '(' ( exp ( ',' exp )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(57,16);
            IDF58=(Token)match(input,IDF,FOLLOW_IDF_in_appel697); 
            IDF58_tree = (Object)adaptor.create(IDF58);
            adaptor.addChild(root_0, IDF58_tree);

            dbg.location(57,20);
            char_literal59=(Token)match(input,31,FOLLOW_31_in_appel699); 
            char_literal59_tree = (Object)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);

            dbg.location(57,24);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:24: ( exp ( ',' exp )* )?
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=IDF && LA16_0<=CST_ENT)||LA16_0==31||(LA16_0>=44 && LA16_0<=46)) ) {
                alt16=1;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:26: exp ( ',' exp )*
                    {
                    dbg.location(57,26);
                    pushFollow(FOLLOW_exp_in_appel703);
                    exp60=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp60.getTree());
                    dbg.location(57,29);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:29: ( ',' exp )*
                    try { dbg.enterSubRule(15);

                    loop15:
                    do {
                        int alt15=2;
                        try { dbg.enterDecision(15);

                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            alt15=1;
                        }


                        } finally {dbg.exitDecision(15);}

                        switch (alt15) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:57:31: ',' exp
                    	    {
                    	    dbg.location(57,31);
                    	    char_literal61=(Token)match(input,24,FOLLOW_24_in_appel706); 
                    	    char_literal61_tree = (Object)adaptor.create(char_literal61);
                    	    adaptor.addChild(root_0, char_literal61_tree);

                    	    dbg.location(57,34);
                    	    pushFollow(FOLLOW_exp_in_appel707);
                    	    exp62=exp();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exp62.getTree());

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

            dbg.location(57,43);
            char_literal63=(Token)match(input,32,FOLLOW_32_in_appel714); 
            char_literal63_tree = (Object)adaptor.create(char_literal63);
            adaptor.addChild(root_0, char_literal63_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(57, 46);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:1: bloc : 'begin' ( declaration )* ( instruction )+ 'end' ;
    public final compParser.bloc_return bloc() throws RecognitionException {
        compParser.bloc_return retval = new compParser.bloc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal64=null;
        Token string_literal67=null;
        compParser.declaration_return declaration65 = null;

        compParser.instruction_return instruction66 = null;


        Object string_literal64_tree=null;
        Object string_literal67_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bloc");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:9: ( 'begin' ( declaration )* ( instruction )+ 'end' )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:13: 'begin' ( declaration )* ( instruction )+ 'end'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(58,13);
            string_literal64=(Token)match(input,35,FOLLOW_35_in_bloc727); 
            string_literal64_tree = (Object)adaptor.create(string_literal64);
            adaptor.addChild(root_0, string_literal64_tree);

            dbg.location(58,22);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:22: ( declaration )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=FONCTION && LA17_0<=PROCEDURE)||(LA17_0>=25 && LA17_0<=27)) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:23: declaration
            	    {
            	    dbg.location(58,23);
            	    pushFollow(FOLLOW_declaration_in_bloc731);
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

            dbg.location(58,39);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:39: ( instruction )+
            int cnt18=0;
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18);

                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RETOUR && LA18_0<=WRITE)||LA18_0==IDF||LA18_0==35||LA18_0==37||LA18_0==39) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:58:40: instruction
            	    {
            	    dbg.location(58,40);
            	    pushFollow(FOLLOW_instruction_in_bloc738);
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

            dbg.location(58,56);
            string_literal67=(Token)match(input,23,FOLLOW_23_in_bloc744); 
            string_literal67_tree = (Object)adaptor.create(string_literal67);
            adaptor.addChild(root_0, string_literal67_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(58, 61);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:59:1: affectation : ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) );
    public final compParser.affectation_return affectation() throws RecognitionException {
        compParser.affectation_return retval = new compParser.affectation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF68=null;
        Token char_literal69=null;
        Token IDF71=null;
        Token char_literal72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        compParser.exp_return exp70 = null;

        compParser.exp_return exp73 = null;

        compParser.exp_return exp75 = null;

        compParser.exp_return exp78 = null;


        Object IDF68_tree=null;
        Object char_literal69_tree=null;
        Object IDF71_tree=null;
        Object char_literal72_tree=null;
        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "affectation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:59:12: ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) )
            int alt20=2;
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==36) ) {
                    alt20=1;
                }
                else if ( (LA20_1==28) ) {
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:59:17: IDF '=' exp
                    {
                    dbg.location(59,17);
                    IDF68=(Token)match(input,IDF,FOLLOW_IDF_in_affectation753);  
                    stream_IDF.add(IDF68);

                    dbg.location(59,23);
                    char_literal69=(Token)match(input,36,FOLLOW_36_in_affectation757);  
                    stream_36.add(char_literal69);

                    dbg.location(59,29);
                    pushFollow(FOLLOW_exp_in_affectation761);
                    exp70=exp();

                    state._fsp--;

                    stream_exp.add(exp70.getTree());


                    // AST REWRITE
                    // elements: IDF, 36, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:33: -> ^( '=' IDF exp )
                    {
                        dbg.location(59,36);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:59:36: ^( '=' IDF exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(59,38);
                        root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                        dbg.location(59,42);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(59,46);
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:19: IDF '[' exp ( ',' exp )* ']' '=' exp
                    {
                    dbg.location(60,19);
                    IDF71=(Token)match(input,IDF,FOLLOW_IDF_in_affectation791);  
                    stream_IDF.add(IDF71);

                    dbg.location(60,23);
                    char_literal72=(Token)match(input,28,FOLLOW_28_in_affectation793);  
                    stream_28.add(char_literal72);

                    dbg.location(60,27);
                    pushFollow(FOLLOW_exp_in_affectation795);
                    exp73=exp();

                    state._fsp--;

                    stream_exp.add(exp73.getTree());
                    dbg.location(60,31);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:31: ( ',' exp )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:32: ',' exp
                    	    {
                    	    dbg.location(60,32);
                    	    char_literal74=(Token)match(input,24,FOLLOW_24_in_affectation798);  
                    	    stream_24.add(char_literal74);

                    	    dbg.location(60,36);
                    	    pushFollow(FOLLOW_exp_in_affectation800);
                    	    exp75=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(60,43);
                    char_literal76=(Token)match(input,29,FOLLOW_29_in_affectation805);  
                    stream_29.add(char_literal76);

                    dbg.location(60,47);
                    char_literal77=(Token)match(input,36,FOLLOW_36_in_affectation807);  
                    stream_36.add(char_literal77);

                    dbg.location(60,51);
                    pushFollow(FOLLOW_exp_in_affectation809);
                    exp78=exp();

                    state._fsp--;

                    stream_exp.add(exp78.getTree());


                    // AST REWRITE
                    // elements: 24, exp, IDF, 29, exp, 28, exp, 36
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 60:55: -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                    {
                        dbg.location(60,57);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:57: ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(60,59);
                        root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                        dbg.location(60,63);
                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        dbg.location(60,68);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:68: ^( exp '[' exp ( ',' exp )* ']' )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(60,70);
                        root_2 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_2);

                        dbg.location(60,74);
                        adaptor.addChild(root_2, stream_28.nextNode());
                        dbg.location(60,78);
                        adaptor.addChild(root_2, stream_exp.nextTree());
                        dbg.location(60,82);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:60:82: ( ',' exp )*
                        while ( stream_24.hasNext()||stream_exp.hasNext() ) {
                            dbg.location(60,83);
                            adaptor.addChild(root_2, stream_24.nextNode());
                            dbg.location(60,87);
                            adaptor.addChild(root_2, stream_exp.nextTree());

                        }
                        stream_24.reset();
                        stream_exp.reset();
                        dbg.location(60,94);
                        adaptor.addChild(root_2, stream_29.nextNode());

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

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(60, 100);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "affectation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "affectation"

    public static class iteration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteration"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:1: iteration : 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) ;
    public final compParser.iteration_return iteration() throws RecognitionException {
        compParser.iteration_return retval = new compParser.iteration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token IDF80=null;
        Token string_literal81=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token string_literal87=null;
        compParser.exp_return exp82 = null;

        compParser.exp_return exp84 = null;

        compParser.instruction_return instruction86 = null;


        Object string_literal79_tree=null;
        Object IDF80_tree=null;
        Object string_literal81_tree=null;
        Object string_literal83_tree=null;
        Object string_literal85_tree=null;
        Object string_literal87_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "iteration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(61, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:12: ( 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:16: 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end'
            {
            dbg.location(61,16);
            string_literal79=(Token)match(input,37,FOLLOW_37_in_iteration846);  
            stream_37.add(string_literal79);

            dbg.location(61,24);
            IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_iteration850);  
            stream_IDF.add(IDF80);

            dbg.location(61,30);
            string_literal81=(Token)match(input,38,FOLLOW_38_in_iteration854);  
            stream_38.add(string_literal81);

            dbg.location(61,37);
            pushFollow(FOLLOW_exp_in_iteration858);
            exp82=exp();

            state._fsp--;

            stream_exp.add(exp82.getTree());
            dbg.location(61,43);
            string_literal83=(Token)match(input,30,FOLLOW_30_in_iteration862);  
            stream_30.add(string_literal83);

            dbg.location(61,50);
            pushFollow(FOLLOW_exp_in_iteration866);
            exp84=exp();

            state._fsp--;

            stream_exp.add(exp84.getTree());
            dbg.location(61,56);
            string_literal85=(Token)match(input,22,FOLLOW_22_in_iteration870);  
            stream_22.add(string_literal85);

            dbg.location(61,63);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:63: ( instruction )+
            int cnt21=0;
            try { dbg.enterSubRule(21);

            loop21:
            do {
                int alt21=2;
                try { dbg.enterDecision(21);

                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RETOUR && LA21_0<=WRITE)||LA21_0==IDF||LA21_0==35||LA21_0==37||LA21_0==39) ) {
                    alt21=1;
                }


                } finally {dbg.exitDecision(21);}

                switch (alt21) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:65: instruction
            	    {
            	    dbg.location(61,65);
            	    pushFollow(FOLLOW_instruction_in_iteration876);
            	    instruction86=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction86.getTree());

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

            dbg.location(61,82);
            string_literal87=(Token)match(input,23,FOLLOW_23_in_iteration883);  
            stream_23.add(string_literal87);



            // AST REWRITE
            // elements: 38, instruction, IDF, exp, 30, exp, 37, 22
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:87: -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
            {
                dbg.location(61,89);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:89: ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(61,91);
                root_1 = (Object)adaptor.becomeRoot(stream_37.nextNode(), root_1);

                dbg.location(61,97);
                adaptor.addChild(root_1, stream_IDF.nextNode());
                dbg.location(61,101);
                adaptor.addChild(root_1, stream_38.nextNode());
                dbg.location(61,106);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(61,110);
                adaptor.addChild(root_1, stream_30.nextNode());
                dbg.location(61,115);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(61,119);
                adaptor.addChild(root_1, stream_22.nextNode());
                dbg.location(61,124);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:61:124: ^( instruction )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(61,127);
                root_2 = (Object)adaptor.becomeRoot(stream_instruction.nextNode(), root_2);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(61, 143);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:1: condition : 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? ) ;
    public final compParser.condition_return condition() throws RecognitionException {
        compParser.condition_return retval = new compParser.condition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal88=null;
        Token string_literal90=null;
        Token string_literal92=null;
        Token string_literal94=null;
        compParser.exp_return exp89 = null;

        compParser.instruction_return instruction91 = null;

        compParser.instruction_return instruction93 = null;


        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        Object string_literal92_tree=null;
        Object string_literal94_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:12: ( 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:16: 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi'
            {
            dbg.location(62,16);
            string_literal88=(Token)match(input,39,FOLLOW_39_in_condition917);  
            stream_39.add(string_literal88);

            dbg.location(62,23);
            pushFollow(FOLLOW_exp_in_condition921);
            exp89=exp();

            state._fsp--;

            stream_exp.add(exp89.getTree());
            dbg.location(62,29);
            string_literal90=(Token)match(input,40,FOLLOW_40_in_condition925);  
            stream_40.add(string_literal90);

            dbg.location(62,38);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:38: ( instruction )+
            int cnt22=0;
            try { dbg.enterSubRule(22);

            loop22:
            do {
                int alt22=2;
                try { dbg.enterDecision(22);

                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RETOUR && LA22_0<=WRITE)||LA22_0==IDF||LA22_0==35||LA22_0==37||LA22_0==39) ) {
                    alt22=1;
                }


                } finally {dbg.exitDecision(22);}

                switch (alt22) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:40: instruction
            	    {
            	    dbg.location(62,40);
            	    pushFollow(FOLLOW_instruction_in_condition931);
            	    instruction91=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction91.getTree());

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

            dbg.location(62,55);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:55: ( 'else' ( instruction )+ )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:56: 'else' ( instruction )+
                    {
                    dbg.location(62,56);
                    string_literal92=(Token)match(input,41,FOLLOW_41_in_condition937);  
                    stream_41.add(string_literal92);

                    dbg.location(62,65);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:65: ( instruction )+
                    int cnt23=0;
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23);

                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RETOUR && LA23_0<=WRITE)||LA23_0==IDF||LA23_0==35||LA23_0==37||LA23_0==39) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:66: instruction
                    	    {
                    	    dbg.location(62,66);
                    	    pushFollow(FOLLOW_instruction_in_condition942);
                    	    instruction93=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction93.getTree());

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

            dbg.location(62,85);
            string_literal94=(Token)match(input,42,FOLLOW_42_in_condition951);  
            stream_42.add(string_literal94);



            // AST REWRITE
            // elements: 39, instruction, 40, instruction, exp, 41
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 62:90: -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? )
            {
                dbg.location(62,92);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:92: ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(62,94);
                root_1 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_1);

                dbg.location(62,99);
                adaptor.addChild(root_1, stream_exp.nextTree());
                dbg.location(62,103);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:103: ^( 'then' instruction )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(62,105);
                root_2 = (Object)adaptor.becomeRoot(stream_40.nextNode(), root_2);

                dbg.location(62,112);
                adaptor.addChild(root_2, stream_instruction.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(62,125);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:62:125: ( 'else' ( instruction )+ )?
                if ( stream_instruction.hasNext()||stream_41.hasNext() ) {
                    dbg.location(62,126);
                    adaptor.addChild(root_1, stream_41.nextNode());
                    dbg.location(62,133);
                    if ( !(stream_instruction.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_instruction.hasNext() ) {
                        dbg.location(62,134);
                        adaptor.addChild(root_1, stream_instruction.nextTree());

                    }
                    stream_instruction.reset();

                }
                stream_instruction.reset();
                stream_41.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(62, 150);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retour"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:63:1: retour : 'retour' '(' exp ')' -> ^( RETOUR exp ) ;
    public final compParser.retour_return retour() throws RecognitionException {
        compParser.retour_return retval = new compParser.retour_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        compParser.exp_return exp97 = null;


        Object string_literal95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        RewriteRuleTokenStream stream_RETOUR=new RewriteRuleTokenStream(adaptor,"token RETOUR");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "retour");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:63:12: ( 'retour' '(' exp ')' -> ^( RETOUR exp ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:63:16: 'retour' '(' exp ')'
            {
            dbg.location(63,16);
            string_literal95=(Token)match(input,RETOUR,FOLLOW_RETOUR_in_retour987);  
            stream_RETOUR.add(string_literal95);

            dbg.location(63,25);
            char_literal96=(Token)match(input,31,FOLLOW_31_in_retour989);  
            stream_31.add(char_literal96);

            dbg.location(63,31);
            pushFollow(FOLLOW_exp_in_retour993);
            exp97=exp();

            state._fsp--;

            stream_exp.add(exp97.getTree());
            dbg.location(63,38);
            char_literal98=(Token)match(input,32,FOLLOW_32_in_retour998);  
            stream_32.add(char_literal98);



            // AST REWRITE
            // elements: exp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:41: -> ^( RETOUR exp )
            {
                dbg.location(63,43);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:63:43: ^( RETOUR exp )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(63,45);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETOUR, "RETOUR"), root_1);

                dbg.location(63,52);
                adaptor.addChild(root_1, stream_exp.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(63, 57);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:64:1: read : 'read' IDF -> ^( READ IDF ) ;
    public final compParser.read_return read() throws RecognitionException {
        compParser.read_return retval = new compParser.read_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal99=null;
        Token IDF100=null;

        Object string_literal99_tree=null;
        Object IDF100_tree=null;
        RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:64:12: ( 'read' IDF -> ^( READ IDF ) )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:64:16: 'read' IDF
            {
            dbg.location(64,16);
            string_literal99=(Token)match(input,READ,FOLLOW_READ_in_read1020);  
            stream_READ.add(string_literal99);

            dbg.location(64,26);
            IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_read1025);  
            stream_IDF.add(IDF100);



            // AST REWRITE
            // elements: IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 64:30: -> ^( READ IDF )
            {
                dbg.location(64,32);
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:64:32: ^( READ IDF )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(64,34);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);

                dbg.location(64,39);
                adaptor.addChild(root_1, stream_IDF.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(64, 43);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "write"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:65:1: write : ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) );
    public final compParser.write_return write() throws RecognitionException {
        compParser.write_return retval = new compParser.write_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        Token string_literal103=null;
        Token CSTE_CHAINE104=null;
        compParser.exp_return exp102 = null;


        Object string_literal101_tree=null;
        Object string_literal103_tree=null;
        Object CSTE_CHAINE104_tree=null;
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "write");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(65, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:65:10: ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) )
            int alt25=2;
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==WRITE) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==CSTE_CHAINE) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=IDF && LA25_1<=CST_ENT)||LA25_1==31||(LA25_1>=44 && LA25_1<=46)) ) {
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:65:14: 'write' exp
                    {
                    dbg.location(65,14);
                    string_literal101=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1044);  
                    stream_WRITE.add(string_literal101);

                    dbg.location(65,22);
                    pushFollow(FOLLOW_exp_in_write1046);
                    exp102=exp();

                    state._fsp--;

                    stream_exp.add(exp102.getTree());


                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:25: -> ^( WRITE exp )
                    {
                        dbg.location(65,27);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:65:27: ^( WRITE exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(65,29);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

                        dbg.location(65,35);
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:66:10: 'write' CSTE_CHAINE
                    {
                    dbg.location(66,10);
                    string_literal103=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1063);  
                    stream_WRITE.add(string_literal103);

                    dbg.location(66,18);
                    CSTE_CHAINE104=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_write1065);  
                    stream_CSTE_CHAINE.add(CSTE_CHAINE104);



                    // AST REWRITE
                    // elements: CSTE_CHAINE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:30: -> ^( WRITE CSTE_CHAINE )
                    {
                        dbg.location(66,32);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:66:32: ^( WRITE CSTE_CHAINE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(66,34);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

                        dbg.location(66,40);
                        adaptor.addChild(root_1, stream_CSTE_CHAINE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(67, 9);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:68:2: exp : ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 );
    public final compParser.exp_return exp() throws RecognitionException {
        compParser.exp_return retval = new compParser.exp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set106=null;
        Token string_literal108=null;
        Token string_literal109=null;
        compParser.plus_return plus105 = null;

        compParser.plus_return plus107 = null;

        compParser.exp2_return exp2110 = null;


        Object set106_tree=null;
        Object string_literal108_tree=null;
        Object string_literal109_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(68, 2);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:68:9: ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 )
            int alt27=4;
            try { dbg.enterDecision(27);

            switch ( input.LA(1) ) {
            case CST_ENT:
            case 31:
            case 44:
                {
                alt27=1;
                }
                break;
            case IDF:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==28||LA27_2==31) ) {
                    alt27=4;
                }
                else if ( ((LA27_2>=RETOUR && LA27_2<=WRITE)||LA27_2==IDF||(LA27_2>=22 && LA27_2<=24)||(LA27_2>=29 && LA27_2<=30)||LA27_2==32||LA27_2==35||LA27_2==37||(LA27_2>=39 && LA27_2<=44)||(LA27_2>=47 && LA27_2<=54)) ) {
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
            case 45:
                {
                alt27=2;
                }
                break;
            case 46:
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:68:14: plus ( ( '+' | '-' ) plus )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(68,14);
                    pushFollow(FOLLOW_plus_in_exp1095);
                    plus105=plus();

                    state._fsp--;

                    adaptor.addChild(root_0, plus105.getTree());
                    dbg.location(68,19);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:68:19: ( ( '+' | '-' ) plus )*
                    try { dbg.enterSubRule(26);

                    loop26:
                    do {
                        int alt26=2;
                        try { dbg.enterDecision(26);

                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=43 && LA26_0<=44)) ) {
                            alt26=1;
                        }


                        } finally {dbg.exitDecision(26);}

                        switch (alt26) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:68:20: ( '+' | '-' ) plus
                    	    {
                    	    dbg.location(68,20);
                    	    set106=(Token)input.LT(1);
                    	    set106=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=43 && input.LA(1)<=44) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set106), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        dbg.recognitionException(mse);
                    	        throw mse;
                    	    }

                    	    dbg.location(68,31);
                    	    pushFollow(FOLLOW_plus_in_exp1105);
                    	    plus107=plus();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, plus107.getTree());

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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:69:12: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(69,12);
                    string_literal108=(Token)match(input,45,FOLLOW_45_in_exp1120); 
                    string_literal108_tree = (Object)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:70:12: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(70,12);
                    string_literal109=(Token)match(input,46,FOLLOW_46_in_exp1133); 
                    string_literal109_tree = (Object)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:71:12: exp2
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,12);
                    pushFollow(FOLLOW_exp2_in_exp1146);
                    exp2110=exp2();

                    state._fsp--;

                    adaptor.addChild(root_0, exp2110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(71, 16);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp2"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:1: exp2 : ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( exp IDF ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) );
    public final compParser.exp2_return exp2() throws RecognitionException {
        compParser.exp2_return retval = new compParser.exp2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDF111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Token IDF117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        compParser.exp_return exp113 = null;

        compParser.exp_return exp115 = null;

        compParser.exp_return exp119 = null;

        compParser.exp_return exp121 = null;


        Object IDF111_tree=null;
        Object char_literal112_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        Object IDF117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try { dbg.enterRule(getGrammarFileName(), "exp2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(72, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:11: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( exp IDF ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) )
            int alt31=2;
            try { dbg.enterDecision(31);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDF) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==31) ) {
                    alt31=1;
                }
                else if ( (LA31_1==28) ) {
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:17: IDF '(' ( exp ( ',' exp )* )? ')'
                    {
                    dbg.location(72,17);
                    IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_exp21162);  
                    stream_IDF.add(IDF111);

                    dbg.location(72,21);
                    char_literal112=(Token)match(input,31,FOLLOW_31_in_exp21164);  
                    stream_31.add(char_literal112);

                    dbg.location(72,25);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:25: ( exp ( ',' exp )* )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=IDF && LA29_0<=CST_ENT)||LA29_0==31||(LA29_0>=44 && LA29_0<=46)) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:26: exp ( ',' exp )*
                            {
                            dbg.location(72,26);
                            pushFollow(FOLLOW_exp_in_exp21167);
                            exp113=exp();

                            state._fsp--;

                            stream_exp.add(exp113.getTree());
                            dbg.location(72,30);
                            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:30: ( ',' exp )*
                            try { dbg.enterSubRule(28);

                            loop28:
                            do {
                                int alt28=2;
                                try { dbg.enterDecision(28);

                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==24) ) {
                                    alt28=1;
                                }


                                } finally {dbg.exitDecision(28);}

                                switch (alt28) {
                            	case 1 :
                            	    dbg.enterAlt(1);

                            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:31: ',' exp
                            	    {
                            	    dbg.location(72,31);
                            	    char_literal114=(Token)match(input,24,FOLLOW_24_in_exp21170);  
                            	    stream_24.add(char_literal114);

                            	    dbg.location(72,35);
                            	    pushFollow(FOLLOW_exp_in_exp21172);
                            	    exp115=exp();

                            	    state._fsp--;

                            	    stream_exp.add(exp115.getTree());

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

                    dbg.location(72,44);
                    char_literal116=(Token)match(input,32,FOLLOW_32_in_exp21179);  
                    stream_32.add(char_literal116);



                    // AST REWRITE
                    // elements: IDF, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:47: -> ^( exp IDF )
                    {
                        dbg.location(72,49);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:72:49: ^( exp IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(72,51);
                        root_1 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_1);

                        dbg.location(72,55);
                        adaptor.addChild(root_1, stream_IDF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:73:18: IDF '[' exp ( ',' exp )* ']'
                    {
                    dbg.location(73,18);
                    IDF117=(Token)match(input,IDF,FOLLOW_IDF_in_exp21204);  
                    stream_IDF.add(IDF117);

                    dbg.location(73,22);
                    char_literal118=(Token)match(input,28,FOLLOW_28_in_exp21206);  
                    stream_28.add(char_literal118);

                    dbg.location(73,26);
                    pushFollow(FOLLOW_exp_in_exp21208);
                    exp119=exp();

                    state._fsp--;

                    stream_exp.add(exp119.getTree());
                    dbg.location(73,30);
                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:73:30: ( ',' exp )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==24) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:73:31: ',' exp
                    	    {
                    	    dbg.location(73,31);
                    	    char_literal120=(Token)match(input,24,FOLLOW_24_in_exp21211);  
                    	    stream_24.add(char_literal120);

                    	    dbg.location(73,35);
                    	    pushFollow(FOLLOW_exp_in_exp21213);
                    	    exp121=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(73,42);
                    char_literal122=(Token)match(input,29,FOLLOW_29_in_exp21218);  
                    stream_29.add(char_literal122);



                    // AST REWRITE
                    // elements: exp, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:45: -> ^( exp IDF )
                    {
                        dbg.location(73,47);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:73:47: ^( exp IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(73,49);
                        root_1 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_1);

                        dbg.location(73,53);
                        adaptor.addChild(root_1, stream_IDF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(74, 17);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:75:1: plus : fois ( ( '*' | '/' ) fois )* ;
    public final compParser.plus_return plus() throws RecognitionException {
        compParser.plus_return retval = new compParser.plus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;
        compParser.fois_return fois123 = null;

        compParser.fois_return fois125 = null;


        Object set124_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "plus");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:75:12: ( fois ( ( '*' | '/' ) fois )* )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:75:16: fois ( ( '*' | '/' ) fois )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(75,16);
            pushFollow(FOLLOW_fois_in_plus1256);
            fois123=fois();

            state._fsp--;

            adaptor.addChild(root_0, fois123.getTree());
            dbg.location(75,21);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:75:21: ( ( '*' | '/' ) fois )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32);

                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=47 && LA32_0<=48)) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:75:23: ( '*' | '/' ) fois
            	    {
            	    dbg.location(75,23);
            	    set124=(Token)input.LT(1);
            	    set124=(Token)input.LT(1);
            	    if ( (input.LA(1)>=47 && input.LA(1)<=48) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set124), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(75,34);
            	    pushFollow(FOLLOW_fois_in_plus1267);
            	    fois125=fois();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fois125.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(75, 40);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fois"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:1: fois : atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* ;
    public final compParser.fois_return fois() throws RecognitionException {
        compParser.fois_return retval = new compParser.fois_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token string_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        compParser.atom_return atom126 = null;

        compParser.atom_return atom133 = null;


        Object string_literal127_tree=null;
        Object string_literal128_tree=null;
        Object string_literal129_tree=null;
        Object string_literal130_tree=null;
        Object char_literal131_tree=null;
        Object char_literal132_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fois");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:12: ( atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* )
            dbg.enterAlt(1);

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:16: atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(76,16);
            pushFollow(FOLLOW_atom_in_fois1284);
            atom126=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom126.getTree());
            dbg.location(76,21);
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:21: ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=2;
                try { dbg.enterDecision(34);

                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=49 && LA34_0<=54)) ) {
                    alt34=1;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom
            	    {
            	    dbg.location(76,24);
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            	    int alt33=6;
            	    try { dbg.enterSubRule(33);
            	    try { dbg.enterDecision(33);

            	    switch ( input.LA(1) ) {
            	    case 49:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 54:
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

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:25: '=='
            	            {
            	            dbg.location(76,29);
            	            string_literal127=(Token)match(input,49,FOLLOW_49_in_fois1290); 
            	            string_literal127_tree = (Object)adaptor.create(string_literal127);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal127_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:33: '!='
            	            {
            	            dbg.location(76,37);
            	            string_literal128=(Token)match(input,50,FOLLOW_50_in_fois1295); 
            	            string_literal128_tree = (Object)adaptor.create(string_literal128);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal128_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:41: '<='
            	            {
            	            dbg.location(76,45);
            	            string_literal129=(Token)match(input,51,FOLLOW_51_in_fois1300); 
            	            string_literal129_tree = (Object)adaptor.create(string_literal129);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal129_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:49: '>='
            	            {
            	            dbg.location(76,53);
            	            string_literal130=(Token)match(input,52,FOLLOW_52_in_fois1305); 
            	            string_literal130_tree = (Object)adaptor.create(string_literal130);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:57: '<'
            	            {
            	            dbg.location(76,60);
            	            char_literal131=(Token)match(input,53,FOLLOW_53_in_fois1310); 
            	            char_literal131_tree = (Object)adaptor.create(char_literal131);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:76:64: '>'
            	            {
            	            dbg.location(76,67);
            	            char_literal132=(Token)match(input,54,FOLLOW_54_in_fois1315); 
            	            char_literal132_tree = (Object)adaptor.create(char_literal132);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(33);}

            	    dbg.location(76,72);
            	    pushFollow(FOLLOW_atom_in_fois1321);
            	    atom133=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom133.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(76, 79);

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
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:77:1: atom : ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( VAR '-' atom ) );
    public final compParser.atom_return atom() throws RecognitionException {
        compParser.atom_return retval = new compParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CST_ENT134=null;
        Token IDF135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        compParser.exp_return exp137 = null;

        compParser.atom_return atom140 = null;


        Object CST_ENT134_tree=null;
        Object IDF135_tree=null;
        Object char_literal136_tree=null;
        Object char_literal138_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(77, 1);

        try {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:77:12: ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( VAR '-' atom ) )
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
            case 31:
                {
                alt35=3;
                }
                break;
            case 44:
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

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:77:16: CST_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(77,16);
                    CST_ENT134=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_atom1339); 
                    CST_ENT134_tree = (Object)adaptor.create(CST_ENT134);
                    adaptor.addChild(root_0, CST_ENT134_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:78:5: IDF
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(78,5);
                    IDF135=(Token)match(input,IDF,FOLLOW_IDF_in_atom1346); 
                    IDF135_tree = (Object)adaptor.create(IDF135);
                    adaptor.addChild(root_0, IDF135_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:79:5: '(' exp ')'
                    {
                    dbg.location(79,5);
                    char_literal136=(Token)match(input,31,FOLLOW_31_in_atom1353);  
                    stream_31.add(char_literal136);

                    dbg.location(79,9);
                    pushFollow(FOLLOW_exp_in_atom1355);
                    exp137=exp();

                    state._fsp--;

                    stream_exp.add(exp137.getTree());
                    dbg.location(79,13);
                    char_literal138=(Token)match(input,32,FOLLOW_32_in_atom1357);  
                    stream_32.add(char_literal138);



                    // AST REWRITE
                    // elements: exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:17: -> exp
                    {
                        dbg.location(79,20);
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:80:5: '-' atom
                    {
                    dbg.location(80,5);
                    char_literal139=(Token)match(input,44,FOLLOW_44_in_atom1367);  
                    stream_44.add(char_literal139);

                    dbg.location(80,9);
                    pushFollow(FOLLOW_atom_in_atom1369);
                    atom140=atom();

                    state._fsp--;

                    stream_atom.add(atom140.getTree());


                    // AST REWRITE
                    // elements: atom, 44
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:14: -> ^( VAR '-' atom )
                    {
                        dbg.location(80,16);
                        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:80:16: ^( VAR '-' atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(80,18);
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                        dbg.location(80,22);
                        adaptor.addChild(root_1, stream_44.nextNode());
                        dbg.location(80,26);
                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(81, 3);

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
        "\1\13\1\34\10\uffff";
    static final String DFA14_maxS =
        "\1\47\1\44\10\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\10";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\6\1\7\4\uffff\1\1\20\uffff\1\2\1\uffff\1\3\1\uffff\1"+
            "\4",
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
            return "49:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_22_in_prog101 = new BitSet(new long[]{0x000000A80E843860L});
    public static final BitSet FOLLOW_declaration_in_prog105 = new BitSet(new long[]{0x000000A80E843860L});
    public static final BitSet FOLLOW_instruction_in_prog112 = new BitSet(new long[]{0x000000A800843800L});
    public static final BitSet FOLLOW_23_in_prog118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_declaration165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_declaration172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_proc_in_declaration181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_dec_var198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_dec_var203 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_dec_var206 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_dec_var210 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_type237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_func_in_dec_func322 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_declaration_in_dec_func326 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_instruction_in_dec_func334 = new BitSet(new long[]{0x000000A800843800L});
    public static final BitSet FOLLOW_23_in_dec_func338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_proc_in_dec_proc356 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_declaration_in_dec_proc360 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_instruction_in_dec_proc368 = new BitSet(new long[]{0x000000A800843800L});
    public static final BitSet FOLLOW_23_in_dec_proc372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FONCTION_in_ent_func388 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_type_in_ent_func393 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_ent_func397 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_param_in_ent_func401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_ent_proc426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_ent_proc430 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_param_in_ent_proc433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_array457 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_array459 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_bounds_in_array461 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_array462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds486 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_bounds488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds490 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_bounds493 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds496 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_bounds498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds501 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_31_in_param518 = new BitSet(new long[]{0x0000000300040000L});
    public static final BitSet FOLLOW_formal_in_param521 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_param526 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_formal_in_param528 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_param537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_formal559 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_formal563 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_formal567 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_type_in_formal571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_instruction626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retour_in_instruction640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_instruction681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_appel697 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_appel699 = new BitSet(new long[]{0x00007001800C0000L});
    public static final BitSet FOLLOW_exp_in_appel703 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_appel706 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_appel707 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_appel714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_bloc727 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_declaration_in_bloc731 = new BitSet(new long[]{0x000000A80E043860L});
    public static final BitSet FOLLOW_instruction_in_bloc738 = new BitSet(new long[]{0x000000A800843800L});
    public static final BitSet FOLLOW_23_in_bloc744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_affectation757 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_affectation761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation791 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_affectation793 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_affectation795 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_24_in_affectation798 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_affectation800 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_29_in_affectation805 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_affectation807 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_affectation809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_iteration846 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_iteration850 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_iteration854 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_iteration858 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_iteration862 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_iteration866 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_iteration870 = new BitSet(new long[]{0x000000A800043800L});
    public static final BitSet FOLLOW_instruction_in_iteration876 = new BitSet(new long[]{0x000000A800843800L});
    public static final BitSet FOLLOW_23_in_iteration883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condition917 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_condition921 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_condition925 = new BitSet(new long[]{0x000000A800043800L});
    public static final BitSet FOLLOW_instruction_in_condition931 = new BitSet(new long[]{0x000006A800043800L});
    public static final BitSet FOLLOW_41_in_condition937 = new BitSet(new long[]{0x000000A800043800L});
    public static final BitSet FOLLOW_instruction_in_condition942 = new BitSet(new long[]{0x000004A800043800L});
    public static final BitSet FOLLOW_42_in_condition951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETOUR_in_retour987 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_retour989 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_retour993 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_retour998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1020 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_IDF_in_read1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1044 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_write1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1063 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_write1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_in_exp1095 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_set_in_exp1098 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_plus_in_exp1105 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_45_in_exp1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_exp1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp2_in_exp1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21162 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_exp21164 = new BitSet(new long[]{0x00007001800C0000L});
    public static final BitSet FOLLOW_exp_in_exp21167 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_exp21170 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_exp21172 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_exp21179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21204 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_exp21206 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_exp21208 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_24_in_exp21211 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_exp21213 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_29_in_exp21218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fois_in_plus1256 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_set_in_plus1260 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_fois_in_plus1267 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_atom_in_fois1284 = new BitSet(new long[]{0x007E000000000002L});
    public static final BitSet FOLLOW_49_in_fois1290 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_50_in_fois1295 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_51_in_fois1300 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_52_in_fois1305 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_53_in_fois1310 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_54_in_fois1315 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_atom_in_fois1321 = new BitSet(new long[]{0x007E000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_atom1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_atom1353 = new BitSet(new long[]{0x00007000800C0000L});
    public static final BitSet FOLLOW_exp_in_atom1355 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_atom1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_atom1367 = new BitSet(new long[]{0x00001000800C0000L});
    public static final BitSet FOLLOW_atom_in_atom1369 = new BitSet(new long[]{0x0000000000000002L});

}