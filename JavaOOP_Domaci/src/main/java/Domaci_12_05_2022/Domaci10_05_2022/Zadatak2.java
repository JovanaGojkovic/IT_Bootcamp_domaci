package Domaci10_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//        Brojevi veci od nule u nizu A su: 1, 3, 9,
        ArrayList<Integer> A = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = s.nextInt();
        int broj = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            if (broj > 0) {
                A.add(broj);
            }
        }
        System.out.println("Brojevi veci od nule u nizu su: " + A);
    }
}
