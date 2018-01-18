/*
    CODE SECTION
*/
package Ph1;

%%

%{
    public static void echoFinding(String text, String desc) throws java.io.IOException{
        java.io.FileWriter fw1 = new java.io.FileWriter("./src/Ph1/output.txt", true);
        java.io.FileWriter fw2 = new java.io.FileWriter("./src/lexemes.txt", true);
        java.io.BufferedWriter bw1 = new java.io.BufferedWriter(fw1);
        java.io.BufferedWriter bw2 = new java.io.BufferedWriter(fw2);
        String msg = text + "\t\t" + desc + "\t\t-";
        System.out.println(msg);
        bw1.write("\n"+msg);
        bw2.write("\n"+msg);
        bw1.close();
        bw2.close();
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
PUNCT = [(),;:]
PLUS = [+]
MINUS = [-]
MULTP = [*]
DIVIDE = [/]
MOD = [%]
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

{SHENASE} {echoFinding(yytext(), "SHENASE");}
{HARF} {echoFinding(yytext(), "HARF");}
{ADADSABET} {echoFinding(yytext(), "ADADSABET");}
{REALCONST} {echoFinding(yytext(), "REALCONST");}
{BOOLSABET} {echoFinding(yytext(), "BOOLSABET");}
{COMMENTS} {echoFinding(yytext(), "COMMENTS");}
{PUNCT} {echoFinding(yytext(), "PUNCT");}
{PLUS} {echoFinding(yytext(), "PLUS");}
{MINUS} {echoFinding(yytext(), "MINUS");}
{MULTP} {echoFinding(yytext(), "MULTP");}
{DIVIDE} {echoFinding(yytext(), "DIVIDE");}
{MOD} {echoFinding(yytext(), "MOD");}
{BLOCK_START} {echoFinding(yytext(), "BLOCK_START");}
{BLOCK_END} {echoFinding(yytext(), "BLOCK_END");}
{RANGE_START} {echoFinding(yytext(), "RANGE_START");}
{RANGE_END} {echoFinding(yytext(), "RANGE_END");}
{NEQ_KW} {echoFinding(yytext(), "NEQ_KW");}
{GT_KW} {echoFinding(yytext(), "GT_KW");}
{GTE_KW} {echoFinding(yytext(), "GTE_KW");}
{LT_KW} {echoFinding(yytext(), "LT_KW");}
{LTE_KW} {echoFinding(yytext(), "LTE_KW");}
{EQ_KW} {echoFinding(yytext(), "EQ_KW");}
{ASSIGN_KW} {echoFinding(yytext(), "ASSIGN_KW");}
{INT_KW} {echoFinding(yytext(), "INT_KW");}
{FLOAT_KW} {echoFinding(yytext(), "FLOAT_KW");}
{CHAR_KW} {echoFinding(yytext(), "CHAR_KW");}
{BOOLEAN_KW} {echoFinding(yytext(), "BOOLEAN_KW");}
{PROGRAM_KW} {echoFinding(yytext(), "PROGRAM_KW");}
{AGAR_KW} {echoFinding(yytext(), "AGAR_KW");}
{ANGAH_KW} {echoFinding(yytext(), "ANGAH_KW");}
{VAGARNA_KW} {echoFinding(yytext(), "VAGARNA_KW");}
{DO_KW} {echoFinding(yytext(), "DO_KW");}
{WHILE_KW} {echoFinding(yytext(), "WHILE_KW");}
{FOR_KW} {echoFinding(yytext(), "FOR_KW");}
{GOZINESH_KW} {echoFinding(yytext(), "GOZINESH_KW");}
{MORED_KW} {echoFinding(yytext(), "MORED_KW");}
{END_KW} {echoFinding(yytext(), "END_KW");}
{EXIT_KW} {echoFinding(yytext(), "EXIT_KW");}
{WHEN_KW} {echoFinding(yytext(), "WHEN_KW");}
{DEFAULT_KW} {echoFinding(yytext(), "DEFAULT_KW");}
{UPTO_KW} {echoFinding(yytext(), "UPTO_KW");}
{DOWNTO_KW} {echoFinding(yytext(), "DOWNTO_KW");}
{VA_KW} {echoFinding(yytext(), "VA_KW");}
{YA_KW} {echoFinding(yytext(), "YA_KW");}
{VAANGAH_KW} {echoFinding(yytext(), "VAANGAH_KW");}
{YAVAGARNA_KW} {echoFinding(yytext(), "YAVAGARNA_KW");}
{RAVIE_KW} {echoFinding(yytext(), "RAVIE_KW");}
{NAGHIZ_KW} {echoFinding(yytext(), "NAGHIZ_KW");}
{BAZGASHT_KW} {echoFinding(yytext(), "BAZGASHT_KW");}
{COMMENTS} {echoFinding(yytext(), "COMMENTS");}
{WHITESPACE} {}
. {}
