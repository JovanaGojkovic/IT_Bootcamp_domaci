package Domaci_24_05_2022;

public class ZeleniKarton {
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//    konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//     (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime

    private String student;
    private int brojIndexa;
    private String imePredmeta;
    private String profesor;
    private int ocena;

    public ZeleniKarton(String student, int brojIndexa, String imePredmeta, String profesor, int ocena) {
        this.student = student;
        this.brojIndexa = brojIndexa;
        this.imePredmeta = imePredmeta;
        this.profesor = profesor;
        this.ocena = ocena;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public String polozenIspit(int ocena){
        if(ocena > 5){
            return "Polozen ispit";
        }else {
            return "Pao ispit";
        }
    }
    public void stampaj(){
        System.out.println("(" + this.imePredmeta + ")" + " - " + "(" + this.ocena + ")");
        System.out.println("Student: " + this.student + " , " + this.brojIndexa);
        System.out.println("Profesor: " + this.profesor);
    }
}
