package Loops;
import java.util.*;
public class ReverseGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev = 0;
        while(N>0){
            int LD = N%10;
            rev = rev*10+LD;
            N=N/10;
        }
        System.out.println(rev);
        
    }
    
}
