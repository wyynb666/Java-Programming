import java.util.Scanner;

public class EnergyCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double massOfWater = scanner.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double energyNeeded = massOfWater * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("The energy needed is %.1f%n", energyNeeded);

        scanner.close();
    }
}
