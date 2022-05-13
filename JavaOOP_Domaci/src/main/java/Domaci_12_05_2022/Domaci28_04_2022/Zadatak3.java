package Domaci28_04_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji validira formu za registraciju. Korisnik od informacija unosi:
//        ime
//        prezime
//        email
//        password
//        confirmPassword
//        Validacija:
//        Sva polja su obavezna
//        password mora da bude minimum duzina 8
//        confirmPassword i password moraju da se poklapaju
//        Email u sebi mora da sadrzi @
//        Password u sebi ne sme da sadrzi deo iz imena ili prezimena.
//        Npr: za Milana nevalidan password bi bio Milan129, jer sadrzi “Milan” u sebi
//        Ispisati sve validacione greske.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vase ime ");
        String ime = s.nextLine();
        System.out.println("Unesite vase prezime ");
        String prezime = s.nextLine();
        System.out.println("Unesite vas email ");
        String email = s.nextLine();
        System.out.println("Unesite vas password ");
        String pass = s.nextLine();
        System.out.println("Potvrdite vas password ");
        String confirmPass = s.nextLine();
        boolean isValid = true;

        if (ime.length()<1){
            System.out.println("Sva polja su obavezna");
            isValid=false;
        }
        if (prezime.length()<1){
            System.out.println("Sva polja su obavezna");
            isValid=false;
        }
        if (email.length()<1){
            System.out.println("Sva polja su obavezna");
            isValid=false;
        }
        if (pass.length()<1){
            System.out.println("Sva polja su obavezna");
            isValid=false;
        }
        if (confirmPass.length()<1){
            System.out.println("Sva polja su obavezna");
            isValid=false;
        }
        if (pass.length()<8){
            System.out.println("Password mora imati 8 karaktera");
            isValid=false;
        }
        if (!pass.equals(confirmPass)){
            System.out.println("Password i confirm password se ne poklapaju");
            isValid=false;
        }
        if (!email.contains("@")){
            System.out.println("Mail mora da sadrzi @");
            isValid=false;
        }
        if (pass.contains(ime) || pass.contains(prezime)){
            System.out.println("Password ne sme da sadrzi vase ime ili prezime");
            isValid=false;
        }
        if(isValid)
            System.out.println("Uspesno ste se ulogovali");

    }
}
