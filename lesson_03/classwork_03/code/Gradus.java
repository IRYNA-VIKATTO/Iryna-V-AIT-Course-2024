public class Gradus {

    public static void main(String[] args) {

        double degrees = 10; //
        double degreesFahrenheit = exchangeDegreesOfCelsiusToDegreesFahrenheit(degrees);
        System.out.println(degrees + " degrees of Celsius = " + degreesFahrenheit + " degrees Fahrenheit ");
    }

    private static double exchangeDegreesOfCelsiusToDegreesFahrenheit(double degrees) {

        return degrees * 1.8 + 32;
    }
}
