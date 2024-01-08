public class linearSearch {
    public static int linearSearc(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {12,2,43,67,43,10,13,};
        int key = 10;
        int index = linearSearc(numbers, key);
        if(index == -1){
            System.out.println("not present key in array");
        }
        System.out.println(index);
        
    }
    
}
