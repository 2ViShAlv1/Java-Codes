import java.util.*;
public class PassorFail {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in) ;

        int marks = sc.nextInt() ;

        String result = (marks > 33) ? "Pass" : "Fail" ;

        System.out.println(result) ;
        
    }
}