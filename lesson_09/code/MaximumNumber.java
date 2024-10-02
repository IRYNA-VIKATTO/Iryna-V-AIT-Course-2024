public class MaximumNumber {
    public static void main(String[] args) {

        //Написать программу, выводящую на экран максимальное из трех целых чисел.
        // Числа задайте самостоятельно внутри программы.
        // Решите эту задачу с помощью if ... else
         int a = 5;
         int b = 7;
         int c = 2;

        // Найдем максимальное число с использованием if...else
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        // Вывод максимального числа
        System.out.println("Максимальное число : " + max);
    }
}




