package Domaci_19_05_2022;

public class SmartAirConditioning {
    public String marka;
    public int dokHladi;
    public int dokGreje;
    public int temperatura;
    public String mood;

    public void stampaj() {
        System.out.println(this.marka + " " + this.mood + " " + this.temperatura);
        System.out.println("Mesecna potrosnja je: " + this.mesecnaPotrosnja() + " KW, " +
                "a vas racun je: " + this.potroseniNovac() + " dinara");
    }

    public int mesecnaPotrosnja() {
        if (mood.equals("greje")) {
            return 30 * 15 * dokGreje;
        } else {
            return 30 * 15 * dokHladi;
        }
    }

    public int potroseniNovac() {
        if (mesecnaPotrosnja() < 350) {
            return mesecnaPotrosnja() * 6;
        } else {
            return mesecnaPotrosnja() * 9;
        }
    }
}

