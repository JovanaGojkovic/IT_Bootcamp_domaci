package Domaci_19_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("{" + this.naziv + "}" + "{" + this.cena + "}" + "{" + this.tezina + "}");
    }

    public void povecajCenu(int povecanje) {
        cena = cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popustUProcentima) {
        double popust = (cena / popustUProcentima) * 100;
        return cena - popust;
    }

    public int racunajPostarinu() {
        if (tezina <= 100) {
            return 200;
        } else if (tezina >= 101 && tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }
}

