public class Main2 {

    public static void main(String[] args) {

        Konyvtar konyvtar = new Konyvtar("Campus Konyvtar", 20);
        konyvtar.borrowBook("Zsolti a béka");
        konyvtar.borrowBook("David");
        konyvtar.borrowBook("Jano a kiraly");
        konyvtar.returnBook("David");

        System.out.println(konyvtar);

    }

}
