package Domaci_31_05_2022_Igrac;

public class Igrac extends Osoba{
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
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

    public Igrac(){

    }
    public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int brojIgraca, String pozicijaIgraca, boolean jesteKapiten) {
        super(imeIprezime, jmbg, godinaRodjenja);
        this.brojIgraca = brojIgraca;
        this.pozicijaIgraca = pozicijaIgraca;
        this.jesteKapiten = jesteKapiten;
    }
    @Override
    public void stampaj(){
        if (jesteKapiten){
        System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " +
                            this.pozicijaIgraca + " Kapiten tima");
        }else {
        System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", " +
                            this.pozicijaIgraca );
        }
    }
}
