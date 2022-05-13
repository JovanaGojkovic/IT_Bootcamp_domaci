package Domaci27_04_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji za unetu vrednost x odredjuje i prikazuje vrednost funkcije y. Funkcija y je definisana kao:
//        (x,       x < 2
//        y =  (2,      2 <= x < 10
//        (x - 1, x >= 10
//
//        Objasnjenje formule: Ako je x manje od 2, y je jednako x
//        Ako je x u opsegu od 2 do 10, y je jednako 2
//        Ako je x vece od 10, y je x-1

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x");
        int x = s.nextInt();
        int y = 0;

        if(x<2){
            System.out.println("Y = " + x);
        } else if (x>=2 && x<10) {
            System.out.println("Y = 2");
        } else if (x>=10) {
            System.out.println("Y = " + (x-1));
        }

    }
}
