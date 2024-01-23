package Recursion;

public class optiPower {
    public static int optimized(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimized(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2!=0){
            halfPower = a*halfPower;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 10));
    }   
}
