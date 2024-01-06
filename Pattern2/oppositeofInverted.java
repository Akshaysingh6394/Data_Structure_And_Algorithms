package Pattern2;

public class oppositeofInverted {
    public static void invertedRot(int N){
        for (int i = 1; i <= N; i++) {
            // ptinr spaces
            for (int j = 1; j <= N-i+1; j++) {
                System.out.print("*");
                
            }
            // print stars 
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRot(4);
    }
    

    
}
