public class Loops {
    public static void main(String args[]) {

        int i = 12345 ;

        while (i > 0) {
            int lastdigit = i % 10 ;
            
            i /= 10 ;
        }System.out.print(lastdigit) ;
    }
}