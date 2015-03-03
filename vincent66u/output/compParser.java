// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g 2015-02-23 17:44:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class compParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "FONCTION", "PROCEDURE", "AFFECTATION", "BLOC", "ITERATION", "CONDITION", "RETOUR", "READ", "WRITE", "APPEL", "CALL", "PARAM", "IDF", "CST_ENT", "CSTE_CHAINE", "WS", "'do'", "'end'", "','", "'integer'", "'boolean'", "'array'", "'['", "']'", "'..'", "'('", "')'", "'adr'", "':'", "'begin'", "'='", "'for'", "'in'", "'if'", "'then'", "'else'", "'fi'", "'+'", "'-'", "'true'", "'false'", "'*'", "'/'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int AFFECTATION=7;
    public static final int BLOC=8;
    public static final int T__50=50;
    public static final int VAR=4;
    public static final int IDF=17;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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
    public static final int T__21=21;
    public static final int CALL=15;
    public static final int FONCTION=5;
    public static final int CSTE_CHAINE=19;
    public static final int WRITE=13;
    public static final int APPEL=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int WS=20;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int CST_ENT=18;
    public static final int PROCEDURE=6;
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
    public String getGrammarFileName() { return "/home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:1: prog : 'do' ( declaration )* ( instruction )+ 'end' -> ^( 'do' ( ( declaration )* )? ( instruction )+ 'end' ) ;
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
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:11: ( 'do' ( declaration )* ( instruction )+ 'end' -> ^( 'do' ( ( declaration )* )? ( instruction )+ 'end' ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:14: 'do' ( declaration )* ( instruction )+ 'end'
            {
            string_literal1=(Token)match(input,21,FOLLOW_21_in_prog98);  
            stream_21.add(string_literal1);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:20: ( declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=FONCTION && LA1_0<=PROCEDURE)||(LA1_0>=24 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:21: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_prog102);
            	    declaration2=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:37: ( instruction )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RETOUR && LA2_0<=WRITE)||LA2_0==IDF||LA2_0==34||LA2_0==36||LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:38: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_prog109);
            	    instruction3=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            string_literal4=(Token)match(input,22,FOLLOW_22_in_prog115);  
            stream_22.add(string_literal4);



            // AST REWRITE
            // elements: declaration, 21, 22, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 21:60: -> ^( 'do' ( ( declaration )* )? ( instruction )+ 'end' )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:63: ^( 'do' ( ( declaration )* )? ( instruction )+ 'end' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_21.nextNode(), root_1);

                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:70: ( ( declaration )* )?
                if ( stream_declaration.hasNext() ) {
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:21:71: ( declaration )*
                    while ( stream_declaration.hasNext() ) {
                        adaptor.addChild(root_1, stream_declaration.nextTree());

                    }
                    stream_declaration.reset();

                }
                stream_declaration.reset();
                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();
                adaptor.addChild(root_1, stream_22.nextNode());

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
        return retval;
    }
    // $ANTLR end "prog"

    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:23:1: declaration : ( dec_var -> dec_var | dec_func -> dec_func | dec_proc -> dec_proc );
    public final compParser.declaration_return declaration() throws RecognitionException {
        compParser.declaration_return retval = new compParser.declaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        compParser.dec_var_return dec_var5 = null;

        compParser.dec_func_return dec_func6 = null;

        compParser.dec_proc_return dec_proc7 = null;


        RewriteRuleSubtreeStream stream_dec_var=new RewriteRuleSubtreeStream(adaptor,"rule dec_var");
        RewriteRuleSubtreeStream stream_dec_func=new RewriteRuleSubtreeStream(adaptor,"rule dec_func");
        RewriteRuleSubtreeStream stream_dec_proc=new RewriteRuleSubtreeStream(adaptor,"rule dec_proc");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:23:13: ( dec_var -> dec_var | dec_func -> dec_func | dec_proc -> dec_proc )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
            case 25:
            case 26:
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:23:16: dec_var
                    {
                    pushFollow(FOLLOW_dec_var_in_declaration146);
                    dec_var5=dec_var();

                    state._fsp--;

                    stream_dec_var.add(dec_var5.getTree());


                    // AST REWRITE
                    // elements: dec_var
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:24: -> dec_var
                    {
                        adaptor.addChild(root_0, stream_dec_var.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:24:5: dec_func
                    {
                    pushFollow(FOLLOW_dec_func_in_declaration156);
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
                    // 24:14: -> dec_func
                    {
                        adaptor.addChild(root_0, stream_dec_func.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:25:5: dec_proc
                    {
                    pushFollow(FOLLOW_dec_proc_in_declaration165);
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
                    // 25:14: -> dec_proc
                    {
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
        return retval;
    }
    // $ANTLR end "declaration"

    public static class dec_var_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_var"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:1: dec_var : type IDF ( ',' IDF )* -> ^( VAR type IDF ) ;
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
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:13: ( type IDF ( ',' IDF )* -> ^( VAR type IDF ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:16: type IDF ( ',' IDF )*
            {
            pushFollow(FOLLOW_type_in_dec_var182);
            type8=type();

            state._fsp--;

            stream_type.add(type8.getTree());
            IDF9=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var187);  
            stream_IDF.add(IDF9);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:28: ( ',' IDF )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:29: ',' IDF
            	    {
            	    char_literal10=(Token)match(input,23,FOLLOW_23_in_dec_var190);  
            	    stream_23.add(char_literal10);

            	    IDF11=(Token)match(input,IDF,FOLLOW_IDF_in_dec_var194);  
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

            root_0 = (Object)adaptor.nil();
            // 27:41: -> ^( VAR type IDF )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:27:43: ^( VAR type IDF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
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
        return retval;
    }
    // $ANTLR end "dec_var"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:29:1: type : ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) );
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
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:29:13: ( 'integer' -> ^( 'integer' ) | 'boolean' -> ^( 'boolean' ) | 'array' -> ^( 'array' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:29:15: 'integer'
                    {
                    string_literal12=(Token)match(input,24,FOLLOW_24_in_type221);  
                    stream_24.add(string_literal12);



                    // AST REWRITE
                    // elements: 24
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:24: -> ^( 'integer' )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:29:26: ^( 'integer' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_24.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:30:27: 'boolean'
                    {
                    string_literal13=(Token)match(input,25,FOLLOW_25_in_type255);  
                    stream_25.add(string_literal13);



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
                    // 30:36: -> ^( 'boolean' )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:30:38: ^( 'boolean' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_25.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:31:28: 'array'
                    {
                    string_literal14=(Token)match(input,26,FOLLOW_26_in_type290);  
                    stream_26.add(string_literal14);



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
                    // 31:36: -> ^( 'array' )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:31:38: ^( 'array' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "type"

    public static class dec_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_func"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:1: dec_func : ent_func ( declaration )* ( instruction )+ 'end' -> ^( FONCTION ) ;
    public final compParser.dec_func_return dec_func() throws RecognitionException {
        compParser.dec_func_return retval = new compParser.dec_func_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        compParser.ent_func_return ent_func15 = null;

        compParser.declaration_return declaration16 = null;

        compParser.instruction_return instruction17 = null;


        Object string_literal18_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_ent_func=new RewriteRuleSubtreeStream(adaptor,"rule ent_func");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:13: ( ent_func ( declaration )* ( instruction )+ 'end' -> ^( FONCTION ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:16: ent_func ( declaration )* ( instruction )+ 'end'
            {
            pushFollow(FOLLOW_ent_func_in_dec_func306);
            ent_func15=ent_func();

            state._fsp--;

            stream_ent_func.add(ent_func15.getTree());
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:26: ( declaration )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=FONCTION && LA6_0<=PROCEDURE)||(LA6_0>=24 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_dec_func310);
            	    declaration16=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration16.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:43: ( instruction )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RETOUR && LA7_0<=WRITE)||LA7_0==IDF||LA7_0==34||LA7_0==36||LA7_0==38) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:45: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_dec_func318);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            string_literal18=(Token)match(input,22,FOLLOW_22_in_dec_func322);  
            stream_22.add(string_literal18);



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
            // 32:65: -> ^( FONCTION )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:32:67: ^( FONCTION )
                {
                Object root_1 = (Object)adaptor.nil();
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
        return retval;
    }
    // $ANTLR end "dec_func"

    public static class dec_proc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dec_proc"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:1: dec_proc : ent_proc ( declaration )* ( instruction )+ 'end' -> ^( PROCEDURE ) ;
    public final compParser.dec_proc_return dec_proc() throws RecognitionException {
        compParser.dec_proc_return retval = new compParser.dec_proc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal22=null;
        compParser.ent_proc_return ent_proc19 = null;

        compParser.declaration_return declaration20 = null;

        compParser.instruction_return instruction21 = null;


        Object string_literal22_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_ent_proc=new RewriteRuleSubtreeStream(adaptor,"rule ent_proc");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:13: ( ent_proc ( declaration )* ( instruction )+ 'end' -> ^( PROCEDURE ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:16: ent_proc ( declaration )* ( instruction )+ 'end'
            {
            pushFollow(FOLLOW_ent_proc_in_dec_proc340);
            ent_proc19=ent_proc();

            state._fsp--;

            stream_ent_proc.add(ent_proc19.getTree());
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:26: ( declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=FONCTION && LA8_0<=PROCEDURE)||(LA8_0>=24 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:27: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_dec_proc344);
            	    declaration20=declaration();

            	    state._fsp--;

            	    stream_declaration.add(declaration20.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:43: ( instruction )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RETOUR && LA9_0<=WRITE)||LA9_0==IDF||LA9_0==34||LA9_0==36||LA9_0==38) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:45: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_dec_proc352);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            string_literal22=(Token)match(input,22,FOLLOW_22_in_dec_proc356);  
            stream_22.add(string_literal22);



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
            // 35:65: -> ^( PROCEDURE )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:35:67: ^( PROCEDURE )
                {
                Object root_1 = (Object)adaptor.nil();
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
        return retval;
    }
    // $ANTLR end "dec_proc"

    public static class ent_func_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_func"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:37:1: ent_func : 'function' type IDF param -> ^( 'function' ^( type IDF param ) ) ;
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
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:37:13: ( 'function' type IDF param -> ^( 'function' ^( type IDF param ) ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:37:15: 'function' type IDF param
            {
            string_literal23=(Token)match(input,FONCTION,FOLLOW_FONCTION_in_ent_func372);  
            stream_FONCTION.add(string_literal23);

            pushFollow(FOLLOW_type_in_ent_func377);
            type24=type();

            state._fsp--;

            stream_type.add(type24.getTree());
            IDF25=(Token)match(input,IDF,FOLLOW_IDF_in_ent_func381);  
            stream_IDF.add(IDF25);

            pushFollow(FOLLOW_param_in_ent_func385);
            param26=param();

            state._fsp--;

            stream_param.add(param26.getTree());


            // AST REWRITE
            // elements: param, type, IDF, FONCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:48: -> ^( 'function' ^( type IDF param ) )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:37:51: ^( 'function' ^( type IDF param ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_FONCTION.nextNode(), root_1);

                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:37:64: ^( type IDF param )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_type.nextNode(), root_2);

                adaptor.addChild(root_2, stream_IDF.nextNode());
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
        return retval;
    }
    // $ANTLR end "ent_func"

    public static class ent_proc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ent_proc"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:39:1: ent_proc : 'procedure' IDF param -> ^( 'procedure' ^( IDF param ) ) ;
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
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:39:13: ( 'procedure' IDF param -> ^( 'procedure' ^( IDF param ) ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:39:15: 'procedure' IDF param
            {
            string_literal27=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_ent_proc410);  
            stream_PROCEDURE.add(string_literal27);

            IDF28=(Token)match(input,IDF,FOLLOW_IDF_in_ent_proc414);  
            stream_IDF.add(IDF28);

            pushFollow(FOLLOW_param_in_ent_proc417);
            param29=param();

            state._fsp--;

            stream_param.add(param29.getTree());


            // AST REWRITE
            // elements: IDF, PROCEDURE, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:40: -> ^( 'procedure' ^( IDF param ) )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:39:42: ^( 'procedure' ^( IDF param ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:39:56: ^( IDF param )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_IDF.nextNode(), root_2);

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
        return retval;
    }
    // $ANTLR end "ent_proc"

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:41:1: array : 'array' '[' bounds ']' -> ^( 'array' ^( bounds ) ) ;
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
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_bounds=new RewriteRuleSubtreeStream(adaptor,"rule bounds");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:41:12: ( 'array' '[' bounds ']' -> ^( 'array' ^( bounds ) ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:41:14: 'array' '[' bounds ']'
            {
            string_literal30=(Token)match(input,26,FOLLOW_26_in_array441);  
            stream_26.add(string_literal30);

            char_literal31=(Token)match(input,27,FOLLOW_27_in_array443);  
            stream_27.add(char_literal31);

            pushFollow(FOLLOW_bounds_in_array445);
            bounds32=bounds();

            state._fsp--;

            stream_bounds.add(bounds32.getTree());
            char_literal33=(Token)match(input,28,FOLLOW_28_in_array446);  
            stream_28.add(char_literal33);



            // AST REWRITE
            // elements: bounds, 26
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 41:36: -> ^( 'array' ^( bounds ) )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:41:39: ^( 'array' ^( bounds ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_26.nextNode(), root_1);

                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:41:49: ^( bounds )
                {
                Object root_2 = (Object)adaptor.nil();
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
        return retval;
    }
    // $ANTLR end "array"

    public static class bounds_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bounds"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:43:1: bounds : CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:43:13: ( CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )* )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:43:16: CST_ENT '..' CST_ENT ( ',' CST_ENT '..' CST_ENT )*
            {
            root_0 = (Object)adaptor.nil();

            CST_ENT34=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds470); 
            CST_ENT34_tree = (Object)adaptor.create(CST_ENT34);
            adaptor.addChild(root_0, CST_ENT34_tree);

            string_literal35=(Token)match(input,29,FOLLOW_29_in_bounds472); 
            string_literal35_tree = (Object)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            CST_ENT36=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds474); 
            CST_ENT36_tree = (Object)adaptor.create(CST_ENT36);
            adaptor.addChild(root_0, CST_ENT36_tree);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:43:37: ( ',' CST_ENT '..' CST_ENT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:43:38: ',' CST_ENT '..' CST_ENT
            	    {
            	    char_literal37=(Token)match(input,23,FOLLOW_23_in_bounds477); 
            	    char_literal37_tree = (Object)adaptor.create(char_literal37);
            	    adaptor.addChild(root_0, char_literal37_tree);

            	    CST_ENT38=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds480); 
            	    CST_ENT38_tree = (Object)adaptor.create(CST_ENT38);
            	    adaptor.addChild(root_0, CST_ENT38_tree);

            	    string_literal39=(Token)match(input,29,FOLLOW_29_in_bounds482); 
            	    string_literal39_tree = (Object)adaptor.create(string_literal39);
            	    adaptor.addChild(root_0, string_literal39_tree);

            	    CST_ENT40=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_bounds485); 
            	    CST_ENT40_tree = (Object)adaptor.create(CST_ENT40);
            	    adaptor.addChild(root_0, CST_ENT40_tree);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "bounds"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:1: param : '(' ( formal ( ',' formal )* )? ')' -> ^( PARAM ( formal )* ) ;
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
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_formal=new RewriteRuleSubtreeStream(adaptor,"rule formal");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:13: ( '(' ( formal ( ',' formal )* )? ')' -> ^( PARAM ( formal )* ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:16: '(' ( formal ( ',' formal )* )? ')'
            {
            char_literal41=(Token)match(input,30,FOLLOW_30_in_param502);  
            stream_30.add(char_literal41);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:20: ( formal ( ',' formal )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDF||LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:21: formal ( ',' formal )*
                    {
                    pushFollow(FOLLOW_formal_in_param505);
                    formal42=formal();

                    state._fsp--;

                    stream_formal.add(formal42.getTree());
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:30: ( ',' formal )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:31: ',' formal
                    	    {
                    	    char_literal43=(Token)match(input,23,FOLLOW_23_in_param510);  
                    	    stream_23.add(char_literal43);

                    	    pushFollow(FOLLOW_formal_in_param512);
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

            char_literal45=(Token)match(input,31,FOLLOW_31_in_param521);  
            stream_31.add(char_literal45);



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
            // 44:52: -> ^( PARAM ( formal )* )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:54: ^( PARAM ( formal )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);

                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:44:62: ( formal )*
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
        return retval;
    }
    // $ANTLR end "param"

    public static class formal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formal"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:47:1: formal : ( 'adr' )? IDF ':' type ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:47:13: ( ( 'adr' )? IDF ':' type )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:47:15: ( 'adr' )? IDF ':' type
            {
            root_0 = (Object)adaptor.nil();

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:47:15: ( 'adr' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:47:16: 'adr'
                    {
                    string_literal46=(Token)match(input,32,FOLLOW_32_in_formal543); 
                    string_literal46_tree = (Object)adaptor.create(string_literal46);
                    adaptor.addChild(root_0, string_literal46_tree);


                    }
                    break;

            }

            IDF47=(Token)match(input,IDF,FOLLOW_IDF_in_formal547); 
            IDF47_tree = (Object)adaptor.create(IDF47);
            adaptor.addChild(root_0, IDF47_tree);

            char_literal48=(Token)match(input,33,FOLLOW_33_in_formal551); 
            char_literal48_tree = (Object)adaptor.create(char_literal48);
            adaptor.addChild(root_0, char_literal48_tree);

            pushFollow(FOLLOW_type_in_formal555);
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
        return retval;
    }
    // $ANTLR end "formal"

    public static class instruction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:48:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );
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
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:48:13: ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel )
            int alt14=8;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:48:17: affectation
                    {
                    pushFollow(FOLLOW_affectation_in_instruction567);
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
                    // 48:29: -> affectation
                    {
                        adaptor.addChild(root_0, stream_affectation.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:49:10: bloc
                    {
                    pushFollow(FOLLOW_bloc_in_instruction581);
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
                    // 49:16: -> bloc
                    {
                        adaptor.addChild(root_0, stream_bloc.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:50:10: iteration
                    {
                    pushFollow(FOLLOW_iteration_in_instruction596);
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
                    // 50:20: -> iteration
                    {
                        adaptor.addChild(root_0, stream_iteration.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:51:10: condition
                    {
                    pushFollow(FOLLOW_condition_in_instruction610);
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
                    // 51:20: -> condition
                    {
                        adaptor.addChild(root_0, stream_condition.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:52:10: retour
                    {
                    pushFollow(FOLLOW_retour_in_instruction624);
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
                    // 52:17: -> retour
                    {
                        adaptor.addChild(root_0, stream_retour.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:53:10: read
                    {
                    pushFollow(FOLLOW_read_in_instruction638);
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
                    // 53:15: -> read
                    {
                        adaptor.addChild(root_0, stream_read.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:54:10: write
                    {
                    pushFollow(FOLLOW_write_in_instruction652);
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
                    // 54:16: -> write
                    {
                        adaptor.addChild(root_0, stream_write.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:55:9: appel
                    {
                    pushFollow(FOLLOW_appel_in_instruction665);
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
                    // 55:14: -> appel
                    {
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
        return retval;
    }
    // $ANTLR end "instruction"

    public static class appel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "appel"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:1: appel : IDF '(' ( exp ( ',' exp )* )? ')' ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:12: ( IDF '(' ( exp ( ',' exp )* )? ')' )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:16: IDF '(' ( exp ( ',' exp )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            IDF58=(Token)match(input,IDF,FOLLOW_IDF_in_appel681); 
            IDF58_tree = (Object)adaptor.create(IDF58);
            adaptor.addChild(root_0, IDF58_tree);

            char_literal59=(Token)match(input,30,FOLLOW_30_in_appel683); 
            char_literal59_tree = (Object)adaptor.create(char_literal59);
            adaptor.addChild(root_0, char_literal59_tree);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:24: ( exp ( ',' exp )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=IDF && LA16_0<=CST_ENT)||LA16_0==30||(LA16_0>=43 && LA16_0<=45)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:26: exp ( ',' exp )*
                    {
                    pushFollow(FOLLOW_exp_in_appel687);
                    exp60=exp();

                    state._fsp--;

                    adaptor.addChild(root_0, exp60.getTree());
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:29: ( ',' exp )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==23) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:56:31: ',' exp
                    	    {
                    	    char_literal61=(Token)match(input,23,FOLLOW_23_in_appel690); 
                    	    char_literal61_tree = (Object)adaptor.create(char_literal61);
                    	    adaptor.addChild(root_0, char_literal61_tree);

                    	    pushFollow(FOLLOW_exp_in_appel691);
                    	    exp62=exp();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, exp62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal63=(Token)match(input,31,FOLLOW_31_in_appel698); 
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
        return retval;
    }
    // $ANTLR end "appel"

    public static class bloc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bloc"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:1: bloc : 'begin' ( declaration )* ( instruction )+ 'end' ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:9: ( 'begin' ( declaration )* ( instruction )+ 'end' )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:13: 'begin' ( declaration )* ( instruction )+ 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal64=(Token)match(input,34,FOLLOW_34_in_bloc711); 
            string_literal64_tree = (Object)adaptor.create(string_literal64);
            adaptor.addChild(root_0, string_literal64_tree);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:22: ( declaration )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=FONCTION && LA17_0<=PROCEDURE)||(LA17_0>=24 && LA17_0<=26)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:23: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_bloc715);
            	    declaration65=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration65.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:39: ( instruction )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RETOUR && LA18_0<=WRITE)||LA18_0==IDF||LA18_0==34||LA18_0==36||LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:57:40: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_bloc722);
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

            string_literal67=(Token)match(input,22,FOLLOW_22_in_bloc728); 
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
        return retval;
    }
    // $ANTLR end "bloc"

    public static class affectation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "affectation"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:58:1: affectation : ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) );
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
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:58:12: ( IDF '=' exp -> ^( '=' IDF exp ) | IDF '[' exp ( ',' exp )* ']' '=' exp -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDF) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==35) ) {
                    alt20=1;
                }
                else if ( (LA20_1==27) ) {
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:58:17: IDF '=' exp
                    {
                    IDF68=(Token)match(input,IDF,FOLLOW_IDF_in_affectation737);  
                    stream_IDF.add(IDF68);

                    char_literal69=(Token)match(input,35,FOLLOW_35_in_affectation741);  
                    stream_35.add(char_literal69);

                    pushFollow(FOLLOW_exp_in_affectation745);
                    exp70=exp();

                    state._fsp--;

                    stream_exp.add(exp70.getTree());


                    // AST REWRITE
                    // elements: 35, exp, IDF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 58:33: -> ^( '=' IDF exp )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:58:36: ^( '=' IDF exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:19: IDF '[' exp ( ',' exp )* ']' '=' exp
                    {
                    IDF71=(Token)match(input,IDF,FOLLOW_IDF_in_affectation775);  
                    stream_IDF.add(IDF71);

                    char_literal72=(Token)match(input,27,FOLLOW_27_in_affectation777);  
                    stream_27.add(char_literal72);

                    pushFollow(FOLLOW_exp_in_affectation779);
                    exp73=exp();

                    state._fsp--;

                    stream_exp.add(exp73.getTree());
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:31: ( ',' exp )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==23) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:32: ',' exp
                    	    {
                    	    char_literal74=(Token)match(input,23,FOLLOW_23_in_affectation782);  
                    	    stream_23.add(char_literal74);

                    	    pushFollow(FOLLOW_exp_in_affectation784);
                    	    exp75=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    char_literal76=(Token)match(input,28,FOLLOW_28_in_affectation789);  
                    stream_28.add(char_literal76);

                    char_literal77=(Token)match(input,35,FOLLOW_35_in_affectation791);  
                    stream_35.add(char_literal77);

                    pushFollow(FOLLOW_exp_in_affectation793);
                    exp78=exp();

                    state._fsp--;

                    stream_exp.add(exp78.getTree());


                    // AST REWRITE
                    // elements: 27, IDF, exp, 35, exp, exp, 23, 28
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:55: -> ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:57: ^( '=' IDF ^( exp '[' exp ( ',' exp )* ']' ) )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:68: ^( exp '[' exp ( ',' exp )* ']' )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_27.nextNode());
                        adaptor.addChild(root_2, stream_exp.nextTree());
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:59:82: ( ',' exp )*
                        while ( stream_exp.hasNext()||stream_23.hasNext() ) {
                            adaptor.addChild(root_2, stream_23.nextNode());
                            adaptor.addChild(root_2, stream_exp.nextTree());

                        }
                        stream_exp.reset();
                        stream_23.reset();
                        adaptor.addChild(root_2, stream_28.nextNode());

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
        return retval;
    }
    // $ANTLR end "affectation"

    public static class iteration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iteration"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:1: iteration : 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) ;
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:12: ( 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end' -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:16: 'for' IDF 'in' exp '..' exp 'do' ( instruction )+ 'end'
            {
            string_literal79=(Token)match(input,36,FOLLOW_36_in_iteration830);  
            stream_36.add(string_literal79);

            IDF80=(Token)match(input,IDF,FOLLOW_IDF_in_iteration834);  
            stream_IDF.add(IDF80);

            string_literal81=(Token)match(input,37,FOLLOW_37_in_iteration838);  
            stream_37.add(string_literal81);

            pushFollow(FOLLOW_exp_in_iteration842);
            exp82=exp();

            state._fsp--;

            stream_exp.add(exp82.getTree());
            string_literal83=(Token)match(input,29,FOLLOW_29_in_iteration846);  
            stream_29.add(string_literal83);

            pushFollow(FOLLOW_exp_in_iteration850);
            exp84=exp();

            state._fsp--;

            stream_exp.add(exp84.getTree());
            string_literal85=(Token)match(input,21,FOLLOW_21_in_iteration854);  
            stream_21.add(string_literal85);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:63: ( instruction )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RETOUR && LA21_0<=WRITE)||LA21_0==IDF||LA21_0==34||LA21_0==36||LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:65: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_iteration860);
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

            string_literal87=(Token)match(input,22,FOLLOW_22_in_iteration867);  
            stream_22.add(string_literal87);



            // AST REWRITE
            // elements: 21, IDF, 37, exp, 29, exp, instruction, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 60:87: -> ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:89: ^( 'for' IDF 'in' exp '..' exp 'do' ^( instruction ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDF.nextNode());
                adaptor.addChild(root_1, stream_37.nextNode());
                adaptor.addChild(root_1, stream_exp.nextTree());
                adaptor.addChild(root_1, stream_29.nextNode());
                adaptor.addChild(root_1, stream_exp.nextTree());
                adaptor.addChild(root_1, stream_21.nextNode());
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:60:124: ^( instruction )
                {
                Object root_2 = (Object)adaptor.nil();
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
        return retval;
    }
    // $ANTLR end "iteration"

    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condition"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:1: condition : 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? ) ;
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
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:12: ( 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:16: 'if' exp 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi'
            {
            string_literal88=(Token)match(input,38,FOLLOW_38_in_condition901);  
            stream_38.add(string_literal88);

            pushFollow(FOLLOW_exp_in_condition905);
            exp89=exp();

            state._fsp--;

            stream_exp.add(exp89.getTree());
            string_literal90=(Token)match(input,39,FOLLOW_39_in_condition909);  
            stream_39.add(string_literal90);

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:38: ( instruction )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RETOUR && LA22_0<=WRITE)||LA22_0==IDF||LA22_0==34||LA22_0==36||LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:40: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_condition915);
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

            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:55: ( 'else' ( instruction )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:56: 'else' ( instruction )+
                    {
                    string_literal92=(Token)match(input,40,FOLLOW_40_in_condition921);  
                    stream_40.add(string_literal92);

                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:65: ( instruction )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RETOUR && LA23_0<=WRITE)||LA23_0==IDF||LA23_0==34||LA23_0==36||LA23_0==38) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:66: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_condition926);
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

            string_literal94=(Token)match(input,41,FOLLOW_41_in_condition935);  
            stream_41.add(string_literal94);



            // AST REWRITE
            // elements: instruction, 40, exp, 39, 38, instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:90: -> ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:92: ^( 'if' exp ^( 'then' instruction ) ( 'else' ( instruction )+ )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                adaptor.addChild(root_1, stream_exp.nextTree());
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:103: ^( 'then' instruction )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_39.nextNode(), root_2);

                adaptor.addChild(root_2, stream_instruction.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:61:125: ( 'else' ( instruction )+ )?
                if ( stream_40.hasNext()||stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_40.nextNode());
                    if ( !(stream_instruction.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_instruction.hasNext() ) {
                        adaptor.addChild(root_1, stream_instruction.nextTree());

                    }
                    stream_instruction.reset();

                }
                stream_40.reset();
                stream_instruction.reset();

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
        return retval;
    }
    // $ANTLR end "condition"

    public static class retour_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retour"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:62:1: retour : 'retour' '(' exp ')' -> ^( RETOUR exp ) ;
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
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:62:12: ( 'retour' '(' exp ')' -> ^( RETOUR exp ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:62:16: 'retour' '(' exp ')'
            {
            string_literal95=(Token)match(input,RETOUR,FOLLOW_RETOUR_in_retour971);  
            stream_RETOUR.add(string_literal95);

            char_literal96=(Token)match(input,30,FOLLOW_30_in_retour973);  
            stream_30.add(char_literal96);

            pushFollow(FOLLOW_exp_in_retour977);
            exp97=exp();

            state._fsp--;

            stream_exp.add(exp97.getTree());
            char_literal98=(Token)match(input,31,FOLLOW_31_in_retour982);  
            stream_31.add(char_literal98);



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
            // 62:41: -> ^( RETOUR exp )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:62:43: ^( RETOUR exp )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETOUR, "RETOUR"), root_1);

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
        return retval;
    }
    // $ANTLR end "retour"

    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:63:1: read : 'read' IDF -> ^( READ IDF ) ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:63:12: ( 'read' IDF -> ^( READ IDF ) )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:63:16: 'read' IDF
            {
            string_literal99=(Token)match(input,READ,FOLLOW_READ_in_read1004);  
            stream_READ.add(string_literal99);

            IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_read1009);  
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
            // 63:30: -> ^( READ IDF )
            {
                // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:63:32: ^( READ IDF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);

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
        return retval;
    }
    // $ANTLR end "read"

    public static class write_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "write"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:64:1: write : ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) );
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
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:64:10: ( 'write' exp -> ^( WRITE exp ) | 'write' CSTE_CHAINE -> ^( WRITE CSTE_CHAINE ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==WRITE) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==CSTE_CHAINE) ) {
                    alt25=2;
                }
                else if ( ((LA25_1>=IDF && LA25_1<=CST_ENT)||LA25_1==30||(LA25_1>=43 && LA25_1<=45)) ) {
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:64:14: 'write' exp
                    {
                    string_literal101=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1028);  
                    stream_WRITE.add(string_literal101);

                    pushFollow(FOLLOW_exp_in_write1030);
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
                    // 64:25: -> ^( WRITE exp )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:64:27: ^( WRITE exp )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

                        adaptor.addChild(root_1, stream_exp.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:65:10: 'write' CSTE_CHAINE
                    {
                    string_literal103=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1047);  
                    stream_WRITE.add(string_literal103);

                    CSTE_CHAINE104=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_write1049);  
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
                    // 65:30: -> ^( WRITE CSTE_CHAINE )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:65:32: ^( WRITE CSTE_CHAINE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);

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
        return retval;
    }
    // $ANTLR end "write"

    public static class exp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:67:2: exp : ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 );
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:67:9: ( plus ( ( '+' | '-' ) plus )* | 'true' | 'false' | exp2 )
            int alt27=4;
            switch ( input.LA(1) ) {
            case CST_ENT:
            case 30:
            case 43:
                {
                alt27=1;
                }
                break;
            case IDF:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==27||LA27_2==30) ) {
                    alt27=4;
                }
                else if ( ((LA27_2>=RETOUR && LA27_2<=WRITE)||LA27_2==IDF||(LA27_2>=21 && LA27_2<=23)||(LA27_2>=28 && LA27_2<=29)||LA27_2==31||LA27_2==34||LA27_2==36||(LA27_2>=38 && LA27_2<=43)||(LA27_2>=46 && LA27_2<=53)) ) {
                    alt27=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt27=2;
                }
                break;
            case 45:
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:67:14: plus ( ( '+' | '-' ) plus )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_plus_in_exp1079);
                    plus105=plus();

                    state._fsp--;

                    adaptor.addChild(root_0, plus105.getTree());
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:67:19: ( ( '+' | '-' ) plus )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=42 && LA26_0<=43)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:67:20: ( '+' | '-' ) plus
                    	    {
                    	    set106=(Token)input.LT(1);
                    	    set106=(Token)input.LT(1);
                    	    if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
                    	        input.consume();
                    	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set106), root_0);
                    	        state.errorRecovery=false;
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }

                    	    pushFollow(FOLLOW_plus_in_exp1089);
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:68:12: 'true'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal108=(Token)match(input,44,FOLLOW_44_in_exp1104); 
                    string_literal108_tree = (Object)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);


                    }
                    break;
                case 3 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:69:12: 'false'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal109=(Token)match(input,45,FOLLOW_45_in_exp1117); 
                    string_literal109_tree = (Object)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 4 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:70:12: exp2
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_exp2_in_exp1130);
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
        return retval;
    }
    // $ANTLR end "exp"

    public static class exp2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exp2"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:1: exp2 : ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( exp IDF ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) );
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
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:11: ( IDF '(' ( exp ( ',' exp )* )? ')' -> ^( exp IDF ) | IDF '[' exp ( ',' exp )* ']' -> ^( exp IDF ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDF) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==30) ) {
                    alt31=1;
                }
                else if ( (LA31_1==27) ) {
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:17: IDF '(' ( exp ( ',' exp )* )? ')'
                    {
                    IDF111=(Token)match(input,IDF,FOLLOW_IDF_in_exp21146);  
                    stream_IDF.add(IDF111);

                    char_literal112=(Token)match(input,30,FOLLOW_30_in_exp21148);  
                    stream_30.add(char_literal112);

                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:25: ( exp ( ',' exp )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=IDF && LA29_0<=CST_ENT)||LA29_0==30||(LA29_0>=43 && LA29_0<=45)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:26: exp ( ',' exp )*
                            {
                            pushFollow(FOLLOW_exp_in_exp21151);
                            exp113=exp();

                            state._fsp--;

                            stream_exp.add(exp113.getTree());
                            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:30: ( ',' exp )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==23) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:31: ',' exp
                            	    {
                            	    char_literal114=(Token)match(input,23,FOLLOW_23_in_exp21154);  
                            	    stream_23.add(char_literal114);

                            	    pushFollow(FOLLOW_exp_in_exp21156);
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

                    char_literal116=(Token)match(input,31,FOLLOW_31_in_exp21163);  
                    stream_31.add(char_literal116);



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
                    // 71:47: -> ^( exp IDF )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:71:49: ^( exp IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:72:18: IDF '[' exp ( ',' exp )* ']'
                    {
                    IDF117=(Token)match(input,IDF,FOLLOW_IDF_in_exp21188);  
                    stream_IDF.add(IDF117);

                    char_literal118=(Token)match(input,27,FOLLOW_27_in_exp21190);  
                    stream_27.add(char_literal118);

                    pushFollow(FOLLOW_exp_in_exp21192);
                    exp119=exp();

                    state._fsp--;

                    stream_exp.add(exp119.getTree());
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:72:30: ( ',' exp )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==23) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:72:31: ',' exp
                    	    {
                    	    char_literal120=(Token)match(input,23,FOLLOW_23_in_exp21195);  
                    	    stream_23.add(char_literal120);

                    	    pushFollow(FOLLOW_exp_in_exp21197);
                    	    exp121=exp();

                    	    state._fsp--;

                    	    stream_exp.add(exp121.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    char_literal122=(Token)match(input,28,FOLLOW_28_in_exp21202);  
                    stream_28.add(char_literal122);



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
                    // 72:45: -> ^( exp IDF )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:72:47: ^( exp IDF )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_exp.nextNode(), root_1);

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
        return retval;
    }
    // $ANTLR end "exp2"

    public static class plus_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:74:1: plus : fois ( ( '*' | '/' ) fois )* ;
    public final compParser.plus_return plus() throws RecognitionException {
        compParser.plus_return retval = new compParser.plus_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set124=null;
        compParser.fois_return fois123 = null;

        compParser.fois_return fois125 = null;


        Object set124_tree=null;

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:74:12: ( fois ( ( '*' | '/' ) fois )* )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:74:16: fois ( ( '*' | '/' ) fois )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fois_in_plus1240);
            fois123=fois();

            state._fsp--;

            adaptor.addChild(root_0, fois123.getTree());
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:74:21: ( ( '*' | '/' ) fois )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=46 && LA32_0<=47)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:74:23: ( '*' | '/' ) fois
            	    {
            	    set124=(Token)input.LT(1);
            	    set124=(Token)input.LT(1);
            	    if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set124), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_fois_in_plus1251);
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
        return retval;
    }
    // $ANTLR end "plus"

    public static class fois_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fois"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:1: fois : atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* ;
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

        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:12: ( atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )* )
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:16: atom ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_fois1268);
            atom126=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom126.getTree());
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:21: ( ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=48 && LA34_0<=53)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) atom
            	    {
            	    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:24: ( '==' | '!=' | '<=' | '>=' | '<' | '>' )
            	    int alt33=6;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt33=5;
            	        }
            	        break;
            	    case 53:
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
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:25: '=='
            	            {
            	            string_literal127=(Token)match(input,48,FOLLOW_48_in_fois1274); 
            	            string_literal127_tree = (Object)adaptor.create(string_literal127);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal127_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:33: '!='
            	            {
            	            string_literal128=(Token)match(input,49,FOLLOW_49_in_fois1279); 
            	            string_literal128_tree = (Object)adaptor.create(string_literal128);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal128_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:41: '<='
            	            {
            	            string_literal129=(Token)match(input,50,FOLLOW_50_in_fois1284); 
            	            string_literal129_tree = (Object)adaptor.create(string_literal129);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal129_tree, root_0);


            	            }
            	            break;
            	        case 4 :
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:49: '>='
            	            {
            	            string_literal130=(Token)match(input,51,FOLLOW_51_in_fois1289); 
            	            string_literal130_tree = (Object)adaptor.create(string_literal130);
            	            root_0 = (Object)adaptor.becomeRoot(string_literal130_tree, root_0);


            	            }
            	            break;
            	        case 5 :
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:57: '<'
            	            {
            	            char_literal131=(Token)match(input,52,FOLLOW_52_in_fois1294); 
            	            char_literal131_tree = (Object)adaptor.create(char_literal131);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal131_tree, root_0);


            	            }
            	            break;
            	        case 6 :
            	            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:75:64: '>'
            	            {
            	            char_literal132=(Token)match(input,53,FOLLOW_53_in_fois1299); 
            	            char_literal132_tree = (Object)adaptor.create(char_literal132);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal132_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_fois1305);
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
        return retval;
    }
    // $ANTLR end "fois"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:76:1: atom : ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( VAR '-' atom ) );
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
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:76:12: ( CST_ENT | IDF | '(' exp ')' -> exp | '-' atom -> ^( VAR '-' atom ) )
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
            case 30:
                {
                alt35=3;
                }
                break;
            case 43:
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
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:76:16: CST_ENT
                    {
                    root_0 = (Object)adaptor.nil();

                    CST_ENT134=(Token)match(input,CST_ENT,FOLLOW_CST_ENT_in_atom1323); 
                    CST_ENT134_tree = (Object)adaptor.create(CST_ENT134);
                    adaptor.addChild(root_0, CST_ENT134_tree);


                    }
                    break;
                case 2 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:77:5: IDF
                    {
                    root_0 = (Object)adaptor.nil();

                    IDF135=(Token)match(input,IDF,FOLLOW_IDF_in_atom1330); 
                    IDF135_tree = (Object)adaptor.create(IDF135);
                    adaptor.addChild(root_0, IDF135_tree);


                    }
                    break;
                case 3 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:78:5: '(' exp ')'
                    {
                    char_literal136=(Token)match(input,30,FOLLOW_30_in_atom1337);  
                    stream_30.add(char_literal136);

                    pushFollow(FOLLOW_exp_in_atom1339);
                    exp137=exp();

                    state._fsp--;

                    stream_exp.add(exp137.getTree());
                    char_literal138=(Token)match(input,31,FOLLOW_31_in_atom1341);  
                    stream_31.add(char_literal138);



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
                    // 78:17: -> exp
                    {
                        adaptor.addChild(root_0, stream_exp.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:79:5: '-' atom
                    {
                    char_literal139=(Token)match(input,43,FOLLOW_43_in_atom1351);  
                    stream_43.add(char_literal139);

                    pushFollow(FOLLOW_atom_in_atom1353);
                    atom140=atom();

                    state._fsp--;

                    stream_atom.add(atom140.getTree());


                    // AST REWRITE
                    // elements: 43, atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:14: -> ^( VAR '-' atom )
                    {
                        // /home/etudiants/condere1u/Bureau/compil_proj/vincent66u/comp.g:79:16: ^( VAR '-' atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_43.nextNode());
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
        "\1\13\1\33\10\uffff";
    static final String DFA14_maxS =
        "\1\46\1\43\10\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\10";
    static final String DFA14_specialS =
        "\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\5\1\6\1\7\3\uffff\1\1\20\uffff\1\2\1\uffff\1\3\1\uffff\1"+
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
            return "48:1: instruction : ( affectation -> affectation | bloc -> bloc | iteration -> iteration | condition -> condition | retour -> retour | read -> read | write -> write | appel -> appel );";
        }
    }
 

    public static final BitSet FOLLOW_21_in_prog98 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_declaration_in_prog102 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_prog109 = new BitSet(new long[]{0x0000005407423860L});
    public static final BitSet FOLLOW_22_in_prog115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_var_in_declaration146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_func_in_declaration156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dec_proc_in_declaration165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_dec_var182 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_dec_var187 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_dec_var190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_dec_var194 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24_in_type221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_type255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_func_in_dec_func306 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_declaration_in_dec_func310 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_dec_func318 = new BitSet(new long[]{0x0000005407423860L});
    public static final BitSet FOLLOW_22_in_dec_func322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ent_proc_in_dec_proc340 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_declaration_in_dec_proc344 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_dec_proc352 = new BitSet(new long[]{0x0000005407423860L});
    public static final BitSet FOLLOW_22_in_dec_proc356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FONCTION_in_ent_func372 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_type_in_ent_func377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_ent_func381 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_ent_func385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_ent_proc410 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_ent_proc414 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_param_in_ent_proc417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_array441 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_array443 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_bounds_in_array445 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_array446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds470 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_bounds472 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds474 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_bounds477 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds480 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_bounds482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CST_ENT_in_bounds485 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_30_in_param502 = new BitSet(new long[]{0x0000000180020000L});
    public static final BitSet FOLLOW_formal_in_param505 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_param510 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_formal_in_param512 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_param521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_formal543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_formal547 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_formal551 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_type_in_formal555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_affectation_in_instruction567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bloc_in_instruction581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_in_instruction596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_in_instruction610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retour_in_instruction624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_appel_in_instruction665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_appel681 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_appel683 = new BitSet(new long[]{0x00003800C0060000L});
    public static final BitSet FOLLOW_exp_in_appel687 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_appel690 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_appel691 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_appel698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_bloc711 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_declaration_in_bloc715 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_bloc722 = new BitSet(new long[]{0x0000005407423860L});
    public static final BitSet FOLLOW_22_in_bloc728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation737 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_affectation741 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_affectation745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_affectation775 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_affectation777 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_affectation779 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_affectation782 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_affectation784 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_affectation789 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_affectation791 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_affectation793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_iteration830 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_iteration834 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_iteration838 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_iteration842 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_iteration846 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_iteration850 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_iteration854 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_iteration860 = new BitSet(new long[]{0x0000005407423860L});
    public static final BitSet FOLLOW_22_in_iteration867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_condition901 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_condition905 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_condition909 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_condition915 = new BitSet(new long[]{0x0000035407023860L});
    public static final BitSet FOLLOW_40_in_condition921 = new BitSet(new long[]{0x0000005407023860L});
    public static final BitSet FOLLOW_instruction_in_condition926 = new BitSet(new long[]{0x0000025407023860L});
    public static final BitSet FOLLOW_41_in_condition935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETOUR_in_retour971 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_retour973 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_retour977 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_retour982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1004 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDF_in_read1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1028 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_write1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1047 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_write1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_in_exp1079 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_set_in_exp1082 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_plus_in_exp1089 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_44_in_exp1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_exp1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exp2_in_exp1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21146 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_exp21148 = new BitSet(new long[]{0x00003800C0060000L});
    public static final BitSet FOLLOW_exp_in_exp21151 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_exp21154 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_exp21156 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_exp21163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_exp21188 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_exp21190 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_exp21192 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_23_in_exp21195 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_exp21197 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_28_in_exp21202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fois_in_plus1240 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_set_in_plus1244 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_fois_in_plus1251 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_atom_in_fois1268 = new BitSet(new long[]{0x003F000000000002L});
    public static final BitSet FOLLOW_48_in_fois1274 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_49_in_fois1279 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_50_in_fois1284 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_51_in_fois1289 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_52_in_fois1294 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_53_in_fois1299 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_atom_in_fois1305 = new BitSet(new long[]{0x003F000000000002L});
    public static final BitSet FOLLOW_CST_ENT_in_atom1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_atom1337 = new BitSet(new long[]{0x0000380040060000L});
    public static final BitSet FOLLOW_exp_in_atom1339 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_atom1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_atom1351 = new BitSet(new long[]{0x0000080040060000L});
    public static final BitSet FOLLOW_atom_in_atom1353 = new BitSet(new long[]{0x0000000000000002L});

}