package Stacks;
import java.util.* ;

public class ReverseString {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>() ;
        int idx = 0 ;

        while(idx < str.length()) {

            s.push(str.charAt(idx)) ;
            idx++ ;
        }

        StringBuilder sc = new StringBuilder("");

        while(!s.isEmpty()) {

            char top = s.pop() ;

            sc.append(top) ;
        }
        return sc.toString() ;
    }
    public static void main(String[] args) {
        
        String str = "Malkova" ;

        System.out.println(reverseString(str));
    }
}
