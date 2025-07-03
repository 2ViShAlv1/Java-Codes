public class Swapwithouttemp {

    public static void swap(int x , int y) {

        //by using xor operator we can do that

        x = x ^ y ;
        y = x ^ y ;
        x = x ^ y ;

        System.out.print("after swap x="+x+"," + "y="+ y) ;
    }
    public static void main(String[] args) {
        
        int x = 1 ;
        int y = 2 ;
        swap(x, y);

    }
}
