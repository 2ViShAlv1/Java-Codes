public class Insertionsort {
    public static void insertionsort(int arr[]) {

        for(int i = 1 ; i < arr.length ; i++) {

            int curr = arr[i] ;
            int prev = i - 1 ;

            while(prev >= 0 && curr < arr[prev] ) {
                
                arr[prev + 1] = arr[prev] ;
                prev-- ;

            }
            arr[prev + 1] = curr ;
        } 
        for(int i = 0 ; i < arr.length  ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    public static void main(String args[]) {
        
        int arr[] = {6, 5, 4, 2, 1, 3} ;

        insertionsort(arr) ;
    }
}