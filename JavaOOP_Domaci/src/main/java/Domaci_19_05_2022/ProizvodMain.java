package Domaci_19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        //    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cene i ova funkcija nema povratnu vrednost.
//        vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena
//        proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Milka";
        cokolada.cena = 105;
        cokolada.tezina = 95;
        cokolada.stampaj();
        cokolada.povecajCenu(10);
        cokolada.vratiCenuSaPopustom(20);
        cokolada.racunajPostarinu();
        cokolada.stampaj();

        Proizvod pivo = new Proizvod();
        pivo.naziv = "Nisko";
        pivo.cena = 120;
        pivo.tezina = 200;
        pivo.stampaj();
        pivo.povecajCenu(20);
        pivo.vratiCenuSaPopustom(30);
        pivo.racunajPostarinu();
        pivo.stampaj();
    }
}
