package Domaci26_04_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koj racuna z prema formuli: (x - y) na kvadrat.
//        X i Y se unose sa tastature.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za x: ");
        int x = s.nextInt();

        System.out.println("Unesite vrednost za y: ");
        int y = s.nextInt();

        int z = (x - y) * (x - y);

        System.out.println("Z je: " + z);


    }
}
