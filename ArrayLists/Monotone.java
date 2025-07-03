import java.util.ArrayList;

public class Monotone {

    public static boolean isMonotone(ArrayList<Integer> list) {

        boolean isIncreasing = true ;
        boolean isDecreasing = true ;

        for(int i = 0 ; i < list.size() ; i++) {

            for(int j = i+1 ; j < list.size() ; j++) {

                if(list.get(i) > list.get(j)) {
                    isIncreasing = false ;
                }
                if(list.get(i) < list.get(j)) {
                    isDecreasing = false ;
                }
            }
        }
        return isDecreasing || isIncreasing ;   
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>() ;

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(4);

        System.out.println();
    }
}
