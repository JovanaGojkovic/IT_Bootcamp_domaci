package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisati odgovarajucu poruku.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a: ");
        int a = s.nextInt();
        System.out.println("Unesite b: ");
        int b = s.nextInt();
        System.out.println("Unesite c: ");
        int c = s.nextInt();
        int resenje = najmanjiBr(a,b,c);
        System.out.println("Najmanji broj je: " + resenje);
    }
    static int najmanjiBr(int a, int b, int c){
        if (a < b && a < c){
            return a;
        } else if (b < a && b < c) {
            return b;
        }else {
            return c;
        }
    }
}

