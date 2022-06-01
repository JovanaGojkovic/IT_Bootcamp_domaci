package Domaci_31_05_2022_Karton;

public class MainKlasa {
    public static void main(String[] args) {
        // U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

        Karton zuti = new Karton("zuti");
        Karton crveni = new Karton("crveni");

        Igrac igrac1 = new Igrac("Pera Peric", "123456", 1999, 20, "odbrana", true);
        Igrac igrac2 = new Igrac("Mika Mikic", "987456", 2002, 17, "Golman",false);

        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(zuti);
        igrac1.dodajKarton(crveni);
        igrac2.dodajKarton(zuti);
        igrac2.dodajKarton(zuti);
        igrac2.dodajKarton(crveni);

        igrac1.stampaj();
        igrac2.stampaj();
    }
}
