package Domaci_23_05_2022;

public class Vaga {
//    Kreirati klasu Vaga koja ima:
//    merna jedinica (kg ili lb)
//    proizvod (proizvod koji se meri)
//    TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//    default-ni konstuktor
//    getteri i setteri za sve atribute
//    metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
//    Na racunanje cene utice i merna jedinica na koju je vaga podesena.
//    metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//            (sifra) - (naziv)
//            (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//    Ukupno: (ukupna cena)
    private String mernaJed;
    private Proizvod_23 proizvod_23;

    public Vaga(){

    }

    public String getMernaJed() {
        return mernaJed;
    }

    public void setMernaJed(String mernaJed) {
        this.mernaJed = mernaJed;
    }

    public Proizvod_23 getProizvod_23() {
        return proizvod_23;
    }

    public void setProizvod_23(Proizvod_23 proizvod_23) {
        this.proizvod_23 = proizvod_23;
    }
    public double sracunajCenu(double tezina){
        if (mernaJed.equals("lb")){
            return this.proizvod_23.getCenaLb() * tezina;
        }return this.proizvod_23.getCenaKg() * tezina;
    }
    public void stampajRacun(double tezina){
        System.out.println("(" + this.proizvod_23.getSifraProizvoda() + ")" + " - " + "(" + this.proizvod_23.getNaziv() + ")");
        if (mernaJed.equals("lb")) {
            System.out.println(this.proizvod_23.getCenaLb() + " " + this.mernaJed + " X " + tezina );
        }else {
            System.out.println(this.proizvod_23.getCenaKg() + " " + this.mernaJed + " X " + tezina );
        }
        System.out.println("Ukupno: " + this.sracunajCenu(10));
    }
}
