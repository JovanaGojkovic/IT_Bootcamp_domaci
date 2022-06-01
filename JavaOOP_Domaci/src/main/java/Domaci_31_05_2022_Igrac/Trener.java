package Domaci_31_05_2022_Igrac;

public class Trener extends Osoba{
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.

    private int godineIskustva;

    public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIprezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    private String tipTrenera;

    @Override
    public void stampaj(){
        System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja + ", Godine iskustva: " + this.godineIskustva
                            + ", Tip trenera: " + this.tipTrenera);
    }
}
