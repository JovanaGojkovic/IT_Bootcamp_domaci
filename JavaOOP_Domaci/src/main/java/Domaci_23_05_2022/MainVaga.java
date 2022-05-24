package Domaci_23_05_2022;

public class MainVaga {
    public static void main(String[] args) {

        Proizvod_23 patike = new Proizvod_23(5,"Adidas", 20);
        Vaga merilica = new Vaga();
        merilica.setMernaJed("lb");
        merilica.setProizvod_23(patike);
        merilica.stampajRacun(10);
    }
}
