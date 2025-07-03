public class MissingInteger {
    public static int missinginteger(int arr[]) {

        for(int i = 0 ; i < arr.length ; i++) {

            int second = arr[i+1] ;
            int first = arr[i] ;

            if((second - first) != 1) { {
                return (arr[i+1])-1 ;
            }

            } 
        }
        return -1 ;
    }
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9} ;

        System.out.print(missinginteger(arr)) ;
    }
}
