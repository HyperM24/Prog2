public class FizzBuzz {

    private int szam;

    public FizzBuzz(int szam) {
        this.szam = szam;
    }

    public void start() {
        for (int i = 1; i <= szam; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz(100);
        fb.start();
    }
}
