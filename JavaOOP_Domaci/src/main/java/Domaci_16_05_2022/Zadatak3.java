package Domaci_16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        podaciKorisnik("0708986735081", "Jovana", "Gojkovic",1986,true);

    }
    static void podaciKorisnik (String JMBG, String IME, String PREZIME, int GodinaRodjenja, boolean aktivan){
        System.out.println("JMBG: " + JMBG);
        System.out.println("Ime: " + IME);
        System.out.println("Prezime: " + PREZIME);
        System.out.println("God. Rodjenja: " + GodinaRodjenja);
        System.out.println("Aktivan: " + aktivan);

    }
}
