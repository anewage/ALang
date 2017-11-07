import java.io.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to ALang Compiler!");
        try {
            FileReader r = new FileReader("src/input.txt");
            Yylex lexer = new Yylex(r);
            lexer.yylex();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
