
 class UpperCase {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        // Capitalize the first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Process the rest of the string
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(' '); // Append the space
                i++; // Move to the next character
                sb.append(Character.toUpperCase(str.charAt(i))); // Capitalize the next character
            } else {
                sb.append(str.charAt(i)); // Append the character as-is
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "boht marunga";

        System.out.print(touppercase(str));
    }
}
