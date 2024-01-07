package Pattern2;

public class floydTriangle {
    public static void floydTr(int N){
        int counter = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
              System.out.print(counter+" ");
              counter++;
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floydTr(5);
    }
    
}
