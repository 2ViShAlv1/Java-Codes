public class QueueArray {

    static class Queue {

        static int arr[] ;
        static int size ;
        static int rear ;

        Queue(int n) {
            arr = new int[n] ;
            size = n ;
            rear = -1 ;

        }

        //checking if Queue is Empty 

        public boolean isEmpty() {

            return rear == -1 ;
        }

        // adding function 

        public  void enque(int data) {

            if(rear == size-1) {
                System.out.println("Queue is empty");
                return;
            }
            rear = rear + 1 ;
            arr[rear] = data ;
        }
        // to remove the front 
        public  int remove() {

            if(isEmpty()) {
                return -1 ;
            }
            int front = arr[0] ;

            for(int i = 0 ; i < rear ; i++) {
                arr[i] = arr[i+1] ;
            }
            rear-- ; // as element is remove we will dec the rear
            return front ;
        }

        // function to get element

        public  int peek() {

            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1 ;
            }
            return arr[0] ;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5) ;

        q.enque(1);
        q.enque(2);
        q.enque(3);
        q.enque(4);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove() ;
        }
    }
}