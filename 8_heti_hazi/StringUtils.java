public class StringUtils {

    public static String randomcase(String s1) {

        StringBuilder new_s = new StringBuilder();
        double random = Math.random();


        for (char c : s1.toCharArray()) {

            random = Math.random();

            if (random < 0.5) {

                new_s.append(Character.toLowerCase(c));

            } else {
                new_s.append(Character.toUpperCase(c));
            }

        }
        return new_s.toString();
    }

}