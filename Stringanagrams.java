import java.util.*;

public class revision {
    public static void main(String args[]) {

        String s1 = "Vishal" ;
        String s2  = "Priyanshi" ;

        if(s1.length() == s2.length()) {

        s1 = s1.toLowerCase() ;
        s2  = s2.toLowerCase() ;

        char s1a[] = s1.toCharArray() ;
        char s2a[] = s2.toCharArray() ;

        Arrays.sort(s1a) ;
        Arrays.sort(s2a) ;

        boolean result = Arrays.equals(s1a,s2a) ;

        if(result) {
            System.out.print("are anagrams") ;
        }
        else{
            System.out.print("are not anagrams") ;
        }

        }
        else{
            System.out.print("are not anagrams") ;
        }
    
    }
}