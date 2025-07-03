public class BintoDec {

    public static void bintodec(int binum) {

        int pow = 0 ;
        int dec = 0 ;

        while (binum > 0) {
            int lastdigit = binum % 10 ;
            dec = dec + (lastdigit *(int) Math.pow(2 , pow)) ;
            pow++ ;
            binum = binum / 10 ;
        }
        System.out.println(dec) ;
    }
    public static void main(String args[]) {
        bintodec(101) ;
    }
}