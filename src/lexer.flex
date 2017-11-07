/*
    CODE SECTION
*/

%%

/*
    DECLARATION SECTION
*/

LETTER = [a-zA-Z]
DIGIT = [0-9]

SHENASE = "#"{LETTER}{LETTER}{DIGIT}{DIGIT}{DIGIT}

WHITESPACE = [ \n\r\t]
COMMENTS = "//".*



ADADSABET = {DIGIT}+
REALCONST = {ADADSABET}"\."{ADADSABET}
HARF = "'"[a-zA-Z0-9]"'"
BOOLSABET = "true"|"false"

INT_KW = (int)
FLOAT_KW = (float)
CHAR_KW = (char)
BOOLEAN_KW = (boolean)

IF_KW = (if)
ELSE_KW = (else)
SWITCH_KW = (switch)
CASE_KW = (case)
END_KW = (end)
DEFAULT_KW = (default)
WHILE_KW = (while)
RETURN_KW = (return)
BREAK_KW = (break)
OR_KW = (or)
OR_ELSE_KW = "or else"
AND_KW = "and"
AND_THEN_KW = "and then"
NOT_KW = (not)

%%

/*
    RULES
*/

{COMMENTS} {System.out.println(yytext() + "\t\tComments\t\t-");}

{REALCONST} {System.out.println(yytext() + "\t\tREALCONST\t\t-");}
{ADADSABET} {System.out.println(yytext() + "\t\tADADSABET\t\t-");}
{BOOLSABET} {System.out.println(yytext() + "\t\tBOOLSABET\t\t-");}
{HARF} {System.out.println(yytext() + "\t\tHARF\t\t-");}

{SHENASE} {System.out.println(yytext() + "\t\tSHENASE\t\t" );}
{WHITESPACE} {}
. {}
