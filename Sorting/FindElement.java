
public class FindElement {

    public static int findElement(int arr[], int k , int x) {

        int i = 0 ;

        while(i < arr.length ) {

            if(arr[i] == x) {
                return i ;
            }
            else {
                i += Math.max((Math.abs((arr[i]-x)/k)),1);
            }
        }
        return -1 ;
    }
    
    public static void main(String args[]) {

        int arr[] = {20, 40, 50, 70, 70, 60} ;
        int k = 20 ;
        int x = 60 ;

        System.out.println(findElement(arr, k, x));

    }   
}