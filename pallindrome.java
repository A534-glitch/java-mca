import java.util.Scanner;

public class SimplePalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        scanner.close();
    }
}
