package classwork_50.exceptions.application;

import classwork_50.exceptions.exception_handlir.NoSolutionException;
import classwork_50.exceptions.exception_handlir.SolutionIsAnyNumber;

public class SolutionAppl {

    // a * X = b - решение линейного уравнения
    // solution: X = b / a;
    // a = 0 && b != 0 => "Делить на 0 нельзя!", продолжить работу
    // a = 0 && b = 0 => "X - любое число"

    public static void main(String[] args) {

        int a = 0;
        int b = 40;
        int x = 0;

        try {
            x = solution(a, b);
            System.out.println("X = " + x);

        } catch (NoSolutionException e) {
            System.out.println("Division by 0 " + e.getMessage());
            //throw new RuntimeException(e);
        } catch (SolutionIsAnyNumber e){
            System.out.println("Any number is solution " + e.getMessage());
        }
        finally {
            System.out.println("Buy, buy!");
        }

    }

    private static int solution(int a, int b) throws NoSolutionException {
        if(a == 0 && b != 0){
            throw new NoSolutionException("No possible solution, division by 0 impossible!");
        }
        if(a == 0 && b == 0) {
            throw new SolutionIsAnyNumber("X - is any number!");
        }
        return b / a; // деление целочисленное
    }

}
