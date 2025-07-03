import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter a : ") ;
        float a = sc.nextFloat() ;
        System.out.println("enter b : ") ;
        float b = sc.nextFloat() ;
        System.out.println("enter c : ") ;
        float c = sc.nextFloat() ;
        System.out.println("enter operator : " ) ;
        char operator = sc.next().charAt(0) ;

        switch(operator) {
            case '+' : System.out.println(a+b) ;
            break ;
            case '-' : System.out.println(a-b) ;
            break ;
            case '*' : System.out.println(a*b) ;
            break ;
            case '/' : System.out.println(a/b) ;
            break ;
            case '%' : System.out.println(a%b) ;
            break ;
            default : System.out.println("mere bas ki nahi hai") ;
            
        }


        
    }
}