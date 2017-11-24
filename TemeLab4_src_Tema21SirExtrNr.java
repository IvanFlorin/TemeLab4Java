
//21. Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.

public class Tema21SirExtrNr {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 10, 12, 27, 55, 4, 36};
        int[] newArray = new int[numbers.length];
        int a = 12;
        int b = 35;
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > a && numbers[i] < b) {
                newArray[j] = numbers[i];
                System.out.println(newArray[j]);
                j++;
            }
        }
    }

}
