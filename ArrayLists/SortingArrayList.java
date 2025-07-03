import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        System.out.println(list);

        // ascending order sorting

        Collections.sort(list);
        System.out.println(list);

        //descneding order

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
