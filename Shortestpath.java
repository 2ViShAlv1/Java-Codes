import java.util.*;
public class Shortestpath {
    public static double shortest(String str) {

        int x = 0 ;
        int y = 0 ;

        for(int i = 0 ; i < str.length() ; i++) {

            int dir = str.charAt(i) ;
          
            //north
            if(dir == 'N') {
                y++ ;
            }
            // South 
            else if(dir == 'S') {
                y-- ;
            }
            // east 
            else if(dir == 'E') {
                x++ ;
            }
            else { 
                x-- ;
            }
        }
        int x2 = x*x ;
        int y2 = y*y ;
        return Math.sqrt(x2 + y2) ;
    } 
    public static void main(String args[]) {

        String str = "NWESSSSWEN" ;

        System.out.print(shortest(str)) ;
    }
}