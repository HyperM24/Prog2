import java.util.List;

public class TestVerem {
    public static void main(String[] args) {
        testVeremSize();
        testVeremIsEmpty();
        testVeremAppend();
        testVeremPop();
        testVeremToString();
        testVeremPopEmpty();
        System.out.println("done");
    }

    private static void testVeremSize() {
        Verem verem = new Verem();
        assert verem.size() == 0;
        verem.append(10);
        assert verem.size() == 1;
        verem.append(20);
        assert verem.size() == 2;
    }

    private static void testVeremIsEmpty() {
        Verem verem = new Verem();
        assert verem.isEmpty();
        verem.append(10);
        assert !verem.isEmpty();
    }

    private static void testVeremAppend() {
        Verem verem = new Verem();
        verem.append(5);
        verem.append(10);
        verem.append(15);
        assert verem.size() == 3;
    }

    private static void testVeremPop() {
        Verem verem = new Verem();
        verem.append(5);
        verem.append(10);
        verem.append(15);

        int popped = verem.pop();
        assert popped == 15;
        assert verem.size() == 2;
    }

    private static void testVeremToString() {
        Verem verem = new Verem();
        verem.append(5);
        verem.append(10);
        verem.append(15);
        assert verem.toString().equals("[5, 10, 15");
    }

    private static void testVeremPopEmpty() {
        Verem verem = new Verem();
        try {
            verem.pop();
            assert false;
        } catch (IndexOutOfBoundsException e) {
            assert true;
        }
    }
}
