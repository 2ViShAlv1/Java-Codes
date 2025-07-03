public class DoubleLL {

    public static class Node {

        int data ;
        Node next ;
        Node prev ;

        public Node(int data) {

            this.data = data ;
            this.next = null ;
            this.prev = null ;
        } 
    }
    public static Node head ;
    public static Node tail ;
    public static int size ;

    public void addFirst(int data) {

        Node newNode = new Node(data) ;
        size++ ;

        if(head == null) {
            head = tail = newNode;
            return ;
        }
        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;

    }
    public int removeFirst() {

        if(head == null) {
            System.out.print("List Khali hai bsdk");
            return Integer.MIN_VALUE ;
        }
        int val = head.data ;
        head = head.next ;
        head.prev = null ;
        size-- ;

        return val ;
    }
    public void addLast(int data) {

        Node newNode = new Node(data) ;
        size++ ;

        if(head == null) {
            head = tail = newNode ;
            return ;
        }
        tail.next = newNode;
        newNode.prev = tail ;
        tail = newNode ;

    }

    public int removeLast() {

        if(head == null) {
            return Integer.MIN_VALUE ;
        }

        int val = tail.data ;
        tail = tail.prev ;
        tail.next = null ;
        size-- ;

        return val ;
    }

    public void reverse() {

        Node prev = null ;
        Node curr = head ;
        Node next ;

        while(curr != null) {

            next = curr.next ;
            curr.next = prev ;
            curr.prev = next ; // in DLL curr ke prev ko next ki taraf point krvana padega
            prev = curr ;
            curr = next ;
        }
        head = prev ;
    }

    public void printll() {
        
        Node temp = head ;

        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next ;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        
        DoubleLL dll = new DoubleLL() ;

        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(6) ;

       dll.printll();
       dll.reverse() ;
       System.out.println();
       dll.printll();
    }
}