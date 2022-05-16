package Domaci27_04_2022;
import java.util.Scanner;
public class yt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj pregleda videa: ");
        int views = s.nextInt();
        String shortView = "";

        if (views >= 100000 && views < 1000000) {
            shortView = views / 1000 + "K";
        } else if (views < 1000000000 && views >= 1000000) {
            shortView = views / 1000000 + "M";
        } else {
            shortView = views + "";
        }
        System.out.printf(shortView + " views.");
    }
}

