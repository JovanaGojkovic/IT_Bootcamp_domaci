package Domaci27_04_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//        (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
//        odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta
//        sa tastature.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x,y");
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("Unesite operator");
        String operator = s.next();

        if(operator.equals("+")){
            System.out.println(x + y);
        }else if(operator.equals("-")){
            System.out.println(x - y);
        }else if(operator.equals("*")){
            System.out.println(x * y);
        }else if(operator.equals("/")){
            System.out.println(x / y);
        }
    }
}
