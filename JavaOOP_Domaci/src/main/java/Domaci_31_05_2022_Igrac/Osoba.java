package Domaci_31_05_2022_Igrac;

public class Osoba {
//    Kreirati klasu Osoba koja ima:
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
    protected String imeIprezime;
    protected String jmbg;

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIprezime, String jmbg, int godinaRodjenja) {
        this.imeIprezime = imeIprezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj(){
        System.out.println(this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }
}
