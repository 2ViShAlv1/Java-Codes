public class Recursion {
    public static void printvalues(int n) {

        if(n == 1) {
            System.out.print("1 ") ;
            return ;
        }
        printvalues(n-1) ;
        System.out.print(n + " ") ;

    }
    public static void main(String args[]) {

        int n = 10 ;

        printvalues(n) ;

    }
}