package Domaci26_04_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji stampa podatke o kreditnoj kartici u
//        formatu kao na slici. Od informacija se pamti broj kartice
//        (16 cifara sa razmacima), mesec i godina do kada vazi kartica,
//        kao i ime i prezime vlasnika kartice. Kartica se stampa sa zvezdicama i ne
//        brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.

        int maxDuzina = 30;
        String zvezdice = "*************************************";
        String prviRed = "*  Credit Card                      *";
        String drugiITreciRed = "*    ****                           *";
        String cetvrtiRed = "*       1234 1232 4321 1212         *";
        String petiRed = "*                  valid > 10/25    *";
        String sestiRed = "*                                   *";
        String sedmiRed = "*    Milan Jovanovic                *";


        System.out.println(zvezdice);
        System.out.println(prviRed);
        System.out.println(drugiITreciRed);
        System.out.println(cetvrtiRed);
        System.out.println(petiRed);
        System.out.println(sestiRed);
        System.out.println(sedmiRed);
        System.out.println(zvezdice);
    }
}
