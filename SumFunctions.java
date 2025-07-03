import java.util.*;
public class SumFunctions {

    public static void calculatesum(int a , int b) { // is bracket mai jo hai ussi hi kehte hai parameters

        int sum  = a + b ;
        System.out.println(sum) ;
    }
        public static void main(String args[]) {
            
            Scanner sc = new Scanner(System.in) ;

            int a = sc.nextInt() ;
            int b = sc.nextInt() ;
            calculatesum(a , b) ; // ye j a or b yaha hai isse kehte hai arguments
        }

        
     
}