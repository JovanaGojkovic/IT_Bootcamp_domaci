import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//      pozicija coveculjka, inicijalno je na prvom polju prvog reda.
        int pozicija = 1;

        System.out.print("Unesite dimenziju table:");
        int d = s.nextInt();

        System.out.print("Unesite broj akcija:");
        int brojAkcija = s.nextInt();

        for (int i = 0; i < brojAkcija; i++) {
            System.out.print("Unesite akciju (a, w, s, d):");
//          Akcija za pomeranje coveculjka
            String akcija = s.next();

//
//          Ispod je logika koja pomera coveculjka u odnosu na izabranu akciju
//
            if (akcija.equals("w") && pozicija - d >= 1) {
//                pozicija - d >= 1 - ukoliko prelezak u gornji red ne izlazi van opsega table
                pozicija = pozicija - d;
            } else if (akcija.equals("a") && pozicija % d != 1) {
//                pozicija % d != 1 - provera da li je coveculjak u prvoj koloni
                pozicija = pozicija - 1;
            } else if (akcija.equals("s") && pozicija + d <= d*d) {
//                pozicija + d <= d*d - ukoliko prelezak u donji red ne izlazi van opsega table
                pozicija = pozicija + d;
            } else if (akcija.equals("d") && pozicija % d != 0) {
//                pozicija % d != 1 - provera da li je coveculjak u poslednjoj koloni
                pozicija = pozicija + 1;
            }

//
//          Ispod je petlja koja stampa stanje na tabli
//
            System.out.print("");
            for (int j = 1; j <= d*d; j++) {
                if (j == pozicija) {
                    System.out.print(" C |");
                } else {
                    System.out.print("   |");
                }
                if (j % d == 0) {
//                  iza svakog poslednjeg polja na tabli, odstampati novi red.
                    System.out.println("");
                }
            }
            System.out.print("");


        }

    }
}
