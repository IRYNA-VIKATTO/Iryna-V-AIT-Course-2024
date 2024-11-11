package homework_43.student_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentAppl {

    public static void main(String[] args) {
        // Инициализируем список студентов с их оценками
        List<Student> students = Arrays.asList(
                new Student("Иван", Arrays.asList(5, 4, 3, 5, 4, 4, 5, 4, 5, 5)),
                new Student("Мария", Arrays.asList(3, 4, 4, 2, 3, 5, 4, 3, 4, 3)),
                new Student("Петр", Arrays.asList(4, 4, 4, 4, 4, 4, 4, 4, 4, 4)),
                new Student("Алексей", Arrays.asList(5, 5, 4, 5, 5, 5, 5, 5, 4, 4)),
                new Student("Анна", Arrays.asList(2, 3, 3, 3, 2, 3, 3, 2, 3, 2)),
                new Student("Елена", Arrays.asList(4, 5, 5, 4, 4, 4, 5, 5, 4, 4)),
                new Student("Максим", Arrays.asList(5, 5, 5, 5, 5, 5, 5, 5, 5, 5)),
                new Student("Дарина", Arrays.asList(2, 3, 2, 2, 3, 2, 3, 2, 3, 2)),
                new Student("Сергей", Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3)),
                new Student("Ольга", Arrays.asList(4, 4, 4, 4, 4, 4, 3, 4, 4, 4))
        );

        // Найдём студента с максимальным средним баллом
        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getAverageGrade))
                .orElseThrow(() -> new RuntimeException("Не удалось найти студента с максимальным средним баллом"));

        // Найдём студента с минимальным средним баллом
        Student bottomStudent = students.stream()
                .min(Comparator.comparingDouble(Student::getAverageGrade))
                .orElseThrow(() -> new RuntimeException("Не удалось найти студента с минимальным средним баллом"));

        // Вывод результатов
        System.out.println("Студент с максимальным средним баллом: " + topStudent);
        System.out.println("Студент с минимальным средним баллом: " + bottomStudent);
    }
}
