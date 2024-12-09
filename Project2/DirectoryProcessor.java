import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirectoryProcessor {

    private final File rootDir;
    private final HtmlGenerator htmlGenerator;

    public DirectoryProcessor(File rootDir, HtmlGenerator htmlGenerator) {
        this.rootDir = rootDir;
        this.htmlGenerator = htmlGenerator;
    }

    public void process() throws IOException {
        processDirectory(rootDir, null); // A gyokerkonyvtar feldolgozasanak kezdese
    }

    private void processDirectory(File dir, String parentDirName) throws IOException {
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Ures konyvtar: " + dir.getName());
            htmlGenerator.generateEmptyIndexHtml(dir); // Üres könyvtár index.html generálása
            return;
        }

        // Alkonyvtarak osszegyujtese
        List<File> directories = Arrays.stream(files)
                .filter(File::isDirectory)
                .collect(Collectors.toList());

        // Kepek osszegyujtese
        List<File> images = Arrays.stream(files)
                .filter(htmlGenerator::isImageFile)
                .collect(Collectors.toList());

        // Index.html generalasa az aktualis konyvtarhoz
        htmlGenerator.generateIndexHtml(dir, directories, images, parentDirName);

        // Rekurziv feldolgozas az alkonyvtarakra
        for (File subDir : directories) {
            // Az aktualis konyvtar nevenek atadasa szulo konyvtarkent
            processDirectory(subDir, dir.getName());
        }
    }
}
