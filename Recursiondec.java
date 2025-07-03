public class Recursion {
    public static void printvalues(int n) {

        if(n == 1) {   // base case
            System.out.print(n) ;
            return ;
        }

        System.out.print(n + " ") ;
        printvalues(n-1); // function is calling again and again 
    }
    public static void main(String args[]) {

        int n = 10 ;

        printvalues(n) ;
    }
}