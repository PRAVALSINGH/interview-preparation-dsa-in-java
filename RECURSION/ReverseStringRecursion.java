package RECURSION;

public class ReverseStringRecursion {
    
    // Recursive function
    static String reverse(String str) {
        // Base case
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + result);
    }
}

