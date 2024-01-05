package Function;

public class product {
    public static int mul(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        //product P = new product();
        //P.mul(2,3);
        int prod = mul(2,3);
        System.out.println(prod);
    }
    
}
