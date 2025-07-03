public class RomantoInt {

    public static int romantoint(String roman) {

        int integer = 0 ;

        for(int i = 0 ; i < roman.length() ; i++) {

            if(roman.charAt(i) == 'X') {
                integer += 10 ;
            }
            else if(roman.charAt(i) == 'I') {
                integer += 1 ;
            }
            else {
                integer += 5 ;
            }
        }
        return integer ;

    }
    public static void main(String args[]) {

        String roman = "IX" ;

        System.out.print(romantoint(roman));
    }
}
