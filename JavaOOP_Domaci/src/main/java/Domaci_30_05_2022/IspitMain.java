package Domaci_30_05_2022;

public class IspitMain {
    public static void main(String[] args) {
        Ispit predmet1 = new Ispit("Matematika", 5, "Milan Jovanovic");
        Ispit predmet2 = new Ispit("Java", 10, "Vladimir Minic");
        Ispit predmet3 = new Ispit("Manuelno testiranje", 8, "Radmila Petrovic");

        Student prvi = new Student("123", "Jovana Gojkovic", "Master");

        prvi.dodajIspit(predmet1);
        prvi.dodajIspit(predmet2);
        prvi.dodajIspit(predmet3);
        prvi.stampaj();
    }
}
