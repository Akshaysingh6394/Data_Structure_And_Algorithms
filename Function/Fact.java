package Function;

public class Fact {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
            
        }
        return f;
    }
    public static int binocoff(int n , int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int bc = a/(b*c);
        return bc;
    }
    public static void main(String[] args) {
        int BCF = binocoff(5, 2);
        System.out.println(BCF);
    }
    
}
