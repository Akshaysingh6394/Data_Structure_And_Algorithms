package Pattern2;

public class InvertedandRotated {
    public static void invertedRot(int N){
        for (int i = 1; i <= N; i++) {
            // ptinr spaces
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
                
            }
            // print stars 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedRot(4);
    }
    
}
