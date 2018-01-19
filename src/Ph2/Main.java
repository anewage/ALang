package Ph2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public Main(){
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

    public void lex(){
        try {
            FileReader r = new FileReader("./src/Resources/input.al");
            Ph2.Yylex lexer = new Ph2.Yylex(r);
            lexer.yylex();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        // initialization
        Main m = new Main();
        m.lex();
    }
}
