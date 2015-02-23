// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g 2015-02-23 17:25:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class compLexer extends Lexer {
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

    public compLexer() {;} 
    public compLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public compLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g"; }

    // $ANTLR start "FONCTION"
    public final void mFONCTION() throws RecognitionException {
        try {
            int _type = FONCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:3:10: ( 'function' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:3:12: 'function'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:4:11: ( 'procedure' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:4:13: 'procedure'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:5:13: ( 'affectation' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:5:15: 'affectation'
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

    // $ANTLR start "RETOUR"
    public final void mRETOUR() throws RecognitionException {
        try {
            int _type = RETOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:6:8: ( 'retour' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:6:10: 'retour'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:7:6: ( 'read' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:7:8: 'read'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:8:7: ( 'write' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:8:9: 'write'
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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:9:7: ( 'do' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:9:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:10:7: ( 'end' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:10:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:11:7: ( ',' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:12:7: ( 'integer' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:12:9: 'integer'
            {
            match("integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:13:7: ( 'boolean' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:13:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:14:7: ( 'array' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:14:9: 'array'
            {
            match("array"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:15:7: ( '[' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:15:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:16:7: ( ']' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:16:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:17:7: ( '..' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:17:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:18:7: ( '(' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:18:9: '('
            {
            match('('); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:19:7: ( ')' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:19:9: ')'
            {
            match(')'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:20:7: ( 'adr' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:20:9: 'adr'
            {
            match("adr"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:21:7: ( ':' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:21:9: ':'
            {
            match(':'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:7: ( 'begin' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:22:9: 'begin'
            {
            match("begin"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:23:7: ( '=' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:23:9: '='
            {
            match('='); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:24:7: ( 'for' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:24:9: 'for'
            {
            match("for"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:25:7: ( 'in' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:25:9: 'in'
            {
            match("in"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:26:7: ( 'if' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:26:9: 'if'
            {
            match("if"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:27:7: ( 'then' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:27:9: 'then'
            {
            match("then"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:7: ( 'else' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:28:9: 'else'
            {
            match("else"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:29:7: ( 'fi' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:29:9: 'fi'
            {
            match("fi"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:7: ( '+' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:30:9: '+'
            {
            match('+'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:31:7: ( '-' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:31:9: '-'
            {
            match('-'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:32:7: ( 'true' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:32:9: 'true'
            {
            match("true"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:7: ( 'false' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:33:9: 'false'
            {
            match("false"); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:34:7: ( '*' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:34:9: '*'
            {
            match('*'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:35:7: ( '/' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:35:9: '/'
            {
            match('/'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:7: ( '==' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:36:9: '=='
            {
            match("=="); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:37:7: ( '!=' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:37:9: '!='
            {
            match("!="); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:7: ( '<=' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:38:9: '<='
            {
            match("<="); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:39:7: ( '>=' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:39:9: '>='
            {
            match(">="); 


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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:7: ( '<' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:40:9: '<'
            {
            match('<'); 

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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:41:7: ( '>' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:41:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "CST_ENT"
    public final void mCST_ENT() throws RecognitionException {
        try {
            int _type = CST_ENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:82:12: ( ( '0' .. '9' )+ )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:82:16: ( '0' .. '9' )+
            {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:82:16: ( '0' .. '9' )+
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
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:82:17: '0' .. '9'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:12: ( ( '\"' (~ '\"' )* '\"' ) )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:16: ( '\"' (~ '\"' )* '\"' )
            {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:16: ( '\"' (~ '\"' )* '\"' )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:17: '\"' (~ '\"' )* '\"'
            {
            match('\"'); 
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:20: (~ '\"' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:83:21: ~ '\"'
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:84:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:84:15: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:84:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:
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
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:12: ( ( '/*' ( . )* '*/' | ' ' | '\\t' )+ )
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:16: ( '/*' ( . )* '*/' | ' ' | '\\t' )+
            {
            // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:16: ( '/*' ( . )* '*/' | ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
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

                }

                switch (alt5) {
            	case 1 :
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:17: '/*' ( . )* '*/'
            	    {
            	    match("/*"); 

            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:21: ( . )*
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
            	    	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:21: .
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
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:28: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:85:32: '\\t'
            	    {
            	    match('\t'); 

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
        // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:8: ( FONCTION | PROCEDURE | AFFECTATION | RETOUR | READ | WRITE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | CST_ENT | CSTE_CHAINE | IDF | WS )
        int alt6=43;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:10: FONCTION
                {
                mFONCTION(); 

                }
                break;
            case 2 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:19: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 3 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:29: AFFECTATION
                {
                mAFFECTATION(); 

                }
                break;
            case 4 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:41: RETOUR
                {
                mRETOUR(); 

                }
                break;
            case 5 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:48: READ
                {
                mREAD(); 

                }
                break;
            case 6 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:53: WRITE
                {
                mWRITE(); 

                }
                break;
            case 7 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:59: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:65: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:71: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:77: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:83: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:89: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:95: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:101: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:107: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:113: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:119: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:125: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:131: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:137: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:143: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:149: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:155: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:161: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:167: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:173: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:179: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:185: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:191: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:197: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:203: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:209: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:215: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:221: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:227: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:233: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:239: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:245: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:251: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:257: CST_ENT
                {
                mCST_ENT(); 

                }
                break;
            case 41 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:265: CSTE_CHAINE
                {
                mCSTE_CHAINE(); 

                }
                break;
            case 42 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:277: IDF
                {
                mIDF(); 

                }
                break;
            case 43 :
                // /home/etudiants/karim2u/Bureau/COMPILATION/vincent66u/comp.g:1:281: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\7\34\1\uffff\2\34\6\uffff\1\60\1\34\3\uffff\1\63\1\uffff"+
        "\1\65\1\67\4\uffff\2\34\1\72\7\34\1\103\2\34\1\107\1\110\2\34\2"+
        "\uffff\2\34\5\uffff\1\34\1\116\1\uffff\4\34\1\123\3\34\1\uffff\1"+
        "\127\2\34\2\uffff\5\34\1\uffff\4\34\1\uffff\1\34\1\144\1\34\1\uffff"+
        "\1\146\3\34\1\152\1\153\1\34\1\155\2\34\1\160\1\34\1\uffff\1\162"+
        "\1\uffff\2\34\1\165\2\uffff\1\34\1\uffff\2\34\1\uffff\1\171\1\uffff"+
        "\2\34\1\uffff\3\34\1\uffff\1\177\1\u0080\1\u0081\2\34\3\uffff\1"+
        "\u0084\1\34\1\uffff\1\34\1\u0087\1\uffff";
    static final String DFA6_eofS =
        "\u0088\uffff";
    static final String DFA6_minS =
        "\1\11\1\141\1\162\1\144\1\145\1\162\1\157\1\154\1\uffff\1\146\1"+
        "\145\6\uffff\1\75\1\150\3\uffff\1\52\1\uffff\2\75\4\uffff\1\156"+
        "\1\162\1\60\1\154\1\157\1\146\2\162\1\141\1\151\1\60\1\144\1\163"+
        "\2\60\1\157\1\147\2\uffff\1\145\1\165\5\uffff\1\143\1\60\1\uffff"+
        "\1\163\1\143\1\145\1\141\1\60\1\157\1\144\1\164\1\uffff\1\60\2\145"+
        "\2\uffff\1\154\1\151\1\156\1\145\1\164\1\uffff\2\145\1\143\1\171"+
        "\1\uffff\1\165\1\60\1\145\1\uffff\1\60\1\147\1\145\1\156\2\60\1"+
        "\151\1\60\1\144\1\164\1\60\1\162\1\uffff\1\60\1\uffff\1\145\1\141"+
        "\1\60\2\uffff\1\157\1\uffff\1\165\1\141\1\uffff\1\60\1\uffff\1\162"+
        "\1\156\1\uffff\1\156\1\162\1\164\1\uffff\3\60\1\145\1\151\3\uffff"+
        "\1\60\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\165\2\162\1\145\1\162\1\157\1\156\1\uffff\1\156\1\157\6"+
        "\uffff\1\75\1\162\3\uffff\1\52\1\uffff\2\75\4\uffff\1\156\1\162"+
        "\1\172\1\154\1\157\1\146\2\162\1\164\1\151\1\172\1\144\1\163\2\172"+
        "\1\157\1\147\2\uffff\1\145\1\165\5\uffff\1\143\1\172\1\uffff\1\163"+
        "\1\143\1\145\1\141\1\172\1\157\1\144\1\164\1\uffff\1\172\2\145\2"+
        "\uffff\1\154\1\151\1\156\1\145\1\164\1\uffff\2\145\1\143\1\171\1"+
        "\uffff\1\165\1\172\1\145\1\uffff\1\172\1\147\1\145\1\156\2\172\1"+
        "\151\1\172\1\144\1\164\1\172\1\162\1\uffff\1\172\1\uffff\1\145\1"+
        "\141\1\172\2\uffff\1\157\1\uffff\1\165\1\141\1\uffff\1\172\1\uffff"+
        "\1\162\1\156\1\uffff\1\156\1\162\1\164\1\uffff\3\172\1\145\1\151"+
        "\3\uffff\1\172\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\11\2\uffff\1\15\1\16\1\17\1\20\1\21\1\23\2\uffff\1\34"+
        "\1\35\1\40\1\uffff\1\43\2\uffff\1\50\1\51\1\52\1\53\21\uffff\1\42"+
        "\1\25\2\uffff\1\41\1\44\1\46\1\45\1\47\2\uffff\1\33\10\uffff\1\7"+
        "\3\uffff\1\27\1\30\5\uffff\1\26\4\uffff\1\22\3\uffff\1\10\14\uffff"+
        "\1\5\1\uffff\1\32\3\uffff\1\31\1\36\1\uffff\1\37\2\uffff\1\14\1"+
        "\uffff\1\6\2\uffff\1\24\3\uffff\1\4\5\uffff\1\12\1\13\1\1\2\uffff"+
        "\1\2\2\uffff\1\3";
    static final String DFA6_specialS =
        "\u0088\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\35\26\uffff\1\35\1\27\1\33\5\uffff\1\16\1\17\1\25\1\23\1"+
            "\10\1\24\1\15\1\26\12\32\1\20\1\uffff\1\30\1\21\1\31\2\uffff"+
            "\32\34\1\13\1\uffff\1\14\3\uffff\1\3\1\12\1\34\1\6\1\7\1\1\2"+
            "\34\1\11\6\34\1\2\1\34\1\4\1\34\1\22\2\34\1\5\3\34",
            "\1\41\7\uffff\1\40\5\uffff\1\37\5\uffff\1\36",
            "\1\42",
            "\1\45\1\uffff\1\43\13\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\1\uffff\1\51",
            "",
            "\1\54\7\uffff\1\53",
            "\1\56\11\uffff\1\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\1\61\11\uffff\1\62",
            "",
            "",
            "",
            "\1\35",
            "",
            "\1\64",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\101\22\uffff\1\100",
            "\1\102",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\104",
            "\1\105",
            "\12\34\7\uffff\32\34\6\uffff\23\34\1\106\6\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\1\143",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\145",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\154",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\156",
            "\1\157",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\161",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\163",
            "\1\164",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
            "\1\u0085",
            "",
            "\1\u0086",
            "\12\34\7\uffff\32\34\6\uffff\32\34",
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
            return "1:1: Tokens : ( FONCTION | PROCEDURE | AFFECTATION | RETOUR | READ | WRITE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | CST_ENT | CSTE_CHAINE | IDF | WS );";
        }
    }
 

}