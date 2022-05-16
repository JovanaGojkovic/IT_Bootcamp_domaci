package Domaci27_04_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p
//        (p ima startni deo #) tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu
//        sa desne. Konkatanacija stringova u javi-> Koristan link
//        Primer izvrsenja 1:
//        Unesite a: 10  -> # 10
//        Unesite b: -2   -> -2 # 10
//        Unesite c: -1   -> -1 -2 # 10
//        Unesite d: 9    -> -1 -2 # 10 9
//        String p ime vrednost = -1 -2 # 10 9

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite a,b,c,d ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        String p = "#";

        if (a > 0) {
            System.out.println(p = p + " " + a);
        } else {
            System.out.println(p = a + " " + p);
        }
        if (b > 0) {
            System.out.println(p = p + " " + b);
        } else {
            System.out.println(p = b + " "+ p);
        }
        if (c > 0) {
            System.out.println(p = p + " " + c);
        } else {
            System.out.println(p = c + " "+ p);
        }
        if (d > 0) {
            System.out.println(p = p + " "+ d);
        } else {
            System.out.println(p = d + " "+ p);
        }
    }
}