package classwork_46.todolist.model;

import java.io.Serializable;
// В меню теперь есть опция редактирования задач.
public enum Menu implements Serializable {

    ADD(1, "Add task"),
    LIST(2, "List of tasks"),
    REMOVE(3, "Remove task"),
    EDIT(4, "Edit task"),//опция редактирования задач
    SAVE(5, "Save"),
    LOAD(6, "Load"),
    EXIT(7, "Exit");

    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }

    public static void printMenu() {
        for (Menu option : Menu.values()) {
            System.out.print(option.menuItem + " - " + option.action + " | ");
        }
        System.out.println();
    }

}
