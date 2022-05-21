package Domaci_20_05_2022;

public class FacePostMain {
    public static void main(String[] args) {
        FacePost post1 = new FacePost();
        post1.objavioPost = "Jovana Gojkovic";
        post1.primioPost = "Petar Petrovic";
        post1.textObjave = "Srecan rodjendan!";
        post1.brojLajkova = 10;
        post1.brojDeljenja = 2;
        post1.povecajLajk();
        post1.dislike();
        post1.share();
        post1.print();

        FacePost post2 = new FacePost("Petar Petrovic", "Jovana Gojkovic", "Hvala!");
        post2.brojLajkova = 20;
        post2.brojDeljenja = 3;
        post2.print();
    }
}
