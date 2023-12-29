package Loops;

public class ReversePrint {
    public static void main(String[] args) {
        int num = 10899;
        while(num>0){
            int LastDigit = num%10;
            System.out.print(LastDigit);
             num = num/10;
        }
        
       

    }
    
}
