package Pattern2;
public class inveretdPiramid {
    public static void invertedPyramid(int N){
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N-i+1; j++) {
                System.out.print(j);
                
            }
            System.out.println();

            
        }
    }
    public static void main(String[] args) {
        invertedPyramid(5);
    }
    
}
