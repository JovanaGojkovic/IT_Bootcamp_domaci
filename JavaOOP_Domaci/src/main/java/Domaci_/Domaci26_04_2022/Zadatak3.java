package Domaci26_04_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Bug report od informacija ima:
//        ID (broj)
//                Title
//                Severity
//                Priority
//                Description
//                Environment
//                Steps to reproduce (jedna promenlijva)
//                Expected result
//                Actual result


        Scanner s = new Scanner(System.in);

        String title = "Bug report";
        System.out.println(title);
        System.out.println("Enter ID: ");
        int id = s.nextInt();

        System.out.println("Enter Severity: ");
        String severity = s.next();

        System.out.println("Enter Priority: ");
        String priority = s.next();

        System.out.println("Enter description: ");
        String description = s.next();

        System.out.println("Enter environment: ");
        String environment = s.next();

        System.out.println("Steps to reproduce: ");
        String steps = s.next();

        System.out.println("Expected result: ");
        String expected = s.next();

        System.out.println("Actual result: ");
        String actual = s.next();

        System.out.println("Bug has ID " + id + " " + "and on his way to the developer!");




    }
}
