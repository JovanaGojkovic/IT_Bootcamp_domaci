package Domaci_19_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
//        3.(ZA VEZBANJE) Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//        ime i prezime korisnika koji je objavio post
//        ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//        tekst objave
//        broj lajkova
//        broj deljenja
//        Od metoda:
//        like(), koja povecava broj lajkova za 1.
//        dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//        share(), koja povecava broj deljenja za 1
//        print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

        FacebookPost post1 = new FacebookPost();
        post1.objavioPost = "Jovana Gojkovic";
        post1.primioPost = "Petar Petrovic";
        post1.textObjave = "Srecan rodjendan!";
        post1.brojLajkova = 10;
        post1.brojDeljenja = 2;
        post1.print();
        post1.povecajLajk();
        post1.povecajLajk();
        post1.dislike();
        post1.share();
        post1.print();

        FacebookPost post2 = new FacebookPost();
        post2.objavioPost = "Petar Petrovic";
        post2.primioPost = "Jovana Gojkovic";
        post2.textObjave = "Hvala puno!";
        post2.brojLajkova = 20;
        post2.brojDeljenja = 6;
        post2.print();
        post2.povecajLajk();
        post2.povecajLajk();
        post2.dislike();
        post2.share();
        post2.print();
    }
}
