package Recursion;

public class xToPower {
    public static int optimized(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimized(a, n/2) * optimized(a, n/2);
        if(n%2!=0){
            halfPower = a*halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args) {
        System.out.println(optimized(2, 10));
        
    }
    
}
