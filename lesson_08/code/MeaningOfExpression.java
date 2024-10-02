public class MeaningOfExpression {
    //

    public static void main(String[] args) {
        int x = 5;
        System.out.println( "значение выражения = " + resultCalculation(x));

    }

    public static int resultCalculation(Integer x){

       int result = x-- + --x;
       return result;

    }
}
