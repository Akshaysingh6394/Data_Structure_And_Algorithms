package BitManupulate;

public class powOfTwo {
    public static boolean isPowofTwo(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowofTwo(16));
        System.out.println(isPowofTwo(12));
        
    }
    
}
