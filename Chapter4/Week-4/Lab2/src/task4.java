import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        final double PI = 3.14;
        double length, radius, area, volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = sc.nextDouble();
        length = sc.nextDouble();
        area = radius * radius * PI;
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}