import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the integer input

        // Check if number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        scanner.close(); // Close the scanner
    }
}
