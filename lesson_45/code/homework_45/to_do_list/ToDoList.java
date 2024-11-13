package homework_45.to_do_list;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
//Класс ToDoList:
//Хранит список задач в поле tasks (список объектов Task).
//Метод saveToFile() сериализует список задач в файл todolist.dat с использованием ObjectOutputStream.
//Метод loadFromFile() десериализует задачи из файла при запуске приложения.
//Метод showTasks() выводит список задач на экран.
public class ToDoList {

    private List<Task> tasks;
    private final String filename = "todolist.dat";  // Файл для сохранения задач

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // Метод для добавления задачи в список
    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    // Метод для сохранения списка задач в файл
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(tasks);
            System.out.println("Задачи сохранены в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении задач в файл: " + e.getMessage());
        }
    }

    // Метод для загрузки задач из файла
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            tasks = (List<Task>) ois.readObject();
            System.out.println("Задачи загружены из файла " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке задач из файла: " + e.getMessage());
        }
    }

    // Метод для отображения всех задач
    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
