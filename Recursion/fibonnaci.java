package Recursion;

public class fibonnaci {
    public static int fibo(int n){
        // if(n == 0){
        //     return 0;
        // }
        // if(n == 1){
        //     return 1;
        // }
        if(n == 0 || n ==1){
            return n;
        }
        int fbnm1 = fibo(n - 1);
        int fbnm2 = fibo(n - 2);
        int fbn = fbnm1 + fbnm2;
        return fbn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fibo(n));
    }
    
}
