package Domaci09_05_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//        Primer izvrsenja:
//        Unesite broj: 3
//        Apsolutna vrednost je 3
//        Unesite broj: -1
//        Apsolutna vrednost je 1
//        Unesite broj: 0
//        Kraj programa jer je uneta nula.

        Scanner s = new Scanner(System.in);
        boolean vrednostNijeNula = true;
        int broj = 1;

        while (vrednostNijeNula) {
            System.out.println("Unesite broj ");
            broj = s.nextInt();
            if (broj != 0) {
                if (broj < 0) {
                    broj = broj * (-1);
                }
                System.out.println("Apsolutna vrednost je " + broj);
            } else {
                vrednostNijeNula = false;
            }
        }
        System.out.println("Kraj programa jer je uneta nula");

    }
}