package homework_39.course_enrollment;

import java.util.HashSet;
import java.util.Set;

public class CourseEnrollmentApp {

    public static void main(String[] args) {
        // Создаем списки студентов для каждого курса
        Set<String> mathCourse = new HashSet<>();
        Set<String> csCourse = new HashSet<>();

        // Добавляем студентов на курс Математика
        mathCourse.add("Анна");
        mathCourse.add("Борис");
        mathCourse.add("Елена");
        mathCourse.add("Дмитрий");

        // Добавляем студентов на курс Информатика
        csCourse.add("Виктор");
        csCourse.add("Борис");
        csCourse.add("Елена");
        csCourse.add("Светлана");

        // Список студентов, записанных на оба курса (пересечение множеств)
        Set<String> bothCourses = new HashSet<>(mathCourse);
        bothCourses.retainAll(csCourse); // пересечение множеств
        System.out.println("Студенты, записанные на оба курса: " + bothCourses);

        // Список студентов, записанных только на один курс (симметрическая разность множеств)
        Set<String> onlyOneCourse = new HashSet<>(mathCourse);
        onlyOneCourse.addAll(csCourse); // объединяем множества
        onlyOneCourse.removeAll(bothCourses); // убираем студентов, которые на обоих курсах
        System.out.println("Студенты, записанные только на один из курсов: " + onlyOneCourse);
    }
}
