package Domaci_20_05_2022;

public class FacePost {
    public String objavioPost;
    public String primioPost;
    public String textObjave;
    public int brojLajkova;
    public int brojDeljenja;
    public FacePost() {

    }

    public FacePost(String objavioPost, String primioPost, String textObjave) {
        this.objavioPost = objavioPost;
        this.primioPost = primioPost;
        this.textObjave = textObjave;
    }

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
