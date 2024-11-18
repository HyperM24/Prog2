public class MyUtilsTest {
    public static void main(String[] args) {
        test_duplaz();
        test_strlen();
        System.out.println("done");
    }

    private static void test_duplaz() {
        assert MyUtils.duplaz(0) == 0;
        assert MyUtils.duplaz(1) == 2;
        assert MyUtils.duplaz(-3) == -6;
        assert MyUtils.duplaz(5) == 10;
    }

    private static void test_strlen() {
        assert MyUtils.strlen("") == 0;
        assert MyUtils.strlen("Hello") == 5;
        assert MyUtils.strlen("abc") == 3;
        assert MyUtils.strlen("javaprogram") == 11;
    }
}
