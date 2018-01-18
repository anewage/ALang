package Ph1;

import java.io.*;

public class Main {

    public static void main(String[] args){
        try {
            FileReader r = new FileReader("./src/Ph1/input.txt");
            Yylex lexer = new Yylex(r);
            lexer.yylex();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
