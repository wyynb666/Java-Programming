import java.util.Scanner;

public class TestLoan {
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        // Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // Enter loan payment
        System.out.print("Enter loan amount, for example, 12000.95: ");
        double loanAmount = input.nextDouble();
        input.close();

        // Create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                        "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}