public class CircularQueue {

    public static class Queue {

        int arr[] ;
        int size ;
        int rear ;
        int front ;

        Queue(int n) {
            arr = new int[n] ;
            size = n ;
            rear = -1 ;
            front = -1 ;
        }
        public boolean isEmpty() {

            return rear == -1 && front == -1 ;
        }

        // checking if queue is full

        public boolean isFull() {

            return (rear+1)%size == front ;
        }
        //adding elements 

        public void add(int data) {

            if(isFull()) {
                System.out.println("Queue is Full") ;
                return;
            }
            if(front == -1) {
                front = 0 ;
            }
            rear = (rear+1)%size ; // rear will reach to 0 
            arr[rear] = data ;
        }
        // remove elements 

        public int remove() {

            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1 ;
            }

            int result = arr[front] ;
            
            if(rear == front) {
                
                rear = front = -1 ;
            }
            else {
                front = (front+1) % size ;
            }

            return result ;
        }

        // to get element

        public int peek() {

            if(isEmpty()) {
                return -1 ;
            }
            return arr[front] ;
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue(3) ;

        q.add(1);
        q.add(2);
        q.add(3);



        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove() ;
        }
    }
}
