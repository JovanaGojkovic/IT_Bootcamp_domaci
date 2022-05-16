package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
//        koja se formira kao na primeru:
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x: ");
        int x = s.nextInt();
        System.out.println("Unesite y: ");
        int y = s.nextInt();
        System.out.println("Dobitni broj je: " + brojevi(x,y));
    }
    static int brojevi (int x, int y){
        return x * 10 + y;
    }
}
