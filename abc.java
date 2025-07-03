public class abc {
    public static void main(String args[]) {

        int n = 4 ; 
        int i = 1 ;
        int j = 1 ;

        while(i <= 4) {
            j = 1 ;

            do {
                System.out.print(j) ;
                j++ ; 
            }
            while(j <= i );
            System.out.println();
            i++;
        }
    }
}