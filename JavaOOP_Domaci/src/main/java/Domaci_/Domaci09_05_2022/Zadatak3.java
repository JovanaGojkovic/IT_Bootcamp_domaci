package Domaci09_05_2022;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program za ucenje matematike. Program daje korisniku matematicke zadatke sve dok ne pogresi.
//         Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou
//        korisniku se prikazuju dva random broja koja treba da sabere. (Program generise
//        random brojeve u opsegu od 0 do 100, ne unosi ih korisnik)
//        Random brojevi u Javi se generisisu kao u primeru
// creating an object of Random class
// Generates random integers 0 to 49
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        boolean tacanOdgovor = true;
        int i = 1;
        while (tacanOdgovor) {
            int x = random.nextInt(100);
            int y = random.nextInt(100);
            int rezultat = x + y;
            System.out.println("Nivo " + i + ":" + "Koliko je : " + x + "+" + y + "?");
            int resenje = s.nextInt();
            i++;
            if (resenje == rezultat) {
                System.out.println("Cestitam!");
            } else {
                tacanOdgovor = false;
                System.out.println("Game over!");
            }
        }


    }
}
