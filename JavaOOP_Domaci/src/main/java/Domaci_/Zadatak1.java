package Domaci_;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println("Zdravo!");
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite komentar: ");
        String komentar = s.nextLine();
        if(komentar.equals("Bravo Milane")){
            System.out.println("Anketa je uspesno popunjena");
        }else if (komentar.equals("Milan je sjajan")){
            System.out.println("Anketa je uspesno popunjena");
        }else if (komentar.equals("Milan je sa boljim forama, Vlado ne ljuti se")){
            System.out.println("Anketa je uspesno popunjena");
        }
        else {
            System.out.println("Izbaceni ste sa kursa IT Bootkamp - dozivotno!");
        }
    }
}
