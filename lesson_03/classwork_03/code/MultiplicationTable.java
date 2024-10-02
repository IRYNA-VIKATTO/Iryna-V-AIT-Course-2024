public class MultiplicationTable {

    public static void main(String[] args) {

        //
         int i = 1 , j = 1 ;

        while (i < 11) {
            while ( j < 11 ) {
                System.out.println(i + " x "+ j + " = "+ ( j*i )+" |");
                j++;
            }//
            j= 1 ;
            i++;
            System.out.println();
        }//
    }

}
