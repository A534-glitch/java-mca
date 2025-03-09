
import java.util.Scanner;

public class complex {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number:");
        double real1=sc.nextDouble();
        double imag1=sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number:");
        double real2=sc.nextDouble();
        double imag2=sc.nextDouble();

        double sumreal=real1+real2;
        double sumimag=imag1+imag2;
        System.out.println("Sum="+sumreal+"+"+sumimag+"i");
        sc.close();


        
    }
}