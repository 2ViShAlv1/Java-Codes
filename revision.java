public class revision {

    public static void insertionSort(int arr[], int n) {

        for(int i = 1 ; i < n; i++) {
            int curr = arr[i] ;
            int prev = i-1 ;

            while(prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev] ;
                prev-- ;
            }
            arr[prev+1] = curr ;
        }
    }
    public static void printarr(int arr[], int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]) {

        int arr[] = {2, 1, 5, 3, 6, 4} ;
        int n = arr.length ;
        insertionSort(arr, n)  ;
        printarr(arr, n)    ;
    }
}