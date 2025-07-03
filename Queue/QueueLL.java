public class QueueLL {
    static class Node {

        int data ;
        Node next ;

        Node(int data) {
            this.data = data ;
            this.next = next ;
        }
    }
        
        public static class Queue {

            static Node head = null ;
            static Node tail = null ;

            public boolean isEmpty() {

                return head == null && tail == null ;
            }
            public void add(int data) {

                Node newNode = new Node(data) ;

                // if ll is empty then adding new node
                if(head == null) {
                    head = tail = newNode ;
                    return ;
                }
                // adding new node
                tail.next = newNode ;
                tail = newNode ;
            }
            public int remove() {

                if(isEmpty()) {
                    System.out.println("queue is empty");
                    return -1 ;
                }
                int front = head.data ;

                //if single element is left

                if(tail == head) {
                    tail = head = null ;
                }
                else {
                    head = head.next ;
                }
                return front ;
            }
            
            //to get element

            public int peek() {

                if(isEmpty()) {
                    return -1 ;
                }

                int front = head.data ;

                return front ;
            }
        }
    
    public static void main (String args[]) {

        Queue q = new Queue() ;

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove() ;
        }
    }
}
