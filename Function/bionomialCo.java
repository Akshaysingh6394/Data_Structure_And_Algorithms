package Function;

public class bionomialCo {
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
            
        }
        return f;
    }
    public static int bionomialCoff(int n, int r){
        int a = factorial(n);// WE USE FACTORIAL FUNCTION AS A HELPER FUNCTION
        int b = factorial(r);
        int c = factorial(n-r);
        int BC = a/(b*c);
        return BC;
    }
    public static void main(String[] args) {
        System.out.println(bionomialCoff(5,2));
    }
    
}

    

