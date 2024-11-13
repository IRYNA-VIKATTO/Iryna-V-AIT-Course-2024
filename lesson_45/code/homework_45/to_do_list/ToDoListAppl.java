package homework_45.to_do_list;

import java.util.Scanner;
  //приложение ToDoListAppl:
  //Создает объект ToDoList и предоставляет меню для взаимодействия с пользователем.
  //Поддерживает добавление задач, отображение задач,
  // сохранение задач в файл и выход из приложения.
public class ToDoListAppl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        // Загружаем задачи из файла при старте приложения
        toDoList.loadFromFile();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Сохранить задачи");
            System.out.println("4. Выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Считываем символ новой строки

            switch (choice) {
                case 1:
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.showTasks();
                    break;
                case 3:
                    toDoList.saveToFile();
                    break;
                case 4:
                    System.out.println("Выход из приложения...");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
