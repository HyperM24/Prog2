import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class ZHGenerator {

    private static final Random r = new Random();

    private static final int row = 10;
    private static final int column = 15;

    public static int randint(int also, int felso) {
        int veletlen = r.nextInt(also, felso + 1);
        return veletlen;
    }

    public static char randChar() {
        int rand = randint(0, 2);

        if (rand == 0) {
            return 'a';
        }

        if (rand == 1) {
            return 'b';
        } else {
            return 'c';
        }

    }

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter("output.txt", StandardCharsets.UTF_8);) {

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {

                    writer.print(randChar() + "" + randint(0, 9) + " ");

                }
                writer.println();
            }

        } catch (Exception e) {
            System.err.println(e);
        }

    }

}
