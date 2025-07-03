public class ClearIthBit {

    public static void clearithbit(int n , int i) {

        int bitmask =  ~(1<<i) ;

        System.out.print(n & bitmask) ;

    }

    public static void main(String args[]) {

        clearithbit(10 , 1) ;
    }
}