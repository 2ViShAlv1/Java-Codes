public class ClearRangeBits {

    public static int clearrangebits(int n , int j , int i) {

        int a = (~0) << (j+1) ;
        int b = (1 << i) - 1 ;

        int bitmask = a | b ;

        return n & bitmask ; 
    }

    public static void main(String args[]) {

        System.out.print(clearrangebits(10 , 4 , 2)) ;

    }
}