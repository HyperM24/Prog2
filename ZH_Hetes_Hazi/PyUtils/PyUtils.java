import java.util.Scanner;

public class PyUtils {

    public PyUtils() {

    }

    public static String input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static String input(String s1) {
        System.out.println(s1);
        return input();
    }

}
