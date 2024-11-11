package homework_43.student_stream;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    // Конструктор
    public Student(String name, List<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    // Получение имени студента
    public String getName() {
        return name;
    }

    // Получение списка оценок студента
    public List<Integer> getGrades() {
        return grades;
    }

    // Метод для вычисления среднего балла студента
    public double getAverageGrade() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }

    @Override
    public String toString() {
        return name + " (средний балл: " + getAverageGrade() + ")";
    }

}



