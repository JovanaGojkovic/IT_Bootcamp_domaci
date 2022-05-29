package Domaci_26_05_2022;

import java.util.ArrayList;

public class FacePost {
//    Kreirati klasu FacebookPost koja ima:
//    ime i prezime korisnika koji je stavio oglas
//    tekst objave
//    niz reakcija
//    metodu reaguj, koja dodaje reakciju u niz
//    modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post (tj. postoji rekacija
//    korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
//    Primer: Milan - lajkuje
//    Nemanja - lajkuje
//    Milan - daje srce
//    Post ima lajk od Nemanje i srce od Milana.
//    privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//    metodu stampaj koja stampa podatke u formatu:
//    ime i prezime
//    tekst objave
//    Smajli 10 | Like 15 | Srce 2
    ArrayList<Reakcija> nizRaakcija = new ArrayList<Reakcija>();
    private String postAutor;
    private String tekstObjave;

    public ArrayList<Reakcija> getNizRaakcija() {
        return nizRaakcija;
    }

    public void setNizRaakcija(ArrayList<Reakcija> nizRaakcija) {
        this.nizRaakcija = nizRaakcija;
    }

    public String getPostAutor() {
        return postAutor;
    }

    public void setPostAutor(String postAutor) {
        this.postAutor = postAutor;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public void reaguj(Reakcija reakcija){
        for (int i = 0; i < nizRaakcija.size() ; i++) {
            Reakcija prethodnaReakcija = nizRaakcija.get(i);
            if (prethodnaReakcija.getImeIPrezime().equals(reakcija.getImeIPrezime())){
                nizRaakcija.remove(i);
            }
        }
        nizRaakcija.add(reakcija);
    }
    private int brojReakcija(String tipReakcije){
        int brojac = 0;
        for (int i = 0; i < nizRaakcija.size(); i++) {
            if (tipReakcije.equals(nizRaakcija.get(i).getReakcija())){
                brojac ++;
            }
        }
        return brojac;
    }
    public void stampaj(){
        int brojSmajlija = brojReakcija("smajli");
        int brojLajkova = brojReakcija("lajk");
        int brojSrca = brojReakcija("srce");

        System.out.println(this.postAutor);
        System.out.println(this.tekstObjave);
        System.out.println("Smajli: " + brojSmajlija + " | " + "Broj lajkova: " + brojLajkova + " | " + "Broj srca: " + brojSrca);
    }
}
