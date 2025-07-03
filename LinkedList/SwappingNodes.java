public class SwappingNodes {

    public static class Node {

        int data ;
        Node next ;

        public Node(int data) {

            this.data = data;
            this.next = null ;
        }
    }
    public static Node head ;
    
    public void swap(int x , int y) {

        Node temp1 = head ;
        Node prev1 =  null ;
        Node temp2 = head ;
        Node prev2 = null ;
        
        
            for(int i = 1 ; i < x && temp1.next != null ; i++) {
                prev1 = temp1 ;
                temp1 = temp1.next ;
            }
            for(int i = 1 ; i < y && temp2.next != null ; i++) {
                prev2 = temp2 ;
                temp2 = temp2.next ;
            }
        
        prev1.next = temp2 ;
        temp2.next = prev2 ;
        prev2.next = temp1 ;
        temp1.next = null ;
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

        SwappingNodes ll = new SwappingNodes() ;

        head = new Node(1) ;
        head.next = new Node(2) ;
        head.next.next = new Node(3) ;
        head.next.next.next = new Node(4) ;
        
        
        
        
        ll.print();
        ll.swap(2,1) ;
        System.out.println();
        ll.print();


    }
}
