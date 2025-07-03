import java.util.*;
public class LargestinArrays {
    public static int islargest(int numbers[]) {
        int largest = Integer.MIN_VALUE ;
        for(int i = 0 ; i < numbers.length ; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i] ;
            }
        } return largest ;
    }
    public static void main(String args[]) {
        int numbers[] = {1 ,2 , 6, 7, 4 } ;
        System.out.print("largest number is : " + islargest(numbers)) ;

    }
}