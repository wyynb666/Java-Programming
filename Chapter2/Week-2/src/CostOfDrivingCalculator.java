import java.util.Scanner;

public class CostOfDrivingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mpg = scanner.nextDouble();

        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        double cost = (distance / mpg) * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f%n", cost);

        scanner.close();
    }
}