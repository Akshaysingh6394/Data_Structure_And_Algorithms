package String;
import java.lang.*;

public class subString {
    public static void subStrings(String str, int si, int ei){
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);           
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str = "HelloWord";
        subStrings(str, 0, 5);

    }
    
}
