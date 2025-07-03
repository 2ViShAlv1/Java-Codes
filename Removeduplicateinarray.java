public class Removeduplicateinarray {

    public static void remove(int arr[]) {

        int narr[] = new int[arr.length] ;

        narr[0] = arr[0] ;
        int rd = 0 ;

        for(int i = 1 ; i < arr.length ; i++) {

            if(arr[i] != narr[rd]) {
                rd++;
                narr[rd] = arr[i] ;
            }
        }
        for(int i = 0 ; i < narr.length ; i++) {
            System.out.print(narr[i] + " ") ;
        }
    }

    
    public static void main(String[] args) {
        
        int arr[] = {1, 1, 2, 3, 4, 4, 5, 6} ;

        remove(arr);
    }
}
