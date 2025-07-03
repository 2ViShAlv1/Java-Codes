public class Minsizesubarraysum {
    public static int minsubarray(int arr[] , int target) {

        int sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++) {

            for(int j = 0 ; j < arr.length ; j++) {

                for(int k = i ; k <= j ; k++) {

                    sum = sum + arr[k] ;

                    if(sum == 7) {
                        return arr[i] ; 
                        
                    }
                } 
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6} ;
        int target = 7 ;
        System.out.print(minsubarray(arr, target));
    }
}
