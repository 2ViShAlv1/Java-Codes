import java.util.*;

public class stockspan {
    public static void spanStock(int stock[], int span[]) {

        Stack<Integer> s = new Stack<>() ;
        span[0] = 1 ;
        s.push(0) ;

        for(int i = 1 ; i < stock.length ; i++) {

            int currPrice = stock[i] ;

            while(!s.isEmpty() && currPrice >= stock[s.peek()]) {
                s.pop() ;
            }
            if(s.isEmpty()) {
                span[i] = i+1 ;
            }
            else {
                int prevHigh = s.peek() ;
                span[i] = i - prevHigh ;
            }    
            s.push(i) ;  
        }
        for(int i = 0 ; i < span.length ; i++) {
            System.out.print(span[i] + " ");
        }
    }
    public static void main(String[] args) {
        
        int stock[] = {20, 15, 10, 15, 30, 15} ;

        int span[] = new int[stock.length] ;

        spanStock(stock, span) ;
    }
}
