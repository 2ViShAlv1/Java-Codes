import java.util.LinkedList ;

public class DeleteNafterM {

    public static class Node {

        int data ;
        Node next ;

        public Node(int data) {
            this.data = data ;
            this.next = null ;
        }
    }
    public static Node head ;
    public static Node tail ;

    public static void delete(int m, int n) {

        Node temp = head ;
        Node newNode = head ;
        
        while(temp != null) {

            // iterating in case of m 

            for(int i = 1 ; i < m && temp != null ; i++) {

                temp = temp.next ;
            }
            //checking if we have reached the end
            if(temp == null ||  temp.next == null) {
                return ;
            }
            newNode = temp.next ;

            // interating in case of n

            for(int i = 1 ; i <= n && newNode != null ; i++) {
                newNode = newNode.next ;
            }
            temp.next = newNode ;
            temp = newNode ;
        }

    }
    public void print() {
        Node temp = head ;

        while(temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }
     public static void main(String[] args) {

       DeleteNafterM ll = new DeleteNafterM();

        head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;
        head.next.next.next.next = new Node(5) ;
        head.next.next.next.next.next = new Node(6) ;
        
        ll.print();
         delete(2, 2);
         System.out.println();
         ll.print();
        
    }
}
