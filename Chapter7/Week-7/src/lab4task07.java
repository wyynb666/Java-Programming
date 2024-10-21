public class lab4task07 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num 1 is " + num1
                            + " and num 2 is " + num2);
        swap(num1, num2);

        System.out.println("After invoking the swap method, num 1 is " + num1
                + " and num 2 is " + num2);
    }

    public static void swap(int num1, int num2) {
        System.out.println("\tInside the swap method");
        System.out.println("\tBefore swapping, n1 is " + num1 + " and n2 is " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\tAfter swapping, n1 is " + num1 + " and n2 is " + num2);
    }
}
