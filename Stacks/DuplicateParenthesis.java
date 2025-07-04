import java.util.Stack; 

public class DuplicateParenthesis {

    public static boolean isDuplicate(String str) {

        Stack<Character> s = new Stack<>() ;

        for(int i = 0 ; i < str.length() ; i++) {

            char ch = str.charAt(i) ;

            //closing parenthesis

            if(ch == ')') {

                int count = 0 ;

                while(s.peek() != '(') {
                    count++ ;
                    s.pop() ;
                }
                if(count < 1) {
                    return true ;
                }
                else {
                    s.pop() ;
                }
            }

            //opening parenthesis

            else {
                s.push(ch) ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        
        String str = "(a+b)" ;

        System.out.println(isDuplicate(str));
    }
}
