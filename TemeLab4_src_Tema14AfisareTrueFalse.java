
//14. Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.

import java.util.Scanner;

public class Tema14AfisareTrueFalse {

    public static void main (String[] args) {
        int n;

        Scanner numar = new Scanner(System.in);

        System.out.println(" Introduceti numarul dorit: ");
        n = numar.nextInt();

        if (n >= 9 && n <=24) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

}
