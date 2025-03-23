package Q_08;
import java.util.Scanner;
public class Q_08 {
    public static void main(String[] args) {
        // user input
        Scanner S8 = new Scanner(System.in);

        // Get the radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = S8.nextDouble();

        // Pi
        final double PI = 3.14;

        // Calculation
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);

        // Display the result
        System.out.println("The volume of the sphere is: " + volume);

        S8.close();
    }
}
