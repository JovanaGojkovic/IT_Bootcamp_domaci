package Domaci09_05_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Za vezbanje:
        //Napisati program koji simulira apload tekstualnog fajla kroz mrezu
        //Aploadovanje fajla se ne desava iz jednog slanja, vec se podaci salju u paketima
        //Program prilikom slanja paketa mora da prikaze napredak
        //Pre pocetka programa korisnik unosi velicinu fajla za upload, velicina fajla je ukupan broj karaktera koji treba da se uploaduje
        //Zatim se unose paketi dok se ne dostigne velicina fajla. Paket je bilo koji niz karaktera
        //Na kraju programa prikazati sadrzaj aploadovanog teksutualnog fajla
        //Napomena: Ako velicina paketa predje velicinu fajla, to je okey :wink:

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite paket: ");
        int paket = s.nextInt();

        String unetiPaket = "";
        int procenatSuma = 0;
        String sadrzajFajla = "";
        boolean tacno = true;

        while (tacno) {
            System.out.println("Unesite sledeci paket: ");
            unetiPaket = s.next();
            int procenat = (unetiPaket.length() * 100) / paket;

            procenatSuma = procenatSuma + procenat;
            System.out.println("Upload je " + procenatSuma + "%");
            sadrzajFajla = sadrzajFajla + unetiPaket;

            if (procenatSuma >= 100) {
                System.out.println("Fajl je uploadovan uspesno!");
                System.out.println("Sadrzaj fajla je: " + sadrzajFajla);
                tacno = false;
            }
        }
    }
}

