import java.util.Random;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // RandomUtils
        for (int i = 0; i < 5; i++) {

            System.out.println(RandUtils.randint(70, 72));

        }

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {

            System.out.println(RandUtils.randrange(70, 72));
        }

        System.out.println("\n");

        int result = RandUtils.choice(List.of(1, 2, 3, 4, 5, 6));
        System.out.println("Random valasztott szam a listabol: " + result);

    }

}
