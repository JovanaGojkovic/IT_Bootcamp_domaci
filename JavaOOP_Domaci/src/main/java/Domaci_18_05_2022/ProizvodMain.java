package Domaci_18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//         cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//         i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
        Proizvod prvi = new Proizvod();
        prvi.naziv = "Cokolada";
        prvi.cena = 205;
        prvi.tezina = 175;

        Proizvod drugi = new Proizvod();
        drugi.naziv = "Pivo";
        drugi.cena = 250;
        drugi.tezina = 105;

        prvi.stampaj(prvi.naziv, prvi.cena, prvi.tezina);
        drugi.stampaj(drugi.naziv, drugi.cena, drugi.tezina);
    }
}
