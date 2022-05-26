package Domaci_24_05_2022;

public class ViberReakcija {
//    Kreirati klasu ViberReakcija koja ima:
//    emoji (moze da bude sunglases, heart, smile, like ili sad)
//    korisnika koji je reagovao
    ////    POMOC: Trebace vam provera da li reakcija postoji to pravite u if-u
////    if (this.reakcija != null)

    private String emoji;
    private ViberKorisnik primalac;
    public String reakcija(){
        if (this.reakcija() != null){
            return this.reakcija();
        }
        return null;
    }

    public ViberReakcija(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberKorisnik getPrimalac() {
        return primalac;
    }

    public void setPrimalac(ViberKorisnik primalac) {
        this.primalac = primalac;
    }
}
