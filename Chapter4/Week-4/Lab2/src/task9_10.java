import java.util.Scanner;

public class task9_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amount = sc.nextDouble();
        double value = 0;
        for (int i = 1; i <= 6; i++) {
            value = (value + amount) * (1 + 0.05 / 12);
        }
        System.out.println("After the six month, the account value is $" + value);
    }
}
