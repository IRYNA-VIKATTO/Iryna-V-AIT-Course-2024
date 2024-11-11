package homework_38.germany_cities;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GermanyLinkedListAppl {

    public static void main(String[] args) {
        // Создаем LinkedList для городов
        List<String> cities = new LinkedList<>();

        // Заполняем список городов - столиц земель Германии
        fillCityList(cities);

        // Выводим начальный список
        System.out.println("Начальный список городов:");
        printList(cities);

        // Добавляем город Гамбург в начало, середину и конец списка
        cities.add(0, "Гамбург");  // начало
        cities.add(cities.size() / 2, "Гамбург");  // середина
        cities.add("Гамбург");  // конец
        System.out.println("\nСписок после добавления Гамбурга в начало, середину и конец:");
        printList(cities);

        // Сортировка по алфавиту
        Collections.sort(cities);
        System.out.println("\nСписок, отсортированный по алфавиту:");
        printList(cities);

        // Сортировка в обратном порядке
        cities.sort(Collections.reverseOrder());
        System.out.println("\nСписок, отсортированный в обратном алфавитном порядке:");
        printList(cities);

        // Демонстрация удаления городов по условию
        System.out.println("\nУдаление всех вхождений 'Гамбург':");
        cities.removeIf(city -> city.equals("Гамбург"));
        printList(cities);

        // Удаление по индексу
        if (!cities.isEmpty()) {
            cities.remove(0);  // удаляем первый элемент
        }
        System.out.println("\nСписок после удаления первого элемента:");
        printList(cities);

        // Удаление всех городов, которые содержат букву "и"
        cities.removeIf(city -> city.contains("и"));
        System.out.println("\nСписок после удаления всех городов, содержащих букву 'и':");
        printList(cities);
    }

    // Метод для заполнения списка столиц земель Германии
    private static void fillCityList(List<String> cities) {
        cities.add("Берлин");      // столица Германии и земля Берлин
        cities.add("Мюнхен");      // столица Баварии
        cities.add("Штутгарт");    // столица Баден-Вюртемберга
        cities.add("Дрезден");     // столица Саксонии
        cities.add("Ганновер");    // столица Нижней Саксонии
        cities.add("Висбаден");    // столица Гессена
        cities.add("Киль");        // столица Шлезвиг-Гольштейна
        cities.add("Майнц");       // столица Рейнланд-Пфальца
    }

    // Метод для вывода списка
    private static void printList(List<String> list) {
        for (String city : list) {
            System.out.print(city + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
    }
}
