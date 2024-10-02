public class Maximum {
//**Задание 3.** Написать метод, возвращающий максимальное из двух целых чисел.
//  Реализовать метод, который возвращает максимальное из трех целых чисел. Числа задаются в программе.
//  Написать метод, возвращающий максимальное из двух целых чисел, использовать тернарный оператор.
    public static void main(String[] args) {

        //здесь будет вызов метода

            int a = 45;
            int b = 34;

            int max = maximum(a , b);
            System.out.println("Maximum ="+ max);
        }

        //здесь будет метод
        private static int maximum(int a , int b){
            int max = 0;
            if (a >= b){
            max = a;

        }else {
            max = b;
        }
        return max;

    }
}
