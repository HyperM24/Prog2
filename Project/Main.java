import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba: Kérlek adj meg egy könyvtárat!");
            return;
        }

        File rootDir = new File(args[0]);
        if (!rootDir.isDirectory()) {
            System.out.println("Hiba: Az adott fájl nem egy könyvtár!");
            return;
        }

        HtmlGenerator htmlGenerator = new HtmlGenerator(rootDir);
        DirectoryProcessor processor = new DirectoryProcessor(rootDir, htmlGenerator);

        try {
            processor.process();
            System.out.println("HTML fájlok sikeresen generálva.");
        } catch (IOException e) {
            System.out.println("Hiba történt a fájlok generálása közben: " + e.getMessage());
        }
    }
}
