public class reverseBroute {
    public static void reverse(int num[]){
        for (int i = num.length - 1 ; i >= 0; i--) {
            System.out.print(num[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        reverse(num);
    }
    
}
