%{
  package Ph2;
%}

/* The Start Symbol of the Grammar */
%start program

/* Tokens */
%token SHENASE
%token HARF
%token ADADSABET
%token REALCONST
%token BOOLSABET
%token SEMICOLON_KW
%token COLON_KW
%token COMMA_KW
%token TWO_DOTS_KW
%token LP_KW
%token RP_KW
%token PLUS
%token MINUS
%token MULTP
%token DIVIDE
%token MOD
%token BLOCK_START
%token BLOCK_END
%token RANGE_START
%token RANGE_END
%token NEQ_KW
%token GT_KW
%token GTE_KW
%token LT_KW
%token LTE_KW
%token EQ_KW
%token ASSIGN_KW
%token INT_KW
%token FLOAT_KW
%token CHAR_KW
%token BOOLEAN_KW
%token PROGRAM_KW
%token MAIN_KW
%token AGAR_KW
%token ANGAH_KW
%token VAGARNA_KW
%token DO_KW
%token WHILE_KW
%token FOR_KW
%token GOZINESH_KW
%token MORED_KW
%token END_KW
%token EXIT_KW
%token WHEN_KW
%token DEFAULT_KW
%token UPTO_KW
%token DOWNTO_KW
%token VA_KW
%token YA_KW
%token VAANGAH_KW
%token YAVAGARNA_KW
%token RAVIE_KW
%token NAGHIZ_KW
%token BAZGASHT_KW

%left YA_KW YAVAGARNA_KW
%left VA_KW VAANGAH_KW
%left EQ_KW NEQ_KW LTE_KW LT_KW GTE_KW GT_KW
%left PLUS MINUS
%left MULTP DIVIDE MOD
%right NAGHIZ_KW

/* In order to solve the dangling else problem */
%nonassoc ANGAH_KW
%nonassoc VAGARNA_KW

%%
program:
	PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block{
		System.out.println("Rule 1: " +
			"program: PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block");
	}
	| PROGRAM_KW SHENASE list_ravie MAIN_KW block{
        System.out.println("Rule 2: " +
            "program: PROGRAM_KW SHENASE list_ravie MAIN_KW block");
    }
    | PROGRAM_KW SHENASE declarations_list MAIN_KW block{
        System.out.println("Rule 3: " +
            "program: PROGRAM_KW SHENASE declarations_list MAIN_KW block");
    }
    | PROGRAM_KW SHENASE MAIN_KW block{
        System.out.println("Rule 4: " +
            "program: PROGRAM_KW SHENASE MAIN_KW block");
    }

declarations_list:
	declarations_list declarations {
		System.out.println("Rule 5: " +
			"declarations_list: declarations_list declarations");
	}
	| declarations{
        System.out.println("Rule 6: " +
            "declarations_list: declarations");
    }

declarations:
	taeen_type declarator_list SEMICOLON_KW{
		System.out.println("Rule 7: " +
			"declarations: taeen_type declarator_list SEMICOLON_KW");
	}

taeen_type:
	INT_KW{
		System.out.println("Rule 8: " +
			"taeen_type: INT_KW");
	}
	| FLOAT_KW{
		System.out.println("Rule 9: " +
			"taeen_type: REAL_KW");
	}
	| CHAR_KW{
		System.out.println("Rule 10: " +
			"taeen_type: CHAR_KW");
	}
	| BOOLEAN_KW{
		System.out.println("Rule 11: " +
			"taeen_type: BOOLEAN_KW");
	}

declarator_list:
    declarator{
		System.out.println("Rule 12: " +
			"delarator_list: declarator");
	}
	| declarator_list COMMA_KW declarator{
		System.out.println("Rule 13: " +
			"declarator_list: declarator_list COMMA_KW declarator");
	}

declarator:
	dec{
		System.out.println("Rule 14: " +
			"declarator: dec");
	}
	| dec ASSIGN_KW meghdar_avalie{
		System.out.println("Rule 15: " +
			"declarator: dec ASSIGN_KW meghdar_avalie");
	}

dec:
	SHENASE{
		System.out.println("Rule 16: " +
			"dec: SHENASE");
	}
	| SHENASE RANGE_START range RANGE_END{
		System.out.println("Rule 17: " +
			"dec: SHENASE RANGE_START range RANGE_END");
	}
	| SHENASE RANGE_START ADADSABET RANGE_END{
		System.out.println("Rule 18: " +
			"dec: SHENASE RANGE_START ADADSABET RANGE_END");
	}

range:
	SHENASE TWO_DOTS_KW SHENASE{
		System.out.println("Rule 19: " +
			"range: SHENASE TWO_DOTS_KW SHENASE");
	}
	| ADADSABET TWO_DOTS_KW ADADSABET{
		System.out.println("Rule 20: " +
			"range: ADADSABET TWO_DOTS_KW ADADSABET");
	}
	| ebarat_riazi TWO_DOTS_KW ebarat_riazi{
		System.out.println("Rule 21: " +
			"range: ebarat_riazi TWO_DOTS_KW ebarat_riazi");
	}

meghdar_avalie:
    ebarat_sabet{
        System.out.println("Rule 22: " +
        			"meghdar_avalie: ebarat_sabet");
    }
	| BLOCK_START list_meghdar_avalie BLOCK_END{
		System.out.println("Rule 23: " +
			"meghdar_avalie: BLOCK_START list_meghdar_avalie BLOCK_END");
	}

list_meghdar_avalie:
	ebarat_sabet COMMA_KW list_meghdar_avalie{
		System.out.println("Rule 24: " +
			"list_meghdar_avalie: ebarat_sabet COMMA_KW list_meghdar_avalie");
	}
	| ebarat_sabet{
		System.out.println("Rule 25: " +
			"list_meghdar_avalie: ebarat_sabet");
	}

list_ravie:
    ravie {
        System.out.println("Rule 26: " +
            "list_ravie: ravie ");
    }
	| list_ravie ravie {
		System.out.println("Rule 27: " +
			"list_ravie: list_ravie ravie ");
	};

ravie:
    RAVIE_KW SHENASE parameters BLOCK_START block BLOCK_END SEMICOLON_KW {
		System.out.println("Rule 28: " +
			"ravie:	RAVIE_KW SHENASE parameters BLOCK_START block BLOCK_END SEMICOLON_KW");
	}
    | RAVIE_KW SHENASE parameters BLOCK_START declarations_list block BLOCK_END SEMICOLON_KW {
		System.out.println("Rule 29: " +
			"ravie:	RAVIE_KW SHENASE parameters BLOCK_START declarations_list block BLOCK_END SEMICOLON_KW");
	};

parameters:
    LP_KW RP_KW {
        System.out.println("Rule 30: " +
            "parameters: LP_KW RP_KW");
    }
	| LP_KW declarations_list RP_KW {
		System.out.println("Rule 31: " +
			"parameters: LP_KW declarations_list RP_KW");
	};

block:
	BLOCK_START statement_list BLOCK_END {
		System.out.println("Rule 32: " +
			"block:	BLOCK_START statement_list BLOCK_END");
	};

statement_list:
    SEMICOLON_KW {
        System.out.println("Rule 33: " +
            "statement_list: SEMICOLON_KW");
    }
	| statement SEMICOLON_KW {
		System.out.println("Rule 34: " +
			"statement_list: statement SEMICOLON_KW");
	}
	| statement_list statement SEMICOLON_KW {
		System.out.println("Rule 35: " +
			"statement_list: statement_list statement SEMICOLON_KW");
	}
	| statement_list SEMICOLON_KW {
        System.out.println("Rule 36: " +
            "statement_list: statement_list SEMICOLON_KW");
    };

statement:
    AGAR_KW ebarat_bool ANGAH_KW {
        System.out.println("Rule 37: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW");
    }
    | AGAR_KW ebarat_bool ANGAH_KW statement {
        System.out.println("Rule 38: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW statement");
    }
    | AGAR_KW ebarat_bool ANGAH_KW VAGARNA_KW statement {
        System.out.println("Rule 39: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW VAGARNA_KW statement");
    }
    | AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement {
        System.out.println("Rule 40: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement");
    }
    | SHENASE ASSIGN_KW ebarat {
        System.out.println("Rule 41: " +
            "statement: SHENASE ASSIGN_KW ebarat");
    }
    | DO_KW statement WHILE_KW ebarat_bool {
		System.out.println("Rule 42: " +
			"statement: DO_KW statement WHILE_KW ebarat_bool");
	}
	| DO_KW WHILE_KW ebarat_bool {
        System.out.println("Rule 43: " +
			"statement: DO_KW WHILE_KW ebarat_bool");
	}
	| FOR_KW SHENASE ASSIGN_KW counter DO_KW statement {
		System.out.println("Rule 44: " +
			"statement: FOR_KW SHENASE ASSIGN_KW counter DO_KW statement");
	}
	| FOR_KW SHENASE ASSIGN_KW counter DO_KW {
		System.out.println("Rule 45: " +
			"statement: FOR_KW SHENASE ASSIGN_KW counter DO_KW");
	}
	| GOZINESH_KW ebarat onsor_mored default END_KW {
		System.out.println("Rule 46: " +
			"statement: GOZINESH_KW ebarat onsor_mored default END_KW");
	}
    | GOZINESH_KW ebarat onsor_mored END_KW {
		System.out.println("Rule 47: " +
			"statement: GOZINESH_KW ebarat onsor_mored END_KW");
	}
	| SHENASE LP_KW arguments_list RP_KW {
		System.out.println("Rule 48: " +
			"statement: SHENASE LP_KW arguments_list RP_KW");
	}
	| SHENASE LP_KW RP_KW {
		System.out.println("Rule 49: " +
			"statement: SHENASE LP_KW RP_KW");
	}
	| SHENASE RANGE_START ebarat RANGE_END ASSIGN_KW ebarat {
        System.out.println("Rule 50: " +
            "statement: SHENASE RANGE_START ebarat RANGE_END ASSIGN_KW ebarat");
    }
	| BAZGASHT_KW ebarat {
		System.out.println("Rule 51: " +
			"statement: BAZGASHT_KW ebarat");
	}
	| EXIT_KW WHEN_KW ebarat_bool {
		System.out.println("Rule 52: " +
			"statement: EXIT_KW WHEN_KW ebarat_bool");
	}
	| block {
		System.out.println("Rule 53: " +
			"statement: block");
	};

arguments_list:
	arguments_list COMMA_KW ebarat {
		System.out.println("Rule 54: " +
			"arguments_list: multi_arguments");
	}
	| ebarat {
        System.out.println("Rule 55: " +
            "arguments_list: ebarat");
    };

counter:
    ADADSABET UPTO_KW ADADSABET{
        System.out.println("Rule 56: " +
            "counter: ADADSABET UPTO_KW ADADSABET");
    }
    | ADADSABET DOWNTO_KW ADADSABET{
        System.out.println("Rule 57: " +
          "counter: ADADSABET DOWNTO_KW ADADSABET");
    };

onsor_mored:
	MORED_KW ADADSABET COLON_KW block {
		System.out.println("Rule 58: " +
			"onsor_mored: MORED_KW ADADSABET COLON_KW block ");
	}
	| onsor_mored MORED_KW ADADSABET COLON_KW block {
		System.out.println("Rule 59: " +
			"onsor_mored: onsor_mored MORED_KW ADADSABET COLON_KW block");
	};

default:
	DEFAULT_KW COLON_KW block {
		System.out.println("Rule 60: " +
			"default: DEFAULT_KW COLON_KW block");
	};

ebarat:
	ebarat_sabet {
		System.out.println("Rule 61: " +
			"ebarat: ebarat_sabet");
	}
	| ebarat_bool {
        System.out.println("Rule 62: " +
            "ebarat: ebarat_bool");
    }
	| ebarat_riazi{
		System.out.println("Rule 63: " +
			"ebarat: ebarat_riazi");
	}
	| SHENASE {
		System.out.println("Rule 64: " +
			"ebarat: SHENASE");
	}
	| SHENASE RANGE_START ebarat RANGE_END {
		System.out.println("Rule 65: " +
			"ebarat: SHENASE RANGE_START ebarat RANGE_END");
	}
	| SHENASE LP_KW arguments_list RP_KW {
        System.out.println("Rule 66: " +
            "ebarat: SHENASE LP_KW arguments_list RP_KW");
    }
	| SHENASE LP_KW RP_KW {
        System.out.println("Rule 67: " +
            "ebarat: SHENASE LP_KW RP_KW");
    }
    | LP_KW ebarat RP_KW {
        System.out.println("Rule 68: " +
            "ebarat: LP_KW ebarat RP_KW ");
    };

ebarat_sabet:
	ADADSABET {
		System.out.println("Rule 69: " +
			"ebarat_sabet: ADADSABET");
	}
	| REALCONST {
		System.out.println("Rule 70: " +
			"ebarat_sabet: REALCONST");
	}
	| HARF {
		System.out.println("Rule 71: " +
			"ebarat_sabet: HARF");
	}
	| BOOLSABET {
		System.out.println("Rule 72: " +
			"ebarat_sabet: BOOL_SABET");
	};

ebarat_riazi:
	zojmoratab PLUS {
		System.out.println("Rule 73: " +
			"ebarat_riazi: zojmoratab PLUS");
	}
	| zojmoratab MINUS {
        System.out.println("Rule 74: " +
            "ebarat_riazi: zojmoratab MINUS");
    }
    | zojmoratab MULTP {
        System.out.println("Rule 75: " +
            "ebarat_riazi: zojmoratab MULTP");
    }
    | zojmoratab DIVIDE {
        System.out.println("Rule 76: " +
            "ebarat_riazi: zojmoratab DIVIDE");
    }
    | zojmoratab MOD {
        System.out.println("Rule 77: " +
            "ebarat_riazi: zojmoratab MOD");
    }
	| MINUS ebarat {
		System.out.println("Rule 78: " +
			"ebarat_riazi: MINUS ebarat");
	};

ebarat_bool:
	zojmoratab VA_KW {
		System.out.println("Rule 79: " +
			"ebarat_bool: zojmoratab VA_KW ");
	}
	| zojmoratab YA_KW {
        System.out.println("Rule 80: " +
            "ebarat_bool: zojmoratab YA_KW ");
    }
    | zojmoratab VAANGAH_KW {
        System.out.println("Rule 81: " +
            "ebarat_bool: zojmoratab VAANGAH_KW ");
    }
    | zojmoratab YAVAGARNA_KW {
        System.out.println("Rule 82: " +
            "ebarat_bool: zojmoratab YAVAGARNA_KW ");
    }
    | zojmoratab LT_KW {
        System.out.println("Rule 83: " +
            "ebarat_bool: zojmoratab LT_KW ");
    }
    | zojmoratab LTE_KW {
        System.out.println("Rule 84: " +
            "ebarat_bool: zojmoratab LTE_KW ");
    }
    | zojmoratab GT_KW {
        System.out.println("Rule 85: " +
            "ebarat_bool: zojmoratab GT_KW ");
    }
    | zojmoratab GTE_KW {
        System.out.println("Rule 86: " +
            "ebarat_bool: zojmoratab GTE_KW ");
    }
    | zojmoratab EQ_KW {
        System.out.println("Rule 87: " +
            "ebarat_bool: zojmoratab EQ_KW ");
    }
    | zojmoratab NEQ_KW {
        System.out.println("Rule 88: " +
            "ebarat_bool: zojmoratab NEQ_KW ");
    }
    | ebarat NAGHIZ_KW {
        System.out.println("Rule 90: " +
            "ebarat_bool: ebarat NAGHIZ_KW ");
    }

zojmoratab:
    LP_KW ebarat COMMA_KW ebarat RP_KW{
        System.out.println("Rule 91: " +
            "zojmoratab: RP_KW ebarat COMMA_KW ebarat LP_KW");
    }


