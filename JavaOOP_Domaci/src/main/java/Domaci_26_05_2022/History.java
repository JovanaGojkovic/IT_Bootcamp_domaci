package Domaci_26_05_2022;

import java.util.ArrayList;

public class History {
//    Klasu History koja ima:
//    niz stranica koje su posecene
//    metoda otvori stranicu koja dodaje novi historypage u niz.
//    metodu obrisi prema linku - metoda koja iz niza izbacuje stranicu prema linku
//    metoda obrisi kolacice za link - metoda koja za homepage brise kolacice
//    metoda obrisi istoriju - metoda brise celu istoriju
//    metoda sacuvajKredencija - od parametara se prima naziv stranice i username i password koji se cuvaju.
//    metoda pogledajIstoriju - stampa sve posecene stranice
//    metoda obrisiSveKolacice - metoda brise kredencijale za sve stranice.
//    metoda obrisiSveKolaciceZaSadnjihSatVremena-  brise kolacice za strnaice koje su ucitane u zadnjih
//    sat vremena. Metoda kao parametar prima trenutno vreme (sat i minut)

    ArrayList<HistoryPage> nizStranica = new ArrayList<HistoryPage>();

    public void otvoriStranicu(HistoryPage historyPage) {
        nizStranica.add(historyPage);
    }

    public void obrisiPremaLinku(String link) {
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getLinkDoStranice().equals(link)) {
                nizStranica.remove(i);
            }
        }
    }
    public void obrisiKolaciceZaLink(HistoryPage historyPage){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getUsername().equals(historyPage.getUsername()) &&
                trenutnaStranica.getPassword().equals(historyPage.getPassword())) {
                trenutnaStranica.obrisiKolacice();
            }
        }
    }
    public void obrisiIstoriju(){
        nizStranica.clear();
    }
    public void sacuvajKredencijal(String imeStranice, String username, String password){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getImeStranice().equals(imeStranice)){
                trenutnaStranica.sacuvajKredencijale(username, password);
            }
        }
    }
    public void pogledajIstoriju(){
        for (int i = 0; i < this.nizStranica.size(); i++) {
            HistoryPage hp = this.nizStranica.get(i);
            hp.stampaj();
        }
        System.out.println("Trenutno prikazano: " + this.nizStranica.size() + " stranica.");
    }
    public void obrisiSveKolacice(){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            trenutnaStranica.obrisiKolacice();
        }
    }
    public void obrisiSveKolaciceZaSadnjihSatVremena(int trenutniSat, int trenutniMinut){
        for (int i = 0; i < nizStranica.size(); i++) {
            HistoryPage trenutnaStranica = nizStranica.get(i);
            if (trenutnaStranica.getSatOtvaranja() >= (trenutniSat - 1) &&
                    trenutnaStranica.getMinutOtvaranja() > trenutniMinut){
                trenutnaStranica.obrisiKolacice();
            }
        }
    }
}

