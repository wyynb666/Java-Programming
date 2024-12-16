import java.util.Scanner;

public class RunwayLengthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入速度和加速度
        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble();
        double a = input.nextDouble();

        // 计算最小跑道长度
        double length = Math.pow(v, 2) / (2 * a);

        // 显示结果
        System.out.printf("The minimum runway length for this airplane is %.3f meters\n", length);

        input.close();
    }
}
