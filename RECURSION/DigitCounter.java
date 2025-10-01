package RECURSION;
    import java.util.Scanner;

public class DigitCounter {

    // Recursive function to count digits in n
    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
       // int n = 123; // Example input
        // Special case: if n is 0, it has 1 digit
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(countDigits(n));
        }
    }
}

