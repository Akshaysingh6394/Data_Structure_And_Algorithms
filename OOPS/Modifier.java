package OOPS;

public class Modifier {
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
    public void setPassword(String pwd){
        password = pwd;
    
    }
    public String getPassword(){
        return password;
    }
}
