package Domaci_24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
//        U glavnoj klasi:
//        kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

        ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();

        ZeleniKarton ispit1 = new ZeleniKarton("Jovana Gojkovic",
                                                1010,
                                                "matematika",
                                                "Milan Jovanovic",
                                                10);
        ispiti.add(ispit1);

        ZeleniKarton ispit2 = new ZeleniKarton("Jovan Petrovic",
                                                1011,
                                                "matematika",
                                                "Milan Jovanovic",
                                                9);
        ispiti.add(ispit2);

        ZeleniKarton ispit3 = new ZeleniKarton("Pera Peric",
                                                1012,
                                                "Srpski",
                                                "Ivan Ivanovic",
                                                6);
        ispiti.add(ispit3);

        ZeleniKarton ispit4 = new ZeleniKarton("Zoran Peric",
                                                1012,
                                                "Engleski",
                                                "Jovan Ivanovic",
                                                8);
        ispiti.add(ispit4);

        ZeleniKarton ispit5 = new ZeleniKarton("Dejan Peric",
                                                1012,
                                                "Srpski",
                                                "Ivan Ivanovic",
                                                7);
        ispiti.add(ispit5);

        ZeleniKarton ispit6 = new ZeleniKarton("Jovana Gojkovic",
                                                1010,
                                                "Engleski",
                                                "Jovan Jovanovic",
                                                5);
        ispiti.add(ispit6);

        ZeleniKarton ispit7 = new ZeleniKarton("Jovan Petrovic",
                                                1019,
                                                "matematika",
                                                "Milan Jovanovic",
                                                9);
        ispiti.add(ispit7);

        ZeleniKarton ispit8 = new ZeleniKarton("Pera Peric",
                                                1012,
                                                "Srpski",
                                                "Ivan Ivanovic",
                                                9);
        ispiti.add(ispit8);

        ZeleniKarton ispit9 = new ZeleniKarton("Zoran Peric",
                                                1012,
                                                "Engleski",
                                                "Jovan Ivanovic",
                                                3);
        ispiti.add(ispit9);

        ZeleniKarton ispit10 = new ZeleniKarton("Dejan Peric",
                                                1012,
                                                "Srpski",
                                                "Ivan Ivanovic",
                                                10);
        ispiti.add(ispit10);

        double prosecnaOcena = 0;
        double suma = 0;
        double prOcenaPolIspita = 0;
        double sumaPol = 0;
        int brojac = 0;

        for (int i = 0; i < ispiti.size() ; i++) {
            //ispiti.get(i).stampaj();
            ZeleniKarton zk = ispiti.get(i);
            zk.stampaj();
            suma += zk.getOcena();
            if (zk.getOcena() > 5) {
                sumaPol += zk.getOcena();
                brojac++;
            }
        }
        prosecnaOcena = suma / ispiti.size();
        System.out.println("Prosecna ocena je: " + prosecnaOcena);
        prOcenaPolIspita = sumaPol / brojac;
        System.out.println("Prosecna ocena polozenih ispita je: " + prOcenaPolIspita);
    }
}
