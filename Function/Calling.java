package Function;
import java.util.*;
public class Calling {
    public static void CalculateSum(int A, int B){     
        int sum = A+B;
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int A = sc.nextInt();
        int B = sc.nextInt();
        CalculateSum(7,8);
    }
    
}
