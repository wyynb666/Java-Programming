import java.util.Scanner;

public class CelsiusToFahrenheitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

        scanner.close();
    }
}