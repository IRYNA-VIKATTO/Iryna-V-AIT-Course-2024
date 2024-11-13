package homework_45.to_do_list;

import java.io.Serializable;
//Класс Task:
//Представляет задачу с полями description (описание задачи) и isCompleted (статус завершенности задачи).
//Реализует метод toString() для вывода задачи в удобном формате.
public class Task  implements Serializable {

    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + description;
    }

}
