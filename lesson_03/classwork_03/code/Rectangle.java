public class Rectangle {

    public static void main(String[] args) {

        double a = 125.37d;
        double b = 35.0;

        // solution 1
        double area = a * b;
        System.out.println(" Area of rectangle:" + area);

        //solution with method

        area = areaOfRectangle(a, b);
        System.out.println(area);



    }//


    public static double areaOfRectangle(double a, double b){

        double res = a * b;
        return res ;
    }
}//
