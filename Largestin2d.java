import java.util.*;

public class Largest2d {
    public static void largestin(int numbers[][]) {
        
        Scanner sc = new Scanner(System.in) ;

        int largest = Integer.MIN_VALUE ;

        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers[0].length ; j++) {
                numbers[i][j] = sc.nextInt() ;
            }
        }
        for(int i = 0 ; i < numbers.length ; i++) {
            for(int j = 0 ; j < numbers[0].length ; j++) {
                if(numbers[i][j] > largest) {
                    largest = numbers[i][j] ;
                }
            }
        } System.out.print(largest) ;
    }
    public static void main(String args[]) {

        int numbers[][] = new int [3][3] ;

        largestin(numbers) ;
    }
}