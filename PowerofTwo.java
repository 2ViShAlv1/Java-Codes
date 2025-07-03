public class PowerofTwo {
    public static boolean ispoweroftwo(int n) {

        return (n&(n-1)) == 0 ;
    }
    public static void main(String args[]) {

        System.out.print(ispoweroftwo(11)) ;
    }
}