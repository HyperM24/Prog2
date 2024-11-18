public class Main2Test {
    public static void main(String[] args) {
        testProduct();
        System.out.println("done");
    }

    private static void testProduct() {
        assert product() == 1;

        assert product(2) == 2;

        assert product(2, 5) == 10;

        assert product(2, 5, 10) == 100;

        assert product(2, 5, 10, 3) == 300;
    }

    private static int product(int... args) {
        int p = 1;
        for (int n : args) {
            p *= n;
        }
        return p;
    }
}
