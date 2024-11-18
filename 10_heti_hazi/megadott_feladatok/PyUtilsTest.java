import java.util.List;
import java.util.ArrayList;

public class PyUtilsTest {
    public static void main(String[] args) {

        test_range();
        System.out.println("done");
    }

    private static void test_range() {
        assert PyUtils.range(1, 10, 2).equals(List.of(1, 3, 5, 7, 9));
        assert PyUtils.range(1, 5).equals(List.of(1, 2, 3, 4));
        assert PyUtils.range(4).equals(List.of(0, 1, 2, 3));
        assert PyUtils.range(5, 3).isEmpty();
        assert PyUtils.range(1, 10, 3).equals(List.of(1, 4, 7));

    }
}
