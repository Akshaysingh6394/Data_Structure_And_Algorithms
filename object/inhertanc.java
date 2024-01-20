package object;
public class inhertanc {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.eat();
    }
    
}
class Animal{
    Animal(){
        System.out.println("Animal constructor calling");
    }
    void eat(){
        System.out.println("eat everything");
    }
}
class Horse extends Animal{
    
    void legs(){
        System.out.println("four legs");
    }
}
