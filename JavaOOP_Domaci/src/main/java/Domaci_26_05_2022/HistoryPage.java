package Domaci_26_05_2022;

public class HistoryPage {
//    Za potrebe google istorije potrebno je kreirati sledece klase.
//    Klasu HistoryPage koja ima:
//    naziv stranice
//    link do stranice
//    vreme otvaranja stranice - sat i minut (2 atributa)
//    username i password sacuvani za ovu stranicu (kao objasnjene ovo su kao kolacici za neki sajt)
//    konstuktore koji su logicni
//    gettere i setter (username i password nemaju settere)
//    metodu sacuvaj kredencijale za ovu stranicu. Metoda kao parametre  prima username i password i setuje te atribute.
//    Metoda obrisi kolacice koja setuje username i password na null.
//    Metoda stampaj koja stampa podatke u formatu:
//    [datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
    private String imeStranice;
    private String linkDoStranice;
    private int satOtvaranja;
    private int minutOtvaranja;
    private String username;
    private String password;

    public HistoryPage(String imeStranice, String linkDoStranice, int satOtvaranja, int minutOtvaranja, String username, String password) {
        this.imeStranice = imeStranice;
        this.linkDoStranice = linkDoStranice;
        this.satOtvaranja = satOtvaranja;
        this.minutOtvaranja = minutOtvaranja;
        this.username = username;
        this.password = password;
    }

    public String getImeStranice() {
        return imeStranice;
    }

    public void setImeStranice(String imeStranice) {
        this.imeStranice = imeStranice;
    }

    public String getLinkDoStranice() {
        return linkDoStranice;
    }

    public void setLinkDoStranice(String linkDoStranice) {
        this.linkDoStranice = linkDoStranice;
    }

    public int getSatOtvaranja() {
        return satOtvaranja;
    }

    public void setSatOtvaranja(int satOtvaranja) {
        this.satOtvaranja = satOtvaranja;
    }

    public int getMinutOtvaranja() {
        return minutOtvaranja;
    }

    public void setMinutOtvaranja(int minutOtvaranja) {
        this.minutOtvaranja = minutOtvaranja;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void sacuvajKredencijale(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void obrisiKolacice(){
        this.username = null;
        this.password = null;
    }
    public void stampaj(){
        String kredencijali = "";
        if(this.username != null && this.password != null){
            kredencijali = "******";
        }
        System.out.println("[" + this.satOtvaranja + ":" + this.minutOtvaranja + "] - [" +
                this.imeStranice + "]...[" + this.linkDoStranice  + "] [" + kredencijali + "]");
    }

//    Metoda stampaj koja stampa podatke u formatu:
//    [datum] - [ naziv ]…[ link ] [Ako postoje kredencijali stampa se zvezdica pored linka]
}
