package Stacks;

import java.util.* ;

public class StacksJCF {
    public static void main(String[] args) {

        //saare functions JCF mai already hote hai

        Stack<Integer> s = new Stack<>() ;

        s.push(1) ;
        s.push(2) ;
        s.push(3) ;

        while(!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop() ;
        }

    }
}
