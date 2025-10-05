package RECURSION;

public class find_max {

    public static int max(int arr[]){
        return solver_function(arr, arr.length);
    }

    private static int solver_function(int arr[], int n){
    

        if(n == 0) return arr[0];

        int sabse_bada = solver_function(arr,n-1);

        if(arr[n-1] > sabse_bada) return arr[n-1];
        
        else{
            return sabse_bada;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,88,5};
        int result = max(arr);
        System.out.println(result);
    }
}
