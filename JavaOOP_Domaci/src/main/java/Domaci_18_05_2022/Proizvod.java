package Domaci_18_05_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public static void stampaj (String naziv,double cena, double tezina){
        System.out.println("{" + naziv + "}" + "{" + cena + "}" + "{" + tezina + "}" );
    }
}
