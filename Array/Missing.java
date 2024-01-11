public class Missing {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3};
        int sum = 0;
        int n = arr.length+1;
        int TS = (n*(n+1))/2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        int missNumber = TS - sum;
        System.out.println(missNumber);
    }
    
}
