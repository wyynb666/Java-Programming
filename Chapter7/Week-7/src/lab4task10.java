public class lab4task10 {
    // Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Generate a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Generate a random digit (0-9)
    public static char getRandomDigit() {
        return getRandomCharacter('0', '9');
    }

    // Generate a random special symbol (limited set)
    public static char getRandomSpecialSymbol() {
        String symbols = "!@#$%^&*()_+";
        return symbols.charAt((int) (Math.random() * symbols.length()));
    }

    public static void main(String[] args) {
        // Test all methods
        System.out.println("Random Lowercase Letter: " + getRandomLowerCaseLetter());
        System.out.println("Random Uppercase Letter: " + getRandomUpperCaseLetter());
        System.out.println("Random Digit: " + getRandomDigit());
        System.out.println("Random Special Symbol: " + getRandomSpecialSymbol());
    }
}
