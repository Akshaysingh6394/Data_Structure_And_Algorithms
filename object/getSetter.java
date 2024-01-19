package object;
public class getSetter {
    public static void main(String[] args) {
        BankAccount bnk = new BankAccount();
        bnk.userName = "Akshay Singh";
        System.out.println(bnk.userName);
        bnk.setPassword("abcdefgi");
        System.out.println(bnk.getPassword());       
    }  
}
class BankAccount{
    public String userName;
    private String password;
    void setPassword(String pwd){
        password = pwd;
    
    }
    public String getPassword(){
        return this.password;
    }  
}