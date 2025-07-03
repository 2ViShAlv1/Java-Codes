package Question Practice ;

public class RemoveDuplicates {

    public static class Node {

        int data ;
        Node next ;

        public Node(int data) {
            this.data = data;
            this.next = null ;
        }
    }
    public static Node head ;

    public static void remove() {

        Node curr1 = head ;
        Node curr2 = head ;
        

        while(curr1 != null && curr1.next != null) {

            while(curr2 != null && curr2.next != null) {

                
                curr2 = curr2.next ;

                if(curr1.data == curr2.data) {

                   int val = curr2.data ;
                   curr2 = curr2.next ;
                }
            }
            curr1 = curr1.next ;
            curr2 = curr1 ;
        }
    }

    public void print() {

        Node temp = head ;

        while(temp != null) {

            System.out.println(temp.data+"->");
            temp = temp.next ;
        }
    }
    
    public static void main(String[] args) {
        
        RemoveDuplicates ll = new RemoveDuplicates() ;

        head = new Node(1) ;
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        ll.print();

        
    }
}
