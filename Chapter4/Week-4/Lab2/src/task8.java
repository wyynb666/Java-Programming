import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len;
        System.out.print("Enter the length of the side: ");
        len = sc.nextDouble();
        double area = 3 * Math.sqrt(3) * len * len / 2;
        System.out.printf("The area of the hexagon is: %.4f\n", area);
    }
}
