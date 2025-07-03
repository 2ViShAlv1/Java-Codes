public class SubString {
    public static String substring(String str , int si , int ei) {

        String substr = "";

        for(int i = si ; i < ei ; i++) {

            substr += str.charAt(i) ;

        }return substr ; 
    }
    public static void main(String args[]) {

        String str = "Vishal Verma" ;

        System.out.print(substring(str , 0 , 6)) ; 
    }
}