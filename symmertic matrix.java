
import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt(); // Read matrix size (assuming square matrix)
        int[][] matrix = new int[n][n];

        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        
        boolean symmetric = true;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // Check only lower triangle
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break outerLoop; // Exit immediately on mismatch
                }
            }
        }

        // Print result
        System.out.println(symmetric ? "Symmetric" : "Not Symmetric");

        sc.close();
    }
}