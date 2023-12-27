public class Logical {
    public static void main(String[] args) {
        int A = 4;
        int B = 7;
        int C = 3;
        if(A<B && C<B){
            System.out.println("Both are true");
        }
        else if(A<B  && C>B){
            System.out.println("both are not equal");
        }
        else if(A>B || B>C){
            System.out.println("a true or b true then print true");
        }
        else if(A!=B){
            System.out.println("perform not gate");
        }
        else{
            System.out.println("This is all about logical operator");
        }
    }
    
}
