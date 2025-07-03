public class GridwaysTrick {

    public static int fact(int n) {
        
        if(n == 0) {
            return 1 ;
        }
        return n*fact(n-1) ;
    }

    public static int gridWays(int n , int m) {

        int totalcharf = fact((n-1)+(m-1)) ;

        int nm1f = fact(n-1) ;

        int mm1f = fact(m-1);

        return (totalcharf)/(nm1f*mm1f) ;

    }
    public static void main(String[] args) {
        
        int n = 4 ; 
        int m = 4 ;

        System.out.print(gridWays(n, m));

    }
}
