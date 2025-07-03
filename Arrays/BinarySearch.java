public class BinarySearch {

    public static int binarySearch(int arr[], int key) {

        int start = 0 ;
        int end = arr.length-1 ;

        while(start <= end) {
            int mid = (start+end)/2 ;

            if(arr[mid] > key) {
                end = mid-1 ;
            }
            else if(arr[mid] == key) {
                return key ;
            }
            else  {
                start = mid+1 ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 4, 5 ,6, 7, 8, 9} ;
        int key = 6 ;
        System.out.println(binarySearch(arr, key));
    }
}