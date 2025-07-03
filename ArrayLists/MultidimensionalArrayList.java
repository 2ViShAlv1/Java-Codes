import java.util.ArrayList;

public class MultidimensionalArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>>mainList = new ArrayList<>();

        // adding ArrayList one

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(3);
        mainList.add(list1);

        // adding ArrayList two

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(2); list2.add(4); list2.add(6);
        mainList.add(list2);

        //adding ArrayList three

        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(3); list3.add(6); list3.add(9);
        mainList.add(list3);

        for(int i = 0; i < mainList.size(); i++) { // in the mainlist at ith index whole list is stored
            ArrayList<Integer>currList = mainList.get(i);

            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+ " "); // printing elements of list
            }
            System.out.println();
        }
        System.out.print(mainList);
    }
}