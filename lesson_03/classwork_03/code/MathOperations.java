public class MathOperations {
    public static void main(String[] args) {

        double r = 200d;
        double sqareSideSize = 500d;
        double a = 1000;
        double b = 2000;

        System.out.println("площадь круга для R = "+ r +" равна "+ calcAreaOfCircle(r));
        System.out.println("площадь квадрата со стороной "+ sqareSideSize +" составляет " + calcAreaOfSqare(sqareSideSize));
        System.out.println("периметр прямоугольника со сторонами "+ a +" и "+ b + " равен " + perimeterOfRectangle(a,b));

    }
    public static double calcAreaOfSqare(Double sqareSideSize){
        return (sqareSideSize*sqareSideSize);
    }

    public static double calcAreaOfCircle(Double circleRadius){
        return (Math.PI * circleRadius * circleRadius);
    }
    public static double perimeterOfRectangle(Double a, Double b){
        double result = 2*(a+b);
        return result;
    }
}
