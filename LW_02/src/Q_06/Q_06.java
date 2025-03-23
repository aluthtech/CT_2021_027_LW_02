package Q_06;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Q_06 {
    public static void main(String[] args) {
        // Today
        GregorianCalendar  today = new GregorianCalendar();
        System.out.println(today.getTime());
        int currentYear = today.get(GregorianCalendar.YEAR);

        // User bron day
        Scanner S6 = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        int birthYear = S6.nextInt();

        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be " + age + " in this year.");

        S6.close();
    }
}
