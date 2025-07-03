public class GetIthBit {

    public static void getithbit(int n , int i) {

        int bitmask = 1<<i ;

        if((n & bitmask) == 0) {
            System.out.print("ith term is 0") ;
        }
        else{
            System.out.print("ith term is 1" );
        }
    }
    public static void main(String args[]) {

        getithbit(11 , 1) ;

    }
}