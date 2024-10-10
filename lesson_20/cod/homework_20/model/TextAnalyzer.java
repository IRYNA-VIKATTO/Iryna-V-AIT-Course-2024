package homework_20.model;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя строку
        System.out.println("Введите строку (например: 'Мама мыла раму.'):");
        String input = scanner.nextLine();

        // Анализируем строку
        int totalChars = input.length();
        int upperCaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        // Проходим по каждому символу строки и анализируем его
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
            if (ch == ' ') {
                spaceCount++;
            }
        }

        // Определяем тип предложения по последнему символу
        String sentenceType;
        if (input.endsWith(".")) {
            sentenceType = "повествовательное";
        } else if (input.endsWith("?")) {
            sentenceType = "вопросительное";
        } else if (input.endsWith("!")) {
            sentenceType = "восклицательное";
        } else {
            sentenceType = "неопределенный тип";
        }

        // Выводим результаты анализа
        System.out.println("Количество символов в строке: " + totalChars);
        System.out.println("Количество символов в верхнем регистре: " + upperCaseCount);
        System.out.println("Количество цифр в строке: " + digitCount);
        System.out.println("Количество пробелов в строке: " + spaceCount);
        System.out.println("Тип предложения: " + sentenceType);

        // Закрываем сканер
        scanner.close();


    }
}
