public class UpdateithBit {
    public static int clear(int n , int i) {

        int bitmask = ~(1 << i) ;

        return (n & bitmask) ;
    }
    public static int set(int n , int i) {

        int bitmask = (1 << i) ;

        return (n | bitmask) ;
    }
    public static int update(int n , int i , int newbit) {

        if(newbit == 0) {
            return clear(n , i) ;
        }
        else{
            return set(n , i) ;
        }
    }
    public static void main(String args[]) {

        System.out.print(update(10 , 2 , 1)) ;
    }

}