public class Primenofunctions {

    public static boolean isprime(int n) {
         boolean  isprime = true ;
        for (int i = 2 ; i <= n-1 ; i++) {
            if (n % i == 0) {
                return false ;
            }
        }return true ;
    }

    public static void main(String args[]) {
        System.out.print(isprime(11)) ;
    }
}