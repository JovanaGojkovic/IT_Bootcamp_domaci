package Domaci28_04_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
// 2. Napisati program koji validira da li je uneti email validan.
// Korisnik unosi svoj email, a program ispisuje da li je validan ili ne.
// Email je obavezan, sto znaci da mora da ima bar 1 karakter
// Email u sebi mora da sadrzi @
// Email  mora da se zavrsava sa .com (Za ovu proveru koristite endWith metodu,
// Email u sebi ne sme da sadrzi specijalne karaktere * /

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vas email");
        String email = s.nextLine();
        boolean isValid = true;

        if(email.length()<1){
            System.out.println("Mail mora da bude duzi od 0 karaktera");
            isValid = false;
        }
        if(!email.contains("@")) {
            System.out.println("Mail mora da sadrzi @");
            isValid = false;
        }
        if(!email.endsWith(".com")){
            System.out.println("Mail mora da se zavrsava sa .com");
            isValid = false;
        }
        if(email.contains("*") || email.contains("/")){
            System.out.println("Mail ne sme da sadrzi specijalne karaktere");
            isValid = false;
        }

        if(isValid) {
            System.out.println("Uneli ste vaildan mail");
        }
    }
}
