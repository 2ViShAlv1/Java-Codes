public class Patternrectangle {

    public static void hollowrectangle(int totrows , int totcols) {
        // outerloop
        for (int i = 1 ; i <= totrows ; i++) {
        // inner loop
        for (int j = 1 ; j <= totcols ; j++) {
            if (i == 1 || i == totrows || j == 1 || j == totcols) {
                System.out.print("* ") ;
            }else {
                System.out.print("  ") ;
            }
        } System.out.println() ;

        } 
    }
    public static void main(String args[]) {
        hollowrectangle(4 , 5) ;
    }

}