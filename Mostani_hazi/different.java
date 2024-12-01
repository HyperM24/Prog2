import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class different {

    public static void main(String[] args) {

        String input = "input.txt";
        Set<String> szoveg = new HashSet<>();

        try {

            String line;
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            while ((line = br.readLine()) != null) {

                String[] szavak = line.split(" ");

                for (String s : szavak) {
                    szoveg.add(s);
                }

            }
            br.close();

            System.out.println("Kulonbozo szavak szama: " + szoveg.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
