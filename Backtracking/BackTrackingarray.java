public class BackTrackingarray {
    public static void changeArr(int arr[] , int i, int val) {
        //basecase 
        if(i == arr.length) {
            printArr(arr) ;
            return ;
        }
        //recursion
        arr[i] = val ;
        changeArr(arr,i+1,val+1) ;
        arr[i] = arr[i] - 2 ; //backtracking jab return krte hai to upar ki dono line to already run
                              // ho chuki hai ab sirf ye hi run hogi jis se values update hogi
    }
    public static void printArr(int arr[]) {
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ") ;
        }
    }
    public static void main(String args[]) {

        int arr[] = new int[5] ;
        changeArr(arr,0,0) ;
        printArr(arr) ;
    }
}