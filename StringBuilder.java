import java.util.*;

public class StringBuilder {
    public StringBuilder(String string) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("") ;

        for(char ch = 'A' ; ch <= 'Z' ; ch++) {

            sb.append(ch) ; // used to add characters and an inbuilt functions

            System.out.print(sb) ;
        }
    }

    public void append(char ch) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'append'");
    }

    void append(char ch) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}