public class DectoBin {
    
    public static void dectobin(int decnum) {
        
        int binum = 0 ;
        int pow = 0 ;
        while(decnum > 0) {
            int remainder = decnum % 2 ;
            binum = binum + (remainder * (int)Math.pow(10 , pow)) ;
            pow++ ;
            decnum = decnum / 2 ;
        }
        System.out.print(binum) ;
    }
    public static void main(String args[]) {
        dectobin(5) ;
    }
}