public class reverse {
    public static void reverseArray(int num[]){
        int first = 0;
        int last = num.length - 1;
        while(first<last){
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        reverseArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            
        }
        System.out.println();
        
    }
    
}
