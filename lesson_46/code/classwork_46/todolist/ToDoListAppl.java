package classwork_46.todolist;

import classwork_46.todolist.dao.ToDoListImpl;
import classwork_46.todolist.model.Menu;
import classwork_46.todolist.model.Task;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class ToDoListAppl  implements Serializable {


    public static final String FILE_NAME = "task_list.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListImpl toDoList = new ToDoListImpl();
        LocalDate now = LocalDate.now();

        while (true) {
            // Отображаем меню
            Menu.printMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Пропускаем остаток строки

            switch (choice) {
                case 1: // Добавить задачу
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    Task task = new Task(taskDescription, now);
                    toDoList.addTask(task);
                    break;

                case 2: // Показать все задачи
                    toDoList.viewTasks();
                    break;

                case 3: // Удалить задачу
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    break;

                case 4: // Редактировать задачу- блок для обработки нового пункта меню
                    System.out.print("Enter task number to edit: ");
                    taskNumber = scanner.nextInt();
                    scanner.nextLine(); // Пропускаем остаток строки
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoList.editTask(taskNumber, newDescription);
                    break;

                case 5: // Сохранить задачи
                    toDoList.saveTasks(FILE_NAME);
                    break;

                case 6: // Загрузить задачи
                    toDoList.loadTasks(FILE_NAME);
                    break;

                case 7: // Выход
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}