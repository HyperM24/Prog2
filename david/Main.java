public class Main {

    public static void main(String[] args) {

        Motor motor = new Motor("Yamaha", "r7");
        motor.setEvJarat(2003);
        motor.setEddigi_tulajdonosok_szama(2);
        motor.setMotor_neve("Yamaha-v10");
        motor.addowner("Kovacs Janos");
        motor.addowner("Zsolti a beka");
        System.out.println(motor);

    }

}
