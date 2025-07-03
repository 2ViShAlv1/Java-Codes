public class FindPermutations {

    public static void findPermutations(String str, String ans) {

        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion 
        for(int i = 0 ; i<str.length() ; i++) {

            char curr = str.charAt(i) ;

            //we will delete the char which is already gone to ans string using substring func

           String newStr = str.substring(0, i) + str.substring(i+1);//used to delete char

           findPermutations(newStr, ans+curr);
        }
    }
    public static void main(String args[]) {

        String str = "abc";

        findPermutations(str, "");
    }
}