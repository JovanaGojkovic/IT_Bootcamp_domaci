package Domaci_18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//        atribut za mod (hladi/greje)
//        metodu za stampu - stampa u formatu: Proizvoljno :)
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//        za svaki od njih pozvati metodu za stampu

        SmartAirConditioning prvi = new SmartAirConditioning();
        prvi.marka = "Samsung";
        prvi.temperatura = 12;
        prvi.daLiGreje = true;

        SmartAirConditioning drugi = new SmartAirConditioning();
        drugi.marka = "Midea";
        drugi.temperatura = 25;
        drugi.daLiGreje = false;

        prvi.stampaj(prvi.marka, prvi.temperatura, prvi.daLiGreje);
        drugi.stampaj(drugi.marka, drugi.temperatura, drugi.daLiGreje);
    }
}
