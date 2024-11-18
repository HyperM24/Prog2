public class Teglalap {

    private double a;
    private double b;

    public Teglalap(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double kerulet() {
        return 2 * (a + b);
    }

    public double terulet() {
        return a * b;
    }

}
