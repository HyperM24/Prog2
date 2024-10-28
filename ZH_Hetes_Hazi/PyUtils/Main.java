public class Main {

    public static void main(String[] args) {

        String name = PyUtils.input("Neved: ");
        System.out.printf("Hello %s!\n", name);

        System.out.println("--------------");

        String name2 = PyUtils.input();
        System.out.printf("Hello %s!\n", name2);

    }
}
