import java.util.Scanner;

public class ComputeChangeWithMonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an amount in cents, e.g., 1156 for 11 dollars and 56 cents: ");
        int amountInCents = scanner.nextInt();

        int dollars = amountInCents / 100;
        int cents = amountInCents % 100;

        System.out.println("Your amount is equivalent to " + dollars + " dollars and " + cents + " cents");

        scanner.close();
    }
}