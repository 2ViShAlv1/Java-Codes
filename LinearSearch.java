public class LinearSearch {
    public static int linearSearch(int numbers[] , int key) {
        for(int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] == key) {
                return i ;
            }
        } return -1 ;

    }
    public static void main(String args[]) {
        int numbers[] ={1, 2, 3, 4, 5, 6, 7 } ;
        int key = 4 ;
        int index = linearSearch(numbers , key) ;
        if(index == -1) {
            System.out.print("ab kya jaan hi lega") ;
        }else {
            System.out.print(index) ;
        }
        
        
    }
}