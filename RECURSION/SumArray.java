package RECURSION;

public class SumArray {

    public static int sum(int arr[]){
        return sumOfArray(arr, arr.length);
    }
    private static int sumOfArray(int arr[], int n){
        if(n == 0) return 0;

        return arr[n - 1] + sumOfArray(arr, n -1);
    }

    public static void main(String[] args) {
        int arr [] = {9,8,9};
        System.out.println(sum(arr));
    }
    
}