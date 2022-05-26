package Domaci_24_05_2022;

public class ViberPoruka {
    //    Kreirati klasu ViberPoruka koja ima:
////    tekst poruke
////    vreme kad je poslata poruka
////    korisnika koji je poslao poruku
////    korisnika kome je poslata poruka
////    gettere i setere i konstuktore
////    rekaciju na poruku
////    metodu prikazi koja stampa podatke o poruci u formatu:
////    From: [Ime i prezime korisnika] * Active Now ili Not Active - at [vreme kad je poslata]
////    To: [Ime i prezime korisnika kome je poslata]
////            [Tekst poruke] : [reakcija] from [korisnik koji je reagovao]
////    POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
////    if (this.reakcija != null)
    private String textPoruke;
    private String vremeSlanja;
    private ViberKorisnik posiljalac;
    private ViberKorisnik primalac;
    private ViberReakcija reakcija;

    public ViberPoruka(String textPoruke, String vremeSlanja, ViberKorisnik posiljalac, ViberKorisnik primalac, ViberReakcija reakcija) {
        this.textPoruke = textPoruke;
        this.vremeSlanja = vremeSlanja;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.reakcija = reakcija;
    }

    public String getTextPoruke() {
        return textPoruke;
    }

    public void setTextPoruke(String textPoruke) {
        this.textPoruke = textPoruke;
    }

    public String getVremeSlanja() {
        return vremeSlanja;
    }

    public void setVremeSlanja(String vremeSlanja) {
        this.vremeSlanja = vremeSlanja;
    }

    public ViberKorisnik getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(ViberKorisnik posiljalac) {
        this.posiljalac = posiljalac;
    }

    public ViberKorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik primalac) {
        this.primalac = primalac;
    }

    public ViberReakcija getReakcija() {
        return reakcija;
    }

    public void setReakcija(ViberReakcija reakcija) {
        this.reakcija = reakcija;
    }
    public void prikazi(){
        if (this.reakcija != null && this.posiljalac.isAktivan() == true){
            System.out.println("From: " + "[" + this.posiljalac.getImeIPrezime() + "]" + " * " + "Active now" +
                    " - " + "[" + this.vremeSlanja + "]");
            System.out.println("To: " + "[" + this.primalac.getImeIPrezime() + "]" + " " + "[" + this.textPoruke + "]" +
                    " : " + "[" + this.reakcija.getEmoji() + "]" + " " + "from: " + "[" + this.posiljalac.getImeIPrezime() + "]");

        } else if (this.reakcija != null && this.posiljalac.isAktivan() == false) {
            System.out.println("From: " + "[" + this.posiljalac.getImeIPrezime() + "]" + " * " + "Not active" +
                    " - " + "[" + this.vremeSlanja + "]");
            System.out.println("To: " + "[" + this.primalac.getImeIPrezime() + "]" + " " + "[" + this.textPoruke + "]" +
                    " : " + " " + "from: " + "[" + this.posiljalac.getImeIPrezime() + "]");
        }else{
            System.out.println();
        }
    }
}
