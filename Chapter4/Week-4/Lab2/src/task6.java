import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        double weight, height;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        weight = sc.nextDouble();
        System.out.print("Enter the height in inches: ");
        height = sc.nextDouble();

        double weightInKilograms = weight * 0.45359237;
        double heightInMeters = height * 0.0254;

        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is %.2f\n", bmi);
    }
}

