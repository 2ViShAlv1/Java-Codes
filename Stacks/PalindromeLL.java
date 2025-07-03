import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLL {

    public static class Node {

        int data ;
        Node next ;

        public Node(int data) {
            this.data = data ;
            this.next = null ;
        }   
    }
    public static Node head ;
    public static boolean isPalindrome(Node head) {

        Stack<Integer> s = new Stack<>() ;

        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null) {

            slow = slow.next ;
            fast = fast.next.next ;
        }

        Node temp = head;

        while(temp != slow) {

            s.push(temp.data) ;
            temp = temp.next ;
        }
        Node temp2 = slow;
        while(!s.isEmpty()) {

            if(s.peek() != temp2.data) {
                return false ;
            }
            else {
                s.pop() ;
                temp2 = temp2.next ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        
        
        head = new Node(2) ; 
        head.next = new Node(2) ;
        head.next.next = new Node(2) ;
        head.next.next.next = new Node(2) ;

        System.out.println(isPalindrome(head));
    }
}
