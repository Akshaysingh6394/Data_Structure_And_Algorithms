package BitManupulate;

public class binToDecimal {
    public static void binTo(int binNumber){
        int pow = 0;
        int decNumber = 0;
        while(binNumber > 0){
            int lastDigit = binNumber % 10;
            decNumber = decNumber + (int)(lastDigit*Math.pow(2,pow));
            pow++;
            
            binNumber/=10;
        }
        System.out.println(decNumber);
    }
    public static void main(String[] args) {
        int binNumber = 1001;
        binTo(binNumber);
    }
    
}
