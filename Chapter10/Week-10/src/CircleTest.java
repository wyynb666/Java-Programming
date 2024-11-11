public class CircleTest {
    public static void main(String[] args) {
        Circle circle_1 = new Circle();
        System.out.println("The area of the circle of radius " + circle_1.radius + " is " + circle_1.getArea());

        Circle circle_2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle_2.radius + " is " + circle_2.getArea());

        Circle circle_3 = new Circle(125);
        System.out.println("The area of the circle of radius " + circle_3.radius + " is " + circle_3.getArea());

        circle_2.radius = 100;
        System.out.println("The area of the circle of radius " + circle_2.radius + " is " + circle_2.getArea());
    }

    static class Circle {
        double radius;

        Circle() {
            radius = 1;
        }

        Circle(double newRadius) {
            radius = newRadius;
        }

        double getArea() {
            return Math.PI * radius * radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        void setRadius(double newRadius) {
            radius = newRadius;
        }
    }
}
