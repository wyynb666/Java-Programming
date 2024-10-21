public class lab4task05 {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        int n = 5;
        nPrintln(message, n);
    }
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
