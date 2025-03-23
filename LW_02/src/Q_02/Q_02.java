package Q_02;
import java.util.Scanner;
public class Q_02 {
    public static void main(String[] args) {
        Scanner S2 = new Scanner(System.in);

        // Get input
        System.out.print("Enter length in centimeters: ");
        double CM = S2.nextDouble();

        // Conversion
        double inches = CM / 2.54; // 1 inch = 2.54 cm
        double Feet = inches/12;
        double rest_feet = inches%12;

        // Display the result
        System.out.println(CM + "cm convert to  " + Feet + " feet and " + rest_feet +" inches");

                S2.close();
    }
}
