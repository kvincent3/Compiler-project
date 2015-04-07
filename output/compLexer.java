// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/oussama/Desktop/Compil/vincent66u/comp.g 2015-04-06 19:43:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class compLexer extends Lexer {
    public static final int INSTRUCTION=9;
    public static final int T__64=64;
    public static final int T__62=62;
    public static final int IDF=27;
    public static final int T__63=63;
    public static final int CASE=24;
    public static final int CONDITION=12;
    public static final int PARAM=18;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int CSTE_CHAINE=29;
    public static final int EOF=-1;
    public static final int DECLARATION=8;
    public static final int INTERVAL=22;
    public static final int LISTPARAM=19;
    public static final int CST_ENT=28;
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
    public static final int FONCTION=5;
    public static final int BLOC=10;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int TABLEAU=26;
    public static final int PROCEDURE=6;
    public static final int WRITE=15;
    public static final int RETOUR=13;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=30;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int BOUNDS=23;
    public static final int T__38=38;
    public static final int READ=14;
    public static final int T__39=39;
    public static final int AFFECTATION=7;
    public static final int CALL=17;
    public static final int DEC_VAR=20;

    // delegates
    // delegators

    public compLexer() {;} 
    public compLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public compLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/oussama/Desktop/Compil/vincent66u/comp.g"; }

    // $ANTLR start "FONCTION"
    public final void mFONCTION() throws RecognitionException {
        try {
            int _type = FONCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:3:10: ( 'function' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:3:12: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FONCTION"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:4:11: ( 'procedure' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:4:13: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "AFFECTATION"
    public final void mAFFECTATION() throws RecognitionException {
        try {
            int _type = AFFECTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:5:13: ( 'affectation' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:5:15: 'affectation'
            {
            match("affectation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AFFECTATION"

    // $ANTLR start "DECLARATION"
    public final void mDECLARATION() throws RecognitionException {
        try {
            int _type = DECLARATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:6:13: ( 'declaration' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:6:15: 'declaration'
            {
            match("declaration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARATION"

    // $ANTLR start "INSTRUCTION"
    public final void mINSTRUCTION() throws RecognitionException {
        try {
            int _type = INSTRUCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:7:13: ( 'instruction' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:7:15: 'instruction'
            {
            match("instruction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTRUCTION"

    // $ANTLR start "RETOUR"
    public final void mRETOUR() throws RecognitionException {
        try {
            int _type = RETOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:8:8: ( 'retour' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:8:10: 'retour'
            {
            match("retour"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETOUR"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:9:6: ( 'read' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:9:8: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:10:7: ( 'write' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:10:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "APPEL"
    public final void mAPPEL() throws RecognitionException {
        try {
            int _type = APPEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:11:7: ( 'Appel' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:11:9: 'Appel'
            {
            match("Appel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPEL"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:12:7: ( 'do' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:12:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:13:7: ( 'end' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:13:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:14:7: ( ',' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:15:7: ( 'integer' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:15:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:16:7: ( 'boolean' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:16:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:17:7: ( 'array' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:17:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:18:7: ( '[' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:19:7: ( ']' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:20:7: ( '..' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:20:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:21:7: ( '(' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:22:7: ( ')' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:23:7: ( 'adr' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:23:9: 'adr'
            {
            match("adr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:24:7: ( ':' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:25:7: ( 'begin' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:25:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:26:7: ( '=' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:27:7: ( 'for' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:27:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:28:7: ( 'in' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:28:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:29:7: ( 'if' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:29:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:30:7: ( 'then' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:30:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:31:7: ( 'else' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:31:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:7: ( 'fi' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:32:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:33:7: ( 'return' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:33:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:34:7: ( '+' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:34:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:35:7: ( '-' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:35:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:36:7: ( 'true' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:36:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:37:7: ( 'false' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:37:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:7: ( '*' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:38:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:39:7: ( '/' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:39:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:7: ( '==' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:40:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:41:7: ( '!=' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:41:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:42:7: ( '<=' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:42:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:7: ( '>=' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:43:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:44:7: ( '<' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:44:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:45:7: ( '>' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:45:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "CST_ENT"
    public final void mCST_ENT() throws RecognitionException {
        try {
            int _type = CST_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:94:12: ( ( '0' .. '9' )+ )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:94:16: ( '0' .. '9' )+
            {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:94:16: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:94:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CST_ENT"

    // $ANTLR start "CSTE_CHAINE"
    public final void mCSTE_CHAINE() throws RecognitionException {
        try {
            int _type = CSTE_CHAINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:12: ( ( '\"' (~ '\"' )* '\"' ) )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:16: ( '\"' (~ '\"' )* '\"' )
            {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:16: ( '\"' (~ '\"' )* '\"' )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:17: '\"' (~ '\"' )* '\"'
            {
            match('\"'); 
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:20: (~ '\"' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:95:21: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSTE_CHAINE"

    // $ANTLR start "IDF"
    public final void mIDF() throws RecognitionException {
        try {
            int _type = IDF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:96:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:96:15: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/oussama/Desktop/Compil/vincent66u/comp.g:96:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDF"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:12: ( ( '/*' ( . )* '*/' | ' ' | '\\t' | '\\n' )+ )
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:16: ( '/*' ( . )* '*/' | ' ' | '\\t' | '\\n' )+
            {
            // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:16: ( '/*' ( . )* '*/' | ' ' | '\\t' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case '/':
                    {
                    alt5=1;
                    }
                    break;
                case ' ':
                    {
                    alt5=2;
                    }
                    break;
                case '\t':
                    {
                    alt5=3;
                    }
                    break;
                case '\n':
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:17: '/*' ( . )* '*/'
            	    {
            	    match("/*"); 

            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:21: ( . )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0=='*') ) {
            	            int LA4_1 = input.LA(2);

            	            if ( (LA4_1=='/') ) {
            	                alt4=2;
            	            }
            	            else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:21: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    match("*/"); 


            	    }
            	    break;
            	case 2 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:28: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:32: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 4 :
            	    // /home/oussama/Desktop/Compil/vincent66u/comp.g:97:37: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:8: ( FONCTION | PROCEDURE | AFFECTATION | DECLARATION | INSTRUCTION | RETOUR | READ | WRITE | APPEL | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | CST_ENT | CSTE_CHAINE | IDF | WS )
        int alt6=47;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:10: FONCTION
                {
                mFONCTION(); 

                }
                break;
            case 2 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:19: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 3 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:29: AFFECTATION
                {
                mAFFECTATION(); 

                }
                break;
            case 4 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:41: DECLARATION
                {
                mDECLARATION(); 

                }
                break;
            case 5 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:53: INSTRUCTION
                {
                mINSTRUCTION(); 

                }
                break;
            case 6 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:65: RETOUR
                {
                mRETOUR(); 

                }
                break;
            case 7 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:72: READ
                {
                mREAD(); 

                }
                break;
            case 8 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:77: WRITE
                {
                mWRITE(); 

                }
                break;
            case 9 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:83: APPEL
                {
                mAPPEL(); 

                }
                break;
            case 10 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:89: T__31
                {
                mT__31(); 

                }
                break;
            case 11 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:95: T__32
                {
                mT__32(); 

                }
                break;
            case 12 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:101: T__33
                {
                mT__33(); 

                }
                break;
            case 13 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:107: T__34
                {
                mT__34(); 

                }
                break;
            case 14 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:113: T__35
                {
                mT__35(); 

                }
                break;
            case 15 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:119: T__36
                {
                mT__36(); 

                }
                break;
            case 16 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:125: T__37
                {
                mT__37(); 

                }
                break;
            case 17 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:131: T__38
                {
                mT__38(); 

                }
                break;
            case 18 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:137: T__39
                {
                mT__39(); 

                }
                break;
            case 19 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:143: T__40
                {
                mT__40(); 

                }
                break;
            case 20 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:149: T__41
                {
                mT__41(); 

                }
                break;
            case 21 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:155: T__42
                {
                mT__42(); 

                }
                break;
            case 22 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:161: T__43
                {
                mT__43(); 

                }
                break;
            case 23 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:167: T__44
                {
                mT__44(); 

                }
                break;
            case 24 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:173: T__45
                {
                mT__45(); 

                }
                break;
            case 25 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:179: T__46
                {
                mT__46(); 

                }
                break;
            case 26 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:185: T__47
                {
                mT__47(); 

                }
                break;
            case 27 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:191: T__48
                {
                mT__48(); 

                }
                break;
            case 28 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:197: T__49
                {
                mT__49(); 

                }
                break;
            case 29 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:203: T__50
                {
                mT__50(); 

                }
                break;
            case 30 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:209: T__51
                {
                mT__51(); 

                }
                break;
            case 31 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:215: T__52
                {
                mT__52(); 

                }
                break;
            case 32 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:221: T__53
                {
                mT__53(); 

                }
                break;
            case 33 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:227: T__54
                {
                mT__54(); 

                }
                break;
            case 34 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:233: T__55
                {
                mT__55(); 

                }
                break;
            case 35 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:239: T__56
                {
                mT__56(); 

                }
                break;
            case 36 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:245: T__57
                {
                mT__57(); 

                }
                break;
            case 37 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:251: T__58
                {
                mT__58(); 

                }
                break;
            case 38 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:257: T__59
                {
                mT__59(); 

                }
                break;
            case 39 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:263: T__60
                {
                mT__60(); 

                }
                break;
            case 40 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:269: T__61
                {
                mT__61(); 

                }
                break;
            case 41 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:275: T__62
                {
                mT__62(); 

                }
                break;
            case 42 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:281: T__63
                {
                mT__63(); 

                }
                break;
            case 43 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:287: T__64
                {
                mT__64(); 

                }
                break;
            case 44 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:293: CST_ENT
                {
                mCST_ENT(); 

                }
                break;
            case 45 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:301: CSTE_CHAINE
                {
                mCSTE_CHAINE(); 

                }
                break;
            case 46 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:313: IDF
                {
                mIDF(); 

                }
                break;
            case 47 :
                // /home/oussama/Desktop/Compil/vincent66u/comp.g:1:317: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\11\35\1\uffff\1\35\6\uffff\1\63\1\35\3\uffff\1\66\1\uffff"+
        "\1\70\1\72\4\uffff\2\35\1\75\6\35\1\104\1\107\1\110\7\35\2\uffff"+
        "\2\35\5\uffff\1\35\1\124\1\uffff\4\35\1\131\1\35\1\uffff\2\35\2"+
        "\uffff\4\35\1\142\6\35\1\uffff\4\35\1\uffff\5\35\1\162\2\35\1\uffff"+
        "\1\165\2\35\1\170\1\171\1\35\1\173\2\35\1\176\5\35\1\uffff\1\u0084"+
        "\1\u0085\1\uffff\1\35\1\u0087\2\uffff\1\35\1\uffff\2\35\1\uffff"+
        "\3\35\1\u008e\1\u008f\2\uffff\1\35\1\uffff\5\35\1\u0096\2\uffff"+
        "\1\u0097\1\u0098\4\35\3\uffff\1\u009d\3\35\1\uffff\3\35\1\u00a4"+
        "\1\u00a5\1\u00a6\3\uffff";
    static final String DFA6_eofS =
        "\u00a7\uffff";
    static final String DFA6_minS =
        "\1\11\1\141\1\162\1\144\1\145\1\146\1\145\1\162\1\160\1\154\1\uffff"+
        "\1\145\6\uffff\1\75\1\150\3\uffff\1\52\1\uffff\2\75\4\uffff\1\156"+
        "\1\162\1\60\1\154\1\157\1\146\2\162\1\143\3\60\1\141\1\151\1\160"+
        "\1\144\1\163\1\157\1\147\2\uffff\1\145\1\165\5\uffff\1\143\1\60"+
        "\1\uffff\1\163\1\143\1\145\1\141\1\60\1\154\1\uffff\1\164\1\145"+
        "\2\uffff\1\157\1\144\1\164\1\145\1\60\1\145\1\154\1\151\1\156\1"+
        "\145\1\164\1\uffff\2\145\1\143\1\171\1\uffff\1\141\1\162\1\147\1"+
        "\165\1\162\1\60\1\145\1\154\1\uffff\1\60\1\145\1\156\2\60\1\151"+
        "\1\60\1\144\1\164\1\60\1\162\1\165\1\145\1\162\1\156\1\uffff\2\60"+
        "\1\uffff\1\141\1\60\2\uffff\1\157\1\uffff\1\165\1\141\1\uffff\1"+
        "\141\1\143\1\162\2\60\2\uffff\1\156\1\uffff\1\156\1\162\3\164\1"+
        "\60\2\uffff\2\60\1\145\3\151\3\uffff\1\60\3\157\1\uffff\3\156\3"+
        "\60\3\uffff";
    static final String DFA6_maxS =
        "\1\172\1\165\2\162\1\157\1\156\1\145\1\162\1\160\1\156\1\uffff\1"+
        "\157\6\uffff\1\75\1\162\3\uffff\1\52\1\uffff\2\75\4\uffff\1\156"+
        "\1\162\1\172\1\154\1\157\1\146\2\162\1\143\3\172\1\164\1\151\1\160"+
        "\1\144\1\163\1\157\1\147\2\uffff\1\145\1\165\5\uffff\1\143\1\172"+
        "\1\uffff\1\163\1\143\1\145\1\141\1\172\1\154\1\uffff\1\164\1\145"+
        "\2\uffff\1\165\1\144\1\164\1\145\1\172\1\145\1\154\1\151\1\156\1"+
        "\145\1\164\1\uffff\2\145\1\143\1\171\1\uffff\1\141\1\162\1\147\1"+
        "\165\1\162\1\172\1\145\1\154\1\uffff\1\172\1\145\1\156\2\172\1\151"+
        "\1\172\1\144\1\164\1\172\1\162\1\165\1\145\1\162\1\156\1\uffff\2"+
        "\172\1\uffff\1\141\1\172\2\uffff\1\157\1\uffff\1\165\1\141\1\uffff"+
        "\1\141\1\143\1\162\2\172\2\uffff\1\156\1\uffff\1\156\1\162\3\164"+
        "\1\172\2\uffff\2\172\1\145\3\151\3\uffff\1\172\3\157\1\uffff\3\156"+
        "\3\172\3\uffff";
    static final String DFA6_acceptS =
        "\12\uffff\1\14\1\uffff\1\20\1\21\1\22\1\23\1\24\1\26\2\uffff\1\40"+
        "\1\41\1\44\1\uffff\1\47\2\uffff\1\54\1\55\1\56\1\57\23\uffff\1\46"+
        "\1\30\2\uffff\1\45\1\50\1\52\1\51\1\53\2\uffff\1\36\6\uffff\1\12"+
        "\2\uffff\1\32\1\33\13\uffff\1\31\4\uffff\1\25\10\uffff\1\13\17\uffff"+
        "\1\7\2\uffff\1\35\2\uffff\1\34\1\42\1\uffff\1\43\2\uffff\1\17\5"+
        "\uffff\1\10\1\11\1\uffff\1\27\6\uffff\1\6\1\37\6\uffff\1\15\1\16"+
        "\1\1\4\uffff\1\2\6\uffff\1\3\1\4\1\5";
    static final String DFA6_specialS =
        "\u00a7\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\36\25\uffff\1\36\1\30\1\34\5\uffff\1\17\1\20\1\26\1\24\1"+
            "\12\1\25\1\16\1\27\12\33\1\21\1\uffff\1\31\1\22\1\32\2\uffff"+
            "\1\10\31\35\1\14\1\uffff\1\15\3\uffff\1\3\1\13\1\35\1\4\1\11"+
            "\1\1\2\35\1\5\6\35\1\2\1\35\1\6\1\35\1\23\2\35\1\7\3\35",
            "\1\42\7\uffff\1\41\5\uffff\1\40\5\uffff\1\37",
            "\1\43",
            "\1\46\1\uffff\1\44\13\uffff\1\45",
            "\1\47\11\uffff\1\50",
            "\1\52\7\uffff\1\51",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\57\1\uffff\1\56",
            "",
            "\1\61\11\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\64\11\uffff\1\65",
            "",
            "",
            "",
            "\1\36",
            "",
            "\1\67",
            "\1\71",
            "",
            "",
            "",
            "",
            "\1\73",
            "\1\74",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\22\35\1\105\1\106\6\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\112\22\uffff\1\111",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\123",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "\1\135\5\uffff\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\163",
            "\1\164",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\166",
            "\1\167",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\172",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\174",
            "\1\175",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "\1\u0086",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "\12\35\7\uffff\32\35\6\uffff\32\35",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( FONCTION | PROCEDURE | AFFECTATION | DECLARATION | INSTRUCTION | RETOUR | READ | WRITE | APPEL | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | CST_ENT | CSTE_CHAINE | IDF | WS );";
        }
    }
 

}