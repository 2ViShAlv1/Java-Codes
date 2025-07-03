public class CleariBits {
    public static int  clearibits(int n , int i) {

        int bitmask = (~0)<<i ;

        return (n & bitmask) ; 
    }
    public static void main(String args[]) {

        System.out.print(clearibits(15 , 2 )) ;
    }
}