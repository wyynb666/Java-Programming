import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // 计算每个员工的总工作小时数
        int[][] totalHours = new int[hours.length][2];
        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i][0] = i; // 记录员工编号
            totalHours[i][1] = sum; // 记录总小时数
        }

        // 按总小时数递减排序
        Arrays.sort(totalHours, (a, b) -> Integer.compare(b[1], a[1]));

        // 打印结果
        System.out.println("Employee Total Hours");
        for (int[] e : totalHours) {
            System.out.println(e[0] + "\t\t " + e[1]);
        }
    }
}
