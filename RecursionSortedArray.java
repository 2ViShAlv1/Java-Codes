public class RecursionSortedArray {
    public static boolean sorted(int array[] , int i) {

        if(i == array.length-1) {
            return true ;
        }
        
        if(array[i] > array[i+1]) {
            return false ;
        }
        return sorted(array , i+1) ;
    }
    public static void main(String args[]) {

        int array[] = {1, 2, 3, 4, 6, 5} ;

        System.out.print(sorted(array, 0)) ;
        
    }
}