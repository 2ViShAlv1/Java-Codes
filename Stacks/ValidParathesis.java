import java.util.Stack;

public class ValidParathesis {

    public static boolean isValid(String str) {

        Stack<Character> s = new Stack<>() ;

        for(int i = 0 ; i < str.length() ; i++) {

            char ch = str.charAt(i) ;
            
            //for opening brackets

            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch) ;
            }

            // if only closing brackets are present

            else {
                if(s.isEmpty()) {
                    return false ;
                }
                // in case of closing brackets

            if((s.peek() == '(' && ch == ')')
            || (s.peek() == '{' && ch == '}')
            || (s.peek() == '[' && ch == ']')) {

                s.pop();
            }
            else {
                return false ;
            }
    }
            }

            
        return s.isEmpty() ;
    }
    public static void main(String[] args) {
        
        String str = "(){}[]" ;

        System.out.println(isValid(str));
    }
}
