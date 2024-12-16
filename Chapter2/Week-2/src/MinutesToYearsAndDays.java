import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        long years = minutes / (365 * 24 * 60);
        long days = minutes % (365 * 24 * 60) / (24 * 60);

        System.out.printf("%d minutes is approximately %d years and %d days%n", minutes, years, days);

        scanner.close();
    }
}
