package classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {

    public static void main(String[] args) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("___________________________________________");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);
        integer = integer + 5;
        System.out.println(integer);

        //автоупаковка
        Integer x = 5;
        System.out.println(x * 10);


        //автораспаковка
        integer = 7;

        int z = x + integer;
        System.out.println(z);

        System.out.println("___________________________________________");
        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);

        //количество цифр в числе , 2 версия
        int b = 1234567890;
        Integer bInt = b;
        //смена типа
        String str = bInt.toString();// числу сменили тип на String
        int l = str.length();

        System.out.println("Number: " + b + " contains " + l + " digits.");

        System.out.println("_____________________________________________");

        System.out.println("Max value of int:" + bInt.MAX_VALUE);
        System.out.println("Min value of int:" + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of doubl:" + d.MAX_VALUE);
        System.out.println("Min value of doubl:" + d.MIN_VALUE);

        //математические вычисления
        int n = 20;
        Integer m = 10;

        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Length of circle: %.2f",circleLenth);
        System.out.println();

        // NaN , Infinite

        double p = 20 / 0.0;



        if (Double.isNaN(p) || Double.isInfinite(p)){
            System.out.println("Wrong operation , division by Zero");
        } else System.out.println(p);

        System.out.println("____________________________________________");

        // перевод String в число
        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);



    }
}
