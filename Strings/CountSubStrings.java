
public class CountSubStrings {

    public static int countStrings(String str) {
        
        int count = 0 ;

        for(int i = 0 ; i < str.length() ; i++) {
            for(int j = i ; j < str.length() ; j++) {
                count++ ;
            }
        }
        return count ;
    }
    public static void main(String args[]) {

        String str = "Vishal" ;

        System.out.println(countStrings(str));
    }
}
