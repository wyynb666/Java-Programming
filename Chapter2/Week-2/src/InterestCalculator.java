import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double interest = balance * monthlyInterestRate;

        System.out.printf("The interest is $%.6f%n", interest);

        scanner.close();
    }
}
