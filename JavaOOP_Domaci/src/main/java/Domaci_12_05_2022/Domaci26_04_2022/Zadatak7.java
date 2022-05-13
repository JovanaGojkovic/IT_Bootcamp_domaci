package Domaci26_04_2022;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        (za vezbanje) Napistai program koji od trocifreng celobrojnog broja a stampa zadnju cifru broja.
//        Primer: ako je a = 123 stapma se 3
//        ako je a = 241 strampa se 1
//        Potrebno je koristiti operator / ili % za ovaj zadatak.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        System.out.println(broj % 10);

    }
}
