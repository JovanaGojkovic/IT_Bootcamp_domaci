package Domaci_02_06_2022;

import java.util.ArrayList;

public class MainKlasa {
    public static void main(String[] args) {
//        U glavnom programu kreirati jednog magacionera i jednog menadzera,
//                postaviti sektore u kojima rade i ispisati platu za svakog

        Magacioner mag1 = new Magacioner("Pera Peric");
        Menadzer men1 = new Menadzer("Mika Mikic");
        Sektor prviSprat = new Sektor("Prvi", 150000);
        Sektor drugiSprat = new Sektor("Drugi", 200000);


        mag1.zaposliUsektor(prviSprat);
        men1.zaposliUsektor(drugiSprat);
        men1.zaposliUsektor(prviSprat);

        System.out.println("Radnik: " + mag1.getImeIprezime() + " Ima platu: " + mag1.plata());
        System.out.println("Radnik: " + men1.getImeIprezime() + " Ima platu: " + men1.plata());


    }
}
