package homework_44.book_and_computer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerAppl {
    public static void main(String[] args) {
        // Создаем список компьютеров
        List<Computer> computers = Arrays.asList(
                new Computer("Dell XPS 13", "Intel i7", 16, 512, 1200),
                new Computer("MacBook Pro", "Intel i9", 32, 1024, 2500),
                new Computer("HP Pavilion", "AMD Ryzen 5", 8, 256, 600),
                new Computer("Lenovo ThinkPad", "Intel i5", 16, 512, 1000),
                new Computer("Asus ROG", "AMD Ryzen 7", 16, 1024, 1800)
        );

        // Отобразить все компьютеры
        System.out.println("Все компьютеры:");
        computers.forEach(System.out::println);

        // Отобразить компьютеры с определённым объёмом памяти (например, 16 ГБ)
        int ramFilter = 16;
        System.out.println("\nКомпьютеры с " + ramFilter + " ГБ памяти:");
        computers.stream()
                .filter(computer -> computer.getRam() == ramFilter)
                .forEach(System.out::println);

        // Отобразить компьютеры, стоимость которых меньше определённой цены
        double priceFilter = 1500;
        System.out.println("\nКомпьютеры дешевле " + priceFilter + ":");
        computers.stream()
                .filter(computer -> computer.getPrice() < priceFilter)
                .forEach(System.out::println);

        // Отобразить компьютеры с процессорами определённого типа (например, Intel i7)
        String cpuFilter = "Intel i7";
        System.out.println("\nКомпьютеры с процессором " + cpuFilter + ":");
        computers.stream()
                .filter(computer -> computer.getCpu().equalsIgnoreCase(cpuFilter))
                .forEach(System.out::println);

        // Отсортировать компьютеры по объему памяти (по убыванию)
        System.out.println("\nКомпьютеры, отсортированные по объему памяти (по убыванию):");
        computers.stream()
                .sorted(Comparator.comparingInt(Computer::getRam).reversed())
                .forEach(System.out::println);

        // Получить среднюю стоимость компьютеров
        double averagePrice = computers.stream()
                .mapToDouble(Computer::getPrice)
                .average()
                .orElse(0);
        System.out.println("\nСредняя цена компьютеров: " + averagePrice);

        // Подсчитать количество компьютеров по процессорам
        System.out.println("\nКоличество компьютеров по процессорам:");
        computers.stream()
                .collect(Collectors.groupingBy(Computer::getCpu))
                .forEach((cpu, computerList) -> {
                    System.out.println(cpu + ": " + computerList.size());
                });
    }
}
