package Domaci_23_05_2022;

public class Knjiga {
//    Kreirati klasu Knjiga koji ima:
//            -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)

    private String isbn;
    private String naziv;
    private int godinaIzdanja;

    private Autor autor;

    public Knjiga (String isbn, String naziv, Autor autor, int godinaIzdanja){
        this.isbn = isbn;
        this.naziv = naziv;
        this.autor = autor;
        this.godinaIzdanja = godinaIzdanja;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void stampajKnjigu(){
        System.out.println("(" + this.isbn + ")");
        System.out.println("(" + this.naziv + ")" + " " + "(" + this.godinaIzdanja + ")");
        System.out.println("Autor: " + "(" + this.getAutor().getImeAutora() + ")" + " " + "(" + this.getAutor().getPrezimeAutora() + ")");
    }
}
