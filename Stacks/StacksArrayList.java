package Stacks ;

import java.util.*;

public class StacksArrayList {

    public static class Stack {
        
        static ArrayList<Integer> list = new ArrayList<>() ;

        // if size of list is zero it will return true 

        public static boolean isEmpty() {

            return list.size() == 0 ;
        }

        // This Function is to add elements to stack

        public static void push(int data) {
            list.add(data) ;
        }

        // this function is to remove elements
        public static int pop() {

            int top = list.get(list.size()-1) ;
            list.remove(list.size()-1) ;

            return top ;
        }

        // this function is to get elements

        public static int peek() {

            return list.get(list.size()-1) ;
        }
    }
    public static void main(String[] args) {
        
        Stack s = new Stack() ;

        s.push(1) ;
        s.push(2) ; 
        s.push(3) ; 

        while(!s.isEmpty()) {

            System.out.println(s.peek());
            s.pop() ;
        }
    }
}
