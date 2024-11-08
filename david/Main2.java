public class Main2 {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Hiba! Adjon meg pontosan 3 szamot!");
            System.exit(1);
        }

        for (String string : args) {

            for (char c : string.toCharArray()) {

                if (!Character.isDigit(c)) {
                    System.out.println("Hiba! Betu nem lehet!");
                    System.exit(2);
                }
            }

        }

        int szam1 = Integer.parseInt(args[0]);
        int szam2 = Integer.parseInt(args[1]);
        int szam3 = Integer.parseInt(args[2]);

        if (szam1 < 0 || szam2 < 0 || szam3 < 0) {
            System.out.println("Hiba! Nem lehet kisebb mint 0!");
            System.exit(3);
        }

        System.out.println(gula.gulaTerulet(szam1, szam2, szam3));

    }

}
