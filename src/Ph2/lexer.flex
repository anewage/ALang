/*
    CODE SECTION
*/
package Ph2;
import java.io.*;
import java.util.Hashtable;

%%

%{
    /* Phase 1 */
    public void echoFinding(String lexeme, String token, String attribute) throws IOException{
        FileWriter fw1 = new FileWriter("./src/Ph1/output.al", true);
        FileWriter fw2 = new FileWriter("./src/lexemes.al", true);
        BufferedWriter bw1 = new BufferedWriter(fw1);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        String msg = lexeme + "\t\t" + token + "\t\t" + attribute;
        //System.out.println(msg);
        bw1.write("\n"+msg);
        bw2.write("\n"+msg);
        bw1.close();
        bw2.close();
    }

    /* Phase 2 */
    private Hashtable<String, String> symbolTable = new Hashtable<String, String>();

    public int insertSymbol(String lexeme, String token) {
        if (!isInSymbolTable(lexeme)){
            symbolTable.put(lexeme, token);
            return 0;
        }
        return -1;
    }

    public boolean isInSymbolTable(String lexeme){
        return symbolTable.containsKey(lexeme);
    }
%}

/*
    DECLARATION SECTION
*/

LETTER = [a-zA-Z]
DIGIT = [0-9]
HARF = "'"[a-zA-Z0-9]"'"

SHENASE = "#"{LETTER}{LETTER}{DIGIT}{DIGIT}{DIGIT}
ADADSABET = {DIGIT}+
REALCONST = {ADADSABET}"\."{ADADSABET}
BOOLSABET = "true"|"false"

WHITESPACE = [ \n\r\t]
COMMENTS = "//".*
PLUS = [+]
MINUS = [-]
MULTP = [*]
DIVIDE = [/]
MOD = [%]
SEMICOLON_KW = [;]
COLON_KW = [:]
COMMA_KW = [,]
SINGLE_QUOTE_KW = [']
TWO_DOTS_KW = "\.\."
LP_KW = [(]
RP_KW = [)]
BLOCK_START = (\{)
BLOCK_END = (\})
RANGE_START = (\[)
RANGE_END = (\])
NEQ_KW = (<>)
GT_KW = (>)
GTE_KW = (>=)
LT_KW = (<)
LTE_KW = (<=)
EQ_KW = (=)
ASSIGN_KW = (:=)
INT_KW = (int)
FLOAT_KW = (float)
CHAR_KW = (char)
BOOLEAN_KW = (boolean)
PROGRAM_KW = (program)
MAIN_KW = (main)
AGAR_KW = (agar)
ANGAH_KW = (angah)
VAGARNA_KW = (vagarna)
DO_KW = (do)
WHILE_KW = (while)
FOR_KW = (for)
GOZINESH_KW = (gozinesh)
MORED_KW = (mored)
END_KW = (end)
EXIT_KW = (exit)
WHEN_KW = (when)
DEFAULT_KW = (default)
UPTO_KW = (upto)
DOWNTO_KW = (downto)
VA_KW = (va)
YA_KW = (ya)
VAANGAH_KW = "va angah"
YAVAGARNA_KW = "ya vagarna"
RAVIE_KW = (ravie)
NAGHIZ_KW = (naghiz)
BAZGASHT_KW = (bazgasht)

%%

/*
    RULES
*/

{SHENASE} {return YYParser.SHENASE;}
{HARF} {return YYParser.HARF;}
{ADADSABET} {return YYParser.ADADSABET;}
{REALCONST} {return YYParser.REALCONST;}
{BOOLSABET} {return YYParser.BOOLSABET;}
{COMMENTS} {return YYParser.COMMENTS;}
{SEMICOLON_KW} {return YYParser.SEMICOLON_KW;}
{COLON_KW} {return YYParser.COLON_KW;}
{COMMA_KW} {return YYParser.COMMA_KW;}
{SINGLE_QUOTE_KW} {return YYParser.SINGLE_QUOTE_KW;}
{TWO_DOTS_KW} {return YYParser.TWO_DOTS_KW;}
{LP_KW} {return YYParser.LP_KW;}
{RP_KW} {return YYParser.RP_KW;}
{PLUS} {return YYParser.PLUS;}
{MINUS} {return YYParser.MINUS;}
{MULTP} {return YYParser.MULTP;}
{DIVIDE} {return YYParser.DIVIDE;}
{MOD} {return YYParser.MOD;}
{BLOCK_START} {return YYParser.BLOCK_START;}
{BLOCK_END} {return YYParser.BLOCK_END;}
{RANGE_START} {return YYParser.RANGE_START;}
{RANGE_END} {return YYParser.RANGE_END;}
{NEQ_KW} {return YYParser.NEQ_KW;}
{GT_KW} {return YYParser.GT_KW;}
{GTE_KW} {return YYParser.GTE_KW;}
{LT_KW} {return YYParser.LT_KW;}
{LTE_KW} {return YYParser.LTE_KW;}
{EQ_KW} {return YYParser.EQ_KW;}
{ASSIGN_KW} {return YYParser.ASSIGN_KW;}
{INT_KW} {return YYParser.INT_KW;}
{FLOAT_KW} {return YYParser.FLOAT_KW;}
{CHAR_KW} {return YYParser.CHAR_KW;}
{BOOLEAN_KW} {return YYParser.BOOLEAN_KW;}
{PROGRAM_KW} {return YYParser.PROGRAM_KW;}
{MAIN_KW} {return YYParser.MAIN_KW;}
{AGAR_KW} {return YYParser.AGAR_KW;}
{ANGAH_KW} {return YYParser.ANGAH_KW;}
{VAGARNA_KW} {return YYParser.VAGARNA_KW;}
{DO_KW} {return YYParser.DO_KW;}
{WHILE_KW} {return YYParser.WHILE_KW;}
{FOR_KW} {return YYParser.FOR_KW;}
{GOZINESH_KW} {return YYParser.GOZINESH_KW;}
{MORED_KW} {return YYParser.MORED_KW;}
{END_KW} {return YYParser.END_KW;}
{EXIT_KW} {return YYParser.EXIT_KW;}
{WHEN_KW} {return YYParser.WHEN_KW;}
{DEFAULT_KW} {return YYParser.DEFAULT_KW;}
{UPTO_KW} {return YYParser.UPTO_KW;}
{DOWNTO_KW} {return YYParser.DOWNTO_KW;}
{VA_KW} {return YYParser.VA_KW;}
{YA_KW} {return YYParser.YA_KW;}
{VAANGAH_KW} {return YYParser.VAANGAH_KW;}
{YAVAGARNA_KW} {return YYParser.YAVAGARNA_KW;}
{RAVIE_KW} {return YYParser.RAVIE_KW;}
{NAGHIZ_KW} {return YYParser.NAGHIZ_KW;}
{BAZGASHT_KW} {return YYParser.BAZGASHT_KW;}
{WHITESPACE} {}
. {}
