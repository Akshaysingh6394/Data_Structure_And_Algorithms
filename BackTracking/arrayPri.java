package BackTracking;

public class arrayPri {
    public static void changeArray(int arr[] , int i, int val){
        if(i == arr.length){// BASE CASE
            printArr(arr);
            return ;
        }
        arr[i] = val;
        changeArray(arr, i+1, val+1);//FNX CALLL STEP
        arr[i] = arr[i] - 2;// BACKTRACKING

    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
    
}
