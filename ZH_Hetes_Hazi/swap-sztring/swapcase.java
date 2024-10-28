package asdasds;

import java.util.Scanner;

public class swapcase {

    public static String lower_upper(String s1) {

        StringBuilder asd = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (Character.isLowerCase(c)) {
                asd.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                asd.append(Character.toLowerCase(c));
            } else {
                asd.append(c);
            }
        }

        return asd.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy szöveget: ");
        String szoveg = scanner.nextLine();

        System.out.println(lower_upper(szoveg));

    }
}
