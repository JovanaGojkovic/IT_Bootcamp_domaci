package Domaci_24_05_2022;

import java.util.Random;

public class Transakcija {
//    Kreirati klasu Transakcija koja ima:
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije
//    se unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
//    (Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//    metodu koja stampa podatke o transakciji u formatu:
//    id transkacije
//    Racun sa: Ime i prezime  -  broj racuna
//    Racun na: Ime i prezime  -  broj racuna
    private String idTransakcije;
    private Racun posljalac;
    private Racun primalac;

    public Transakcija(String idTransakcije, Racun posljalac, Racun primalac) {
        this.idTransakcije = idTransakcije;
        this.posljalac = posljalac;
        this.primalac = primalac;
    }

    public String getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(String idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getPosljalac() {
        return posljalac;
    }

    public void setPosljalac(Racun posljalac) {
        this.posljalac = posljalac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }
    private double provizija(int visinaTransakcije){
        if (visinaTransakcije < 4500){
            return 45;
        }else {
            return visinaTransakcije / 100;
        }
    }
    public void izvrsiTransakciju(int vrednost){
        if (this.posljalac.promeniStanjeNaRacunu(vrednost * -1)){
            this.primalac.promeniStanjeNaRacunu(vrednost);
        }
    }

}
