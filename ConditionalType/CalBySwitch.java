package ConditionalType;
import java.util.*;
public class CalBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter value a: ");
        int A = sc.nextInt();
        System.out.println("Enter value B: ");
        int B = sc.nextInt();
        System.out.println("Choose Operator: ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.println(A+B);
            break;
            case '*' : System.out.println(A*B);
            break;
            case '/' : System.out.println(A/B);
            break;
            case '%' : System.out.println(A%B);
            break;
            case '-' : System.out.println(A-B);
            break;
            default : System.out.println("operator not valid");
            break;

        }


        
    }
    
}
