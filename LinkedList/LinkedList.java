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
    public int removeLast() {

        if(size == 0) {
            System.out.println("Khali hai bsdk");
            return Integer.MIN_VALUE ;
        }
        if(size == 1) {
            int val = head.data ;
            head = head.next ;
            return val ;
        }
        // making prev node which is ar size-2 

        Node prev = head ;
        for(int i = 0 ; i < size-2 ; i++) {
            prev =  prev.next ;
        }
        int val = prev.next.data ;
        prev.next = null ;
        tail = prev ;
        size--;
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
    public int iterativeSearch(int key) {

        int i = 0 ;
        Node temp = head ;

        while(temp != null) {

            if(temp.data == key) {
                System.out.print("The value of the idx is ");
                return i ;
            }
            temp = temp.next ;
            i++ ;
        }
        return -1 ;
    }

    public int helper(Node head , int key) {

        if(head == null) {
            return -1 ;
        }
        else if(head.data == key) {
            return 0 ;
        }

        int idx = helper(head.next, key);

        if(idx == -1) {
            return -1 ;
        }
        return (idx + 1) ;
    }

    public int recursiveSearch(int key) {

        return helper(head, key) ;
    }

    public void reverseLL() {

        Node prev = null ;
        Node curr = tail = head ;
        Node next ;

        while(curr != null) {

            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;  
        }
        head = prev ;
    }

    public void deleteNode(int n) {

        int sz  = 0 ;
        Node temp = head ;

        //calculating size of linkedlist
        while(temp != null) {
            sz++ ;
            temp = temp.next ;
        }
        
        // deleting head node case
        if(sz == n) {
            head = head.next ;
            return ;
        }
        //deleting nth node

        Node prev = head ;
        int i = 1 ;
        int iToFind = sz-n ;

        while(i < iToFind) {
            prev = prev.next ;
            i++ ;
        }
        prev.next = prev.next.next ;
        return ;
    }

    //function to find Mid node 

    public Node findMid(Node head) {

        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null) {
            slow = slow.next ; // inc by 1 node
            fast = fast.next.next ; // inc by 2 node
        }
        return slow ;        
    }

    public boolean isPalindrome() {

        // base case

        if(head == null || head.next == null) {
            return true ;
        }
        //find mid Node

        Node midNode = findMid(head) ;

        //reverse 2nd half

        Node prev = null ;
        Node curr = midNode ;
        Node next ;

        while(curr != null) {

            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;

        }
        
        // comparing first and second half

        Node left = head ; // left half head 
        Node right = prev ; // left half head

        while(right != null) {

            if(left.data != right.data) {
                return false ;
            }
            right = right.next ;
            left = left.next ;
        }
        return true ;
    }

    // Detecting Cycle Code 

    public static boolean isCyclic() {

        if(head == null || head.next == null) {
            return false ;
        }

        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null) {

            //first move then check

            slow = slow.next ;
            fast = fast.next.next ;

            if(slow == fast ) {
                return true ; //cycle exists
            }
           
        }
        return false ; // cycle does not exists
    }
    // Remove cycle function

    public static void removeCycle() {

        //step 1 cycle exists or not
        
        Node slow = head ;
        Node fast = head ;
        boolean cycle = false ;

        while(fast != null && fast.next != null) {

            slow = slow.next ;
            fast = fast.next.next ;

            if(fast == slow) {
                cycle = true ;
                break ;
            }
        }
        // if cycle does not exist we will return
        if(cycle == false) {
            return ;
        }
        slow = head ;
        Node prev = null ; // last node 

        while(slow != fast) {

            prev = fast ;
            slow = slow.next ;
            fast = fast.next ;
        }
        // remove the cycle last.next = null 
        prev.next = null ;
    }

    public void zigZag() {

        // finding the mid Node

        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null) {

            slow = slow.next ;
            fast = fast.next.next ;
        }
        Node mid = slow ;

        //reversing the 2nd half

        Node prev = null ;
        Node curr = mid.next ;
        mid.next = null ;
        Node next ;

        while(curr != null) {

            next = curr.next  ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        // alt merge

        Node left = head ;
        Node right = prev ;
        Node nextL, nextR ;

        while(left != null && right != null) {

            nextL = left.next ;
            left.next = right ;
            nextR = right.next ;
            right.next = nextL ;

            left = nextL ;
            right = nextR ;
        }
    }

    public static void main(String args[]) {

        LinkedList ll = new LinkedList() ;

       ll.addFirst(6);
       ll.addFirst(5);
       ll.addFirst(4);
       ll.addFirst(3);
       ll.addFirst(2);
       ll.addFirst(1);

       ll.print(); 
       ll.zigZag() ;
       System.out.println();
       ll.print();

    }   
}