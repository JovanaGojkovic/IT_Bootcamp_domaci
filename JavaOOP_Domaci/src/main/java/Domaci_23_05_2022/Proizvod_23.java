package Domaci_23_05_2022;

public class Proizvod_23 {
//    (Za vezbanje) Kreirati klasu Proizvod koja ima:
//    sifru proizvoda
//    naziv proizvoda
//    cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//    konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//    gettere i settere za sifru i naziv
//    setter za cenu po kilogramu
//    metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//    metodu getCenaLb koja vraca cenu za 1lb prozvoda
//    konverzija: 1 kg = 2.2046 lb
//    metodu koja stampa proizvod u formatu:
//            (sifra) - (naziv)
    private int sifraProizvoda;
    private String naziv;
    private double cenaPoKg;

    Proizvod_23(int sifraProizvoda, String naziv, double cenaPoKg){
        this.sifraProizvoda = sifraProizvoda;
        this.naziv = naziv;
        this.cenaPoKg = cenaPoKg;
    }

    public int getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(int sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKg(double cenaPoKg) {
        this.cenaPoKg = cenaPoKg;
    }
    public double getCenaKg(){
        return this.cenaPoKg;
    }
    public double getCenaLb(){
        return this.cenaPoKg * 2.2046;
    }
    public void stampaj(){
        System.out.println("(" + this.sifraProizvoda + ")" + " - " + "(" + this.naziv + ")");
    }
}

