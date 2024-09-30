import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        final double tax = 0.06;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchase = sc.nextDouble();
        double output = purchase*tax;

        System.out.printf("Sales tax is $: %.2f", output);
    }
}
