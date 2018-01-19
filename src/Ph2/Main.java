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
        Yylex lexr = lexer;
        parser = new YYParser((YYParser.Lexer) lexer);
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
