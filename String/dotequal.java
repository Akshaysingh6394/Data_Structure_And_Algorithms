package String;

public class dotequal {
    public static void main(String[] args) {
        String s1 = "Akshay";
        String s2 = "Akshay";// it point string which is already exist
        String s3 = new String("Akshay");
        if(s1 == s2){
            System.out.println("String are equals");
        }else{
        System.out.println("string are not equal");
        }
        if(s1.equals(s3)){// new mwthod behave like new object
            System.out.println("String are equals");
        }else{
            System.out.println("string are not equal");
        }
    }
    
}
