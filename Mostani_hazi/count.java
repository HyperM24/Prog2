import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class count {

    public static void main(String[] args) {

        String input = "input.txt";
        Map<String, Integer> szoveg = new HashMap<>();

        try {

            String line;
            BufferedReader br = new BufferedReader(new FileReader(input));

            while ((line = br.readLine()) != null) {

                String[] szavak = line.split(" ");

                for (String s : szavak) {

                    if (szoveg.containsKey(s)) {
                        szoveg.put(s, szoveg.get(s) + 1);
                    } else {
                        szoveg.put(s, 1);

                    }

                }

            }

            br.close();

            int max = 0;
            String word = "";

            for (String s : szoveg.keySet()) {

                int szam = szoveg.get(s);

                if (szam > max) {
                    max = szam;
                    word = s;
                }

            }

            System.out.println("A legtobbet elofordulo szo: " + word + " " + max);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
