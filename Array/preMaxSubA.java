import java.util.*;
public class preMaxSubA {
    public static void maxSubArP(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prifix[] = new int[numbers.length];
        prifix[0] = numbers[0];
        for (int i = 1; i < prifix.length; i++) {
            prifix[i] = prifix[i-1] + numbers[i];
            
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < prifix.length; j++) {
                currSum = i==0?prifix[j]:prifix[j] - prifix[i-1];
                
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        System.out.println(maxSum);  
    }
     
    public static void main(String[] args) {
        int numbers[] =  {2,3,1,4,7,9};
        maxSubArP(numbers);
    } 
}
