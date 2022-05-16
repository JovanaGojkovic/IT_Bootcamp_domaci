package Domaci29_04_2022;

import java.util.Scanner;

public class Zadak2 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
//        Na kraju programa prikazati sumu.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N");
        int N = s.nextInt();
        int zbirParnihBrojeva = 0;

        for (int i = 0; i <N ; i++) {
            System.out.println("Unesite broj");
            int x = s.nextInt();
            if(x % 2 == 0){
                zbirParnihBrojeva = zbirParnihBrojeva + x;
            }
        }
        System.out.println("Zbir parnih brojeva je " + zbirParnihBrojeva);

    }
}
