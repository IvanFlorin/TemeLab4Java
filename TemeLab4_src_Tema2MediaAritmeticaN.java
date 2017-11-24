// 2. Sa se calculeze media aritmetica a N numere.

import java.util.Scanner;


public class Tema2MediaAritmeticaN {


    public static void main(String[] args){
        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);
        Scanner charScanner = new Scanner(System.in);

        System.out.println("Introduceti totalul de numere la care vreti sa calculati media aritmetica");

        counter = NumScanner.nextInt();

        System.out.println("Introduceti " + counter + " numere:");

        for(int x = 1; x<=counter ;x++){
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }

        mean = sum / counter;
        System.out.println("Media aritmetica celor " + counter + " numere este: " + mean);
    }


}
