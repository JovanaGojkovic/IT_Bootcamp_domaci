package Domaci_19_05_2022;

public class FacebookPost {
    public String objavioPost;
    public String primioPost;
    public String textObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void povecajLajk() {
        this.brojLajkova++;
    }

    public void dislike() {
        if (this.brojLajkova < 0) {
            this.brojLajkova = 0;
        } else {
            this.brojLajkova--;
        }
    }

    public int share() {
        return this.brojDeljenja + 1;
    }

    public void print() {
        System.out.println(this.objavioPost + " >>> " + this.primioPost);
        System.out.println(this.textObjave);
        System.out.println("Likes: " + this.brojLajkova + " | " + "Shares: " + this.brojDeljenja);
    }
}


