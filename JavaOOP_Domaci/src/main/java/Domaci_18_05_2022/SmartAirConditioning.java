package Domaci_18_05_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public boolean daLiGreje = true;

    public static void stampaj(String marka, int temperatura, boolean daLiGreje){
        if (daLiGreje) {
            System.out.println("Marka je" + " " + marka + " " + "temperatura je " + temperatura + "; " + "greje");
        }else {
            System.out.println("Marka je" + " " + marka + " " + "temperatura je " + temperatura + "; " + "ne greje");
        }
    }

}


