public class Arraysnegative {
    public static void shifting(int arr[]) {

        int j = 0 ;

        for(int i = 0 ; i < arr.length ; i++) {

            if(arr[i] >= 0) {

                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
                j++ ;
            }
        }
    }
    public static void printarr(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i]) ;
        }
    }
    public static void main(String args[]) {

        int arr[] = {1, -2, 3, -4, 5} ;
        shifting(arr) ;
        printarr(arr) ;
    }
}