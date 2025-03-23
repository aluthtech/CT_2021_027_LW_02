package Q_03;
import java.util.Scanner;
public class Q_03 {
    public static void main(String[] args) {
        Scanner S3 = new Scanner(System.in);
// Get temperature input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = S3.nextDouble();
// Convert to Fahrenheit
        double fahrenheit = (1.8 * celsius) + 32;
// Display the result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        S3.close();
    }

}
