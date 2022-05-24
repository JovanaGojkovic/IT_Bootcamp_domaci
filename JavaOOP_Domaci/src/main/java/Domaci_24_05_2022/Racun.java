package Domaci_24_05_2022;

public class Racun {
//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//    metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    private String brRacuna;
    private String osoba;
    private double stanje;

    public Racun(String brRacuna, String osoba, double stanje) {
        this.brRacuna = brRacuna;
        this.osoba = osoba;
        this.stanje = stanje;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public String getOsoba() {
        return osoba;
    }

    public void setOsoba(String osoba) {
        this.osoba = osoba;
    }

    public double getStanje() {
        return stanje;
    }
    public boolean promeniStanjeNaRacunu(int promena){
        if (this.stanje + promena < 0){
            System.out.println("Stanje racuna ne moze biti negativno");
            return false;
        }else {
            stanje = stanje + promena;
            return true;
        }
    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.osoba + " - " + this.brRacuna);
        System.out.println("Stanje na racunu je: " + this.getStanje() + "rsd");
    }


}
