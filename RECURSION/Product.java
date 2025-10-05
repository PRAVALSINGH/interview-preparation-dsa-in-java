package RECURSION;

public class Product {

    public static int product(int arr[]){
        return findproduct(arr, arr.length);
    }
    private static int findproduct(int arr[], int n){
        if(n == 0) return 1;

        return arr[n - 1] * findproduct(arr, n -1);
    }

    public static void main(String[] args) {
         int arr [] = {1,2,3,40,5};
        System.out.println(product(arr));
    }
}
