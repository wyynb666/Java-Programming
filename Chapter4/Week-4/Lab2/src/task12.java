import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer ");
        int INT = sc.nextInt();
        if(INT % 5 == 0) {
            System.out.println("HiFive");
        }
        else if(INT % 2 == 0) {
            System.out.println("HiEven");
        }
        else {
            System.out.println("NO");
        }
    }
}
