// 5.  Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.


import java.util.Scanner;

public class Tema5TabelaConversieFahrCels {

    public static void main(String[] args) {
        double fahrenheit;
        int x;
        int y;

        Scanner grade = new Scanner(System.in);

        System.out.println("Introduceti  2 valori/grade intre care doriti tabela de conversie: ");
        x = grade.nextInt();
        y = grade.nextInt();


        for (int celsius = x; celsius <= y; celsius++) {
            fahrenheit = 32 + (celsius * 9 / 5);
            //System.out.println(celsius + " ºC = " + fahrenheit + " ºF");
            System.out.println( fahrenheit + "ºF  = " + celsius + "ºC " );


        }
    }


}
