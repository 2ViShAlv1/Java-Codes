public class Maxproductsubarray {

    public static int maxproductsubarray(int arr[]) {

        int max = 0 ;
        int currp = 1 ;

        for(int i = 0 ; i < arr.length ; i++) {
            currp = 1 ;
            for(int j = 0 ; j < arr.length ; j++) {
                currp = 1 ;
                for(int k = i ; k <= j ; k++) {

                    currp = currp*arr[k] ;
                }
                if(currp < 0) {
                    currp = 0 ;
                }
                if(currp > max) {
                    max = currp;
                }
            }
        }
        return  max ;
    }
    public static void main(String[] args) {
        
        int arr[] = {-2, 0, -1} ;
        System.out.println(maxproductsubarray(arr));
    }
}
