public class Sztring_tisztitas {

    public static String tisztitas(String input) {
        return input.replaceAll("\\s+", "");

    }

    public static void main(String[] args) {
        String elso = "192.20.246.138:\n 6666";
        String masodik = "206.130.99.82:\n8080";

        System.out.println("Tisztított Sztring1: " + tisztitas(elso));
        System.out.println("Tisztított Sztring2: " + tisztitas(masodik));
    }
}
