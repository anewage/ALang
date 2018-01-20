package Ph2;

import java.io.*;

public class Main {

    private Yylex lexer;
    private YYParser parser;

    private Main(){
        System.out.println("Initializing the ALang Lexical Analyzer...");
        try {
            FileWriter fw1 = new FileWriter("./src/Ph1/output.al", false);
            FileWriter fw2 = new FileWriter("./src/lexemes.al", false);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            String msg = "LEXEME" + "\t\t" + "TOKEN" + "\t\t" + "ATTRIBUTE";
            bw1.write(msg);
            bw2.write(msg);
            bw1.close();
            bw2.close();
            System.out.println("ALang Lexical Analyzer Initialized Successfully...");
            System.out.println(msg);
        } catch (IOException e) {
            System.out.println("ALang Lexical Analyzer Failed...");
            e.printStackTrace();
        }
    }

    private void lex() throws IOException {
        FileReader r = new FileReader("./src/Resources/input.al");
        this.lexer = new Ph2.Yylex(r);
//        lexer.yylex();
    }

    public void parse() throws IOException {
        System.out.println("Initiating the parser...");
        parser = new YYParser(new YYParser.Lexer() {
            @Override
            public Object getLVal() {
                return null;
            }

            @Override
            public int yylex() throws IOException {
                int yyl_return = -1;
                try {
                    yyl_return = lexer.yylex();
                } catch (IOException e) {
                    System.err.println("IO error :" + e);
                }
                return yyl_return;
            }

            @Override
            public void yyerror(String s) {

            }
        });
        parser.setDebugLevel(100);
        parser.setDebugStream(System.out);
        parser.parse();
    }

    public static void main(String[] args){
        // initialization
        Main m = new Main();
        try {
            m.lex();
            m.parse();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
