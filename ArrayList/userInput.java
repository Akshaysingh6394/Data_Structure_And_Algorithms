import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // Create an ArrayList to store user input
        ArrayList<String> list = new ArrayList<>();

        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter elements, enter "exit" to finish
        System.out.println("Enter elements to the ArrayList (type 'exit' to finish):");
        String userInput;
        while (true) {
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(userInput);
        }

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + list);

        // Reverse the ArrayList using Collections.reverse() method
        Collections.reverse(list);

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + list);

        // Close the Scanner
        scanner.close();
    }
}
