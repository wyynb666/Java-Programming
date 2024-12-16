import java.util.Scanner;

public class FeetToMetersConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = scanner.nextDouble(); // Read the input from user

        double meters = convertFeetToMeters(feet); // Convert feet to meters
        System.out.println(feet + " feet is " + meters + " meters"); // Display the result

        scanner.close(); // Close the scanner
    }


    public static double convertFeetToMeters(double feet) {
        final double FEET_TO_METERS_CONVERSION_FACTOR = 0.305;
        return feet * FEET_TO_METERS_CONVERSION_FACTOR;
    }
}
