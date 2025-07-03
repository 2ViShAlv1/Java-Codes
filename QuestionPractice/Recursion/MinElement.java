public class MinElement {

    public static int findMin(int arr[], int min, int i) {
        
        if(i >= arr.length) {
            return min ;
        }
        if(arr[i] < min) {
            min = arr[i] ;
        }
        return findMin(arr, min, i+1);
    }
    public static void main(String[] args) {
        
        int arr[] = {2, 3, 4, 5};
        int min = arr[0] ;
        int i = 1 ;

        System.out.println(findMin(arr, min, i));
    }
}
