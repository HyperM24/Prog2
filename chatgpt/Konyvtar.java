import java.util.ArrayList;
import java.util.List;

public class Konyvtar {

    private String libraryName;
    private int totalBooks;
    private int availableBooks;
    private int borrowedBooks;
    private List<String> borrowers;

    public Konyvtar(String libraryName, int totalBooks) {
        this.libraryName = libraryName;
        this.totalBooks = totalBooks;
        this.availableBooks = totalBooks;
        this.borrowedBooks = 0;
        this.borrowers = new ArrayList<String>();
    }

    public String getLibraryName() {
        return this.libraryName;
    }

    public int getTotalBooks() {
        return this.totalBooks;
    }

    public int getAvailableBooks() {
        return this.availableBooks;
    }

    public int getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public List<String> getBorrowers() {
        return borrowers;
    }

    public void borrowBook(String borrowerName) {
        if (this.availableBooks > 0) {
            borrowers.add(borrowerName);
            this.availableBooks--;
            this.borrowedBooks++;
        } else {
            System.out.println("Nincs elerheto konyv.");
        }
    }

    public void returnBook(String borrowerName) {

        if (borrowers.contains(borrowerName)) {
            borrowers.remove(borrowerName);
            this.availableBooks++;
            this.borrowedBooks--;
        } else {
            System.out.println("Kolcsonzo nem talalhato.");
        }
    }

    @Override

    public String toString() {

        return String.format("""
                -Konyvtar adatai:
                -Konyvtar neve: %s
                -Osszes konyv szama: %d
                -Elerheto konyvek szama: %d
                -Kolcsonzott konyvek szama: %d
                -Kolcsonzok: %s""",
                this.libraryName,
                this.totalBooks,
                this.availableBooks,
                this.borrowedBooks,
                borrowers.isEmpty() ? "A lista az ures" : String.join(", ", borrowers));

    }
}
