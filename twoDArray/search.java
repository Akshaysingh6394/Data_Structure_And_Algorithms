package twoDArray;

import java.util.Scanner;

public class search {
    public static boolean searchElement(int matrix[][] , int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.println(i+" "+j);
                    return true;
                }
            }           
        }
    return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();               
            }           
        }
        //OUTPUT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");    
            }
            System.out.println();
        }
        searchElement(matrix, 5);

        
    }
        
    }
    

