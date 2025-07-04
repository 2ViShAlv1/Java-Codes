import java.util.*;
public class Subarraysumprefix {
    public static void sumarray(int numbers[]) {
    int currsum = 0 ;
    int maxsum = Integer.MIN_VALUE ;
    int prefix[] = new int[numbers.length] ;

    prefix[0] = numbers[0] ;

    for (int i = 1 ; i < prefix.length ; i++) {
        prefix[i] = prefix[i-1] + numbers[i] ;

    }
    for(int i = 0 ; i < numbers.length ; i++) {
        for(int j = i ; j < numbers.length ; j++ ) {

            currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1] ;

            if(maxsum < currsum ) {
                maxsum = currsum ;
            }
 
        } 
    }System.out.print(maxsum) ;
    } 
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3} ;
        sumarray(numbers) ;
    }


}