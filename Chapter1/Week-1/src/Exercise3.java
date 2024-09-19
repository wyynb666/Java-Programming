public class Exercise3 {
    public static void main(String[] args) {
        double width = 4.5, height = 7.9;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println(String.format("%.2f", area) + "\n" + String.format("%.2f", perimeter));
    }
}
