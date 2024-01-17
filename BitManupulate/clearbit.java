package BitManupulate;

public class clearbit {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
    
}
