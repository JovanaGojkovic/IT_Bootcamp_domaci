package Domaci_26_05_2022;

public class Reakcija {
//    Kreirati klasu Reakcija koja ima
//    tip reakcije (smajli, like, srce)
//    ime i prezime korisnika koji je reagovao
//    gettere, settere i konstruktore

    private String reakcija;
    private String imeIPrezime;

    public Reakcija(String reakcija, String imeIPrezime) {
        this.reakcija = reakcija;
        this.imeIPrezime = imeIPrezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
}
