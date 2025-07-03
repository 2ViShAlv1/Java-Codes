import java.util.*;

public class StringBuilderinjava {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("") ;

        for(char ch = 'a' ; ch <= 'z' ; ch++) {

            sb.append(ch) ; // used to add characters and an inbuilt functions

            System.out.print(sb) ;
        }
    }
}