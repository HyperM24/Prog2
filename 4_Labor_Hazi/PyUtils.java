import java.util.ArrayList;
import java.util.List;

public class PyUtils {
    private PyUtils() {

    }

    public static List<Integer> range(int veg) {
        return range(0, veg, 1);
    }

    public static List<Integer> range(int kezdet, int veg) {
        return range(kezdet, veg, 1);
    }

    public static List<Integer> range(int kezdet, int veg, int lepes) {
        List<Integer> result = new ArrayList<>();

        if (lepes <= 0) {
            System.out.println("A lépésköz pozitív kell legyen.");

        }

        if (kezdet < veg) {
            for (int i = kezdet; i < veg; i += lepes) {
                result.add(i);
            }
        }

        return result;
    }
}
