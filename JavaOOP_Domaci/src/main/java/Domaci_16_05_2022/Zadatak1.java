package Domaci_16_05_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu c u kojoj se stampa prosledjena vrednost za 10 veca.
//            Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();
        int promenljiva = stampajVrednostZa10Vecu(broj);
        System.out.println("Broj 10x veci od vaseg je: " + promenljiva);
    }
    static int stampajVrednostZa10Vecu(int x){
        int vrednost = x * 10;
        return vrednost;
    }
}
