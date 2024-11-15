package classwork_46.todolist.dao;

import classwork_46.todolist.model.Task;

import java.util.List;

public interface ToDoList {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();

    List<Task> getAllTasks(); // взять весь список
    // quantity of tasks

    int quantity();

    //Методы saveTasks и loadTasks — это методы для сохранения и загрузки списка задач в/из файла.
    // Эти методы отвечают за сериализацию и десериализацию объектов,
    // что позволяет сохранять состояние объекта (в данном случае — список задач) в файл и затем восстанавливать его.
    void saveTasks(String fileName);

    void loadTasks(String fileName);

}
