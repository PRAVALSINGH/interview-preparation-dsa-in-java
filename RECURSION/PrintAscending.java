/*
  print number from 1 to N
  in recursion data are stored in STACK and stack perform LIFO
 */

package RECURSION;

public class PrintAscending {
    static void printNumber(int n){
        if(n == 0) return ;
        printNumber(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumber(n);
    }
}
