package ConditionalType;
import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for vote");
        }else if(age>14 && age <18){
            System.out.println("Teenegar");
        }else{
            System.out.println("Not Adult");
        }
        
    }
    
}
