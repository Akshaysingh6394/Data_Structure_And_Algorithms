package BitManupulate;

public class decToBin {
    public static void decToBin(int decNumber){
        int pow = 0 ;
        int binNumber = 0;
        while(decNumber > 0){
            int rem = decNumber%2;
            binNumber = binNumber + rem*(int)Math.pow(10,pow);
            pow++;
            decNumber = decNumber/2;


        }
        System.out.println(binNumber);
    }
    public static void main(String[] args) {
        int decNumber = 8;
        decToBin(decNumber);
        
    }
    
}
