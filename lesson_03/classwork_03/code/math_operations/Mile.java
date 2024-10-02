package math_operations;

public class Mile {

    public static void main(String[] args) {

        double distance = 100; // морская миля
        double kilometers = exchangeNauticalMileToKilometers(distance);
        System.out.println(distance + " nautical mile =  " + kilometers + " kilometers");


    }

    private static double exchangeNauticalMileToKilometers(double distance){
        return distance* 1.852;

    }
}
