public class QuickSort {
    public static void quicksort(int arr[] , int si , int ei) {

        if(si >= ei) {
            return ;
        }

        int pidx = partition(arr,si,ei) ;
        quicksort(arr,si,pidx-1) ; // left side of pivot
        quicksort(arr,pidx+1,ei) ; // right side of pivot
    }
    public static int partition(int arr[], int si , int ei) {
        int pivot = arr[ei] ;
        int i = si-1 ; // it is used to make space for elements smaller than pivot

        for(int j = si ; j < ei ; j++) {
            if(arr[j] <= pivot) {
                i++ ;
                // swaping
                int temp = arr[j] ;
                arr[j] = arr[i] ;
                arr[i] = temp ;
            }
        }
        // putting the pivot at its correct position   
        i++ ;
        int temp = arr[ei] ;
        arr[ei] = arr[i] ;
        arr[i] = temp ;
        return i; 
    }
    public static void print(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]) ;
        }
    }
    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 8, 2, 5} ;

        quicksort(arr,0,arr.length-1) ;
        print(arr) ;
    }
}