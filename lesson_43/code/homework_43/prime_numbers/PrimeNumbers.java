package homework_43.prime_numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Набор целых чисел от 10 до 20
        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        // Фильтруем только простые числа
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)  // Отфильтровываем простые числа
                .collect(Collectors.toList());  // Собираем в новый список

        // Выводим простые числа
        System.out.println("Простые числа: " + primeNumbers);
    }

    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) return false;  // Числа <= 1 не простые
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Число делится на i, значит оно не простое
            }
        }
        return true;  // Если делителей не найдено, то число простое
    }
}
