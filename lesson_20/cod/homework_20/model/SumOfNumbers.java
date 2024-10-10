package homework_20.model;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя строку с числами
        System.out.println("Введите строку, содержащую целые числа, разделенные пробелами:");
        String input = scanner.nextLine();

        // Разделяем строку по пробелам и сохраняем в массив строк
        String[] numbers = input.split(" ");

        // Инициализируем переменную для хранения суммы
        int sum = 0;

        // Проходим по каждому числу в строке, преобразуем его в целое число и добавляем к сумме
        for (String number : numbers) {
            try {
                // Используем класс-обёртку Integer для преобразования строки в целое число
                int num = Integer.parseInt(number);
                sum += num;
            } catch (NumberFormatException e) {
                // Если встречается не число, выводим сообщение об ошибке и продолжаем
                System.out.println("'" + number + "' не является целым числом и будет пропущено.");
            }

        }

        // Выводим сумму всех введенных чисел
        System.out.println("Сумма введенных чисел: " + sum);

        // Закрываем сканер
        scanner.close();
    }
}
