import java.util.ArrayList;
import java.util.List;

class MinMax {
    private final int min;
    private final int max;

    public MinMax(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}

public class Tobb_ertek_visszaadas {

    public static MinMax minMax(List<Integer> szamok) {
        int min = szamok.get(0);
        int max = szamok.get(0);

        for (int szam : szamok) {
            if (szam < min) {
                min = szam;
            }
            if (szam > max) {
                max = szam;
            }
        }
        return new MinMax(min, max);
    }

    public static void main(String[] args) {
        List<Integer> szamok = new ArrayList<>(List.of(5, 6, 3, 9, 4, 2, 7, 99, 1));
        MinMax minMaxEredmeny = minMax(szamok);
        System.out.println("Minimum: " + minMaxEredmeny.getMin() + ", Maximum: " + minMaxEredmeny.getMax());
    }
}
