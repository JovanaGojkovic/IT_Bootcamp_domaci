package Domaci_23_05_2022;

public class Autor {
//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)

    private String imeAutora;
    private String prezimeAutora;

    public Autor(String imeAutora, String prezimeAutora){
        this.imeAutora = imeAutora;
        this.prezimeAutora = prezimeAutora;
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public String getPrezimeAutora() {
        return prezimeAutora;
    }

    public void setPrezimeAutora(String prezimeAutora) {
        this.prezimeAutora = prezimeAutora;
    }

    public void stampaj(){
        System.out.println("(" + this.imeAutora + ")" + " " + "(" + this.prezimeAutora + ")");
    }
}
