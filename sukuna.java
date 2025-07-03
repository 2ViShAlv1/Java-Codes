import java.util.*;
public class sukuna {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in) ;

        float a = sc.nextFloat() ;
        float b = sc.nextFloat() ;
        char operator = sc.next().charAt(0) ;

        switch (operator) {
            
            case '+' : System.out.println(a + b) ;
            break ;
            case '-' : System.out.println(a - b) ;
            break;
            case '/' : System.out.println(a/b) ;
            break ;
            case '*' : System.out.print (a * b) ;
        } 
    }    
}