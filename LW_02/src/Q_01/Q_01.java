package Q_01;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Q_01 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);

        // Getting A
        System.out.print("Enter A :");
        double A = S1.nextDouble();

        // Getting B
        System.out.print("Enter B number :");
        double B = S1.nextDouble();

        // Getting C
        System.out.print("Enter C number :");
        double C = S1.nextDouble();

        double result = Math.sqrt(Math.pow(B, 2) + (4 * A * C));
        /* Display the result */
        System.out.println("a. The result of (B^2 + 4AC) is: " + result);

        // Getting X
        System.out.print("Enter X :");
        double Y = S1.nextDouble();

        // Getting Y
        System.out.print("Enter Y number :");
        double X = S1.nextDouble();

        double result1 = Math.sqrt(X + 4 * Math.pow(Y, 3));
        // Display the result
        System.out.println("b. The result of (X+4Y^3) is: " + result1);

        // cube root of the product of X and Y
        double cube_root = Math.pow(X * Y, 1.0/3.0);
        System.out.println("c. The cube root of the product of X and Y: " + cube_root);

        // Get radius input from the user
        System.out.print("Enter the radius of the circle: ");
        double radius = S1.nextDouble();

        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result
        System.out.println("d. The area of the circle is: " + area);

        S1.close();
    }
}
