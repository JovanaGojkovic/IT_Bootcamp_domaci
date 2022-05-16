package Domaci27_04_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//  Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//  Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite za T1 x i y ");
        int t1x = s.nextInt();
        int t1y = s.nextInt();
        System.out.println("Unesite za T2 x i y ");
        int t2x = s.nextInt();
        int t2y = s.nextInt();
        System.out.println("Unesite za M x i y ");
        int mx = s.nextInt();
        int my = s.nextInt();

        if (mx >= t1x && mx <= t2x && my >= t1y && my <= t2y){
            System.out.println("Pozicija je dobra");
        } else {
            System.out.println("Pozicija nije dobra");
        }

    }
}
