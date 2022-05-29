package Domaci_26_05_2022;

import java.util.ArrayList;

public class FaceMain {
    public static void main(String[] args) {

        Reakcija smajliReakcija = new Reakcija("smajli", "Pera Peric");
        Reakcija lajkReakcija = new Reakcija("lajk", "Dragan Gojkovc");
        Reakcija srceReakcija = new Reakcija("srce", "Nikola Nikolic");
        Reakcija srceReakcija2Test = new Reakcija("lajk", "Nikola Nikolic");

        FacePost prvi = new FacePost();
        prvi.reaguj(smajliReakcija);
        prvi.reaguj(lajkReakcija);
        prvi.reaguj(srceReakcija);
        prvi.reaguj(srceReakcija2Test);
        prvi.setPostAutor("Jovana Gojkovic");
        prvi.setTekstObjave("Srecan rodjendan");

        prvi.stampaj();
    }
}
