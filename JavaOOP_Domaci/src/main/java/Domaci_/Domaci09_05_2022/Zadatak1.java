package Domaci09_05_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve. Zadatak resiti while petljom.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 32
//        Unesite broj: 121
//        Unesite broj: 1333
//        Unesite broj: 144
//        Suma je: 265

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = s.nextInt();
        int suma = 0;
        int i = 1;
        
        while (i <= N) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj > 99 && broj < 1000) {
                suma = suma + broj;
            }
            i++;
        }
        System.out.println("Zbir trocifrenih brojeva je " + suma);
    }
}
