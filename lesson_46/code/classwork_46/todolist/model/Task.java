package classwork_46.todolist.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
//Класс Task представляет собой основную сущность To-Do List приложения.
// Он хранит данные о задаче (описание и дату),
// предоставляет методы для доступа к этим данным,
// а также реализует интерфейсы для сортировки,
// сравнения и отображения информации о задаче.
public class Task implements Comparable<Task>, Serializable {// нужен для использования байтового потока IO
    private String task; // содержание задачи
    private LocalDate date; // дата создания задачи

    // constructor
    public Task(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    // геттеры и сеттеры
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    // Метод equals для проверки равенства задач
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task1)) return false;
        return Objects.equals(task, task1.task) && Objects.equals(date, task1.date);
    }

    // Метод hashCode для генерации хэш-кода задачи
    @Override
    public int hashCode() {
        return Objects.hash(task, date);
    }

    // метод toString
    @Override
    public String toString() {
        return task + ", data: " + date;
    }

    @Override
    public int compareTo(Task o) {
        return this.date.compareTo(o.date); // сортируем задачи по дате создания
    }
}
