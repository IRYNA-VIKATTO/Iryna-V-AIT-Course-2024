package homework_43.boat_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BoatAppl {
    public static void main(String[] args) {
        // Создание набора яхт
        List<Boat> boats = new ArrayList<>();
        boats.add(new Boat("Beneteau", "France", 2018, 12.5, "Plastic", 300000));
        boats.add(new Boat("Sunseeker", "UK", 2020, 15.0, "Metal", 500000));
        boats.add(new Boat("Azimut", "Italy", 2015, 14.0, "Wood", 450000));
        boats.add(new Boat("Princess", "UK", 2021, 13.5, "Plastic", 550000));
        boats.add(new Boat("Ferretti", "Italy", 2019, 16.0, "Metal", 650000));
        boats.add(new Boat("Jeanneau", "France", 2017, 11.0, "Wood", 250000));
        boats.add(new Boat("Lagoon", "France", 2016, 20.0, "Plastic", 800000));

        // Отобразить все яхты
        System.out.println("Все яхты:");
        boats.forEach(System.out::println);

        // Отобразить яхты, сделанные из указанного материала корпуса (например, "Wood")
        String materialFilter = "Wood";
        System.out.println("\nЯхты из материала " + materialFilter + ":");
        boats.stream()
                .filter(boat -> boat.getMaterial().equalsIgnoreCase(materialFilter))
                .forEach(System.out::println);

        // Отобразить яхты дороже указанной цены (например, 500000)
        double priceFilter = 500000;
        System.out.println("\nЯхты дороже " + priceFilter + ":");
        boats.stream()
                .filter(boat -> boat.getPrice() > priceFilter)
                .forEach(System.out::println);

        // Отобразить яхты, чей год выпуска находится в заданном диапазоне (например, от 2016 до 2020)
        int yearStart = 2016;
        int yearEnd = 2020;
        System.out.println("\nЯхты, выпущенные с " + yearStart + " по " + yearEnd + ":");
        boats.stream()
                .filter(boat -> boat.getYear() >= yearStart && boat.getYear() <= yearEnd)
                .forEach(System.out::println);

        // Отсортировать яхты в порядке убывания стоимости
        System.out.println("\nЯхты, отсортированные по убыванию стоимости:");
        boats.stream()
                .sorted(Comparator.comparingDouble(Boat::getPrice).reversed())
                .forEach(System.out::println);

        // Получить среднюю стоимость яхт
        double averagePrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0);
        System.out.println("\nСредняя стоимость яхты: " + averagePrice);

        // Подсчитать, сколько и какие яхты под каким флагом стоят в порту
        System.out.println("\nЯхты по флагам:");
        boats.stream()
                .collect(Collectors.groupingBy(Boat::getFlag))
                .forEach((flag, boatList) -> {
                    System.out.println("Флаг: " + flag);
                    boatList.forEach(System.out::println);
                });
    }
}
