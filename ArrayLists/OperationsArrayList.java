import java.util.ArrayList;

public class OperationsArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();

        // add element operation 

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // add element without removing other 

        list.add(1, 9);
        System.out.println(list);

        // get element operation 
        System.out.println(list.get(2));

        // remove element operation

        list.remove(2);
        System.out.println(list);

        // set element operation

        list.set(2, 10);
        System.out.println(list);

        // contains operation

        System.out.println(list.contains(1));
        System.out.println(list.contains(5));

    }
}
