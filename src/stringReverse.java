public class stringReverse {

    // Method 1: Using StringBuilder
    public static String reverseWithStringBuilder(String str) {
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse(); // Reverse using StringBuilder
        return str2.toString();
    }

    // Method 2: Using for loop and charAt
    public static String reverseWithCharAt(String str) {
        String nstr = "";
        char ch;
        
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // Extract each character
            nstr = ch + nstr;   // Add each character in front of the existing string
        }
        return nstr;
    }

    // Method 3: Using recursion
    public static String reverseWithRecursion(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseWithRecursion(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str1 = "Automation";
        String str2 = "Geeks";
        String str3 = "Programming";

        System.out.println("Reversed (StringBuilder): " + reverseWithStringBuilder(str1));
        System.out.println("Reversed (for loop): " + reverseWithCharAt(str2));
        System.out.println("Reversed (Recursion): " + reverseWithRecursion(str3));
    }
}
