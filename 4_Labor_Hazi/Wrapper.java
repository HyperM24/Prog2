public class Wrapper {
    public static void main(String[] args) {

        System.out.println("Character osztály metódusok:");

        // 1. isDigit(char ch)
        char ch1 = '5';
        System.out.println("A '" + ch1 + "' számjegy? " + Character.isDigit(ch1));

        // 2. toUpperCase(char ch)
        char ch2 = 'a';
        System.out.println("A '" + ch2 + "' nagybetűs változata: " + Character.toUpperCase(ch2));

        System.out.println("----------------------------------");

        // Integer osztály metódusok
        System.out.println("Integer osztály metódusok:");

        // 1. parseInt(String s)
        String numberStr = "123";
        int number = Integer.parseInt(numberStr);
        System.out.println("A string '" + numberStr + "' egész számra konvertálva: " + number);

        // 2. toString(int i)
        int number2 = 456;
        String numberString = Integer.toString(number2);
        System.out.println("A szám " + number2 + " string változata: " + numberString);

        System.out.println("----------------------------------");

        // Double osztály metódusok
        System.out.println("Double osztály metódusok:");

        // 1. parseDouble(String s)
        String doubleStr = "123.45";
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("A string '" + doubleStr + "' double-ra konvertálva: " + doubleValue);

        // 2. isNaN(double v)
        double nanValue = 0.0 / 0.0; // 0 osztva 0-val, ami NaN-t ad
        System.out.println("A " + nanValue + " NaN? " + Double.isNaN(nanValue));

        System.out.println("----------------------------------");

        // Boolean osztály metódusok
        System.out.println("Boolean osztály metódusok:");

        // 1. parseBoolean(String s)
        String trueStr = "true";
        boolean booleanValue = Boolean.parseBoolean(trueStr);
        System.out.println("A string '" + trueStr + "' boolean-ra konvertálva: " + booleanValue);

        // 2. logicalAnd(boolean a, boolean b)
        boolean a = true;
        boolean b = false;
        boolean result = Boolean.logicalAnd(a, b);
        System.out.println("A " + a + " és " + b + " logikai ÉS eredménye: " + result);
    }
}
