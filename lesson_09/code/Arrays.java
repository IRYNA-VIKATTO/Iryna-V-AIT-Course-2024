public class Arrays {



        public static void main(String[] args) {
            // Инициализируем массив для хранения четных чисел от 0 до 50
            int[] evenNumbers = new int[26]; // Массив из 26 элементов (0, 2, 4, ..., 50)

            // Заполняем массив четными числами
            System.out.print("Массив в порядке возрастания: [");
            for (int i = 0, number = 0; i < evenNumbers.length; i++, number += 2) {
                evenNumbers[i] = number;
                System.out.print(evenNumbers[i]);
                if (i > 0) {
                    System.out.print(", ");
                }

            }
            System.out.println("]");

            // Вывод массива в порядке возрастания



            // Вывод массива в порядке убывания
            System.out.print("Массив в порядке убывания: [");
            for (int i = evenNumbers.length - 1; i >= 0; i--) {
                System.out.print(evenNumbers[i]);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }



