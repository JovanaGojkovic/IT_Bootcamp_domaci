package Domaci_31_05_2022_Karton;

import java.util.ArrayList;

public class Igrac extends Osoba {
    //    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    niz kartona
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu dodaj karton, gde se dodaje karton u niz
//    metodu koja vraca broj zutih kartona
//    metodu koja vraca broj crvenih kartona
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int brojIgraca;
    private String pozicijaIgraca;
    private boolean jesteKapiten;

    public int getBrojIgraca() {
        return brojIgraca;
    }

    public void setBrojIgraca(int brojIgraca) {
        this.brojIgraca = brojIgraca;
    }

    public String getPozicijaIgraca() {
        return pozicijaIgraca;
    }

    public void setPozicijaIgraca(String pozicijaIgraca) {
        this.pozicijaIgraca = pozicijaIgraca;
    }

    public boolean isJesteKapiten() {
        return jesteKapiten;
    }

    public void setJesteKapiten(boolean jesteKapiten) {
        this.jesteKapiten = jesteKapiten;
    }

    public Igrac() {

    }

    public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicijaIgraca, boolean jesteKapiten) {
        super(imeIprezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijaIgraca = pozicijaIgraca;
        this.jesteKapiten = jesteKapiten;
    }

    private ArrayList<Karton> nizKartona = new ArrayList<Karton>();

    public ArrayList<Karton> getNizKartona() {
        return nizKartona;
    }

    public void setNizKartona(ArrayList<Karton> nizKartona) {
        this.nizKartona = nizKartona;
    }

    public void dodajKarton(Karton karton) {
        nizKartona.add(karton);
    }

    public int izbrojiKartone(String tipKartona) {
        int brojac = 0;
        for (int i = 0; i < nizKartona.size(); i++) {
            Karton karton1 = nizKartona.get(i);
            if (karton1.getTipKartona().equals(tipKartona)) {
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public void stampaj() {
        if (jesteKapiten) {
            System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " +
                    this.pozicijaIgraca + " Kapiten tima " + ", Broj zutih kartona: " +
                    this.izbrojiKartone("zuti") + ", Broj crvenih kartona:"
                    + this.izbrojiKartone("crveni"));

        } else {
            System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " +
                    this.pozicijaIgraca + ", Broj zutih kartona: " +
                    this.izbrojiKartone("zuti") + ", Broj crvenih kartona:"
                    + this.izbrojiKartone("crveni"));
        }
    }
}

