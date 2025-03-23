package Q_10;
import java.util.Scanner;
public class Q_10 {
    public static void main(String[] args) {
        // Create Scanner input
        Scanner S10 = new Scanner(System.in);

        // Get loan amount
        System.out.print("Enter the amount : ");
        double loan = S10.nextDouble();

        // Get loan period
        System.out.print("Enter the loan period (years) : ");
        double loanPeriod = S10.nextDouble();

        // Get interest rate
        System.out.print("Enter the annual interest rate in percentage: ");
        double annualInterestRate = S10.nextDouble();

        final double MONTHS_IN_YEAR = 12;

        //monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100.0) / MONTHS_IN_YEAR;

        //no of payments
        double numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        //monthly payment
        double monthlyPayment = (loan * monthlyInterestRate) / (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        //total payments
        double totalPayment = monthlyPayment * numberOfPayments;

        // Display the results
        System.out.println("Monthly payment: Rs " + "Rs " + monthlyPayment);
        System.out.println("Total payment after " + loanPeriod + " years: Rs " + totalPayment);

        S10.close();
    }
}
