import java.util.Stack ;

public class NextGreater {
    public static void nextGreater(int arr[], int next[]) {

        Stack<Integer> s = new Stack<>() ;

        for(int i = arr.length-1 ; i >= 0 ; i--) {

            int n = arr[i] ;

            while(!s.isEmpty() && arr[s.peek()] <= n) {
                s.pop() ;
            }

            if(s.isEmpty()) {
                next[i] = -1 ;
            }
            else {
                next[i] = arr[s.peek()] ;
            }
            s.push(i) ;
        }
        for(int i = 0 ; i < next.length ; i++) {

            System.out.print(next[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {7, 10, 4, 8, 2} ;
        int next[] = new int[arr.length] ;

        nextGreater(arr, next);
    }
}