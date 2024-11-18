public class NegyzetTest {
    public static void main(String[] args) {
        testNegyzet();
        System.out.println("done");
    }

    private static void testNegyzet() {
        Negyzet n1 = new Negyzet(1);
        assert n1.kerulet() == 4;

        Negyzet n2 = new Negyzet(2.5);
        assert n2.kerulet() == 10;

        Negyzet n3 = new Negyzet(0);
        assert n3.kerulet() == 0;

        Negyzet n4 = new Negyzet(-3);
        assert n4.kerulet() == -12;

        Negyzet n5 = new Negyzet(1);
        assert n5.terulet() == 1;

        Negyzet n6 = new Negyzet(2.5);
        assert n6.terulet() == 6.25;

        Negyzet n7 = new Negyzet(0);
        assert n7.terulet() == 0;

        Negyzet n8 = new Negyzet(-3);
        assert n8.terulet() == 9;

    }

}
