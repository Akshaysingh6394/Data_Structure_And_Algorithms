package object;

public class copyConst {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Akshay";
        s1.roll = 19;
        s1.password = "abcd";
        s1.marks[0] = 98;
        s1.marks[1] = 96;
        s1.marks[2] = 100;
        student s2 = new student(s1);// COPY CONSTRUCTOR
        s2.marks[2] = 90;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
            
        }


    }
    
}
class student{
    String name;
    int roll;
    String password;
    int marks[];
    student(student s1){
        this.name = name ;
        this.roll = roll;
        marks = new int[3];
        this.marks = s1.marks;


    }
    student(){
        marks = new int[3];
        System.out.println("Constructor is called.....");

    }
    //>>>>>>>>>>>>>>>>>>> below this is called constructor overloading
    // student(String name){
    //     marks = new int[3];
    //     this.name = name;
    // }
    // student(int roll){
    //     marks = new int[3];
    //     this.roll = roll;
    // }

}