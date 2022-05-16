package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//    (Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//    Primer izvrsenja:
//    izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//    izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//    Napomena: Resiti bez koriscenja petlji.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite m: ");
        int m = s.nextInt();
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        System.out.println("Ima za rezultat: " + izbroji(m,n));
    }
    static int izbroji(int m, int n){
        return n - m -1;
    }
}
