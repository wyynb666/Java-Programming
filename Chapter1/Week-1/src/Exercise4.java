public class Exercise4 {
    public static final int birth = 7;
    public static final int death = -13;
    public static final int immigrant = 45;
    public static final int population = 312032486;

    public static void main(String[] args) {
        double time = 5 * 365 * 24 * 60 * 60;
        int p = birth + death + immigrant;

        int newPopulation = population+ (int)time / p;
        System.out.println(newPopulation);
    }
}
