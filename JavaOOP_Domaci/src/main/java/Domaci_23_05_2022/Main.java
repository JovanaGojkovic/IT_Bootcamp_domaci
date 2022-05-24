package Domaci_23_05_2022;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Pera", "Peric");
        Knjiga knjiga = new Knjiga("1254p", "Java", autor, 1989);

        autor.stampaj();
        knjiga.stampajKnjigu();

    }
}
