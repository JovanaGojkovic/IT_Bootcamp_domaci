package Domaci_02_06_2022;

import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {
//        U glavnom programu kreirati jednog magacionera i jednog menadzera,
//                postaviti sektore u kojima rade i ispisati platu za svakog

//        Magacioner mag1 = new Magacioner("Pera Peric");
//        Menadzer men1 = new Menadzer("Mika Mikic");
        Sektor prviSprat = new Sektor("Prvi", 150000);
        Sektor drugiSprat = new Sektor("Drugi", 200000);

        ArrayList<Radnik> nizRadnika = new ArrayList<>();
        Radnik radnik1 = new Magacioner("Pera Peric");
        Radnik radnik2 = new Menadzer("Laza Lazic");

        radnik1.zaposliUsektor(drugiSprat);
        radnik2.zaposliUsektor(prviSprat);
        nizRadnika.add(radnik1);
        nizRadnika.add(radnik2);

        for (int i = 0; i < nizRadnika.size(); i++) {
            Radnik radnik = nizRadnika.get(i);
            System.out.println("Plata " + radnik.getImeIprezime() + " je: " + radnik.plata());
        }
    }
}
