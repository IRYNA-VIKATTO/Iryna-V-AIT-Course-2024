package ArrayMethods;

import java.util.Scanner;

public class ArrayMethodsAppl {
    public static void main(String[] args) {


        int[] myArray = ArrayMethods.fillArray(-10,10,30);

        ArrayMethods.printArray(myArray);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.serchInArray(myArray, n);
        System.out.println("Number" + " is in array: "+ isInArray);

        // Тестовый массив остатков на счетах
        double[] balances = {1000.50, 2500.75, 3200.00, 1500.80, 1800.45};

        // Процент для начисления
        double percent = 5.0;

        // Вызываем метод для начисления процентов
        double[] newBalances = ArrayMethods.calculatePercent(balances, percent);

        // Печатаем исходный массив остатков
        System.out.println("Исходные остатки на счетах:");
        ArrayMethods.printArrayDouble(balances);

        // Печатаем массив с начисленными процентами
        System.out.println("Остатки на счетах после начисления процентов:");
        ArrayMethods.printArrayDouble(newBalances);


        int[] myArray1 = {10,20,30,40,50};
        System.out.println(ArrayMethods.linearSearch(myArray1, 10));
        System.out.println(ArrayMethods.linearSearch(myArray1, 100));





    }

}
