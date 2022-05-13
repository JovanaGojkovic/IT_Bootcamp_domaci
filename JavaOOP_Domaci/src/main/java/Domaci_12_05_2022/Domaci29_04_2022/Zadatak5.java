package Domaci29_04_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji pronalazi 7 stepen broja 2.
//        Izvrsenje:
//        2 na stepen 7 je 128

        int stepen = 7;
        int broj = 2;
        int rezultat = 1;

        for (int i = 0; i < stepen; i++) {
            rezultat = rezultat *= broj;
        }
        System.out.println("Sedmi stepen broja 2 je " + rezultat);
    }
}
