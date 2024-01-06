package Pattern2;

public class Hollow {
    public static void hollowRec(int R, int C){
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                if(i==1 || i == R || j == 1|| j== C){
                    System.out.print(("*"));
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        hollowRec(4,5);
    }

    
}
