package Domaci10_05_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        (Za vezbanje) Napisati program koji ucitava niz stringova duzine N, tako da ucitavanje elemenata u niz a bude obrnuto.
//        Primer:
//        Unesite N: 4
//        Unesite string: xxx1
//        Unesite string: xxx4
//        Unesite string: xxx6
//        Unesite string: xxx9
//        Niz a: xxx9, xxx6, xxx4, xxx1
//        Komentar: Stanje niza a u memoriji je:
//        a[0]="xxx9",
//                a[1]="xxx6",
//                a[2]="xxx4",
//                a[3]="xxx1",
        ArrayList<String> nizA = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = s.nextInt();
        String unos = "";

        for (int i = N - 1; i >= 0; i--) {
            System.out.println("Unesite text:");
            unos = s.next();
            nizA.add(unos);
            addFirst(i);
            Collections.reverse(nizA);
    }
        System.out.println(nizA);
}
    private static void addFirst(int i) {
    }
}
