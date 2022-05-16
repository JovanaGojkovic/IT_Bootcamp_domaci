package Domaci29_04_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava N brojeva i na kraju ispisuje srednju vrednost svih brojeva.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 9
//        Unesite broj: 6
//        Unesite broj: 8
//        Srednja vrednost je 5.
//        5 jer je celobrojno deljenje!
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int N = s.nextInt();
        int sum = 0;
        double srednjaVrednost = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Unesite broj");
            int x = s.nextInt();
            sum += x;
            srednjaVrednost = sum/N;
        }
        System.out.println("Srednja vrednost je " + srednjaVrednost);



    }
}
