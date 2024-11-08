import java.util.ArrayList;
import java.util.List;

public class Motor {

    private String marka;
    private String tipus;
    private int evjarat;
    private List<String> eddigi_tulajdonosok_nevei;
    private int eddigi_tulajdonosok_szama;
    private String motor_neve;

    public Motor(String marka, String tipus) {

        this.marka = marka;
        this.tipus = tipus;
        this.evjarat = evjarat;
        this.eddigi_tulajdonosok_nevei = new ArrayList<String>();
        this.eddigi_tulajdonosok_szama = 0;
        this.motor_neve = motor_neve;

    }

    public String getMarka() {
        return this.marka;
    }

    public String getTipus() {
        return this.tipus;
    }

    public int getEvjarat() {
        return this.evjarat;
    }

    public List<String> getEddigi_tulajdonosok_neve() {
        return eddigi_tulajdonosok_nevei;
    }

    public int getEddigi_tulajdonosok_szama() {
        return this.eddigi_tulajdonosok_szama;
    }

    public String getMotor_neve() {
        return this.motor_neve;
    }

    public void setMarka(String s) {
        this.marka = s;
    }

    public void setTipus(String s) {
        this.tipus = s;
    }

    public void setEvJarat(int i) {
        this.evjarat = i;
    }

    public void setEddigi_tulajdonosok_szama(int i) {
        this.eddigi_tulajdonosok_szama = i;
    }

    public void setMotor_neve(String s) {
        this.motor_neve = s;
    }

    public void setEddigi_tulajdonosok_nevei(List<String> s) {
        this.eddigi_tulajdonosok_nevei = s;
    }

    public void addowner(String s) {
        eddigi_tulajdonosok_nevei.add(s);
    }

    @Override

    public String toString() {
        return String.format(
                """
                        -Motor adatai:
                        -Marka: %s
                        -Neve: %s
                        -Tipusa: %s
                        -Evjarata: %d
                        -Tulajdonosok szama: %d
                        -Volt tulajdonosok: %s
                        """,
                this.marka,
                this.motor_neve,
                this.tipus,
                this.evjarat,
                this.eddigi_tulajdonosok_szama,
                eddigi_tulajdonosok_nevei.isEmpty() ? "Nem volt elozo tulajdonosa"
                        : String.join(", ", eddigi_tulajdonosok_nevei));
    }

}
