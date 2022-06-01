package Domaci_31_05_2022_Igrac;

public class MainKlasa {
    public static void main(String[] args) {
       // U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
        Igrac igrac1 = new Igrac("Petar Petrovic", "123456", 1987, 22, "Odbrana", true);
        Igrac igrac2 = new Igrac("Laza Lazic", "369852", 2000, 10, "Golman", false);

        Trener trener1 = new Trener("Mika Mikic", "7412258", 1978, 10,"Kondicioni trener");
        Trener trener2 = new Trener("Zika Zikic", "963258", 1985, 5, "Pomocni trener");

        igrac1.stampaj();
        System.out.println("-----------");
        igrac2.stampaj();
        System.out.println("-----------");
        System.out.println("-----------");
        trener1.stampaj();
        System.out.println("-----------");
        trener2.stampaj();
    }
}
