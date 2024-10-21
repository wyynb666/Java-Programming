public class lab4task04 {
    public static void main(String[] args) {
        System.out.print("The grade is "+getGrade(78.5));
        System.out.print("\nThe grade is "+getGrade(59.5));

    }

    public static char getGrade(double grade) {
        if (grade >= 90) {
           return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 60) {
            return 'D';
        }
        else
            return 'F';
    }
}
