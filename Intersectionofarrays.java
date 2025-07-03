public class Intersectionofarrays {

    public static int[] intersection(int nums1[] , int nums2[]) {

        int index = 0 ;
        int arr[] = new int[nums2.length];

        for(int i = 0 ; i < nums1.length ; i++) {
            for(int j = 0 ; j < nums2.length ; j++) {

                if(nums1[i] == nums2[j]) {

                    arr[index] = nums1[i] ;
                    index++ ;
                }
            }
        }
        return arr ;
    }
    public static void main(String[] args) {
        
        int nums1[] = {1, 2, 3, 4} ;
        int nums2[] = {3, 4, 5} ;

        System.out.print(intersection(nums1, nums2)) ;
    }
}