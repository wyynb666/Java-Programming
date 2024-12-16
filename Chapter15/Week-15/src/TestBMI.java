public class TestBMI {
    public static void main(String[] args) {
        BMI bmis1 = new BMI("Sam", 30, 75, 185);
        System.out.println("The BMI for " + bmis1.getName() + " is " + bmis1.getBMI() + " " + bmis1.getStatus());

        BMI bmis2 = new BMI("Babu", 75, 175);
        System.out.println("The BMI for " + bmis2.getName() + " is " + bmis2.getBMI() + " " + bmis2.getStatus());

        BMI bmis3 = new BMI("Amy", 18, 55, 160);
        System.out.println("The BMI for " + bmis3.getName() + " is " + bmis3.getBMI() + " " + bmis3.getStatus());
    }
}