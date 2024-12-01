import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicate {

    public static void main(String[] args) {

        List<Integer> szamok = List.of(5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5);

        Set<Integer> rendezett = new HashSet<>(szamok);

        List<Integer> eredmeny = new ArrayList<>(rendezett);
        Collections.sort(eredmeny);

        System.out.println(eredmeny);

    }

}
