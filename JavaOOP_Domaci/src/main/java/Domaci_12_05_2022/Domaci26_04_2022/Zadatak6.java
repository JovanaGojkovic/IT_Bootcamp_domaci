package Domaci26_04_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji ucitava stranicu jednakostranicnog
//        trougla sa tastature i ispisuje povrsinu i obim trougla. Koren iz tri neka bude konstanta 1.73
//        Primer izvrsenja programa:
//        Unesite stranicu trougla: 10
//        Povrsina je 43.25
//        Obim je 30

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu stranice ");
        int stranica = s.nextInt();

        double povrsinaTrougla = ((stranica * stranica) * 1.73 / 4);
        double obimTrougla = (stranica * 3 );

        System.out.println("Povrsina trougla je: " + povrsinaTrougla);
        System.out.println("Obim trougla je: " + obimTrougla);

    }
}
