package classwork_46.todolist.dao;

import classwork_46.todolist.ToDoListAppl;
import classwork_46.todolist.model.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
//В ToDoListImpl добавлен метод editTask, который позволяет редактировать описание задачи по номеру.
public class ToDoListImpl implements ToDoList{
    // Хранилище задач
    private List<Task> tasks;

    public ToDoListImpl() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public boolean addTask(Task task) {
        if (task == null || tasks.contains(task)) {
            System.out.println("Task cannot be null or duplicate.");
            return false;
        }
        tasks.add(task);
        return true;
    }

    @Override
    public Task removeTask(int taskNumber) {
        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return null;
        }
        Task taskToRemove = tasks.get(taskNumber - 1);
        tasks.remove(taskToRemove);
        System.out.println("Task removed: " + taskToRemove);
        return taskToRemove;
    }
// Задачи теперь сортируются по дате перед отображением с помощью
// tasks.sort(Comparator.comparing(Task::getDate)); в методе viewTasks().
    @Override
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        tasks.sort(Comparator.comparing(Task::getDate)); // Сортировка задач по дате
        IntStream.range(0, tasks.size())
                .forEach(i -> System.out.println((i + 1) + ". " + tasks.get(i)));
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);  // Возвращаем копию списка
    }

    @Override
    public int quantity() {
        return tasks.size();
    }

    @Override
    public void saveTasks(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(tasks);
            System.out.println("Tasks have been saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving tasks: " + e.getMessage());
        }
    }

    @Override
    public void loadTasks(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            tasks = (List<Task>) ois.readObject();
            System.out.println("Tasks loaded from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading tasks: " + e.getMessage());
        }
    }

    // Редактирование задачи
    public boolean editTask(int taskNumber, String newTaskDescription) {
        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
            return false;
        }
        Task taskToEdit = tasks.get(taskNumber - 1);
        taskToEdit.setTask(newTaskDescription);
        System.out.println("Task updated: " + taskToEdit);
        return true;
    }
}