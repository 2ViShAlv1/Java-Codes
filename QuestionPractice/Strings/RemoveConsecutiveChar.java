public class RemoveConsecutiveChar {

    public static String remove(String s) {

        StringBuilder sb = new StringBuilder("")  ;

        if(s == null) {
            return s ;
        }

        char prev = s.charAt(0) ;
        sb.append(prev) ;

        for(int i = 1 ; i < s.length() ; i++) {

            char curr = s.charAt(i) ;

            if(prev != curr) {
                sb.append(s.charAt(i));
                prev = curr ;
            }
        }
        return sb.toString() ;
    } 
    public static void main(String args[]) {

        String s = "aabb" ;

        System.out.print(remove(s));
    }

}
