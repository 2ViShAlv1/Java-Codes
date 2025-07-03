

import java.util.*;

public class PushatBottom {

    public static void pushatBottom(Stack<Integer> s, int data) {

        if(s.isEmpty()) { // when stack we will add the data
            s.push(data) ;
            return ;
        }

        int top = s.pop() ; // it stores the value returned by pop
        pushatBottom(s, data);

        s.push(top) ; //adding the elements 
    }
    
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>() ;

        s.push(1) ;
        s.push(2);
        s.push(3);

        pushatBottom(s, 4);
        
        while(!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop();
        }
    }
}
