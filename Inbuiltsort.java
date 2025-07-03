import java.util.Collections;

public class Inbuiltsort {
    public static void print(Integer arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    public static void main(String args[]) {

        Integer arr[] = {5, 4, 2, 1, 3} ;

        Arrays.sort(arr , 0 , 2 , Collections.reverseOrder()) ;

        print(arr) ;

        

        
    }
}