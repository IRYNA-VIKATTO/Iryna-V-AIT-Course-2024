public class Circle {

    // вычислить  длину окружности по радиусу
    public static void main(String[] args) {

        double PI = 3.14159;
        double r = 100;

        double lengthOfCircle = 2 * PI * r;
        System.out.println(lengthOfCircle);

        //solution with method

        double l = lengthOfCircleMethod(r);
        System.out.println( "Length of circle with radius " + r + " = " + l);
    }

private static double lengthOfCircleMethod(double r) {
        double res = 2 * Math. PI * r;
        return 2 * Math.PI * r ;

}

}
