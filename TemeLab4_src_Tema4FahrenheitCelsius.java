
// 4. Se da un numar in grade Fahrenheit. Sa se converteasca in Celsius stiind formula.

import java.util.Scanner;

public class Tema4FahrenheitCelsius {

    public static void main(String[] args) {
        float temperatue;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti temperatura in Fahrenheit");
        temperatue = in.nextInt();

        temperatue = ((temperatue - 32)*5)/9;

        System.out.println("Temperatura in Celsius = " + temperatue);
    }

}
