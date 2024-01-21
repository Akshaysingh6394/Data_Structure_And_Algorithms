package Recursion;

public class sumOfNat {
    public static int sumOf(int n){
        if(n == 1){
            return 1;    
        }
        int fn = sumOf(n - 1);
        int sum = n + fn;
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOf(n));
    }
    
}
