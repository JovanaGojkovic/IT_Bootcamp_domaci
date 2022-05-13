package Domaci29_04_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int N = s.nextInt();
        int[] myIntArray = new int[N];

        for (int i = 0; i < N ; i++) {
            System.out.println("Unesite broj");
            int x = s.nextInt();
            myIntArray[i] = x;
        }

        for (int i = 0; i<myIntArray.length; i++){
            System.out.print(myIntArray[i]);
        }
    }
}
