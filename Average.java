import java.util.Scanner;


class NegativeInputException extends Exception {
    public NegativeInputException() {
        super("Negative input is not allowed.");
    }
}

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();  
        int sum = 0;
        int count = 0;  

        
        for (int i = 1; i <= N; i++) {
            try {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();

                // Check if the number is negative
                if (num < 0) {
                    throw new NegativeInputException();
                }

                sum += num;  
                count++;  

            } catch (NegativeInputException e) {
                System.out.println(e.getMessage());  
                i--;  
            }
        }

        
        if (count > 0) {
            double average = (double) sum / count;  
            System.out.println("The Average of the valid numbers is: " + average);
        } else {
            System.out.println("No valid numbers entered, cannot calculate average.");
        }

        scanner.close();  
    }
}
