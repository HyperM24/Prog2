public class TeglalapTest {
    public static void main(String[] args) {
        testTeglalap();
        System.out.println("done");
    }

    private static void testTeglalap() {
        Teglalap t1 = new Teglalap(1, 2);
        assert t1.kerulet() == 6;

        Teglalap t2 = new Teglalap(2.5, 3.5);
        assert t2.kerulet() == 12;

        Teglalap t3 = new Teglalap(0, 0);
        assert t3.kerulet() == 0;

        Teglalap t4 = new Teglalap(-1, 2);
        assert t4.kerulet() == 2;

        Teglalap t5 = new Teglalap(1, 2);
        assert t5.terulet() == 2;

        Teglalap t6 = new Teglalap(2.5, 3.5);
        assert t6.terulet() == 8.75;

        Teglalap t7 = new Teglalap(0, 5);
        assert t7.terulet() == 0;

        Teglalap t8 = new Teglalap(-1, 2);
        assert t8.terulet() == -2;
    }

}
