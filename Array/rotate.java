public class rotate {
    public static void reverseArray(int arr[], int first, int last){
        // int first = 0;
        // int last = arr.length - 1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        reverseArray(arr , 0 , n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    
}
