import java.util.*;

public class PermuteTwoArrays {

    public static boolean permuteArrays(int arr1[], Integer arr2[], int k) {

        if(arr1.length != arr2.length) {
            return false;
        }

        //sorting the arrays
        Arrays.sort(arr1) ;
        Arrays.sort(arr2, Collections.reverseOrder()) ;
        
        for(int i = 0 ; i < arr1.length ; i++) {

            if((arr1[i] + arr2[i]) < k) {
                return false;
            }
        }
        return true ;
    }
    public static void main(String args[]) {

        int arr1[] = {3, 2, 1} ;
        Integer arr2[] = {9, 7, 8} ;
        int k = 10 ;

        if(permuteArrays(arr1, arr2, k) == true) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}