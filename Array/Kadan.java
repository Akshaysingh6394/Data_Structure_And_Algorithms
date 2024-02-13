
public class Kadan {
    public static int maximum(int[] arr , int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {-7,-2,-3,-4,-5};
        int n = arr.length;
        int maxSum = maximum(arr, n);
        System.out.println(maxSum);

    }
    
}
