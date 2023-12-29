package Loops;
import java.util.*;
public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Sum = 0;
        int i = 1;
        while(i<=X){
            Sum = Sum+i;
            i++;
        }
        System.out.println(Sum);
    }
    
}
