import java.util.Scanner;

public class PondAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the pond
        System.out.print("Enter the radius of the pond (in meters): ");

        // Read the radius from the user
        double radius = scanner.nextDouble();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Calculate the area of the pond
        double area = calculatePondArea(radius);

        // Display the result
        System.out.println("The area of the pond is: " + area + " square meters");
    }

    // Function to calculate the area of a circular pond
    public static double calculatePondArea(double radius) {
        // Use the formula A = πr^2 to calculate the area
        return Math.PI * Math.pow(radius, 2);
    }
}
