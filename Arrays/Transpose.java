// just make a new arr and declare the size of rows equal to the size of col in the old arr
// and size of col equal to size of rows from the old arr
public class Transpose {

    public static void doTranspose(int arr[][], int row , int col){

        int narr[][] = new int[col][row];

        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col ; j++) {
                narr[j][i] = arr[i][j] ;
            }
        }
        for(int j = 0 ; j < narr.length ; j++) {
            for(int i = 0 ; i < narr[0].length ; i++) {
                System.out.print(narr[j][i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3},{4, 5, 6}};
        int row = arr.length ;
        int col = arr[0].length ;

        doTranspose(arr, row, col);
    }
}