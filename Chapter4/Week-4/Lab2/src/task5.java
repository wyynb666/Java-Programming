import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        double subtotal, gratuityRate;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = sc.nextDouble(); gratuityRate = sc.nextDouble();
        double gratuity = subtotal * gratuityRate * 0.01;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
