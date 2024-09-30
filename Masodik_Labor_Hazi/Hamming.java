public class Hamming {

    private Hamming() {

    }

    public static int tavolsag_szamolas(String s1, String s2) {
        if (s1.length() != s2.length()) {

            return -1;
        }

        int tavolsag = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                tavolsag++;
            }
        }

        return tavolsag;
    }

    public static void main(String[] args) {
        String s1 = "toned";
        String s2 = "roses";
        int hamming_tavolsag = Hamming.tavolsag_szamolas(s1, s2);

        if (hamming_tavolsag == -1) {
            System.out.println("A két sztring hossza nem egyezik, így a Hamming-távolság nem értelmezhető.");
        } else {
            System.out.println("A Hamming-távolság: " + hamming_tavolsag);
        }
    }
}
