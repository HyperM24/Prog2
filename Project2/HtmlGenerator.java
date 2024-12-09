import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {

    private final File rootDir;

    public HtmlGenerator(File rootDir) {
        this.rootDir = rootDir;
    }

    // Index.html fájl generálása
    public void generateIndexHtml(File dir, List<File> directories, List<File> images, String parentDir)
            throws IOException {
        File indexFile = new File(dir, "index.html");
        try (FileWriter indexWriter = new FileWriter(indexFile)) {
            indexWriter.write("<html><head><style>\n");
            indexWriter.write("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
            indexWriter.write("a { text-decoration: none; color: blue; font-size: 18px; }\n");
            indexWriter.write(
                    ".start-page-link { position: fixed; top: 10px; left: 10px; font-size: 20px; font-weight: bold; }\n");
            indexWriter.write("h2 { margin-top: 20px; font-size: 22px; }\n");
            indexWriter.write("hr { margin: 20px 0; border: 0; border-top: 1px solid #ccc; }\n");
            indexWriter.write("</style></head><body>\n");

            // START PAGE link dinamikusan
            String startPagePath = getRelativePath(new File(rootDir, "index.html"), dir);
            indexWriter.write("<p><a href=\"" + startPagePath + "\" class=\"start-page-link\">START PAGE</a></p>\n");

            indexWriter.write("<br><br>\n");
            indexWriter.write("<hr>\n");

            // Könyvtárak listája
            if (parentDir != null) {
                indexWriter.write("<h2>Directories:</h2><ul>\n");
                indexWriter.write("<li><a href=\"../index.html\"><<</a></li>\n");
            } else if (!directories.isEmpty()) {
                indexWriter.write("<h2>Directories:</h2><ul>\n");
            }

            for (File subDir : directories) {
                indexWriter.write(
                        "<li><a href=\"" + subDir.getName() + "/index.html\">" + subDir.getName() + "</a></li>\n");
            }
            indexWriter.write("</ul>\n");
            indexWriter.write("<hr>\n");

            // Képek listája
            if (!images.isEmpty()) {
                indexWriter.write("<h2>Images:</h2><ul>\n");
                for (File image : images) {
                    String htmlFileName = image.getName() + ".html";
                    generateImageHtml(image, images, dir);
                    indexWriter.write("<li><a href=\"" + htmlFileName + "\">" + image.getName() + "</a></li>\n");
                }
                indexWriter.write("</ul>\n");
            }

            indexWriter.write("</body></html>");
        }
    }

    // Kép HTML fájl generálása
    public void generateImageHtml(File image, List<File> allImages, File parentDir) throws IOException {
        File imageHtmlFile = new File(image.getParentFile(), image.getName() + ".html");
        try (FileWriter writer = new FileWriter(imageHtmlFile)) {
            writer.write("<html><head><style>\n");
            writer.write("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
            writer.write("a { text-decoration: none; color: blue; font-size: 18px; }\n");
            writer.write(
                    ".start-page-link { position: fixed; top: 10px; left: 10px; font-size: 20px; font-weight: bold; }\n");
            writer.write("h1 { margin: 10px 0; display: inline; }\n");
            writer.write(".nav-links { font-size: 18px; margin-top: 10px; }\n");
            writer.write(".nav-links a { margin: 0 5px; }\n");
            writer.write("img { max-width: 100%; height: auto; display: block; margin: 20px 0; }\n");
            writer.write("</style></head><body>\n");

            // START PAGE link dinamikusan
            String startPagePath = getRelativePath(new File(rootDir, "index.html"), image.getParentFile());
            writer.write("<p><a href=\"" + startPagePath + "\" class=\"start-page-link\">START PAGE</a></p>\n");

            writer.write("<br><br>\n");
            writer.write("<hr>\n");

            // Vissza az almappába
            writer.write("<p><a href=\"index.html\">^^</a></p>\n");

            // Navigációs linkek (előző, következő kép)
            int currentIndex = allImages.indexOf(image);
            writer.write("<div class=\"nav-links\">\n");
            if (currentIndex > 0) {
                writer.write("<a href=\"" + allImages.get(currentIndex - 1).getName() + ".html\"><<</a>");
            } else {
                writer.write("<span style=\"color: grey;\"><<</span>");
            }

            writer.write("<h1>" + image.getName() + "</h1>\n");

            if (currentIndex < allImages.size() - 1) {
                writer.write("<a href=\"" + allImages.get(currentIndex + 1).getName() + ".html\">>></a>");
            } else {
                writer.write("<span style=\"color: grey;\">>></span>");
            }
            writer.write("</div>\n");

            // Kép megjelenítése kattintással a következő képhez
            if (currentIndex < allImages.size() - 1) {
                writer.write("<a href=\"" + allImages.get(currentIndex + 1).getName() + ".html\">");
                writer.write("<img src=\"" + image.getName() + "\" alt=\"" + image.getName() + "\" /></a>\n");
            } else {
                writer.write("<img src=\"" + image.getName() + "\" alt=\"" + image.getName() + "\" />\n");
            }

            writer.write("</body></html>");
        }
    }

    // Segédfüggvény a képfájlok felismeréséhez
    public boolean isImageFile(File file) {
        String[] imageExtensions = { ".jpg", ".jpeg", ".png" };
        for (String ext : imageExtensions) {
            if (file.getName().toLowerCase().endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

    // Relatív útvonal kiszámítása két könyvtár között
    private String getRelativePath(File target, File base) {
        String relativePath = base.toPath().relativize(target.toPath()).toString().replace("\\", "/");
        // Ha a relatív útvonal vége "/" karaktert tartalmaz, eltávolítjuk
        if (relativePath.endsWith("/")) {
            relativePath = relativePath.substring(0, relativePath.length() - 1);
        }
        return relativePath;
    }

    // Üres könyvtárhoz index.html generálása
    public void generateEmptyIndexHtml(File dir) throws IOException {
        File indexFile = new File(dir, "index.html");
        try (FileWriter writer = new FileWriter(indexFile)) {
            writer.write("<html><head><style>\n");
            writer.write("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }\n");
            writer.write("h1 { font-size: 22px; text-align: center; margin-top: 50px; }\n");
            writer.write("</style></head><body>\n");
            writer.write("<h1>This directory is empty.</h1>\n");
            writer.write("</body></html>");
        }
    }
}
