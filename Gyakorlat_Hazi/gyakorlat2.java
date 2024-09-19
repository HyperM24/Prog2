public class gyakorlat2 {

public static int negyzetosszeg(int n){
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i * i;
    }
    
    return sum;

}

public static int osszegnegyzet(int n){
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum * sum;
}

    public static void min(String[] args) {
        
        int n = 100;

        int negyossz = negyzetosszeg(n);
        int ossznegy = osszegnegyzet(n);

        int kulonbseg = ossznegy - negyossz;

        System.out.println("A négyzetösszeg: " + negyossz);
        System.out.println("A Összeg négyzete: " + ossznegy);
        System.out.println("A különbség: " + kulonbseg);

    }
}