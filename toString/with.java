package toString;

public class with {
    public static void main(String args[]){  
        Studen s1=new Studen(101,"Raj","lucknow");  
        Studen s2=new Studen(102,"Vijay","ghaziabad");  
          
        System.out.println(s1);//compiler writes here s1.toString()  
        System.out.println(s2);//compiler writes here s2.toString()  
      } 
    
}
class Studen{  
    int rollno;  
    String name;  
    String city;  
     
    Studen(int rollno, String name, String city){  
    this.rollno=rollno;  
    this.name=name;  
    this.city=city;  
    }  
      
    public String toString(){//overriding the toString() method  
     return rollno+" "+name+" "+city;  
    }  
     
}  