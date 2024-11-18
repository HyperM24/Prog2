public class TipuskonverziokTest {
    public static void main(String[] args) {
        Tipuskonverziok();

        System.out.println("done");
    }

    private static void Tipuskonverziok() {

        String long_type = "123";
        long long_converted = Long.parseLong(long_type);
        assert long_converted == 123;

        String float_type = "3.14";
        float float_converted = Float.parseFloat(float_type);
        assert float_converted == 3.14f;

        String double_type = "7.89";
        double double_converted = Double.parseDouble(double_type);
        assert double_converted == 7.89;

        String char_type = "a";
        char char_converted = char_type.charAt(0);
        assert char_converted == 'a';

    }

}
