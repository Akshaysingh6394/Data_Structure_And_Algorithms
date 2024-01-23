package Recursion;

public class tiling {
    public static int tilingPro(int n){
        if(n == 0 || n ==1 ){
            return 1;
        }
        int fnm1 = tilingPro(n-1);
        int fnm2 = tilingPro(n-2);
        int totalWay = fnm1 + fnm2;
        return totalWay;

    }
    public static void main(String[] args) {
        System.out.println(tilingPro(4));
        
    }
    
}
