import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int Seconds = sc.nextInt();

        int minutes = Seconds / 60;
        int remainingSeconds = Seconds % 60;

        System.out.println(minutes + "   " + remainingSeconds );
    }
}
