public class sorting {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};

    
        double average = calculateAverage(array);

        
        System.out.println("Average of the array: " + average);
    }

    
    public static double calculateAverage(int[] array) {
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }


        return (double) sum / array.length;
    }
}
