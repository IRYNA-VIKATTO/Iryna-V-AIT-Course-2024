public class Minim {


        public static void main(String[] args) {
            int a = 70; // Первое число
            int b = 90; // Второе число

            // Вызов метода для нахождения минимального числа
            int min = minimum(a, b);

            // Вывод результата
            System.out.println("Минимальное число: " + min);
        }

        // Метод для нахождения минимального из двух чисел
        private static int minimum(int a , int b){
            int min = 0;
            if (a <= b){
                min = a;

            }else {
                min = b;
            }
            return min;

        }



}
