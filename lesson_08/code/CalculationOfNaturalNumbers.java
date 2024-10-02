import java.util.Scanner;

public class CalculationOfNaturalNumbers {
    //

    public static void main(String[] args) {

        int x = 200;

        int start = 1;
        System.out.println("Распечатываем натуральные числа меньше 200 и кратные 13");
        while(start < x){
            if(start%13 == 0){
                System.out.println(start);
            }
            start++;
        }
    }



}
