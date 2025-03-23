package Q_09;
import java.util.Scanner;
public class Q_09 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner S9 = new Scanner(System.in);

        // Get amount
        System.out.print("Enter the amount : ");
        double P = S9.nextDouble();

        // Get interest rate
        System.out.print("Enter the annual interest rate in percentage: ");
        double R = S9.nextDouble();

        // Get the number of years
        System.out.print("Enter the number of years : ");
        int N = S9.nextInt();

        // Calculate the amount after N years
        double amount = P * Math.pow(1 + (R / 100), N);

        // Calculate the money earned
        double money = amount - P;

        // Display the results
        System.out.println("Amount after " + N + " years: " + "Rs " + amount);
        System.out.println("Money earned after " + N + " years: " + "Rs "+ money);

        S9.close();
    }
}
