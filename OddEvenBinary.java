public class OddEvenBinary {
    public static void oddoreven(int n) {

        

        if((n & 1) == 0) {
            System.out.print("Even Number") ;
        }
        else{
            System.out.print("Odd Number") ;
        }
    }
    public static void main(String args[]) {

        oddoreven(4) ;
    }
}