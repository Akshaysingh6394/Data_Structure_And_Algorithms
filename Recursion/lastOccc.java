package Recursion;

public class lastOccc {
    public static int lastOccurance(int arr[] , int key, int i){
        if(i == arr.length){//out of array length
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,8,5,9};
        System.out.println(lastOccurance(arr, 5, 0));
    }
    
}
