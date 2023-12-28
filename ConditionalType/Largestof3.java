package ConditionalType;

public class Largestof3 {

    public static void main(String[] args) {
        int A = 6;
        int B = 8;
        int C = 3;
        if(A>B  &&  A>C){
            System.out.println("A is greatest of all");
        }else if(B>C){
            System.out.println("B is Greatest");
        }else{
            System.out.println("C is greatest");
        }
    }
    
}
