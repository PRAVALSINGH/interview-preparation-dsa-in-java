
/* print nth number of fib. series
 * 
 * The sequence begins 0, 1, 1, 2, 3, 5, 8, 13, 21
 * example: Fibonacci at position 6 = 8
 */


package RECURSION;

public class Fibonacci {
    static int fib(int n ){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        
        int n = 6;
        
        System.out.println(fib(n));
    }
}
