package Domaci_31_05_2022_Karton;

public class Karton {
//    Kreirati klasu Karton koja ima:
//    tip kartona (crveni, zuti)
//    konstuktore za koje mislite da ce vam trebati
//    gettere i settere za karton
    private String tipKartona;

    public String getTipKartona() {
        return tipKartona;
    }

    public Karton(String tipKartona) {
        this.tipKartona = tipKartona;
    }
}
