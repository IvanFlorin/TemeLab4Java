
//12. Se se calculeze suma primelor n numere naturale, unde n este declarat ca si int n = 20; //sau o alta valoare

public class Tema12SumaNNr {



        public static void main(String[] args) {
            int n = 20;
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += i;
            }
            System.out.println("Suma primelor " + n + " numere naturale este " + sum);
        }

}
