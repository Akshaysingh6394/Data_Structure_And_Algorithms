import java.util.*;
public class maxSumKadans {
    public static void kdans(int num[]){
         int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < num.length; i++) {
            currSum += num[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int num[] = {2,3,1,4,7,9};
        kdans(num);
    }
   

    
}
