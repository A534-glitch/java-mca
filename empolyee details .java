import java.util.*; 
import java.io.*; 

public class EmployeeFileIO { 
    public static void main(String[] args) { 
        try { 
            Scanner obj = new Scanner(System.in); 
            FileOutputStream fout = new FileOutputStream("employee2.txt"); 

            System.out.println("Enter the number of employees:"); 
            int limit = obj.nextInt(); 
            obj.nextLine(); // Clear newline

            for (int j = 0; j < limit; j++) { 
                try { 
                    // Input employee number
                    System.out.println("Enter the employee number:"); 
                    int empno = obj.nextInt(); 
                    obj.nextLine(); 
                    fout.write(String.valueOf(empno).getBytes()); 
                    fout.write("\r\n".getBytes());

                    // Input employee name
                    System.out.println("Enter the employee name:"); 
                    String empname = obj.nextLine(); 
                    fout.write(empname.getBytes()); 
                    fout.write("\r\n".getBytes());

                    // Input salary
                    System.out.println("Enter the employee salary:"); 
                    int salary = obj.nextInt(); 
                    obj.nextLine(); 
                    fout.write(String.valueOf(salary).getBytes()); 
                    fout.write("\r\n".getBytes());

                    // Optional separator
                    fout.write("-----\r\n".getBytes()); 

                } catch (InputMismatchException e) { 
                    System.out.println("Invalid input. Please enter a valid integer."); 
                    obj.nextLine(); // Clear buffer
                    j--; // Retry this employee
                } 
            } 
            fout.close(); 
        } catch (Exception e) { 
            System.out.println("Error writing to file: " + e); 
        } 

        // Read and display file contents
        try { 
            FileInputStream fin = new FileInputStream("employee2.txt"); 
            System.out.println("\nContents of the file:"); 
            int data; 
            while ((data = fin.read()) != -1) { 
                System.out.print((char) data); 
            } 
            fin.close(); 
        } catch (Exception e) { 
            System.out.println("Error reading from file: " + e); 
        } 
    } 
}
