package Q_07;
import java.util.Scanner;
public class Q_07 {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner S7 = new Scanner(System.in);

        // Get weight
        System.out.print("Enter your weight in kilograms: ");
        double weight = S7.nextDouble();

        // Get height
        System.out.print("Enter your height in centimeters: ");
        double height = S7.nextDouble();

        double heightM = height / 100.0;
        // Calculate BMI using the formula
        double bmi = weight / Math.pow(heightM ,2);

        // Display the result
        System.out.println("Your Body Mass Index (BMI) is: " + bmi);

        if (bmi >= 20 && bmi <= 25) {
            System.out.println("You are underweight.");
        } else if (bmi >= 25) {
            System.out.println("You are overweight.");
        }

        S7.close();
    }
}
