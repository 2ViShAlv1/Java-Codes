public class LinkedList {

    public static class Node {

        int data ; 
        Node next ;

        public Node(int data) {
            this.data = data ;
            this.next = null ;
        }
    }
    public static  Node head; // the first node 
    public static Node tail; // last node
    public static int size; // size of the ll 

    // adding new node in the first of linkedlist

    public void addFirst(int data) { //The data parameter represents the value that will  
                                     // be stored in the newNode 
        //step 1 -> creating new node
        Node newNode = new Node(data) ; // here data is the parameter to initialize
        size++ ;                         // the new node 
        // step 2 -> if ll is null 
        if(head == null) {
            head = tail = newNode ;
            return ;
        }
        // when ll is not empty
        newNode.next = head ;
        
        head = newNode ; // making newNode the head
    }

    public  void addLast(int data) {

        // making new node

        Node newNode = new Node(data) ;
        size++;
        
        // it ll is empty
        if(head == null) {
            head = tail = newNode ;
        }
        tail.next = newNode ;

        tail = newNode ;

    }
    public void addMiddle(int idx , int data) {

        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data) ;
        size++;
        Node temp = head ;
        int i = 0 ;
        
        while(i < idx-1) {
            temp = temp.next ;
            i++;
        }
        newNode.next = temp.next ;
        temp.next = newNode ;
    }
    public int removeFirst() {

        if(size == 0) {
            System.out.println("Khali hai bsdk");
            return Integer.MIN_VALUE ;
        }
        else if(size == 1) {
            int val = head.data ;
            head = tail = null;
            return val ;
        }
        int val = head.data ;
        head = head.next ;
        size-- ;
        return val ;
    }
    public void print() {

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data +  "->");
            temp = temp.next ;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList() ;

       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(4);
       ll.addLast(5);
       ll.addMiddle(2, 3);

       ll.removeFirst() ;
       ll.print() ;
       System.out.println();
       System.out.println(ll.size);

    }   
}