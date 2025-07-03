import java.util.LinkedList; 

public class LinkedListFrameWork {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>() ;

        // add
        ll.addFirst(2) ;
        ll.addFirst(1) ;
        ll.addLast(3) ;

        System.out.println(ll);
        
        //remove

        ll.removeLast();
        ll.removeFirst() ;
        System.out.println(ll);

    }
}
