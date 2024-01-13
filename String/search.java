package String;

public class search {
    public static boolean searchElement(String str,char Ele){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == Ele){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "AKshay";
        char Ele = 'h';
        System.out.println(searchElement(str, Ele));
        
    }
    
}
