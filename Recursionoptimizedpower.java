public class Recurison {
    public static int optimizedpower(int x, int n) {

        if(n == 1) {
            return x ;
        }

        int halfpower = optimizedpower(x,n/2) ;
        int halfpowersq = halfpower*halfpower ;

        if(n % 2 != 0) {
            halfpowersq = x*halfpowersq ;
        }
        return halfpowersq ;
    }
    public static void main(String args[]) {
        
        int x = 3;
        int n = 2 ;

        System.out.print(optimizedpower(x,n)) ;
    }
}