package Domaci28_04_2022;
//1.Napisati program koji racuna zavrsnu ocenu ispita.
// Korisnik unosi poene sa:
//lab vezbi (maksimalno 20poena)
//pismenog (maksimalno 40 poena)
//usmenog (maksimalno 40 poena)
//Nakon toga se racuna zavrsna ocena, tako sto se u
//odnosu na zbir svih poena ocena racuna tako da
//od 50do 59 poena, je ocena 6
//od 60 do 69 poena, je ocena 7
//od 70 do 79 poena, je ocena 8
//od 80 do 89 poena, je ocena 9
//od 90 do 100 poena, je ocena 10
//Za ispod 50 poena, ocena je 5
//Na kraju programa ispistati zavrsnu ocenu ispita

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite poene za vezbe ");
        int vezbe = s.nextInt();
        System.out.println("Unesite poene sa pismenog");
        int pismeni = s.nextInt();
        System.out.println("Unesite poene sa usmenog");
        int usmeni = s.nextInt();
        int poeni = vezbe + pismeni + usmeni;
        int ocena = 0;

        if (poeni < 50) {
            ocena = 5;
        } else if(poeni>=50 && poeni <= 59){
            ocena = 6;
        } else if (poeni>=60 && poeni <= 69) {
            ocena = 7;
        } else if(poeni>=70 && poeni <= 79){
            ocena = 8;
        } else if (poeni>=80 && poeni <= 89) {
            ocena = 9;
        } else if (poeni>=90 && poeni <= 100) {
            ocena = 10;
        }
        System.out.println("Vasa ocena je: " + ocena);

    }
}
