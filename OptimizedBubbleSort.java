public class OptimizedBubbleSort {
    public static void optmizedsort(int arr[]) {

        for(int turn = 0 ; turn < arr.length-1 ; turn++) {
            boolean swapped = false ;
            for(int j = 0 ; j < arr.length-1-turn ; j++) {

                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                    swapped = true ;
                }
            }
            if(swapped == false) {
                break ;
            }
        }
    }
    public static void print(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    public static void main(String args[]) {

        int arr[] = {2, 3, 1, 5, 4} ;

        optmizedsort(arr) ;
        print(arr) ;

        
    }
}