package OOPS;
public class Oops {
    public static void main(String[] args) {
        Akshay ak = new Akshay();
        ak.game("bgmi");
        System.out.println(ak.game);
        ak.hobby = "GYM";
        System.out.println(ak.hobby);
        ak.setPM(100);
        System.out.println(ak.pocket);
    }  
}
class Akshay{
    String game ;
    String hobby; 
    int pocket;
    void game ( String newgame){
        game = newgame;
    }
    void gym(String newhobby){
        hobby = newhobby;
    }
    void setPM(int newpocket){
        pocket = newpocket;
    }
}