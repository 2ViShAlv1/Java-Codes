import java.util.*;
public class Assignment4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt() ;
        int i = 1 ;
        

        do {
           int table = n * i ;
            System.out.println(table) ;
            i++ ;

        }while (i <= 10) ;
    }
}