import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ShowCurrentTimeWithTimeZone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();

        LocalDateTime now = LocalDateTime.now(ZoneOffset.ofHours(offset));
        System.out.println("The current time is " + now.toLocalTime().toString());

        scanner.close();
    }
}
