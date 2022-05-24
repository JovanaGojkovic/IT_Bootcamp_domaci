package Domaci_24_05_2022;

public class TransakcijaMain {
    public static void main(String[] args) {

        Racun posiljalac = new Racun("123456","Jovana Gojkovic", 5000);
        Racun primalac = new Racun("987456", "Dragan Gojkovic", 1500);

        Transakcija prva = new Transakcija("1239",posiljalac,primalac);
        prva.izvrsiTransakciju(5000);
        primalac.stampaj();
        posiljalac.stampaj();
    }
}
