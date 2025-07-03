public class ReverseString {
    public static String reverse(String name) {

        char namearr[] = name.toCharArray() ;

        StringBuilder sb = new StringBuilder("") ;

        for(int i = namearr.length-1 ; i >= 0 ; i--) {

            sb.append(namearr[i]) ;
        }
        return sb.toString() ;
    }
    public static void main(String args[]) {

        String name = "light" ;

        System.out.print(reverse(name)) ;
    }
}