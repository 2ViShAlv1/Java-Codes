import java.util.*;

public class SubarraySum {
    public static void sumarray(int numbers[]) {

        int maxsum = Integer.MIN_VALUE ;
         int currsum = 0 ;

        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = i ; j < numbers.length ; j++) {
                 currsum  = 0 ;
                for(int k = i ; k <= j ; k++) {
                   
                    currsum += numbers[k] ;

                    

                }System.out.println( currsum + " ") ;
                if(maxsum < currsum) {
                    maxsum = currsum ;
                   
                }System.out.println() ;
            }
        }System.out.print("max sum : " + maxsum) ;

    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10} ;
        sumarray(numbers) ;
    }
}