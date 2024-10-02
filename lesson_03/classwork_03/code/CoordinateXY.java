public class CoordinateXY {

    public static void main(String[] args) {

     int x = 10;
     int y = 2;

     if ( x >= 0 & y >= 0) {
         System.out.println("Point is in 1st quarter");
     }

        if ( x <= 0 & y >= 0) {
            System.out.println("Point is in 2st quarter");
        }
        if ( x <= 0 & y <= 0) {
            System.out.println("Point is in 3st quarter");
        }
        if ( x >= 0 & y <= 0) {
            System.out.println("Point is in 4st quarter");
        }
        if(x == 0 & y == 0){
            System.out.println("Point is in (0  ; 0 )");
        }

    }// end of main


}// end of class
