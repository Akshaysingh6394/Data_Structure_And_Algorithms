public class maxSumSA {
    public static void maxSumSubArray(int num[]){
        int max = Integer.MIN_VALUE;
        int CS = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                CS = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    CS += num[j2];   
                }
                System.out.println(CS);
                if(CS>max){
                    max = CS;
                }
                
            }
            
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int num[] = {2,3,1,4,7,9};
        maxSumSubArray(num);
    }
    
}
