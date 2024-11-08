import java.util.Scanner;

public class ascii {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy szoveget majd egy szamot!");
        String szoveg = scanner.nextLine();
        int szam = scanner.nextInt();
        scanner.close();

        int ascii = (int) szoveg.charAt(0);

        int osszeg = 0;

        for (char c : szoveg.toCharArray()) {
            osszeg += (int) c;
        }

        if (ascii * szam == osszeg) {
            System.out.println("Igen megegyezik!");
        } else {
            System.out.println("Nem egyezik meg!");
        }

    }

}
