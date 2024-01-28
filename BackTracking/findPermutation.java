package BackTracking;

public class findPermutation {
    public static void findpermut(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;

        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" = "ab" + "de" = abde
            String newstr = str.substring(0, i) + str.substring(i+1);
            findpermut(newstr, ans + curr);
            
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        findpermut(str, "");
    }
    
}
