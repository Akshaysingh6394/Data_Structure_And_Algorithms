package BackTracking;

public class subset {
    public static void findSubset(String str,String ans,int i){
        if(i == str.length()){
            if(ans.length() == 0){
            System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // YES
        findSubset(str, ans+str.charAt(i), i+1);
        //NO
        findSubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
    
}

