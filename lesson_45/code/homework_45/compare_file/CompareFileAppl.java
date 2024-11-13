package homework_45.compare_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
// В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main.
// Имена файлов принимать через массив args.
// Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты.
// Результат должен быть выведен на консоль в виде сообщения.
public class CompareFileAppl {
    public static void main(String[] args) {
        // Проверяем, что передано два имени файла
        if (args.length != 2) {
            System.out.println("Ошибка: необходимо указать два файла для сравнения.");
            return;
        }

        String file1Path = args[0];
        String file2Path = args[1];

        // Сравниваем файлы
        try {
            if (areFilesEqual(file1Path, file2Path)) {
                System.out.println("Файлы одинаковые.");
            } else {
                System.out.println("Файлы разные.");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файлов: " + e.getMessage());
        }
    }

    // Метод для сравнения файлов
    private static boolean areFilesEqual(String file1Path, String file2Path) throws IOException {
        File file1 = new File(file1Path);
        File file2 = new File(file2Path);

        // Сравниваем размеры файлов
        if (file1.length() != file2.length()) {
            return false;  // Файлы разные по размеру
        }

        // Сравниваем содержимое файлов
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false;  // Найдено различие в содержимом
                }
            }
        }

        return true;  // Файлы одинаковые
    }
}
