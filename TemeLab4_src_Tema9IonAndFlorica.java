
/*Ion lives in Cluj and Florica lives in Floresti and you know
the distance between Cluj and Floresti is k kilometres.
        They plan to meet somewhere between the two cities
        so they start driving on the same road in the same moment.
        Assuming you know the speed of their car vIon and vFlorinca
        and this is kept constant pls calculate after how much time
        they meet (in minutes) and at what distance from Cluj.*/


public class Tema9IonAndFlorica {

    public static void main(String[] args) {
        double distance = 14.0;    //km
        double dCluj;

        //viteze in km/h
        double vIon = 50;
        double vFlorica = 50;

        //viteze in km/min
        vIon = vIon/50;
        vFlorica = vFlorica/50;

        double timp;
        timp = distance/(vIon+vFlorica);
        System.out.print("Ion si Florica se intalnesc dupa " + timp + " minute de la plecare, ");

        dCluj = vIon * timp;
        System.out.print("la " + dCluj + " km distanta de Cluj.");

    }

}


