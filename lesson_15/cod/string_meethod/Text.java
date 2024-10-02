package string_meethod;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных от пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем ввод текста
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        // 1. Сообщаем, сколько слов в строке
        String[] words = inputText.trim().split("\\s+");  // Разделяем строку на слова
        int wordCount = words.length;
        System.out.println("Количество слов: " + wordCount);

        // 2. Сообщаем, сколько букв (символов) в строке (без учета пробелов)
        int letterCount = inputText.replaceAll("\\s+", "").length();
        System.out.println("Количество букв (без учета пробелов): " + letterCount);

        // 3. Печатаем текст задом наперед, начиная с последнего слова
        System.out.print("Текст задом наперед: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }

}
