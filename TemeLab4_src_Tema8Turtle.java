//a turtle goes D km in H hours. calculate the speed of the turtle expressed in meters/second

public class Tema8Turtle {

    public static void main(String[] args) {
        double distanceKm = 200;
        double hours = 12;
        double speed = (distanceKm*1000)/(hours*3600);
        System.out.println("Viteza broscutei testoase este: " + String.format( "%.2f", speed ) + "m/s");
    }

}

