import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        double pay = 1000;
        if (score > 90) {
            pay *= 1.03;
        } else {
            pay *= 1.01;
        }
        System.out.println("The new pay is " + pay);
    }
}