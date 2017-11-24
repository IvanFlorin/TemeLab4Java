// 1.  Sa se calculeze media aritmetica a doua numere.

import java.util.Scanner;

public class Tema1MediaAritmetica {


    public static void main(String[] args) {

        int sum = 0, inputNum;
        int counter = 2;
        float mean;
        Scanner NumScanner = new Scanner(System.in);

        System.out.println("Introduceti 2 numere:");

        for (int x = 1; x <= counter; x++) {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }

        mean = sum / counter;
        System.out.println(" Media aritmetica a celor 2 numere este: " + mean);
    }

}





