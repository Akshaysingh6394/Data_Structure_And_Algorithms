package BitManupulate;

public class evenOdd {
    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
      
        evenOrOdd(13);
        evenOrOdd(6);
        evenOrOdd(7);
        
    }
    
}
