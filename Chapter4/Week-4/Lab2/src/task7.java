import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter the miles per gallon:  ");
        double fuelEfficiency = sc.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double pricePerGallon = sc.nextDouble();

        double totalCost = (distance / fuelEfficiency) * pricePerGallon;
        System.out.printf("The cost of the trip is: $%.2f\n", totalCost);
    }
}
