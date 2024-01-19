package object;

public class Constructor {
    public static void main(String[] args) {
        Akshay ak = new Akshay("abc");
        System.out.println(ak.id);
    }
    
}
class Akshay{
    String id;
    int salary;
    Akshay(String id){
        this.id = id;
    }
}
