
public class Palindrome {

    public static boolean isPalindrome(String str, int length, int i) {

        if(i == length/2) {
            return true ;
        }
        if(str.charAt(i) != str.charAt(length-i)) {
            return false ;
        }
        return isPalindrome(str, length, i+1);
    }
    public static void main(String[] args) {
        
        String str = "1223";
        int length = str.length()-1;
        int i = 0 ;

        System.out.println(isPalindrome(str, length, i));
    }
}
