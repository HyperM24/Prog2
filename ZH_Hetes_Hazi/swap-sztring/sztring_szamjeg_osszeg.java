package asdasds;

public class sztring_szamjeg_osszeg {

    public static int szamjeg_osszeg(String s) {

        int osszeg = 0;

        for (char c : s.toCharArray()) {
            osszeg += Character.getNumericValue(c);
        }

        return osszeg;

    }

    public static void main(String[] args) {

        String s = "90146852";

        System.out.println("Számjegyek összege: " + szamjeg_osszeg(s));

    }
}
