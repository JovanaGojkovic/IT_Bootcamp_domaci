package Domaci_30_05_2022;

import Domaci_26_05_2022.Reakcija;

import java.util.ArrayList;

public class Student {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
    private String brojIndeksa;
    private String imeIPrezimeStudenta;
    private String tipStudija;
    private ArrayList<Ispit> nizIspita = new ArrayList<Ispit>();

    public Student(String brojIndeksa, String imeIPrezimeStudenta, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getNizIspita() {
        return nizIspita;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIPrezimeStudenta() {
        return imeIPrezimeStudenta;
    }

    public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
        this.imeIPrezimeStudenta = imeIPrezimeStudenta;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
    public void dodajIspit(Ispit ispit){
        nizIspita.add(ispit);
    }
    public double racunajProsek(){

        ArrayList<Integer> nizPolozenih = new ArrayList<>();
        double zbirOcena = 0;
        for (int i = 0; i <nizIspita.size() ; i++) {
            Ispit ispit = nizIspita.get(i);
            if (ispit.polozenIspit()){
                zbirOcena += ispit.getOcena();
                nizPolozenih.add(i);
            }
        }
        return zbirOcena / nizPolozenih.size();
    }
    public void stampaj(){
        System.out.println(this.brojIndeksa + " - " + this.imeIPrezimeStudenta + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < nizIspita.size(); i++) {
            Ispit ispit = nizIspita.get(i);
            System.out.println(ispit.getNazivPredmeta() + " - " + ispit.getImeIPrezimeProfesora() + " - " + ispit.getOcena());
        }
        System.out.println("Prosecna ocena je: " + racunajProsek());
    }
}
