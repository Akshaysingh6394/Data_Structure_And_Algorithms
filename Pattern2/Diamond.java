package Pattern2;

public class Diamond {
    public static void printDiamond(int n) 
    { 
        int space = n - 1; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = 0; i < n; i++) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i+1 stars 
            for (int j = 0; j <= i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space--; 
        } 
      
        // Repeat again in 
        // reverse order 
        space = 0; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print("* "); 
      
            System.out.print("\n"); 
            space++; 
        } 
    } 
    public static void main(String[] args) {
        printDiamond(6);
    }
      
    
}
