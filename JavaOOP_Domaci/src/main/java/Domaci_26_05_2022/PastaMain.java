package Domaci_26_05_2022;

import java.util.ArrayList;

public class PastaMain {
    public static void main(String[] args) {

        Sastojak nula = new Sastojak("Kackavalj", 100);
        Sastojak jedan = new Sastojak("Mocarela", 200);
        Sastojak dva = new Sastojak("Spanac", 50);


        Pasta pastica = new Pasta();
        pastica.dodajSastojak(nula);
        pastica.dodajSastojak(jedan);
        pastica.dodajSastojak(dva);
        pastica.dodajSastojak(nula);
        pastica.brisiSastojak(jedan);


        pastica.stampajCenuPaste();
    }
}
