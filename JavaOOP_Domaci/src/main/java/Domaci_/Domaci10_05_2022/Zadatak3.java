package Domaci10_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ucitava niz A duzine N i broj X.
//         Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//          Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//        1, 3
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> noviNiz = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int N = s.nextInt();
        int broj = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            A.add(broj);
        }
        System.out.println("Unesite X: ");
        int X = s.nextInt();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == X) {
                noviNiz.add(i);
            }
        }
        if(noviNiz.size() > 0){
            System.out.println("Elementi niza A koji su jednaki broju X imaju indexe: " + noviNiz);
        }else{
            System.out.println("Nema poklapajucih elemenata");
        }
    }
}
