public class Callbyvalue {

    public static void swap(int a , int b) {
        
        int temp = a ; 
        a = b ;
        b = temp ;
        System.out.println("value of a : " + a) ;
        System.out.println("value of b : " + b ) ;
    }
        public static void main(String args[]) {

            int a = 5 ;
            int b = 6 ;
            swap(a , b ) ;
        }

        
    
}