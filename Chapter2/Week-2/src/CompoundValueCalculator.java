import java.util.Scanner;

public class CompoundValueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: $");
        double savings = input.nextDouble();

        double accountValue = 0;
        final double MONTHLY_INTEREST_RATE = 0.00417;

        for (int month = 1; month <= 6; month++) {
            accountValue += savings;
            accountValue *= (1 + MONTHLY_INTEREST_RATE);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", accountValue);
    }
}