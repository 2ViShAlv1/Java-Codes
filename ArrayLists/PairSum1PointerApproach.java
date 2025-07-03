import java.util.ArrayList;

public class PairSum1PointerApproach {

    static boolean findPair(ArrayList<Integer>list, int rp, int lp, int target)  {

        while(lp != rp) {

            if(list.get(lp) +  list.get(rp) == target) {
                return true ;
            }
            if(list.get(lp) +  list.get(rp) < target) {
                lp++;
            }
            else {
                rp--;
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();

        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5); list.add(6);
        int rp = list.size()-1; // right most index
        int lp = 0 ; // left most index
        int target = 77 ;

        System.out.print(findPair(list, rp, lp, target));
    } 
}
