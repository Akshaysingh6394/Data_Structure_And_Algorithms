package ConditionalType;

public class IfIf {
    public static void main(String[] args) {
        int age = 19;

        if(age>=18){
            System.out.println("Elgibile for the vote");
        }if(age>14 && age<18){// this block of code check if write if when we write else if then if first block false then else if block chek otherwise not check 
            System.out.println("teenager age");
        }else{
            System.out.println("Not adult");
        }
    }
    
}
