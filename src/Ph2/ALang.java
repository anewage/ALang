/* A Bison parser, made by GNU Bison 2.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007-2011 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 1 of "../src/Ph2/ALang.yacc"  */

  package Ph2;


/**
 * A Bison parser, automatically generated from <tt>../src/Ph2/ALang.yacc</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int SHENASE = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int HARF = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int ADADSABET = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int REALCONST = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLSABET = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int SEMICOLON_KW = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int COLON_KW = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int COMMA_KW = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int TWO_DOTS_KW = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int LP_KW = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int RP_KW = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int PLUS = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int MINUS = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int MULTP = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int DIVIDE = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int MOD = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int BLOCK_START = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int BLOCK_END = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int RANGE_START = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int RANGE_END = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int NEQ_KW = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int GT_KW = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int GTE_KW = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int LT_KW = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int LTE_KW = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int EQ_KW = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int ASSIGN_KW = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int INT_KW = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int FLOAT_KW = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int CHAR_KW = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int BOOLEAN_KW = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int PROGRAM_KW = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int MAIN_KW = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int AGAR_KW = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int ANGAH_KW = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int VAGARNA_KW = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int DO_KW = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int WHILE_KW = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int FOR_KW = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int GOZINESH_KW = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int MORED_KW = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int END_KW = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int EXIT_KW = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int WHEN_KW = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int DEFAULT_KW = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int UPTO_KW = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int DOWNTO_KW = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int VA_KW = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int YA_KW = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int VAANGAH_KW = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int YAVAGARNA_KW = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int RAVIE_KW = 309;
  /** Token number, to be returned by the scanner.  */
  public static final int NAGHIZ_KW = 310;
  /** Token number, to be returned by the scanner.  */
  public static final int BAZGASHT_KW = 311;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token.
     * @return the token identifier corresponding to the next token. */
    int yylex() throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror(String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value			    ) {
      height++;
      if (size == height)
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  

	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  // Internal return codes that are not supported for user semantic
  // actions.
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);

    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 351 of lalr1.java  */
/* Line 77 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 1: " +
			"program: PROGRAM_KW SHENASE declarations_list list_ravie MAIN_KW block");
	};
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 351 of lalr1.java  */
/* Line 81 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 2: " +
            "program: PROGRAM_KW SHENASE list_ravie MAIN_KW block");
    };
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 351 of lalr1.java  */
/* Line 85 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 3: " +
            "program: PROGRAM_KW SHENASE declarations_list MAIN_KW block");
    };
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 351 of lalr1.java  */
/* Line 89 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 4: " +
            "program: PROGRAM_KW SHENASE MAIN_KW block");
    };
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 351 of lalr1.java  */
/* Line 95 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 5: " +
			"declarations_list: declarations_list declarations");
	};
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 351 of lalr1.java  */
/* Line 99 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 6: " +
            "declarations_list: declarations");
    };
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 351 of lalr1.java  */
/* Line 105 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 7: " +
			"declarations: taeen_type declarator_list SEMICOLON_KW");
	};
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 351 of lalr1.java  */
/* Line 111 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 8: " +
			"taeen_type: INT_KW");
	};
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 351 of lalr1.java  */
/* Line 115 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 9: " +
			"taeen_type: REAL_KW");
	};
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 351 of lalr1.java  */
/* Line 119 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 10: " +
			"taeen_type: CHAR_KW");
	};
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 351 of lalr1.java  */
/* Line 123 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 11: " +
			"taeen_type: BOOLEAN_KW");
	};
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 351 of lalr1.java  */
/* Line 129 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 12: " +
			"delarator_list: declarator");
	};
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 351 of lalr1.java  */
/* Line 133 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 13: " +
			"declarator_list: declarator_list COMMA_KW declarator");
	};
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 351 of lalr1.java  */
/* Line 139 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 14: " +
			"declarator: dec");
	};
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 351 of lalr1.java  */
/* Line 143 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 15: " +
			"declarator: dec ASSIGN_KW meghdar_avalie");
	};
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 351 of lalr1.java  */
/* Line 149 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 16: " +
			"dec: SHENASE");
	};
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 351 of lalr1.java  */
/* Line 153 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 17: " +
			"dec: SHENASE RANGE_START range RANGE_END");
	};
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 351 of lalr1.java  */
/* Line 157 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 18: " +
			"dec: SHENASE RANGE_START ADADSABET RANGE_END");
	};
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 351 of lalr1.java  */
/* Line 163 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 19: " +
			"range: SHENASE TWO_DOTS_KW SHENASE");
	};
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 351 of lalr1.java  */
/* Line 167 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 20: " +
			"range: ADADSABET TWO_DOTS_KW ADADSABET");
	};
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 351 of lalr1.java  */
/* Line 171 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 21: " +
			"range: ebarat_riazi TWO_DOTS_KW ebarat_riazi");
	};
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 351 of lalr1.java  */
/* Line 177 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 22: " +
        			"meghdar_avalie: ebarat_sabet");
    };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 351 of lalr1.java  */
/* Line 181 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 23: " +
			"meghdar_avalie: BLOCK_START list_meghdar_avalie BLOCK_END");
	};
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 351 of lalr1.java  */
/* Line 187 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 24: " +
			"list_meghdar_avalie: ebarat_sabet COMMA_KW list_meghdar_avalie");
	};
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 351 of lalr1.java  */
/* Line 191 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 25: " +
			"list_meghdar_avalie: ebarat_sabet");
	};
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 351 of lalr1.java  */
/* Line 197 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 26: " +
            "list_ravie: ravie ");
    };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 351 of lalr1.java  */
/* Line 201 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 27: " +
			"list_ravie: list_ravie ravie ");
	};
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 351 of lalr1.java  */
/* Line 207 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 28: " +
			"ravie:	RAVIE_KW SHENASE parameters BLOCK_START block BLOCK_END SEMICOLON_KW");
	};
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 351 of lalr1.java  */
/* Line 211 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 29: " +
			"ravie:	RAVIE_KW SHENASE parameters BLOCK_START declarations_list block BLOCK_END SEMICOLON_KW");
	};
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 351 of lalr1.java  */
/* Line 217 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 30: " +
            "parameters: LP_KW RP_KW");
    };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 351 of lalr1.java  */
/* Line 221 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 31: " +
			"parameters: LP_KW declarations_list RP_KW");
	};
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 351 of lalr1.java  */
/* Line 227 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 32: " +
			"block:	BLOCK_START statement_list BLOCK_END");
	};
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 351 of lalr1.java  */
/* Line 233 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 33: " +
            "statement_list: SEMICOLON_KW");
    };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 351 of lalr1.java  */
/* Line 237 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 34: " +
			"statement_list: statement SEMICOLON_KW");
	};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 351 of lalr1.java  */
/* Line 241 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 35: " +
			"statement_list: statement_list statement SEMICOLON_KW");
	};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 351 of lalr1.java  */
/* Line 245 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 36: " +
            "statement_list: statement_list SEMICOLON_KW");
    };
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 351 of lalr1.java  */
/* Line 251 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 37: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW");
    };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 351 of lalr1.java  */
/* Line 255 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 38: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW statement");
    };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 351 of lalr1.java  */
/* Line 259 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 39: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW VAGARNA_KW statement");
    };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 351 of lalr1.java  */
/* Line 263 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 40: " +
            "statement: AGAR_KW ebarat_bool ANGAH_KW statement VAGARNA_KW statement");
    };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 351 of lalr1.java  */
/* Line 267 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 41: " +
            "statement: SHENASE ASSIGN_KW ebarat");
    };
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 351 of lalr1.java  */
/* Line 271 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 42: " +
			"statement: DO_KW statement WHILE_KW ebarat_bool");
	};
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 351 of lalr1.java  */
/* Line 275 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 43: " +
			"statement: DO_KW WHILE_KW ebarat_bool");
	};
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 351 of lalr1.java  */
/* Line 279 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 44: " +
			"statement: FOR_KW SHENASE ASSIGN_KW counter DO_KW statement");
	};
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 351 of lalr1.java  */
/* Line 283 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 45: " +
			"statement: FOR_KW SHENASE ASSIGN_KW counter DO_KW");
	};
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 351 of lalr1.java  */
/* Line 287 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 46: " +
			"statement: GOZINESH_KW ebarat onsor_mored default END_KW");
	};
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 351 of lalr1.java  */
/* Line 291 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 47: " +
			"statement: GOZINESH_KW ebarat onsor_mored END_KW");
	};
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 351 of lalr1.java  */
/* Line 295 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 48: " +
			"statement: SHENASE LP_KW arguments_list RP_KW");
	};
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 351 of lalr1.java  */
/* Line 299 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 49: " +
			"statement: SHENASE LP_KW RP_KW");
	};
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 351 of lalr1.java  */
/* Line 303 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 50: " +
            "statement: SHENASE RANGE_START ebarat RANGE_END ASSIGN_KW ebarat");
    };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 351 of lalr1.java  */
/* Line 307 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 51: " +
			"statement: BAZGASHT_KW ebarat");
	};
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 351 of lalr1.java  */
/* Line 311 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 52: " +
			"statement: EXIT_KW WHEN_KW ebarat_bool");
	};
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 351 of lalr1.java  */
/* Line 315 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 53: " +
			"statement: block");
	};
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 351 of lalr1.java  */
/* Line 321 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 54: " +
			"arguments_list: multi_arguments");
	};
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 351 of lalr1.java  */
/* Line 325 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 55: " +
            "arguments_list: ebarat");
    };
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 351 of lalr1.java  */
/* Line 331 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 56: " +
            "counter: ADADSABET UPTO_KW ADADSABET");
    };
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 351 of lalr1.java  */
/* Line 335 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 57: " +
          "counter: ADADSABET DOWNTO_KW ADADSABET");
    };
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 351 of lalr1.java  */
/* Line 341 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 58: " +
			"onsor_mored: MORED_KW ADADSABET COLON_KW block ");
	};
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 351 of lalr1.java  */
/* Line 345 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 59: " +
			"onsor_mored: onsor_mored MORED_KW ADADSABET COLON_KW block");
	};
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 351 of lalr1.java  */
/* Line 351 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 60: " +
			"default: DEFAULT_KW COLON_KW block");
	};
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 351 of lalr1.java  */
/* Line 357 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 61: " +
			"ebarat: ebarat_sabet");
	};
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 351 of lalr1.java  */
/* Line 361 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 62: " +
            "ebarat: ebarat_bool");
    };
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 351 of lalr1.java  */
/* Line 365 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 63: " +
			"ebarat: ebarat_riazi");
	};
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 351 of lalr1.java  */
/* Line 369 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 64: " +
			"ebarat: SHENASE");
	};
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 351 of lalr1.java  */
/* Line 373 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 65: " +
			"ebarat: SHENASE RANGE_START ebarat RANGE_END");
	};
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 351 of lalr1.java  */
/* Line 377 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 66: " +
            "ebarat: SHENASE LP_KW arguments_list RP_KW");
    };
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 351 of lalr1.java  */
/* Line 381 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 67: " +
            "ebarat: SHENASE LP_KW RP_KW");
    };
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 351 of lalr1.java  */
/* Line 385 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 68: " +
            "ebarat: LP_KW ebarat RP_KW ");
    };
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 351 of lalr1.java  */
/* Line 391 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 69: " +
			"ebarat_sabet: ADADSABET");
	};
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 351 of lalr1.java  */
/* Line 395 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 70: " +
			"ebarat_sabet: REALCONST");
	};
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 351 of lalr1.java  */
/* Line 399 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 71: " +
			"ebarat_sabet: HARF");
	};
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 351 of lalr1.java  */
/* Line 403 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 72: " +
			"ebarat_sabet: BOOL_SABET");
	};
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 351 of lalr1.java  */
/* Line 409 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 73: " +
			"ebarat_riazi: zojmoratab PLUS");
	};
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 351 of lalr1.java  */
/* Line 413 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 74: " +
            "ebarat_riazi: zojmoratab MINUS");
    };
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 351 of lalr1.java  */
/* Line 417 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 75: " +
            "ebarat_riazi: zojmoratab MULTP");
    };
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 351 of lalr1.java  */
/* Line 421 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 76: " +
            "ebarat_riazi: zojmoratab DIVIDE");
    };
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 351 of lalr1.java  */
/* Line 425 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 77: " +
            "ebarat_riazi: zojmoratab MOD");
    };
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 351 of lalr1.java  */
/* Line 429 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 78: " +
			"ebarat_riazi: MINUS ebarat");
	};
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 351 of lalr1.java  */
/* Line 435 of "../src/Ph2/ALang.yacc"  */
    {
		System.out.println("Rule 79: " +
			"ebarat_bool: zojmoratab VA_KW ");
	};
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 351 of lalr1.java  */
/* Line 439 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 80: " +
            "ebarat_bool: zojmoratab YA_KW ");
    };
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 351 of lalr1.java  */
/* Line 443 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 81: " +
            "ebarat_bool: zojmoratab VAANGAH_KW ");
    };
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 351 of lalr1.java  */
/* Line 447 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 82: " +
            "ebarat_bool: zojmoratab YAVAGARNA_KW ");
    };
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 351 of lalr1.java  */
/* Line 451 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 83: " +
            "ebarat_bool: zojmoratab LT_KW ");
    };
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 351 of lalr1.java  */
/* Line 455 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 84: " +
            "ebarat_bool: zojmoratab LTE_KW ");
    };
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 351 of lalr1.java  */
/* Line 459 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 85: " +
            "ebarat_bool: zojmoratab GT_KW ");
    };
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 351 of lalr1.java  */
/* Line 463 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 86: " +
            "ebarat_bool: zojmoratab GTE_KW ");
    };
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 351 of lalr1.java  */
/* Line 467 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 87: " +
            "ebarat_bool: zojmoratab EQ_KW ");
    };
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 351 of lalr1.java  */
/* Line 471 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 88: " +
            "ebarat_bool: zojmoratab NEQ_KW ");
    };
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 351 of lalr1.java  */
/* Line 475 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 90: " +
            "ebarat_bool: ebarat NAGHIZ_KW ");
    };
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 351 of lalr1.java  */
/* Line 481 of "../src/Ph2/ALang.yacc"  */
    {
        System.out.println("Rule 91: " +
            "zojmoratab: RP_KW ebarat COMMA_KW ebarat LP_KW");
    };
  break;
    



/* Line 351 of lalr1.java  */
/* Line 1467 of "ALang.cacc"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == yyfinal_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yy_pact_value_is_default_ (yyn))
          {
            label = YYDEFAULT;
	    break;
          }

        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }

        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
			     yylval);
          }

        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;

        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yy_table_value_is_error_ (yyn))
	      label = YYERRLAB;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }

        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
			     yylval);

            /* Discard the token being shifted.  */
            yychar = yyempty_;

            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;

            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs_;
            if (yychar == yyempty_)
              yytoken = yyempty_;
            yyerror (yysyntax_error (yystate, yytoken));
          }

        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */

	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:

        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */

        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (!yy_pact_value_is_default_ (yyn))
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }

	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;

	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }

	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);

        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        /* There are many possibilities here to consider:
           - Assume YYFAIL is not used.  It's too flawed to consider.
             See
             <http://lists.gnu.org/archive/html/bison-patches/2009-12/msg00024.html>
             for details.  YYERROR is fine as it does not invoke this
             function.
           - If this state is a consistent state with a default action,
             then the only way this function was invoked is if the
             default action is an error action.  In that case, don't
             check for expected tokens because there are none.
           - The only way there can be no lookahead present (in tok) is
             if this state is a consistent state with a default action.
             Thus, detecting the absence of a lookahead is sufficient to
             determine that there is no unexpected or expected token to
             report.  In that case, just report a simple "syntax error".
           - Don't assume there isn't a lookahead just because this
             state is a consistent state with a default action.  There
             might have been a previous inconsistent state, consistent
             state with a non-default action, or user semantic action
             that manipulated yychar.  (However, yychar is currently out
             of scope during semantic actions.)
           - Of course, the expected token list depends on states to
             have correct lookahead information, and it depends on the
             parser not to perform extra reductions after fetching a
             lookahead from the scanner and before detecting a syntax
             error.  Thus, state merging (from LALR or IELR) and default
             reductions corrupt the expected token list.  However, the
             list is correct for canonical LR with one exception: it
             will still contain any token that will not be accepted due
             to an error action in a later state.
        */
        if (tok != yyempty_)
          {
            // FIXME: This method of building the message is not compatible
            // with internationalization.
            StringBuffer res =
              new StringBuffer ("syntax error, unexpected ");
            res.append (yytnamerr_ (yytname_[tok]));
            int yyn = yypact_[yystate];
            if (!yy_pact_value_is_default_ (yyn))
              {
                /* Start YYX at -YYN if negative to avoid negative
                   indexes in YYCHECK.  In other words, skip the first
                   -YYN actions for this state because they are default
                   actions.  */
                int yyxbegin = yyn < 0 ? -yyn : 0;
                /* Stay within bounds of both yycheck and yytname.  */
                int yychecklim = yylast_ - yyn + 1;
                int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
                int count = 0;
                for (int x = yyxbegin; x < yyxend; ++x)
                  if (yycheck_[x + yyn] == x && x != yyterror_
                      && !yy_table_value_is_error_ (yytable_[x + yyn]))
                    ++count;
                if (count < 5)
                  {
                    count = 0;
                    for (int x = yyxbegin; x < yyxend; ++x)
                      if (yycheck_[x + yyn] == x && x != yyterror_
                          && !yy_table_value_is_error_ (yytable_[x + yyn]))
                        {
                          res.append (count++ == 0 ? ", expecting " : " or ");
                          res.append (yytnamerr_ (yytname_[x]));
                        }
                  }
              }
            return res.toString ();
          }
      }

    return "syntax error";
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yy_pact_value_is_default_ (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code> value indicates a syntax error.
   * @param yyvalue   the value to check
   */
  private static boolean yy_table_value_is_error_ (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -45;
  private static final short yypact_[] =
  {
        14,    35,    86,   131,   -45,   -45,   -45,   -45,   -45,    76,
      96,   138,   -45,    99,   -23,   -45,    21,   -45,   110,    76,
     -45,    39,   105,   107,   -45,   103,    76,   -45,    -3,   -45,
     227,    42,   132,   227,   113,   227,   -45,    34,   136,   124,
     146,   -45,    76,    31,   -45,    99,   100,   -45,   201,   227,
     227,    59,   -45,   -45,   -45,   -45,   227,   227,   112,   -45,
     -45,   145,   125,   227,   134,   154,    -8,   -45,   227,   112,
     -45,   -45,   178,   -45,   -45,   166,   170,   -45,   176,    28,
     227,   168,   177,   229,   -45,   205,   -45,   -45,   -45,    78,
     112,     0,   112,   214,   227,     3,   112,   -45,    82,   -45,
     -45,   -45,   -45,   -45,   -45,   -45,   -45,   -45,   -45,   -45,
     -45,   -45,   -45,   -45,   139,   227,   186,   188,   137,   139,
     -45,   -45,   170,   175,   212,   217,   -45,     4,   -45,    85,
     203,   215,   227,   -45,   195,   -45,   101,     1,   227,   -45,
      89,   190,   139,    98,   196,   228,   231,   -45,   232,   194,
     220,   240,   -45,   -45,   -45,   -45,   205,   112,   227,   -45,
     -45,    17,   -45,    89,   244,   245,    89,    76,   242,    76,
     -45,   246,   -45,   -45,   112,   -45,   -45,   -45,   -45,   -45,
     -45,    76,   -45,   -45,   -45
  };

  /* YYDEFACT[S] -- default reduction number in state S.  Performed when
     YYTABLE doesn't specify something else to do.  Zero means the
     default is an error.  */
  private static final byte yydefact_[] =
  {
         0,     0,     0,     0,     1,     9,    10,    11,    12,     0,
       0,     0,     7,     0,     0,    27,     0,     5,     0,     0,
       6,     0,    17,     0,    13,    15,     0,    28,     0,    34,
       0,     0,     0,     0,     0,     0,    54,     0,     0,     0,
       0,     4,     0,     0,     8,     0,     0,     3,     0,     0,
       0,    65,    72,    70,    71,    73,     0,     0,     0,    62,
      64,    63,     0,     0,     0,     0,     0,    63,     0,    52,
      37,    33,     0,    35,    31,     0,     0,     2,     0,     0,
       0,     0,     0,     0,    14,     0,    16,    23,    50,     0,
      56,     0,    42,     0,     0,     0,    79,    90,    38,    74,
      75,    76,    77,    78,    89,    86,    87,    84,    85,    88,
      80,    81,    82,    83,    44,     0,     0,     0,     0,    53,
      36,    32,     0,     0,     0,     0,    19,     0,    18,     0,
       0,    26,     0,    49,     0,    68,     0,     0,     0,    69,
       0,    39,    43,     0,     0,     0,     0,    48,     0,     0,
       0,     0,    20,    21,    22,    24,     0,    55,     0,    67,
      66,     0,    40,     0,     0,     0,    46,     0,     0,     0,
      47,     0,    29,    25,    51,    91,    41,    57,    58,    45,
      59,     0,    61,    30,    60
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
       -45,   -45,   -24,    -6,   -45,   -45,   207,   -45,   -45,   -45,
      97,   247,    11,   -45,    -9,   -45,   -30,   162,   -45,   -45,
     -45,   -29,   -44,   -40,   -19,   -35
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     2,    11,    12,    13,    23,    24,    25,    81,    86,
     130,    14,    15,    40,    36,    37,    38,    89,   144,   118,
     149,    58,    59,    60,    67,    62
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If YYTABLE_NINF_, syntax error.  */
  private static final short yytable_ninf_ = -64;
  private static final short
  yytable_[] =
  {
        17,    64,    87,    82,    66,    20,    69,    72,    83,    48,
      41,    61,    26,   138,   138,    75,   139,    47,    49,    90,
      91,    92,   134,   160,    28,    27,    50,    95,    96,    29,
     175,    10,    27,    77,    78,   117,    79,    28,     3,   125,
      16,   131,    70,    80,   114,    28,    57,    97,     1,   119,
     126,   127,   122,    16,    71,    97,    97,    30,    97,    97,
      31,    16,    32,    33,    90,   137,    34,   123,   141,    20,
      30,    93,    97,    31,    42,    32,    33,    35,    30,    34,
      94,    31,    63,    32,    33,    28,     4,    34,   132,   154,
      35,   133,    28,    10,    83,    16,   142,    80,    35,    18,
      57,    16,    22,   157,    52,    53,    54,    55,    16,   161,
     162,   132,   131,   150,   159,    44,    20,    45,    30,    85,
     140,    31,    39,    32,    33,    30,    43,    34,    31,   174,
      32,    33,    46,   176,    34,    65,   179,    74,    35,    99,
     100,   101,   102,   103,    73,    35,   164,   165,   104,   105,
     106,   107,   108,   109,     5,     6,     7,     8,   180,    68,
     182,     5,     6,     7,     8,    76,     9,    97,     5,     6,
       7,     8,   184,    19,   115,   110,   111,   112,   113,   121,
     146,   147,    98,   116,   148,    10,   120,   124,   129,    16,
     128,   143,    10,   145,   -63,   151,     5,     6,     7,     8,
       5,     6,     7,     8,    51,    52,    53,    54,    55,    52,
      53,    54,    55,    56,    88,   152,    57,    51,    52,    53,
      54,    55,   153,   155,   158,   156,    56,   135,   163,    57,
      51,    52,    53,    54,    55,   166,   168,   167,   170,    56,
     171,   169,    57,    99,   100,   101,   102,   103,   172,   177,
     178,   181,    84,   173,   183,   136,     0,     0,    21
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         9,    31,    46,    43,    33,    11,    35,    37,    43,    12,
      19,    30,    35,    10,    10,    39,    13,    26,    21,    48,
      49,    50,    22,    22,     3,    14,    29,    56,    57,     8,
      13,    54,    21,    42,     3,    43,     5,     3,     3,    11,
      19,    85,     8,    12,    63,     3,    15,    55,    34,    68,
      22,    80,    76,    19,    20,    55,    55,    36,    55,    55,
      39,    19,    41,    42,    93,    94,    45,    76,    98,    75,
      36,    12,    55,    39,    35,    41,    42,    56,    36,    45,
      21,    39,    40,    41,    42,     3,     0,    45,    10,   129,
      56,    13,     3,    54,   129,    19,   115,    12,    56,     3,
      15,    19,     3,   132,     4,     5,     6,     7,    19,   138,
     140,    10,   156,   122,    13,     8,   122,    10,    36,    19,
      38,    39,    12,    41,    42,    36,    21,    45,    39,   158,
      41,    42,    29,   163,    45,     3,   166,    13,    56,    14,
      15,    16,    17,    18,     8,    56,    48,    49,    23,    24,
      25,    26,    27,    28,    30,    31,    32,    33,   167,    46,
     169,    30,    31,    32,    33,    19,    35,    55,    30,    31,
      32,    33,   181,    35,    40,    50,    51,    52,    53,    13,
      43,    44,    37,    29,    47,    54,     8,    11,    11,    19,
      22,     5,    54,     5,    55,    20,    30,    31,    32,    33,
      30,    31,    32,    33,     3,     4,     5,     6,     7,     4,
       5,     6,     7,    12,    13,     3,    15,     3,     4,     5,
       6,     7,     5,    20,    29,    10,    12,    13,    38,    15,
       3,     4,     5,     6,     7,    39,     5,     9,    44,    12,
      20,     9,    15,    14,    15,    16,    17,    18,     8,     5,
       5,     9,    45,   156,     8,    93,    -1,    -1,    11
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    34,    58,     3,     0,    30,    31,    32,    33,    35,
      54,    59,    60,    61,    68,    69,    19,    71,     3,    35,
      60,    68,     3,    62,    63,    64,    35,    69,     3,     8,
      36,    39,    41,    42,    45,    56,    71,    72,    73,    12,
      70,    71,    35,    21,     8,    10,    29,    71,    12,    21,
      29,     3,     4,     5,     6,     7,    12,    15,    78,    79,
      80,    81,    82,    40,    73,     3,    78,    81,    46,    78,
       8,    20,    73,     8,    13,    59,    19,    71,     3,     5,
      12,    65,    80,    82,    63,    19,    66,    79,    13,    74,
      78,    78,    78,    12,    21,    78,    78,    55,    37,    14,
      15,    16,    17,    18,    23,    24,    25,    26,    27,    28,
      50,    51,    52,    53,    81,    40,    29,    43,    76,    81,
       8,    13,    59,    71,    11,    11,    22,    78,    22,    11,
      67,    79,    10,    13,    22,    13,    74,    78,    10,    13,
      38,    73,    81,     5,    75,     5,    43,    44,    47,    77,
      71,    20,     3,     5,    80,    20,    10,    78,    29,    13,
      22,    78,    73,    38,    48,    49,    39,     9,     5,     9,
      44,    20,     8,    67,    78,    13,    73,     5,     5,    73,
      71,     9,    71,     8,    71
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,   310,   311
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    57,    58,    58,    58,    58,    59,    59,    60,    61,
      61,    61,    61,    62,    62,    63,    63,    64,    64,    64,
      65,    65,    65,    66,    66,    67,    67,    68,    68,    69,
      69,    70,    70,    71,    72,    72,    72,    72,    73,    73,
      73,    73,    73,    73,    73,    73,    73,    73,    73,    73,
      73,    73,    73,    73,    73,    74,    74,    75,    75,    76,
      76,    77,    78,    78,    78,    78,    78,    78,    78,    78,
      79,    79,    79,    79,    80,    80,    80,    80,    80,    80,
      81,    81,    81,    81,    81,    81,    81,    81,    81,    81,
      81,    82
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     6,     5,     5,     4,     2,     1,     3,     1,
       1,     1,     1,     1,     3,     1,     3,     1,     4,     4,
       3,     3,     3,     1,     3,     3,     1,     1,     2,     7,
       8,     2,     3,     3,     1,     2,     3,     2,     3,     4,
       5,     6,     3,     4,     3,     6,     5,     5,     4,     4,
       3,     6,     2,     3,     1,     3,     1,     3,     3,     4,
       5,     3,     1,     1,     1,     1,     4,     4,     3,     3,
       1,     1,     1,     1,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     5
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "SHENASE", "HARF", "ADADSABET",
  "REALCONST", "BOOLSABET", "SEMICOLON_KW", "COLON_KW", "COMMA_KW",
  "TWO_DOTS_KW", "LP_KW", "RP_KW", "PLUS", "MINUS", "MULTP", "DIVIDE",
  "MOD", "BLOCK_START", "BLOCK_END", "RANGE_START", "RANGE_END", "NEQ_KW",
  "GT_KW", "GTE_KW", "LT_KW", "LTE_KW", "EQ_KW", "ASSIGN_KW", "INT_KW",
  "FLOAT_KW", "CHAR_KW", "BOOLEAN_KW", "PROGRAM_KW", "MAIN_KW", "AGAR_KW",
  "ANGAH_KW", "VAGARNA_KW", "DO_KW", "WHILE_KW", "FOR_KW", "GOZINESH_KW",
  "MORED_KW", "END_KW", "EXIT_KW", "WHEN_KW", "DEFAULT_KW", "UPTO_KW",
  "DOWNTO_KW", "VA_KW", "YA_KW", "VAANGAH_KW", "YAVAGARNA_KW", "RAVIE_KW",
  "NAGHIZ_KW", "BAZGASHT_KW", "$accept", "program", "declarations_list",
  "declarations", "taeen_type", "declarator_list", "declarator", "dec",
  "range", "meghdar_avalie", "list_meghdar_avalie", "list_ravie", "ravie",
  "parameters", "block", "statement_list", "statement", "arguments_list",
  "counter", "onsor_mored", "default", "ebarat", "ebarat_sabet",
  "ebarat_riazi", "ebarat_bool", "zojmoratab", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        58,     0,    -1,    34,     3,    59,    68,    35,    71,    -1,
      34,     3,    68,    35,    71,    -1,    34,     3,    59,    35,
      71,    -1,    34,     3,    35,    71,    -1,    59,    60,    -1,
      60,    -1,    61,    62,     8,    -1,    30,    -1,    31,    -1,
      32,    -1,    33,    -1,    63,    -1,    62,    10,    63,    -1,
      64,    -1,    64,    29,    66,    -1,     3,    -1,     3,    21,
      65,    22,    -1,     3,    21,     5,    22,    -1,     3,    11,
       3,    -1,     5,    11,     5,    -1,    80,    11,    80,    -1,
      79,    -1,    19,    67,    20,    -1,    79,    10,    67,    -1,
      79,    -1,    69,    -1,    68,    69,    -1,    54,     3,    70,
      19,    71,    20,     8,    -1,    54,     3,    70,    19,    59,
      71,    20,     8,    -1,    12,    13,    -1,    12,    59,    13,
      -1,    19,    72,    20,    -1,     8,    -1,    73,     8,    -1,
      72,    73,     8,    -1,    72,     8,    -1,    36,    81,    37,
      -1,    36,    81,    37,    73,    -1,    36,    81,    37,    38,
      73,    -1,    36,    81,    37,    73,    38,    73,    -1,     3,
      29,    78,    -1,    39,    73,    40,    81,    -1,    39,    40,
      81,    -1,    41,     3,    29,    75,    39,    73,    -1,    41,
       3,    29,    75,    39,    -1,    42,    78,    76,    77,    44,
      -1,    42,    78,    76,    44,    -1,     3,    12,    74,    13,
      -1,     3,    12,    13,    -1,     3,    21,    78,    22,    29,
      78,    -1,    56,    78,    -1,    45,    46,    81,    -1,    71,
      -1,    74,    10,    78,    -1,    78,    -1,     5,    48,     5,
      -1,     5,    49,     5,    -1,    43,     5,     9,    71,    -1,
      76,    43,     5,     9,    71,    -1,    47,     9,    71,    -1,
      79,    -1,    81,    -1,    80,    -1,     3,    -1,     3,    21,
      78,    22,    -1,     3,    12,    74,    13,    -1,     3,    12,
      13,    -1,    12,    78,    13,    -1,     5,    -1,     6,    -1,
       4,    -1,     7,    -1,    82,    14,    -1,    82,    15,    -1,
      82,    16,    -1,    82,    17,    -1,    82,    18,    -1,    15,
      78,    -1,    82,    50,    -1,    82,    51,    -1,    82,    52,
      -1,    82,    53,    -1,    82,    26,    -1,    82,    27,    -1,
      82,    24,    -1,    82,    25,    -1,    82,    28,    -1,    82,
      23,    -1,    78,    55,    -1,    12,    78,    10,    78,    13,
      -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,    10,    16,    22,    27,    30,    32,    36,
      38,    40,    42,    44,    46,    50,    52,    56,    58,    63,
      68,    72,    76,    80,    82,    86,    90,    92,    94,    97,
     105,   114,   117,   121,   125,   127,   130,   134,   137,   141,
     146,   152,   159,   163,   168,   172,   179,   185,   191,   196,
     201,   205,   212,   215,   219,   221,   225,   227,   231,   235,
     240,   246,   250,   252,   254,   256,   258,   263,   268,   272,
     276,   278,   280,   282,   284,   287,   290,   293,   296,   299,
     302,   305,   308,   311,   314,   317,   320,   323,   326,   329,
     332,   335
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,    77,    77,    81,    85,    89,    95,    99,   105,   111,
     115,   119,   123,   129,   133,   139,   143,   149,   153,   157,
     163,   167,   171,   177,   181,   187,   191,   197,   201,   207,
     211,   217,   221,   227,   233,   237,   241,   245,   251,   255,
     259,   263,   267,   271,   275,   279,   283,   287,   291,   295,
     299,   303,   307,   311,   315,   321,   325,   331,   335,   341,
     345,   351,   357,   361,   365,   369,   373,   377,   381,   385,
     391,   395,   399,   403,   409,   413,   417,   421,   425,   429,
     435,   439,   443,   447,   451,   455,   459,   463,   467,   471,
     475,   481
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 258;
  private static final int yynnts_ = 26;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 4;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 57;

  private static final int yyuser_token_number_max_ = 311;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


