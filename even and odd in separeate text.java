import java.io.*;
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close resources
        try (
            Scanner inputScanner = new Scanner(System.in); // For user input
            FileInputStream inputFile = new FileInputStream(getInputFileName(inputScanner)); // Open input file
            Scanner fileScanner = new Scanner(inputFile); // For reading the file
            FileOutputStream evenFile = new FileOutputStream("even.txt"); // Output file for even numbers
            FileOutputStream oddFile = new FileOutputStream("odd.txt"); // Output file for odd numbers
            PrintWriter evenWriter = new PrintWriter(evenFile); // PrintWriter for even numbers
            PrintWriter oddWriter = new PrintWriter(oddFile) // PrintWriter for odd numbers
        ) {
            while (fileScanner.hasNextInt()) {
                int number = fileScanner.nextInt();
                if (number % 2 == 0) {
                    evenWriter.println(number); // Write even numbers to the even file
                } else {
                    oddWriter.println(number);  // Write odd numbers to the odd file
                }
            }
            System.out.println("Even and odd numbers have been copied to separate files.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    
    private static String getInputFileName(Scanner inputScanner) {
        System.out.print("Enter the name of the input file: ");
        return inputScanner.nextLine();
    }
}
