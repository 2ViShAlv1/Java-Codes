import java.util.*;

public class Stringcompare {
    public static void main(String args[]) {

        String s1 = "Vishal" ;
        String s2 = "Vishal" ;
        
        String s3 = new String("Vishal") ;

        if(s1 == s2) {
            System.out.println("They are equal") ;
        }
        else{
            System.out.println("They are not equal" ) ;
        }
        if(s1.equals(s3)) {
            System.out.println("They are equal") ;

        }
        else{
            System.out.println("They are not equal") ;
        }
    }
}