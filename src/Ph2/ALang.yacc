%{
  package Ph2;
%}

%token PROGRAM_KW MAIN_KW PROCEDURE_KW INTEGER_KW REAL_KW CHAR_KW BOOLEAN_KW IF_KW THEN_KW ELSE_KW DO_KW WHILE_KW FOR_KW IN_KW REPEAT_KW SWITCH_KW CASE_KW DEFAULT_KW END_KW RETURN_KW EXIT_KW WHEN_KW AND_KW AND_THEN_KW OR_KW OR_ELSE_KW NOT_KW SEMICOLON_KW COLON_KW COMMA_KW SINGLE_QUOTE_KW ASS_KW LP_KW RP_KW LB_KW RB_KW LCB_KW RCB_KW TWO_DOTS_KW DOT_KW EQ_KW NE_KW LE_KW LT_KW GE_KW GT_KW ADD_KW SUB_KW MUL_KW DIV_KW MOD_KW BOOLEAN_CONSTANT CHAR_CONSTANT REAL_CONSTANT INTEGER_CONSTANT IDENTIFIER

%code {
    static PrintStream writer;

    public static void main(String args[]) throws IOException, FileNotFoundException {
        YYParser yyparser;
        final Yylex lexer;

        writer = new PrintStream(new File("output.txt"));
        lexer = new Yylex(new InputStreamReader(new FileInputStream(".\\files\\Code.shl")));

        yyparser = new YYParser(new Lexer() {

            @Override
            public int yylex() {
                int yyl_return = -1;
                try {

                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String error) {
                System.err.println("Error : " + error);
            }

            @Override
            public Object getLVal() {
                return null;
            }
        });
        yyparser.parse();

        return;
    }
}

%left OR_KW OR_ELSE_KW
%left AND_KW AND_THEN_KW
%left EQ_KW NE_KW LE_KW LT_KW GE_KW GT_KW
%left ADD_KW SUB_KW
%left MUL_KW DIV_KW MOD_KW
%right NOT_KW usub

%%
program:
	PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block{
		System.out.println("Rule 1.1: " +
			"program: PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block");
	}

declarations_list:
    declarations{
		System.out.println("Rule 2.1: " +
			"declarations_list: declarations");
	}
	| declarations_list declarations {
		System.out.println("Rule 2.2: " +
			"declarations_list: declarations_list declarations");
	}

declarations:
	taeen_type declarator_list SEMICOLON_KW{
		System.out.println("Rule 3.1: " +
			"declarations: taeen_type declarator_list SEMICOLON_KW");
	}

taeen_type:
	INT_KW{
		System.out.println("Rule 4.1: " +
			"taeen_type: INT_KW");
	}
	| FLOAT_KW{
		System.out.println("Rule 4.2: " +
			"taeen_type: REAL_KW");
	}
	| CHAR_KW{
		System.out.println("Rule 4.3: " +
			"taeen_type: CHAR_KW");
	}
	| BOOLEAN_KW{
		System.out.println("Rule 4.4: " +
			"taeen_type: BOOLEAN_KW");
	}

declarator_list:
    declarator{
		System.out.println("Rule 5.1: " +
			"delarator_list: declarator");
	}
	| declarator_list COMMA_KW declarator{
		System.out.println("Rule 5.2: " +
			"declarator_list: declarator_list COMMA_KW declarator");
	}

declarator:
	dec{
		System.out.println("Rule 6.1: " +
			"declarator: dec");
	}
	| dec ASSIGN_KW meghdar_avalie{
		System.out.println("Rule 6.2: " +
			"declarator: dec ASSIGN_KW meghdar_avalie");
	}

dec:
	SHENASE{
		System.out.println("Rule 7.1: " +
			"dec: SHENASE");
	}
	| SHENASE RANGE_START range RANGE_END{
		System.out.println("Rule 7.2: " +
			"dec: SHENASE RANGE_START range RANGE_END");
	}
	| IDENTIFIER RANGE_START ADADSABET RANGE_END{
		System.out.println("Rule 7.3: " +
			"dec: IDENTIFIER RANGE_START ADADSABET RANGE_END");
	}

range:
	SHENASE TWO_DOTS_KW SHENASE{
		System.out.println("Rule 8.1: " +
			"range: SHENASE TWO_DOTS_KW SHENASE");
	}
	| ADADSABET TWO_DOTS_KW ADADSABET{
		System.out.println("Rule 8.2: " +
			"range: ADADSABET TWO_DOTS_KW ADADSABET");
	}
	| ebarat_riazi TWO_DOTS_KW ebarat_riazi{
		System.out.println("Rule 8.3: " +
			"range: ebarat_riazi TWO_DOTS_KW ebarat_riazi");
	}

meghdar_avalie:
    ebarat_sabet{
        System.out.println("Rule 9.1: " +
        			"meghdar_avalie: ebarat_sabet");
    }
	| BLOCK_START List_meghdar_avalie BLOCK_END{
		System.out.println("Rule 9.2: " +
			"meghdar_avalie: BLOCK_START List_meghdar_avalie BLOCK_END");
	}

list_meghdar_avalie:
	ebarat_sabet COMMA_KW list_meghdar_avalie{
		System.out.println("Rule 10.1: " +
			"list_meghdar_avalie: ebarat_sabet COMMA_KW list_meghdar_avalie");
	}
	| ebarat_sabet{
		System.out.println("Rule 10.2: " +
			"list_meghdar_avalie: ebarat_sabet");
	}

list_ravie:
	list_ravie ravie {
		System.out.println("Rule 11.1: " +
			"list_ravie: list_ravie ravie ");
	}

ravie:
	RAVIE_KW SHENASE parameters BLOCK_START declarations_list block BLOCK_END SEMICOLON {
		System.out.println("Rule 12.1: " +
			"ravie:	RAVIE_KW SHENASE parameters BLOCK_START declarations_list block BLOCK_END SEMICOLON");
	}

parameters:
	LP_KW declarations_list RP_KW {
		System.out.println("Rule 13.1: " +
			"parameters: LP_KW declarations_list RP_KW");
	}

block:
	BLOCK_START statement_list BLOCK_END {
		System.out.println("Rule 14.1: " +
			"block:	BLOCK_START statement_list BLOCK_END");
	}

statement_list:
	statement SEMICOLON_KW {
		System.out.println("Rule 15.1: " +
			"statement_list: statement SEMICOLON_KW");
	}
	| statement_list statement SEMICOLON_KW {
		System.out.println("Rule 15.2: " +
			"statement_list: statement_list statement SEMICOLON_KW");
	}

statement:
	SHENASE ASSIGN_KW ebarat {
		System.out.println("Rule 16.1: " +
			"statement: SHENASE ASSIGN_KW ebarat");
	}
	| AGAR_KW ebarat_bool ANGAH_KW statement {
		System.out.println("Rule 16.2: " +
			"statement: AGAR_KW ebarat_bool ANGAH_KW statement");
	}
	| AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement {
		System.out.println("Rule 16.3: " +
			"AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement");
	}
	| DO_KW statement WHILE_KW ebarat_bool {
		System.out.println("Rule 16.4: " +
			"statement: DO_KW statement WHILE_KW ebarat_bool");
	}
	| FOR_KW SHENASE ASSIGN_KW counter DO_KW statement {
		System.out.println("Rule 16.5: " +
			"statement: FOR_KW SHENASE ASSIGN_KW counter DO_KW statement");
	}
	| GOZINESH_KW ebarat onsor_mored default END_KW {
		System.out.println("Rule 16.6: " +
			"statement: GOZINESH_KW ebarat onsor_mored default END_KW");
	}
	| SHENASE LP_KW arguments_list RP_KW {
		System.out.println("Rule 16.7: " +
			"statement: SHENASE LP_KW arguments_list RP_KW");
	}
	| SHENASE RANGE_START ebarat RANGE_END ASSIGN_KW ebarat {
    		System.out.println("Rule 16.8: " +
    			"statement: SHENASE RANGE_START ebarat RANGE_END ASSIGN_KW ebarat");
    }
	| BAZGASHT_KW ebarat {
		System.out.println("Rule 16.9: " +
			"statement: BAZGASHT_KW ebarat");
	}
	| EXIT_KW WHEN_KW ebarat_bool {
		System.out.println("Rule 16.10: " +
			"statement: EXIT_KW WHEN_KW ebarat_bool");
	}
	| block {
		System.out.println("Rule 16.11: " +
			"statement: block");
	}

arguments_list:
	multi_arguments {
		System.out.println("Rule 17.1: " +
			"arguments_list: multi_arguments");
	}
	} ebarat {
        System.out.println("Rule 17.2: " +
            "arguments_list: ebarat");
    }

multi_arguments:
    multi_arguments COMMA_KW ebarat{
        System.out.println("Rule 18.1: " +
            "multi_arguments: multi_arguments COMMA_KW ebarat");
    }
    | ebarat{
        System.out.println("Rule 18.2: " +
            "multi_arguments: ebarat");
    }

counter:
    ADADSABET UPTO_KW ADADSABET{
        System.out.println("Rule 19.1: " +
            "counter: ADADSABET UPTO_KW ADADSABET");
    }
    | ADADSABET DOWNTO_KW ADADSABET{
        System.out.println("Rule 19.2: " +
          "counter: ADADSABET DOWNTO_KW ADADSABET");
    }

onsor_mored:
	MORED_KW ADADSABET COLON_KW block {
		System.out.println("Rule 20.1: " +
			"onsor_mored: MORED_KW ADADSABET COLON_KW block ");
	}
	| onsor_mored MORED_KW ADADSABET COLON_KW block {
		System.out.println("Rule 20.2: " +
			"onsor_mored: onsor_mored MORED_KW ADADSABET COLON_KW block");
	}

default:
	DEFAULT_KW COLON_KW block {
		System.out.println("Rule 21.1: " +
			"default: DEFAULT_KW COLON_KW block");
	}

ebarat:
	ebarat_sabet {
		System.out.println("Rule 22.1: " +
			"ebarat: ebarat_sabet");
	}
	| ebarat_bool {
        System.out.println("Rule 22.2: " +
            "ebarat: ebarat_bool");
    }
	| ebarat_riazi{
		System.out.println("Rule 22.3: " +
			"ebarat: ebarat_riazi");
	}
	| SHENASE {
		System.out.println("Rule 22.4: " +
			"ebarat: SHENASE");
	}
	| SHENASE RANGE_START ebarat RANGE_END {
		System.out.println("Rule 22.5: " +
			"ebarat: SHENASE RANGE_START ebarat RANGE_END");
	}
	| SHENASE LP_KW arguments_list RP_KW {
        System.out.println("Rule 22.6: " +
            "ebarat: SHENASE LP_KW arguments_list RP_KW");
    }
    | LP_KW ebarat RP_KW {
        System.out.println("Rule 22.7: " +
            "ebarat: LP_KW ebarat RP_KW ");
    }

ebarat_sabet:
	ADADSABET {
		System.out.println("Rule 23.1: " +
			"ebarat_sabet: ADADSABET");
	}
	| REALCONST {
		System.out.println("Rule 23.2: " +
			"ebarat_sabet: REALCONST");
	}
	| HARF {
		System.out.println("Rule 23.3: " +
			"ebarat_sabet: HARF");
	}
	| BOOLSABET {
		System.out.println("Rule 23.4: " +
			"ebarat_sabet: BOOL_SABET");
	}

ebarat_riazi:
	zojmoratab PLUS {
		System.out.println("Rule 24.1: " +
			"ebarat_riazi: zojmoratab PLUS");
	}
	| zojmoratab MINUS {
        System.out.println("Rule 24.2: " +
            "ebarat_riazi: zojmoratab MINUS");
    }
    | zojmoratab MULTP {
        System.out.println("Rule 24.3: " +
            "ebarat_riazi: zojmoratab MULTP");
    }
    | zojmoratab DIVIDE {
        System.out.println("Rule 24.4: " +
            "ebarat_riazi: zojmoratab DIVIDE");
    }
    | zojmoratab MOD {
        System.out.println("Rule 24.5: " +
            "ebarat_riazi: zojmoratab MOD");
    }
	| MINUS ebarat {
		System.out.println("Rule 24.6: " +
			"ebarat_riazi: MINUS ebarat");
	}

zojmoratab:
    RP_KW ebarat COMMA_KW ebarat LP_KW{
        System.out.println("Rule 25.1: " +
            "zojmoratab: RP_KW ebarat COMMA_KW ebarat LP_KW");
    }

ebarat_bool:
	zojmoratab VA_KW {
		System.out.println("Rule 26.1: " +
			"ebarat_bool: zojmoratab VA_KW ");
	}
	| zojmoratab YA_KW {
        System.out.println("Rule 26.2: " +
            "ebarat_bool: zojmoratab YA_KW ");
    }
    | zojmoratab VAANGAH_KW {
        System.out.println("Rule 26.3: " +
            "ebarat_bool: zojmoratab VAANGAH_KW ");
    }
    | zojmoratab YAVAGARNA_KW {
        System.out.println("Rule 26.4: " +
            "ebarat_bool: zojmoratab YAVAGARNA_KW ");
    }
    | zojmoratab LT_KW {
        System.out.println("Rule 26.5: " +
            "ebarat_bool: zojmoratab LT_KW ");
    }
    | zojmoratab LTE_KW {
        System.out.println("Rule 26.6: " +
            "ebarat_bool: zojmoratab LTE_KW ");
    }
    | zojmoratab GT_KW {
        System.out.println("Rule 26.7: " +
            "ebarat_bool: zojmoratab GT_KW ");
    }
    | zojmoratab GTE_KW {
        System.out.println("Rule 26.8: " +
            "ebarat_bool: zojmoratab GTE_KW ");
    }
    | zojmoratab EQ_KW {
        System.out.println("Rule 26.9: " +
            "ebarat_bool: zojmoratab EQ_KW ");
    }
    | zojmoratab NEQ_KW {
        System.out.println("Rule 26.10: " +
            "ebarat_bool: zojmoratab NEQ_KW ");
    }
    | ebarat NAGHIZ_KW {
        System.out.println("Rule 26.11: " +
            "ebarat_bool: ebarat NAGHIZ_KW ");
    }


