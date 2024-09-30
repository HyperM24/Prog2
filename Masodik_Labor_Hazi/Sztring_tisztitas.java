public class Sztring_tisztitas {

    public static String cleanString(String input) {
        return input.replaceAll("\\s+", "");

    }

    public static void main(String[] args) {
        String elso = "192.20.246.138:\n 6666";
        String masodik = "206.130.99.82:\n8080";

        System.out.println("Tisztított Sztring1: " + cleanString(elso));
        System.out.println("Tisztított Sztring2: " + cleanString(masodik));
    }
}
