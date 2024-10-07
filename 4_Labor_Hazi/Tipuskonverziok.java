public class Tipuskonverziok {
    public static void main(String[] args) {

        String long_type = "123";
        long long_converted = Long.parseLong(long_type);

        String float_type = "3.14";
        float float_converted = Float.parseFloat(float_type);

        String double_type = "7.89";
        double double_converted = Double.parseDouble(double_type);

        String char_type = "a";
        char char_converted = char_type.charAt(0);

    }
}
