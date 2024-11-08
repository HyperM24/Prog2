import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class animes {

    public static void main(String[] args) {

        List<String> sorok = FileUtils.readLines("animes.txt");
        List<String> ertekeles = new ArrayList<String>();
        List<String> david = new ArrayList<String>();
        List<String> mecha = new ArrayList<String>();

        int count = 0;

        for (String s : sorok) {

            String[] hugeci = s.split(":");

            String nev = hugeci[0].trim();
            String tipus = hugeci[1].trim();
            Double malscore = Double.parseDouble(hugeci[2].trim());
            Boolean david_lattae = Boolean.parseBoolean(hugeci[3].trim());

            if (malscore > 8.0) {

                ertekeles.add(nev);
                count++;
            }

            if (david_lattae) {
                david.add(nev);
            }

            if (tipus.equals("Mecha")) {
                mecha.add(nev);
            }
        }

        System.out.println(
                "8.0 nagyobb ertekeles: " + String.join(", ", ertekeles) + "\n" + "Hany darab: " + count + "\n");
        System.out.println("David latta: " + String.join(", ", david) + "\n");
        System.out.println("Mecha animek: " + String.join(", ", mecha));

    }

}
