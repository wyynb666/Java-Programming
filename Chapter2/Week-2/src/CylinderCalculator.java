import java.util.Scanner;

public class CylinderCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = calculateArea(radius);
        double volume = calculateVolume(area, length);

        System.out.printf("The area is %.4f\n",area);
        System.out.printf("The volume is %.1f\n",volume);

        scanner.close();
    }

    public static double calculateArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double calculateVolume(double area, double length) {
        return area * length;
    }
}
