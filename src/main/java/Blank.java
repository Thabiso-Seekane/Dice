import java.util.Random;

public class Blank {

    private static Random rand = new Random();

    public static void main(String[] args) {
        int num = 0;
        int[] die = new int[7];

        for (int i = 1; i <= 36000; i++) {
            num = rollDice();
            for (int n = 1; n < die.length; n++) {
                if (n == num) {
                    die[n] += 1;
                }
            }
        }

        System.out.printf("%4s %4s %4s%n", "sum ", " frequency", " percentage");
        for (int i = 1; i < die.length; i++) {
            double percent = (double) die[i] / 100;
            System.out.printf("%4d%12d %10.2f%%%n", i, die[i], percent);
        }
    }

    public static int rollDice() {
        return rand.nextInt(6) + 1;
    }

}