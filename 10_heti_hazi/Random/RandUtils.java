import java.util.Random;
import java.util.List;

public class RandUtils {

    private RandUtils() {

    }

    private static final Random r = new Random();

    public static int randint(int also, int felso) {
        int intervallum = felso - also + 1;
        int veletlen = r.nextInt(intervallum);
        return also + veletlen;
    }

    public static int randrange(int also, int felso) {
        int intervallum = felso - also;
        int veletlen = r.nextInt(intervallum);
        return also + veletlen;
    }

    public static int choice(List<Integer> lista) {
        int randomIndex = r.nextInt(lista.size());
        return lista.get(randomIndex);

    }
}
