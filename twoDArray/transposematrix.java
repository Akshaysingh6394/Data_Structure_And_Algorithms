package array2;

public class TransposeMatrix {

    public static void printmatrix(int matrix[][]){
        // to display matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // original matrix
        printmatrix(matrix);
        
        int  col = matrix[0].length , row = matrix.length ;
        int transposematrix[][] = new int[col][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposematrix[i][j]=matrix[j][i];
            }
        }
        // transposed matrix
        printmatrix(transposematrix);
    }
}
