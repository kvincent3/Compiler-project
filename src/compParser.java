// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/alpha-omega/Desktop/comp.g 2015-02-28 17:12:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class compParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FONCTION", "PROCEDURE", "AFFECTATION", "DECLARATION", "INSTRUCTION", "BLOC", "ITERATION", "CONDITION", "RETOUR", "READ", "WRITE", "APPEL", "CALL", "PARAM", "LISTPARAM", "DEC_VAR", "ARRAY", "IDF", "CST_ENT", "CSTE_CHAINE", "WS", "'do'", "'end'", "','", "'integer'", "'boolean'", "'array'", "'['", "']'", "'..'", "'('", "')'", "'adr'", "':'", "'begin'", "'='", "'for'", "'in'", "'if'", "'then'", "'else'", "'fi'", "'+'", "'-'", "'true'", "'false'", "'*'", "'/'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int INSTRUCTION=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int IDF=22;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int PARAM=18;
    public static final int CONDITION=12;
    public static final int CSTE_CHAINE=24;
    public static final int EOF=-1;
    public static final int DECLARATION=8;
    public static final int CST_ENT=23;
    public static final int LISTPARAM=19;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    public static final int WRITE=15;
    public static final int PROCEDURE=6;
    public static final int RETOUR=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=25;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int READ=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int AFFECTATION=7;
    public static final int CALL=17;
    public static final int DEC_VAR=20;

    // delegates
    // delegators


        public compParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public compParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return compParser.tokenNames; }
    public String getGrammarFileName() { return "/home/alpha-omega/Desktop/comp.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/alpha-omega/Desktop/comp.g:27:1: prog : 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' ) ;
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
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/alpha-omega/Desktop/comp.g:27:11: ( 'do' ( declaration )* ( instruction )* 'end' -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' ) )
            // /home/alpha-omega/Desktop/comp.g:27:14: 'do' ( declaration )* ( instruction )* 'end'
            {
            string_literal1=(Token)match(input,26,FOLLOW_26_in_prog123);  
            stream_26.add(string_literal1);

            // /home/alpha-omega/Desktop/comp.g:27:20: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FONCTION && LA1_0<=PROCEDURE)||(LA1_0>=29 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:27:21: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_prog127);
            	    declaration2=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /home/alpha-omega/Desktop/comp.g:27:37: ( instruction )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RETOUR && LA2_0<=WRITE)||LA2_0==IDF||LA2_0==39||LA2_0==41||LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:27:38: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_prog134);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal4=(Token)match(input,27,FOLLOW_27_in_prog140);  
            stream_27.add(string_literal4);



            // AST REWRITE
            // elements: 26, instruction, 27, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:60: -> ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' )
            {
                // /home/alpha-omega/Desktop/comp.g:27:63: ^( 'do' ^( DECLARATION ( ( declaration )* )? ) ^( INSTRUCTION ( instruction )* ) 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                // /home/alpha-omega/Desktop/comp.g:27:70: ^( DECLARATION ( ( declaration )* )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DECLARATION, "DECLARATION"), root_2);

                // /home/alpha-omega/Desktop/comp.g:27:84: ( ( declaration )* )?
                if ( stream_declaration.hasNext() ) {
                    // /home/alpha-omega/Desktop/comp.g:27:85: ( declaration )*
                    while ( stream_declaration.hasNext() ) {
                        adaptor.addChild(root_2, stream_declaration.nextTree());

                    }
                    stream_declaration.reset();

                }
                stream_declaration.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/alpha-omega/Desktop/comp.g:27:104: ^( INSTRUCTION ( instruction )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTRUCTION, "INSTRUCTION"), root_2);

                // /home/alpha-omega/Desktop/comp.g:27:118: ( instruction )*
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_2, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_27.nextNode());

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
        return retval;
    }
    // $ANTLR end "prog"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/alpha-omega/Desktop/comp.g:29:1: declaration : ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc );
    public final compParser.declaration_return declaration() throws RecognitionException {
        compParser.declaration_return retval = new compParser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        compParser.dec_var_return dec_var5 = null;

        compParser.dec_func_return dec_func6 = null;

        compParser.dec_proc_return dec_proc7 = null;


        RewriteRuleSubtreeStream stream_dec_func=new RewriteRuleSubtreeStream(adaptor,"rule dec_func");
        RewriteRuleSubtreeStream stream_dec_proc=new RewriteRuleSubtreeStream(adaptor,"rule dec_proc");
        try {
            // /home/alpha-omega/Desktop/comp.g:29:13: ( dec_var | dec_func -> dec_func | dec_proc -> dec_proc )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 29:
            case 30:
            case 31:
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

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:29:16: dec_var
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dec_var_in_declaration196);
                    dec_var5=dec_var();

                    state._fsp--;

                    adaptor.addChild(root_0, dec_var5.getTree());

                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:30:5: dec_func
                    {
                    pushFollow(FOLLOW_dec_func_in_declaration203);
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
                    // 30:14: -> dec_func
                    {
                        adaptor.addChild(root_0, stream_dec_func.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/alpha-omega/Desktop/comp.g:31:5: dec_proc
                    {
                    pushFollow(FOLLOW_dec_proc_in_declaration212);
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
                    // 31:14: -> dec_proc
                    {
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
        return retval;
    }
    // $ANTLR end "declaration"

    public static class dec_var_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_var"
    // /home/alpha-omega/Desktop/comp.g:33:1: dec_var : type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) ;
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
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/alpha-omega/Desktop/comp.g:33:13: ( type IDF ( ',' IDF )* -> ^( VAR type ( IDF )+ ) )
            // /home/alpha-omega/Desktop/comp.g:33:16: type IDF ( ',' IDF )*
            {
            pushFollow(FOLLOW_type_in_dec_var229);
            type8=type();

            state._fsp--;

            stream_type.add(type8.getTree());
            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var234);  
            stream_IDF.add(IDF9);

            // /home/alpha-omega/Desktop/comp.g:33:28: ( ',' IDF )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:33:29: ',' IDF
            	    {
            	    char_literal10=(Token)match(input,28,FOLLOW_28_in_dec_var237);  
            	    stream_28.add(char_literal10);

            	    IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var241);  
            	    stream_IDF.add(IDF11);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);



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
            // 33:40: -> ^( VAR type ( IDF )+ )
            {
                // /home/alpha-omega/Desktop/comp.g:33:42: ^( VAR type ( IDF )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                if ( !(stream_IDF.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDF.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "dec_var"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/alpha-omega/Desktop/comp.g:35:1: type : ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) );
    public final compParser.type_return type() throws RecognitionException {
        compParser.type_return retval = new compParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal12=null;
        Token string_literal13=null;
        Token string_literal14=null;

        CommonTree string_literal12_tree=null;
        CommonTree string_literal13_tree=null;
        CommonTree string_literal14_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // /home/alpha-omega/Desktop/comp.g:35:13: ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:35:17: 'integer'
                    {
                    string_literal12=(Token)match(input,29,FOLLOW_29_in_type270);  
                    stream_29.add(string_literal12);



                    // AST REWRITE
                    // elements: 29
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 35:26: -> ^( 'integer' )
                    {
                        // /home/alpha-omega/Desktop/comp.g:35:28: ^( 'integer' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_29.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:36:27: 'boolean'
                    {
                    string_literal13=(Token)match(input,30,FOLLOW_30_in_type304);  
                    stream_30.add(string_literal13);



                    // AST REWRITE
                    // elements: 30
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 36:36: -> ^( 'boolean' )
                    {
                        // /home/alpha-omega/Desktop/comp.g:36:38: ^( 'boolean' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_30.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/alpha-omega/Desktop/comp.g:37:28: 'array'
                    {
                    string_literal14=(Token)match(input,31,FOLLOW_31_in_type339);  
                    stream_31.add(string_literal14);



                    // AST REWRITE
                    // elements: 31
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 37:36: -> ^( 'array' )
                    {
                        // /home/alpha-omega/Desktop/comp.g:37:38: ^( 'array' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_31.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "type"

    public static class dec_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_func"
    // /home/alpha-omega/Desktop/comp.g:38:1: dec_func : ent_func ( declaration )* ( instruction )* 'end' -> ^( ent_func ( declaration )* ( instruction )+ 'end' ) ;
    public final compParser.dec_func_return dec_func() throws RecognitionException {
        compParser.dec_func_return retval = new compParser.dec_func_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal18=null;
        compParser.ent_func_return ent_func15 = null;

        compParser.declaration_return declaration16 = null;

        compParser.instruction_return instruction17 = null;


        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_func=new RewriteRuleSubtreeStream(adaptor,"rule ent_func");
        try {
            // /home/alpha-omega/Desktop/comp.g:38:13: ( ent_func ( declaration )* ( instruction )* 'end' -> ^( ent_func ( declaration )* ( instruction )+ 'end' ) )
            // /home/alpha-omega/Desktop/comp.g:38:16: ent_func ( declaration )* ( instruction )* 'end'
            {
            pushFollow(FOLLOW_ent_func_in_dec_func355);
            ent_func15=ent_func();

            state._fsp--;

            stream_ent_func.add(ent_func15.getTree());
            // /home/alpha-omega/Desktop/comp.g:38:26: ( declaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=FONCTION && LA6_0<=PROCEDURE)||(LA6_0>=29 && LA6_0<=31)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:38:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_dec_func359);
            	    declaration16=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /home/alpha-omega/Desktop/comp.g:38:43: ( instruction )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RETOUR && LA7_0<=WRITE)||LA7_0==IDF||LA7_0==39||LA7_0==41||LA7_0==43) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:38:45: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_dec_func367);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            string_literal18=(Token)match(input,27,FOLLOW_27_in_dec_func371);  
            stream_27.add(string_literal18);



            // AST REWRITE
            // elements: declaration, instruction, ent_func, 27
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 38:65: -> ^( ent_func ( declaration )* ( instruction )+ 'end' )
            {
                // /home/alpha-omega/Desktop/comp.g:38:67: ^( ent_func ( declaration )* ( instruction )+ 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ent_func.nextNode(), root_1);

                // /home/alpha-omega/Desktop/comp.g:38:78: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();
                adaptor.addChild(root_1, stream_27.nextNode());

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
        return retval;
    }
    // $ANTLR end "dec_func"

    public static class dec_proc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_proc"
    // /home/alpha-omega/Desktop/comp.g:41:1: dec_proc : ent_proc ( declaration )* ( instruction )* 'end' -> ^( ent_proc ( declaration )* ( instruction )+ 'end' ) ;
    public final compParser.dec_proc_return dec_proc() throws RecognitionException {
        compParser.dec_proc_return retval = new compParser.dec_proc_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal22=null;
        compParser.ent_proc_return ent_proc19 = null;

        compParser.declaration_return declaration20 = null;

        compParser.instruction_return instruction21 = null;


        CommonTree string_literal22_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_proc=new RewriteRuleSubtreeStream(adaptor,"rule ent_proc");
        try {
            // /home/alpha-omega/Desktop/comp.g:41:13: ( ent_proc ( declaration )* ( instruction )* 'end' -> ^( ent_proc ( declaration )* ( instruction )+ 'end' ) )
            // /home/alpha-omega/Desktop/comp.g:41:16: ent_proc ( declaration )* ( instruction )* 'end'
            {
            pushFollow(FOLLOW_ent_proc_in_dec_proc401);
            ent_proc19=ent_proc();

            state._fsp--;

            stream_ent_proc.add(ent_proc19.getTree());
            // /home/alpha-omega/Desktop/comp.g:41:26: ( declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=FONCTION && LA8_0<=PROCEDURE)||(LA8_0>=29 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:41:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_dec_proc405);
            	    declaration20=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration20.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /home/alpha-omega/Desktop/comp.g:41:43: ( instruction )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RETOUR && LA9_0<=WRITE)||LA9_0==IDF||LA9_0==39||LA9_0==41||LA9_0==43) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:41:45: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_dec_proc413);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            string_literal22=(Token)match(input,27,FOLLOW_27_in_dec_proc417);  
            stream_27.add(string_literal22);



            // AST REWRITE
            // elements: instruction, 27, declaration, ent_proc
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 41:65: -> ^( ent_proc ( declaration )* ( instruction )+ 'end' )
            {
                // /home/alpha-omega/Desktop/comp.g:41:67: ^( ent_proc ( declaration )* ( instruction )+ 'end' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ent_proc.nextNode(), root_1);

                // /home/alpha-omega/Desktop/comp.g:41:78: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();
                adaptor.addChild(root_1, stream_27.nextNode());

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
        return retval;
    }
    // $ANTLR end "dec_proc"

    public static class ent_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_func"
    // /home/alpha-omega/Desktop/comp.g:43:1: ent_func : 'function' type IDF param -> ^( FONCTION IDF type param ) ;
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
        try {
            // /home/alpha-omega/Desktop/comp.g:43:13: ( 'function' type IDF param -> ^( FONCTION IDF type param ) )
            // /home/alpha-omega/Desktop/comp.g:43:15: 'function' type IDF param
            {
            string_literal23=(Token)match(input,FONCTION,FOLLOW_FONCTION_in_ent_func445);  
            stream_FONCTION.add(string_literal23);

            pushFollow(FOLLOW_type_in_ent_func450);
            type24=type();

            state._fsp--;

            stream_type.add(type24.getTree());
            IDF25=(Token)match(input,IDF,FOLLOW_IDF_in_ent_func454);  
            stream_IDF.add(IDF25);

            pushFollow(FOLLOW_param_in_ent_func458);
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
            // 43:48: -> ^( FONCTION IDF type param )
            {
                // /home/alpha-omega/Desktop/comp.g:43:51: ^( FONCTION IDF type param )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FONCTION, "FONCTION"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_type.nextTree());
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
        return retval;
    }
    // $ANTLR end "ent_func"

    public static class ent_proc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_proc"
    // /home/alpha-omega/Desktop/comp.g:45:1: ent_proc : 'procedure' IDF param -> ^( PROCEDURE IDF param ) ;
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
        try {
            // /home/alpha-omega/Desktop/comp.g:45:13: ( 'procedure' IDF param -> ^( PROCEDURE IDF param ) )
            // /home/alpha-omega/Desktop/comp.g:45:15: 'procedure' IDF param
            {
            string_literal27=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_ent_proc482);  
            stream_PROCEDURE.add(string_literal27);

            IDF28=(Token)match(input,IDF,FOLLOW_IDF_in_ent_proc486);  
            stream_IDF.add(IDF28);

            pushFollow(FOLLOW_param_in_ent_proc489);
            param29=param();

            state._fsp--;

            stream_param.add(param29.getTree());


            // AST REWRITE
            // elements: param, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 45:40: -> ^( PROCEDURE IDF param )
            {
                // /home/alpha-omega/Desktop/comp.g:45:42: ^( PROCEDURE IDF param )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
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
        return retval;
    }
    // $ANTLR end "ent_proc"

    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /home/alpha-omega/Desktop/comp.g:47:1: array : 'array' '[' bounds ']' -> ^( ARRAY bounds ) ;
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
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_bounds=new RewriteRuleSubtreeStream(adaptor,"rule bounds");
        try {
            // /home/alpha-omega/Desktop/comp.g:47:12: ( 'array' '[' bounds ']' -> ^( ARRAY bounds ) )
            // /home/alpha-omega/Desktop/comp.g:47:14: 'array' '[' bounds ']'
            {
            string_literal30=(Token)match(input,31,FOLLOW_31_in_array511);  
            stream_31.add(string_literal30);

            char_literal31=(Token)match(input,32,FOLLOW_32_in_array513);  
            stream_32.add(char_literal31);

            pushFollow(FOLLOW_bounds_in_array515);
            bounds32=bounds();

            state._fsp--;

            stream_bounds.add(bounds32.getTree());
            char_literal33=(Token)match(input,33,FOLLOW_33_in_array516);  
            stream_33.add(char_literal33);



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
            // 47:36: -> ^( ARRAY bounds )
            {
                // /home/alpha-omega/Desktop/comp.g:47:39: ^( ARRAY bounds )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, "ARRAY"), root_1);

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
        return retval;
    }
    // $ANTLR end "array"

    public static class bounds_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds"
    // /home/alpha-omega/Desktop/comp.g:49:1: bounds : CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* ;
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

        try {
            // /home/alpha-omega/Desktop/comp.g:49:13: ( CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* )
            // /home/alpha-omega/Desktop/comp.g:49:16: CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            CST_ENT34=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds538); 
            CST_ENT34_tree = (CommonTree)adaptor.create(CST_ENT34);
            adaptor.addChild(root_0, CST_ENT34_tree);

            string_literal35=(Token)match(input,34,FOLLOW_34_in_bounds540); 
            string_literal35_tree = (CommonTree)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            CST_ENT36=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds542); 
            CST_ENT36_tree = (CommonTree)adaptor.create(CST_ENT36);
            adaptor.addChild(root_0, CST_ENT36_tree);

            // /home/alpha-omega/Desktop/comp.g:49:37: ( ',' CST_ENT '..' CST_ENT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:49:38: ',' CST_ENT '..' CST_ENT
            	    {
            	    char_literal37=(Token)match(input,28,FOLLOW_28_in_bounds545); 
            	    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
            	    adaptor.addChild(root_0, char_literal37_tree);

            	    CST_ENT38=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds548); 
            	    CST_ENT38_tree = (CommonTree)adaptor.create(CST_ENT38);
            	    adaptor.addChild(root_0, CST_ENT38_tree);

            	    string_literal39=(Token)match(input,34,FOLLOW_34_in_bounds550); 
            	    string_literal39_tree = (CommonTree)adaptor.create(string_literal39);
            	    adaptor.addChild(root_0, string_literal39_tree);

            	    CST_ENT40=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds553); 
            	    CST_ENT40_tree = (CommonTree)adaptor.create(CST_ENT40);
            	    adaptor.addChild(root_0, CST_ENT40_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "bounds"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/alpha-omega/Desktop/comp.g:50:1: param : '(' ( formal ( ',' formal )* )? ')' -> ^( LISTPARAM ( formal )* ) ;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_formal=new RewriteRuleSubtreeStream(adaptor,"rule formal");
        try {
            // /home/alpha-omega/Desktop/comp.g:50:13: ( '(' ( formal ( ',' formal )* )? ')' -> ^( LISTPARAM ( formal )* ) )
            // /home/alpha-omega/Desktop/comp.g:50:16: '(' ( formal ( ',' formal )* )? ')'
            {
            char_literal41=(Token)match(input,35,FOLLOW_35_in_param570);  
            stream_35.add(char_literal41);

            // /home/alpha-omega/Desktop/comp.g:50:20: ( formal ( ',' formal )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDF||LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:50:21: formal ( ',' formal )*
                    {
                    pushFollow(FOLLOW_formal_in_param573);
                    formal42=formal();

                    state._fsp--;

                    stream_formal.add(formal42.getTree());
                    // /home/alpha-omega/Desktop/comp.g:50:30: ( ',' formal )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:50:31: ',' formal
                    	    {
                    	    char_literal43=(Token)match(input,28,FOLLOW_28_in_param578);  
                    	    stream_28.add(char_literal43);

                    	    pushFollow(FOLLOW_formal_in_param580);
                    	    formal44=formal();

                    	    state._fsp--;

                    	    stream_formal.add(formal44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal45=(Token)match(input,36,FOLLOW_36_in_param589);  
            stream_36.add(char_literal45);



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
            // 50:52: -> ^( LISTPARAM ( formal )* )
            {
                // /home/alpha-omega/Desktop/comp.g:50:54: ^( LISTPARAM ( formal )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LISTPARAM, "LISTPARAM"), root_1);

                // /home/alpha-omega/Desktop/comp.g:50:66: ( formal )*
                while ( stream_formal.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "param"

    public static class formal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // /home/alpha-omega/Desktop/comp.g:53:1: formal : ( 'adr' )? IDF ':' type -> ^( PARAM IDF type ) ;
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
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/alpha-omega/Desktop/comp.g:53:13: ( ( 'adr' )? IDF ':' type -> ^( PARAM IDF type ) )
            // /home/alpha-omega/Desktop/comp.g:53:15: ( 'adr' )? IDF ':' type
            {
            // /home/alpha-omega/Desktop/comp.g:53:15: ( 'adr' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:53:16: 'adr'
                    {
                    string_literal46=(Token)match(input,37,FOLLOW_37_in_formal612);  
                    stream_37.add(string_literal46);


                    }
                    break;

            }

            IDF47=(Token)match(input,IDF,FOLLOW_IDF_in_formal616);  
            stream_IDF.add(IDF47);

            char_literal48=(Token)match(input,38,FOLLOW_38_in_formal620);  
            stream_38.add(char_literal48);

            pushFollow(FOLLOW_type_in_formal624);
            type49=type();

            state._fsp--;

            stream_type.add(type49.getTree());


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
            // 53:43: -> ^( PARAM IDF type )
            {
                // /home/alpha-omega/Desktop/comp.g:53:45: ^( PARAM IDF type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAM, "PARAM"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
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
        return retval;
    }
    // $ANTLR end "formal"

    public static class instruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/alpha-omega/Desktop/comp.g:54:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );
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
        try {
            // /home/alpha-omega/Desktop/comp.g:54:13: ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:54:17: affectation
                    {
                    pushFollow(FOLLOW_affectation_in_instruction644);
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
                    // 54:29: -> affectation
                    {
                        adaptor.addChild(root_0, stream_affectation.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:55:10: bloc
                    {
                    pushFollow(FOLLOW_bloc_in_instruction658);
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
                    // 55:16: -> bloc
                    {
                        adaptor.addChild(root_0, stream_bloc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/alpha-omega/Desktop/comp.g:56:10: iteration
                    {
                    pushFollow(FOLLOW_iteration_in_instruction673);
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
                    // 56:20: -> iteration
                    {
                        adaptor.addChild(root_0, stream_iteration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/alpha-omega/Desktop/comp.g:57:10: condition
                    {
                    pushFollow(FOLLOW_condition_in_instruction687);
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
                    // 57:20: -> condition
                    {
                        adaptor.addChild(root_0, stream_condition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/alpha-omega/Desktop/comp.g:58:10: retour
                    {
                    pushFollow(FOLLOW_retour_in_instruction701);
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
                    // 58:17: -> retour
                    {
                        adaptor.addChild(root_0, stream_retour.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /home/alpha-omega/Desktop/comp.g:59:10: read
                    {
                    pushFollow(FOLLOW_read_in_instruction715);
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
                    // 59:15: -> read
                    {
                        adaptor.addChild(root_0, stream_read.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /home/alpha-omega/Desktop/comp.g:60:10: write
                    {
                    pushFollow(FOLLOW_write_in_instruction729);
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
                    // 60:16: -> write
                    {
                        adaptor.addChild(root_0, stream_write.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /home/alpha-omega/Desktop/comp.g:61:9: appel
                    {
                    pushFollow(FOLLOW_appel_in_instruction742);
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
                    // 61:14: -> appel
                    {
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
        return retval;
    }
    // $ANTLR end "instruction"

    public static class appel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "appel"
    // /home/alpha-omega/Desktop/comp.g:62:1: appel : IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) ;
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
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:62:12: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) )
            // /home/alpha-omega/Desktop/comp.g:62:16: IDF '(' ( exp ( ',' exp )* )? ')'
            {
            IDF58=(Token)match(input,IDF,FOLLOW_IDF_in_appel758);  
            stream_IDF.add(IDF58);

            char_literal59=(Token)match(input,35,FOLLOW_35_in_appel760);  
            stream_35.add(char_literal59);

            // /home/alpha-omega/Desktop/comp.g:62:24: ( exp ( ',' exp )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=IDF && LA16_0<=CST_ENT)||LA16_0==35||(LA16_0>=48 && LA16_0<=50)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:62:26: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_appel764);
                    exp60=exp();

                    state._fsp--;

                    stream_exp.add(exp60.getTree());
                    // /home/alpha-omega/Desktop/comp.g:62:29: ( ',' exp )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==28) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:62:31: ',' exp
                    	    {
                    	    char_literal61=(Token)match(input,28,FOLLOW_28_in_appel767);  
                    	    stream_28.add(char_literal61);

                    	    pushFollow(FOLLOW_exp_in_appel768);
                    	    exp62=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal63=(Token)match(input,36,FOLLOW_36_in_appel775);  
            stream_36.add(char_literal63);



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
            // 62:47: -> ^( APPEL IDF ( exp )* )
            {
                // /home/alpha-omega/Desktop/comp.g:62:50: ^( APPEL IDF ( exp )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL, "APPEL"), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                // /home/alpha-omega/Desktop/comp.g:62:62: ( exp )*
                while ( stream_exp.hasNext() ) {
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
        return retval;
    }
    // $ANTLR end "appel"

    public static class bloc_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/alpha-omega/Desktop/comp.g:63:1: bloc : 'begin' ( declaration )* ( instruction )+ 'end' ;
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

        try {
            // /home/alpha-omega/Desktop/comp.g:63:9: ( 'begin' ( declaration )* ( instruction )+ 'end' )
            // /home/alpha-omega/Desktop/comp.g:63:13: 'begin' ( declaration )* ( instruction )+ 'end'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal64=(Token)match(input,39,FOLLOW_39_in_bloc799); 
            string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
            adaptor.addChild(root_0, string_literal64_tree);

            // /home/alpha-omega/Desktop/comp.g:63:22: ( declaration )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=FONCTION && LA17_0<=PROCEDURE)||(LA17_0>=29 && LA17_0<=31)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:63:23: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_bloc803);
            	    declaration65=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration65.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // /home/alpha-omega/Desktop/comp.g:63:39: ( instruction )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RETOUR && LA18_0<=WRITE)||LA18_0==IDF||LA18_0==39||LA18_0==41||LA18_0==43) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:63:40: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_bloc810);
            	    instruction66=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction66.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            string_literal67=(Token)match(input,27,FOLLOW_27_in_bloc816); 
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
        return retval;
    }
    // $ANTLR end "bloc"

    public static class affectation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/alpha-omega/Desktop/comp.g:64:1: affectation : ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) );
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

        compParser.exp_return exp73 = null;

        compParser.exp_return exp75 = null;

        compParser.exp_return exp78 = null;


        CommonTree IDF68_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree IDF71_tree=null;
        CommonTree char_literal72_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:64:12: ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==40) ) {
                    alt20=1;
                }
                else if ( (LA20_1==32) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:64:17: IDF '=' exp
                    {
                    IDF68=(Token)match(input,IDF,FOLLOW_IDF_in_affectation825);  
                    stream_IDF.add(IDF68);

                    char_literal69=(Token)match(input,40,FOLLOW_40_in_affectation829);  
                    stream_40.add(char_literal69);

                    pushFollow(FOLLOW_exp_in_affectation833);
                    exp70=exp();

                    state._fsp--;

                    stream_exp.add(exp70.getTree());


                    // AST REWRITE
                    // elements: IDF, 40, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 64:33: -> ^( '=' IDF exp )
                    {
                        // /home/alpha-omega/Desktop/comp.g:64:36: ^( '=' IDF exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:65:19: IDF '[' exp ( ',' exp )* ']' '=' exp
                    {
                    IDF71=(Token)match(input,IDF,FOLLOW_IDF_in_affectation863);  
                    stream_IDF.add(IDF71);

                    char_literal72=(Token)match(input,32,FOLLOW_32_in_affectation865);  
                    stream_32.add(char_literal72);

                    pushFollow(FOLLOW_exp_in_affectation867);
                    exp73=exp();

                    state._fsp--;

                    stream_exp.add(exp73.getTree());
                    // /home/alpha-omega/Desktop/comp.g:65:31: ( ',' exp )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==28) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:65:32: ',' exp
                    	    {
                    	    char_literal74=(Token)match(input,28,FOLLOW_28_in_affectation870);  
                    	    stream_28.add(char_literal74);

                    	    pushFollow(FOLLOW_exp_in_affectation872);
                    	    exp75=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    char_literal76=(Token)match(input,33,FOLLOW_33_in_affectation877);  
                    stream_33.add(char_literal76);

                    char_literal77=(Token)match(input,40,FOLLOW_40_in_affectation879);  
                    stream_40.add(char_literal77);

                    pushFollow(FOLLOW_exp_in_affectation881);
                    exp78=exp();

                    state._fsp--;

                    stream_exp.add(exp78.getTree());


                    // AST REWRITE
                    // elements: exp, IDF, 33, exp, 28, 32, 40, exp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 65:55: -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                    {
                        // /home/alpha-omega/Desktop/comp.g:65:57: ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // /home/alpha-omega/Desktop/comp.g:65:68: ^( exp '[' exp ( ',' exp )* ']' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_exp.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_32.nextNode());
                        adaptor.addChild(root_2, stream_exp.nextTree());
                        // /home/alpha-omega/Desktop/comp.g:65:82: ( ',' exp )*
                        while ( stream_exp.hasNext()||stream_28.hasNext() ) {
                            adaptor.addChild(root_2, stream_28.nextNode());
                            adaptor.addChild(root_2, stream_exp.nextTree());

                        }
                        stream_exp.reset();
                        stream_28.reset();
                        adaptor.addChild(root_2, stream_33.nextNode());

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
        return retval;
    }
    // $ANTLR end "affectation"

    public static class iteration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteration"
    // /home/alpha-omega/Desktop/comp.g:66:1: iteration : 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) ;
    public final compParser.iteration_return iteration() throws RecognitionException {
        compParser.iteration_return retval = new compParser.iteration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal79=null;
        Token IDF80=null;
        Token string_literal81=null;
        Token string_literal83=null;
        Token string_literal85=null;
        Token string_literal87=null;
        compParser.exp_return exp82 = null;

        compParser.exp_return exp84 = null;

        compParser.instruction_return instruction86 = null;


        CommonTree string_literal79_tree=null;
        CommonTree IDF80_tree=null;
        CommonTree string_literal81_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal85_tree=null;
        CommonTree string_literal87_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/alpha-omega/Desktop/comp.g:66:12: ( 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) )
            // /home/alpha-omega/Desktop/comp.g:66:16: 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end'
            {
            string_literal79=(Token)match(input,41,FOLLOW_41_in_iteration918);  
            stream_41.add(string_literal79);

            IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_iteration922);  
            stream_IDF.add(IDF80);

            string_literal81=(Token)match(input,42,FOLLOW_42_in_iteration926);  
            stream_42.add(string_literal81);

            pushFollow(FOLLOW_exp_in_iteration930);
            exp82=exp();

            state._fsp--;

            stream_exp.add(exp82.getTree());
            string_literal83=(Token)match(input,34,FOLLOW_34_in_iteration934);  
            stream_34.add(string_literal83);

            pushFollow(FOLLOW_exp_in_iteration938);
            exp84=exp();

            state._fsp--;

            stream_exp.add(exp84.getTree());
            string_literal85=(Token)match(input,26,FOLLOW_26_in_iteration942);  
            stream_26.add(string_literal85);

            // /home/alpha-omega/Desktop/comp.g:66:63: ( instruction )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RETOUR && LA21_0<=WRITE)||LA21_0==IDF||LA21_0==39||LA21_0==41||LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:66:65: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_iteration948);
            	    instruction86=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction86.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            string_literal87=(Token)match(input,27,FOLLOW_27_in_iteration955);  
            stream_27.add(string_literal87);



            // AST REWRITE
            // elements: 42, 26, exp, exp, 41, instruction, 34, IDF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 66:87: -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
            {
                // /home/alpha-omega/Desktop/comp.g:66:89: ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_42.nextNode());
                adaptor.addChild(root_1, stream_exp.nextTree());
                adaptor.addChild(root_1, stream_34.nextNode());
                adaptor.addChild(root_1, stream_exp.nextTree());
                adaptor.addChild(root_1, stream_26.nextNode());
                // /home/alpha-omega/Desktop/comp.g:66:124: ^( instruction )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_instruction.nextNode(), root_2);

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
        return retval;
    }
    // $ANTLR end "iteration"

    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /home/alpha-omega/Desktop/comp.g:67:1: condition : 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? ) ;
    public final compParser.condition_return condition() throws RecognitionException {
        compParser.condition_return retval = new compParser.condition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token string_literal90=null;
        Token string_literal92=null;
        Token string_literal94=null;
        compParser.exp_return exp89 = null;

        compParser.instruction_return instruction91 = null;

        compParser.instruction_return instruction93 = null;


        CommonTree string_literal88_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal92_tree=null;
        CommonTree string_literal94_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/alpha-omega/Desktop/comp.g:67:12: ( 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? ) )
            // /home/alpha-omega/Desktop/comp.g:67:16: 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi'
            {
            string_literal88=(Token)match(input,43,FOLLOW_43_in_condition989);  
            stream_43.add(string_literal88);

            pushFollow(FOLLOW_exp_in_condition993);
            exp89=exp();

            state._fsp--;

            stream_exp.add(exp89.getTree());
            string_literal90=(Token)match(input,44,FOLLOW_44_in_condition997);  
            stream_44.add(string_literal90);

            // /home/alpha-omega/Desktop/comp.g:67:38: ( instruction )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RETOUR && LA22_0<=WRITE)||LA22_0==IDF||LA22_0==39||LA22_0==41||LA22_0==43) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:67:40: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_condition1003);
            	    instruction91=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction91.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // /home/alpha-omega/Desktop/comp.g:67:55: ( 'else' ( instruction )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:67:56: 'else' ( instruction )+
                    {
                    string_literal92=(Token)match(input,45,FOLLOW_45_in_condition1009);  
                    stream_45.add(string_literal92);

                    // /home/alpha-omega/Desktop/comp.g:67:65: ( instruction )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RETOUR && LA23_0<=WRITE)||LA23_0==IDF||LA23_0==39||LA23_0==41||LA23_0==43) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:67:66: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_condition1014);
                    	    instruction93=instruction();

                    	    state._fsp--;

                    	    stream_instruction.add(instruction93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            string_literal94=(Token)match(input,46,FOLLOW_46_in_condition1023);  
            stream_46.add(string_literal94);



            // AST REWRITE
            // elements: 44, 45, instruction, exp, 43, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:90: -> ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? )
            {
                // /home/alpha-omega/Desktop/comp.g:67:92: ^( 'if' exp ^( 'then' instruction ) ( ^( 'else' ( instruction )+ ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                adaptor.addChild(root_1, stream_exp.nextTree());
                // /home/alpha-omega/Desktop/comp.g:67:103: ^( 'then' instruction )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_44.nextNode(), root_2);

                adaptor.addChild(root_2, stream_instruction.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/alpha-omega/Desktop/comp.g:67:125: ( ^( 'else' ( instruction )+ ) )?
                if ( stream_45.hasNext()||stream_instruction.hasNext() ) {
                    // /home/alpha-omega/Desktop/comp.g:67:125: ^( 'else' ( instruction )+ )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_2);

                    if ( !(stream_instruction.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_instruction.hasNext() ) {
                        adaptor.addChild(root_2, stream_instruction.nextTree());

                    }
                    stream_instruction.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_45.reset();
                stream_instruction.reset();

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
        return retval;
    }
    // $ANTLR end "condition"

    public static class retour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retour"
    // /home/alpha-omega/Desktop/comp.g:68:1: retour : 'retour' '(' exp ')' -> ^( RETOUR exp ) ;
    public final compParser.retour_return retour() throws RecognitionException {
        compParser.retour_return retval = new compParser.retour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        compParser.exp_return exp97 = null;


        CommonTree string_literal95_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_RETOUR=new RewriteRuleTokenStream(adaptor,"token RETOUR");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:68:12: ( 'retour' '(' exp ')' -> ^( RETOUR exp ) )
            // /home/alpha-omega/Desktop/comp.g:68:16: 'retour' '(' exp ')'
            {
            string_literal95=(Token)match(input,RETOUR,FOLLOW_RETOUR_in_retour1059);  
            stream_RETOUR.add(string_literal95);

            char_literal96=(Token)match(input,35,FOLLOW_35_in_retour1061);  
            stream_35.add(char_literal96);

            pushFollow(FOLLOW_exp_in_retour1065);
            exp97=exp();

            state._fsp--;

            stream_exp.add(exp97.getTree());
            char_literal98=(Token)match(input,36,FOLLOW_36_in_retour1070);  
            stream_36.add(char_literal98);



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
            // 68:41: -> ^( RETOUR exp )
            {
                // /home/alpha-omega/Desktop/comp.g:68:43: ^( RETOUR exp )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RETOUR, "RETOUR"), root_1);

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
        return retval;
    }
    // $ANTLR end "retour"

    public static class read_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // /home/alpha-omega/Desktop/comp.g:69:1: read : 'read' IDF -> ^( READ IDF ) ;
    public final compParser.read_return read() throws RecognitionException {
        compParser.read_return retval = new compParser.read_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal99=null;
        Token IDF100=null;

        CommonTree string_literal99_tree=null;
        CommonTree IDF100_tree=null;
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_READ=new RewriteRuleTokenStream(adaptor,"token READ");

        try {
            // /home/alpha-omega/Desktop/comp.g:69:12: ( 'read' IDF -> ^( READ IDF ) )
            // /home/alpha-omega/Desktop/comp.g:69:16: 'read' IDF
            {
            string_literal99=(Token)match(input,READ,FOLLOW_READ_in_read1092);  
            stream_READ.add(string_literal99);

            IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_read1097);  
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

            root_0 = (CommonTree)adaptor.nil();
            // 69:30: -> ^( READ IDF )
            {
                // /home/alpha-omega/Desktop/comp.g:69:32: ^( READ IDF )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(READ, "READ"), root_1);

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
        return retval;
    }
    // $ANTLR end "read"

    public static class write_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "write"
    // /home/alpha-omega/Desktop/comp.g:70:1: write : ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) );
    public final compParser.write_return write() throws RecognitionException {
        compParser.write_return retval = new compParser.write_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token string_literal103=null;
        Token CSTE_CHAINE104=null;
        compParser.exp_return exp102 = null;


        CommonTree string_literal101_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree CSTE_CHAINE104_tree=null;
        RewriteRuleTokenStream stream_CSTE_CHAINE=new RewriteRuleTokenStream(adaptor,"token CSTE_CHAINE");
        RewriteRuleTokenStream stream_WRITE=new RewriteRuleTokenStream(adaptor,"token WRITE");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:70:10: ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WRITE) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==CSTE_CHAINE) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=IDF && LA25_1<=CST_ENT)||LA25_1==35||(LA25_1>=48 && LA25_1<=50)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:70:14: 'write' exp
                    {
                    string_literal101=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1116);  
                    stream_WRITE.add(string_literal101);

                    pushFollow(FOLLOW_exp_in_write1118);
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 70:25: -> ^( WRITE exp )
                    {
                        // /home/alpha-omega/Desktop/comp.g:70:27: ^( WRITE exp )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WRITE, "WRITE"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:71:10: 'write' CSTE_CHAINE
                    {
                    string_literal103=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1135);  
                    stream_WRITE.add(string_literal103);

                    CSTE_CHAINE104=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_write1137);  
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

                    root_0 = (CommonTree)adaptor.nil();
                    // 71:30: -> ^( WRITE CSTE_CHAINE )
                    {
                        // /home/alpha-omega/Desktop/comp.g:71:32: ^( WRITE CSTE_CHAINE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(WRITE, "WRITE"), root_1);

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
        return retval;
    }
    // $ANTLR end "write"

    public static class exp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // /home/alpha-omega/Desktop/comp.g:73:2: exp : ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 );
    public final compParser.exp_return exp() throws RecognitionException {
        compParser.exp_return retval = new compParser.exp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set106=null;
        Token string_literal108=null;
        Token string_literal109=null;
        compParser.plus_return plus105 = null;

        compParser.plus_return plus107 = null;

        compParser.exp2_return exp2110 = null;


        CommonTree set106_tree=null;
        CommonTree string_literal108_tree=null;
        CommonTree string_literal109_tree=null;

        try {
            // /home/alpha-omega/Desktop/comp.g:73:9: ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 )
            int alt27=4;
            switch ( input.LA(1) ) {
            case CST_ENT:
            case 35:
            case 48:
                {
                alt27=1;
                }
                break;
            case IDF:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==32||LA27_2==35) ) {
                    alt27=4;
                }
                else if ( ((LA27_2>=RETOUR && LA27_2<=WRITE)||LA27_2==IDF||(LA27_2>=26 && LA27_2<=28)||(LA27_2>=33 && LA27_2<=34)||LA27_2==36||LA27_2==39||LA27_2==41||(LA27_2>=43 && LA27_2<=48)||(LA27_2>=51 && LA27_2<=58)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 50:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:73:14: plus ( ( '+' | '-' ) plus )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_plus_in_exp1167);
                    plus105=plus();

                    state._fsp--;

                    adaptor.addChild(root_0, plus105.getTree());
                    // /home/alpha-omega/Desktop/comp.g:73:19: ( ( '+' | '-' ) plus )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=47 && LA26_0<=48)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:73:20: ( '+' | '-' ) plus
                    	    {
                    	    set106=(Token)input.LT(1);
                    	    set106=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=47 && input.LA(1)<=48) ) {
                    	        input.consume();
                    	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set106), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_plus_in_exp1177);
                    	    plus107=plus();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, plus107.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:74:12: 'true'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal108=(Token)match(input,49,FOLLOW_49_in_exp1192); 
                    string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);


                    }
                    break;
                case 3 :
                    // /home/alpha-omega/Desktop/comp.g:75:12: 'false'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal109=(Token)match(input,50,FOLLOW_50_in_exp1205); 
                    string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 4 :
                    // /home/alpha-omega/Desktop/comp.g:76:12: exp2
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exp2_in_exp1218);
                    exp2110=exp2();

                    state._fsp--;

                    adaptor.addChild(root_0, exp2110.getTree());

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
        return retval;
    }
    // $ANTLR end "exp"

    public static class exp2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp2"
    // /home/alpha-omega/Desktop/comp.g:77:1: exp2 : ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) );
    public final compParser.exp2_return exp2() throws RecognitionException {
        compParser.exp2_return retval = new compParser.exp2_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

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


        CommonTree IDF111_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree IDF117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal122_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:77:11: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( APPEL IDF ( exp )* ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDF) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==35) ) {
                    alt31=1;
                }
                else if ( (LA31_1==32) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:77:17: IDF '(' ( exp ( ',' exp )* )? ')'
                    {
                    IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_exp21234);  
                    stream_IDF.add(IDF111);

                    char_literal112=(Token)match(input,35,FOLLOW_35_in_exp21236);  
                    stream_35.add(char_literal112);

                    // /home/alpha-omega/Desktop/comp.g:77:25: ( exp ( ',' exp )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=IDF && LA29_0<=CST_ENT)||LA29_0==35||(LA29_0>=48 && LA29_0<=50)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/alpha-omega/Desktop/comp.g:77:26: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_exp21239);
                            exp113=exp();

                            state._fsp--;

                            stream_exp.add(exp113.getTree());
                            // /home/alpha-omega/Desktop/comp.g:77:30: ( ',' exp )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==28) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // /home/alpha-omega/Desktop/comp.g:77:31: ',' exp
                            	    {
                            	    char_literal114=(Token)match(input,28,FOLLOW_28_in_exp21242);  
                            	    stream_28.add(char_literal114);

                            	    pushFollow(FOLLOW_exp_in_exp21244);
                            	    exp115=exp();

                            	    state._fsp--;

                            	    stream_exp.add(exp115.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal116=(Token)match(input,36,FOLLOW_36_in_exp21251);  
                    stream_36.add(char_literal116);



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
                    // 77:47: -> ^( APPEL IDF ( exp )* )
                    {
                        // /home/alpha-omega/Desktop/comp.g:77:49: ^( APPEL IDF ( exp )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(APPEL, "APPEL"), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // /home/alpha-omega/Desktop/comp.g:77:61: ( exp )*
                        while ( stream_exp.hasNext() ) {
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
                    // /home/alpha-omega/Desktop/comp.g:78:18: IDF '[' exp ( ',' exp )* ']'
                    {
                    IDF117=(Token)match(input,IDF,FOLLOW_IDF_in_exp21279);  
                    stream_IDF.add(IDF117);

                    char_literal118=(Token)match(input,32,FOLLOW_32_in_exp21281);  
                    stream_32.add(char_literal118);

                    pushFollow(FOLLOW_exp_in_exp21283);
                    exp119=exp();

                    state._fsp--;

                    stream_exp.add(exp119.getTree());
                    // /home/alpha-omega/Desktop/comp.g:78:30: ( ',' exp )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==28) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/alpha-omega/Desktop/comp.g:78:31: ',' exp
                    	    {
                    	    char_literal120=(Token)match(input,28,FOLLOW_28_in_exp21286);  
                    	    stream_28.add(char_literal120);

                    	    pushFollow(FOLLOW_exp_in_exp21288);
                    	    exp121=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    char_literal122=(Token)match(input,33,FOLLOW_33_in_exp21293);  
                    stream_33.add(char_literal122);



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
                    // 78:45: -> ^( exp IDF )
                    {
                        // /home/alpha-omega/Desktop/comp.g:78:47: ^( exp IDF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_exp.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());

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
        return retval;
    }
    // $ANTLR end "exp2"

    public static class plus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus"
    // /home/alpha-omega/Desktop/comp.g:80:1: plus : fois ( ( '*' | '/' ) fois )* ;
    public final compParser.plus_return plus() throws RecognitionException {
        compParser.plus_return retval = new compParser.plus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set124=null;
        compParser.fois_return fois123 = null;

        compParser.fois_return fois125 = null;


        CommonTree set124_tree=null;

        try {
            // /home/alpha-omega/Desktop/comp.g:80:12: ( fois ( ( '*' | '/' ) fois )* )
            // /home/alpha-omega/Desktop/comp.g:80:16: fois ( ( '*' | '/' ) fois )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fois_in_plus1331);
            fois123=fois();

            state._fsp--;

            adaptor.addChild(root_0, fois123.getTree());
            // /home/alpha-omega/Desktop/comp.g:80:21: ( ( '*' | '/' ) fois )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=51 && LA32_0<=52)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:80:23: ( '*' | '/' ) fois
            	    {
            	    set124=(Token)input.LT(1);
            	    set124=(Token)input.LT(1);
            	    if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set124), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_fois_in_plus1342);
            	    fois125=fois();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fois125.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "plus"

    public static class fois_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fois"
    // /home/alpha-omega/Desktop/comp.g:81:1: fois : atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* ;
    public final compParser.fois_return fois() throws RecognitionException {
        compParser.fois_return retval = new compParser.fois_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal127=null;
        Token string_literal128=null;
        Token string_literal129=null;
        Token string_literal130=null;
        Token char_literal131=null;
        Token char_literal132=null;
        compParser.atom_return atom126 = null;

        compParser.atom_return atom133 = null;


        CommonTree string_literal127_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree string_literal130_tree=null;
        CommonTree char_literal131_tree=null;
        CommonTree char_literal132_tree=null;

        try {
            // /home/alpha-omega/Desktop/comp.g:81:12: ( atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* )
            // /home/alpha-omega/Desktop/comp.g:81:16: atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_atom_in_fois1359);
            atom126=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom126.getTree());
            // /home/alpha-omega/Desktop/comp.g:81:21: ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=53 && LA34_0<=58)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/alpha-omega/Desktop/comp.g:81:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom
            	    {
            	    // /home/alpha-omega/Desktop/comp.g:81:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            	    int alt33=6;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 57:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt33=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // /home/alpha-omega/Desktop/comp.g:81:25: '=='
            	            {
            	            string_literal127=(Token)match(input,53,FOLLOW_53_in_fois1365); 
            	            string_literal127_tree = (CommonTree)adaptor.create(string_literal127);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal127_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/alpha-omega/Desktop/comp.g:81:33: '!='
            	            {
            	            string_literal128=(Token)match(input,54,FOLLOW_54_in_fois1370); 
            	            string_literal128_tree = (CommonTree)adaptor.create(string_literal128);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal128_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/alpha-omega/Desktop/comp.g:81:41: '<='
            	            {
            	            string_literal129=(Token)match(input,55,FOLLOW_55_in_fois1375); 
            	            string_literal129_tree = (CommonTree)adaptor.create(string_literal129);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal129_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /home/alpha-omega/Desktop/comp.g:81:49: '>='
            	            {
            	            string_literal130=(Token)match(input,56,FOLLOW_56_in_fois1380); 
            	            string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
            	            root_0 = (CommonTree)adaptor.becomeRoot(string_literal130_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // /home/alpha-omega/Desktop/comp.g:81:57: '<'
            	            {
            	            char_literal131=(Token)match(input,57,FOLLOW_57_in_fois1385); 
            	            char_literal131_tree = (CommonTree)adaptor.create(char_literal131);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal131_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // /home/alpha-omega/Desktop/comp.g:81:64: '>'
            	            {
            	            char_literal132=(Token)match(input,58,FOLLOW_58_in_fois1390); 
            	            char_literal132_tree = (CommonTree)adaptor.create(char_literal132);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal132_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_fois1396);
            	    atom133=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom133.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "fois"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/alpha-omega/Desktop/comp.g:82:1: atom : ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( '-' atom ) );
    public final compParser.atom_return atom() throws RecognitionException {
        compParser.atom_return retval = new compParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CST_ENT134=null;
        Token IDF135=null;
        Token char_literal136=null;
        Token char_literal138=null;
        Token char_literal139=null;
        compParser.exp_return exp137 = null;

        compParser.atom_return atom140 = null;


        CommonTree CST_ENT134_tree=null;
        CommonTree IDF135_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/alpha-omega/Desktop/comp.g:82:12: ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( '-' atom ) )
            int alt35=4;
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
            case 35:
                {
                alt35=3;
                }
                break;
            case 48:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/alpha-omega/Desktop/comp.g:82:16: CST_ENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CST_ENT134=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_atom1414); 
                    CST_ENT134_tree = (CommonTree)adaptor.create(CST_ENT134);
                    adaptor.addChild(root_0, CST_ENT134_tree);


                    }
                    break;
                case 2 :
                    // /home/alpha-omega/Desktop/comp.g:83:5: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF135=(Token)match(input,IDF,FOLLOW_IDF_in_atom1421); 
                    IDF135_tree = (CommonTree)adaptor.create(IDF135);
                    adaptor.addChild(root_0, IDF135_tree);


                    }
                    break;
                case 3 :
                    // /home/alpha-omega/Desktop/comp.g:84:5: '(' exp ')'
                    {
                    char_literal136=(Token)match(input,35,FOLLOW_35_in_atom1428);  
                    stream_35.add(char_literal136);

                    pushFollow(FOLLOW_exp_in_atom1430);
                    exp137=exp();

                    state._fsp--;

                    stream_exp.add(exp137.getTree());
                    char_literal138=(Token)match(input,36,FOLLOW_36_in_atom1432);  
                    stream_36.add(char_literal138);



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
                    // 84:17: -> exp
                    {
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/alpha-omega/Desktop/comp.g:85:5: '-' atom
                    {
                    char_literal139=(Token)match(input,48,FOLLOW_48_in_atom1442);  
                    stream_48.add(char_literal139);

                    pushFollow(FOLLOW_atom_in_atom1444);
                    atom140=atom();

                    state._fsp--;

                    stream_atom.add(atom140.getTree());


                    // AST REWRITE
                    // elements: atom, 48
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:14: -> ^( '-' atom )
                    {
                        // /home/alpha-omega/Desktop/comp.g:85:16: ^( '-' atom )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_48.nextNode(), root_1);

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
        "\1\15\1\40\10\uffff";
    static final String DFA14_maxS =
        "\1\53\1\50\10\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\10";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\6\1\7\6\uffff\1\1\20\uffff\1\2\1\uffff\1\3\1\uffff\1"+
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
            return "54:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );";
        }
    }
 

    public static final BitSet FOLLOW_26_in_prog123 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_declaration_in_prog127 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_instruction_in_prog134 = new BitSet(new long[]{0x00000A800840E000L});
    public static final BitSet FOLLOW_27_in_prog140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_declaration196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_declaration203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_proc_in_declaration212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_dec_var229 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_dec_var234 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_dec_var237 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_dec_var241 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_29_in_type270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_type304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_type339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_func_in_dec_func355 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_declaration_in_dec_func359 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_instruction_in_dec_func367 = new BitSet(new long[]{0x00000A800840E000L});
    public static final BitSet FOLLOW_27_in_dec_func371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_proc_in_dec_proc401 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_declaration_in_dec_proc405 = new BitSet(new long[]{0x00000A80E840E060L});
    public static final BitSet FOLLOW_instruction_in_dec_proc413 = new BitSet(new long[]{0x00000A800840E000L});
    public static final BitSet FOLLOW_27_in_dec_proc417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FONCTION_in_ent_func445 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_type_in_ent_func450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_ent_func454 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_param_in_ent_func458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_ent_proc482 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_ent_proc486 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_param_in_ent_proc489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_array511 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_array513 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_bounds_in_array515 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_array516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds538 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_bounds540 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds542 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_bounds545 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds548 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_bounds550 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds553 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_35_in_param570 = new BitSet(new long[]{0x0000003000400000L});
    public static final BitSet FOLLOW_formal_in_param573 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_28_in_param578 = new BitSet(new long[]{0x0000002000400000L});
    public static final BitSet FOLLOW_formal_in_param580 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_36_in_param589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_formal612 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_formal616 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_formal620 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_type_in_formal624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_instruction687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retour_in_instruction701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_instruction742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_appel758 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_appel760 = new BitSet(new long[]{0x0007001800C00000L});
    public static final BitSet FOLLOW_exp_in_appel764 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_28_in_appel767 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_appel768 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_36_in_appel775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_bloc799 = new BitSet(new long[]{0x00000A80E040E060L});
    public static final BitSet FOLLOW_declaration_in_bloc803 = new BitSet(new long[]{0x00000A80E040E060L});
    public static final BitSet FOLLOW_instruction_in_bloc810 = new BitSet(new long[]{0x00000A800840E000L});
    public static final BitSet FOLLOW_27_in_bloc816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation825 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_affectation829 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_affectation833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation863 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_affectation865 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_affectation867 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_28_in_affectation870 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_affectation872 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_33_in_affectation877 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_affectation879 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_affectation881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_iteration918 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_iteration922 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_iteration926 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_iteration930 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_iteration934 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_iteration938 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_iteration942 = new BitSet(new long[]{0x00000A800040E000L});
    public static final BitSet FOLLOW_instruction_in_iteration948 = new BitSet(new long[]{0x00000A800840E000L});
    public static final BitSet FOLLOW_27_in_iteration955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_condition989 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_condition993 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_condition997 = new BitSet(new long[]{0x00000A800040E000L});
    public static final BitSet FOLLOW_instruction_in_condition1003 = new BitSet(new long[]{0x00006A800040E000L});
    public static final BitSet FOLLOW_45_in_condition1009 = new BitSet(new long[]{0x00000A800040E000L});
    public static final BitSet FOLLOW_instruction_in_condition1014 = new BitSet(new long[]{0x00004A800040E000L});
    public static final BitSet FOLLOW_46_in_condition1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETOUR_in_retour1059 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_retour1061 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_retour1065 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_retour1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1092 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_IDF_in_read1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1116 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_write1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1135 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_write1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_in_exp1167 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_set_in_exp1170 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_plus_in_exp1177 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_49_in_exp1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_exp1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp2_in_exp1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21234 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_exp21236 = new BitSet(new long[]{0x0007001800C00000L});
    public static final BitSet FOLLOW_exp_in_exp21239 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_28_in_exp21242 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_exp21244 = new BitSet(new long[]{0x0000001010000000L});
    public static final BitSet FOLLOW_36_in_exp21251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21279 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_exp21281 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_exp21283 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_28_in_exp21286 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_exp21288 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_33_in_exp21293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fois_in_plus1331 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_set_in_plus1335 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_fois_in_plus1342 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_atom_in_fois1359 = new BitSet(new long[]{0x07E0000000000002L});
    public static final BitSet FOLLOW_53_in_fois1365 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_54_in_fois1370 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_55_in_fois1375 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_56_in_fois1380 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_57_in_fois1385 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_58_in_fois1390 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_atom_in_fois1396 = new BitSet(new long[]{0x07E0000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_atom1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_atom1428 = new BitSet(new long[]{0x0007000800C00000L});
    public static final BitSet FOLLOW_exp_in_atom1430 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_atom1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_atom1442 = new BitSet(new long[]{0x0001000800C00000L});
    public static final BitSet FOLLOW_atom_in_atom1444 = new BitSet(new long[]{0x0000000000000002L});

}