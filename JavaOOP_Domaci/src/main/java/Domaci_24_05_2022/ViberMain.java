package Domaci_24_05_2022;

public class ViberMain {
    public static void main(String[] args) {
        public static void main(String[] args) {
            //U mainu kreirati nekoliko poruka izmedju dva korisnika i postavite nekoliko reakcija na poruke.

            ViberKorisnik posiljalac = new ViberKorisnik("Jovana Gojkovic", "0641922990", false );
            ViberKorisnik primalac = new ViberKorisnik("Dragan Gojkovic", "0641318974", true);
            ViberReakcija reakcija = new ViberReakcija(null);
            ViberPoruka prvaPoruka = new ViberPoruka("Dobar dan!", "14:52", posiljalac, primalac, reakcija);

            prvaPoruka.prikazi();
        }
    }
}
