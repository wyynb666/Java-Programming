import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Assuming the initial population and growth rate are provided or calculated elsewhere
        double initialPopulation = 32592969; // Example initial population
        double growthRate = 0.01; // Example growth rate as a percentage

        double futurePopulation = initialPopulation * Math.pow((1 + growthRate), numberOfYears);
        System.out.printf("The population in %d years is %.0f%n", numberOfYears, futurePopulation);

        scanner.close();
    }
}
