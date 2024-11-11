package classwork_41.citizens.dao;

import classwork_41.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens{


    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    //создаются два компаратора для сортировки по фамилии и возрасту
    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }
    // конструктор инициализирует три списка

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // Метод добавляет объект Person в три списка: idList, ageList и lastNameList.
    // В каждом списке выполняется бинарный поиск для нахождения индекса для вставки,
    // и затем элемент вставляется в соответствующую позицию
    @Override
    public boolean add(Person person) {
        // что проверяем?Если person равен null, то не добавляем
        if (person == null) {
            return false;
        }
        // что делает этот код? Ищем индекс для вставки в idList с помощью бинарного поиска
        int index = Collections.binarySearch(idList, person); // что делаем?
        if (index >= 0) { //  если index >= 0, то человек уже есть в списке по ID
            return false;
        }
        index = -index - 1; //  если индекс отрицательный, инвертируем и получаем место для вставки
        idList.add(index, person); //  добавляем в список idList
        // что делается в методе далее?Повторяется аналогичная логика для ageList и lastNameList
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;// аналогичное вычисление индекса для списка по возрасту
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1; // аналогичное вычисление индекса для списка по фамилии
        lastNameList.add(index, person);
        return true;
    }

    //  Сначала ищется объект по ID с помощью метода find,
    //  а затем этот объект удаляется из трех списков
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) { // если человек не найден
            return false;
        }
        idList.remove(victim);// удаляем из idList
        ageList.remove(victim); // удаляем из ageList
        lastNameList.remove(victim);// удаляем из lastNameList
        return true;
    }

    // Метод выполняет бинарный поиск по списку idList для поиска объекта с данным ID
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern); // бинарный поиск по id
        return index < 0 ? null : idList.get(index); // если нашли, возвращаем, иначе null
    }

    // Метод находит всех людей в диапазоне от minAge до maxAge
    // Для этого дважды выполняется бинарный поиск: один для минимального возраста, второй — для максимального
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;// поиск нижней границы
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;// поиск верхней границы
        return ageList.subList(from, to);// возвращаем подсписок людей, попадающих в диапазон возраста
    }

    // в методе выполняется поиск по фамилии
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;// поиск нижней границы
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1; // поиск верхней границы
        return lastNameList.subList(from, to);// возвращаем подсписок людей с нужной фамилией
    }

    @Override
    public Iterable<Person> getAllPersonSortedById() {
        return idList;// возвращаем отсортированный по id список
    }

    @Override
    public Iterable<Person> getAllPersonSortedByLastName() {
        return lastNameList; // возвращаем отсортированный по фамилии список
    }

    @Override
    public Iterable<Person> getAllPersonSortedByAge() {
        return ageList;// возвращаем отсортированный по возрасту список
    }


    @Override
    public int size() {
        return idList.size();// возвращаем размер списка по ID
    }
}
