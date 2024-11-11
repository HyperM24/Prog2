public class Diamond {

    public static void Diamond_kirajz(int m) {

        // assert m % 2 != 0 : "Hiba: A gyémánt magassága csak páratlan szám lehet!";

        /*
         * if (m % 2 == 0) {
         * System.out.println("Hiba: A gyémánt magassága csak páratlan szám lehet!");
         * return;
         * }
         */

        int kozep = m / 2;

        for (int i = 0; i <= kozep; i++) {
            for (int j = 0; j < kozep - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = kozep - 1; i >= 0; i--) {
            for (int j = 0; j < kozep - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond_kirajz(7);
        Diamond_kirajz(4);
    }

}
