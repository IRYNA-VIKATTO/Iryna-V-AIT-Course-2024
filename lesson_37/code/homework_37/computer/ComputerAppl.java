package homework_37.computer;

import java.util.*;

public class ComputerAppl {


    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("Dell", 16, 512));
        computerList.add(new Computer("HP", 8, 256));
        computerList.add(new Computer("Apple", 16, 1024));
        computerList.add(new Computer("Lenovo", 8, 512));
        computerList.add(new Computer("Dell", 32, 1024));
        computerList.add(new Computer("Asus", 16, 256));

        // Исходный список
        System.out.println("Original list:");
        for (Computer comp : computerList) {
            System.out.println(comp);
        }

        // Сортировка по бренду
        computerList.sort(Comparator.comparing(Computer::getBrand));
        System.out.println("\nSorted by brand:");
        for (Computer comp : computerList) {
            System.out.println(comp);
        }

        System.out.println("=============================================");

        // Добавление элементов в Set для демонстрации уникальности
        Set<Computer> computerSet = new HashSet<>(computerList);
        for (Computer comp : computerSet) {
            System.out.println(comp);
        }

        // Сортировка по RAM, затем по SSD при равных объемах RAM
        Comparator<Computer> comparator = (o1, o2) -> {
            int res = Integer.compare(o1.getRamSize(), o2.getRamSize());
            return res != 0 ? res : Integer.compare(o1.getSsdSize(), o2.getSsdSize());
        };
        computerList.sort(comparator);
        System.out.println("-----------------------------------------");
        System.out.println("Sorted by RAM, then by SSD if RAM is equal:");
        for (Computer comp : computerList) {
            System.out.println(comp);
        }

        // Вычисление общего объема SSD и среднего значения
        int totalSsdSize = computerList.stream().mapToInt(Computer::getSsdSize).sum();
        double averageSsdSize = computerList.stream().mapToInt(Computer::getSsdSize).average().orElse(0);

        System.out.println("\nTotal SSD size: " + totalSsdSize + "GB");
        System.out.println("Average SSD size: " + averageSsdSize + "GB");
    }
}

