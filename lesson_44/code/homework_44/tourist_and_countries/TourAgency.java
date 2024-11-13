package homework_44.tourist_and_countries;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TourAgency {
    // Метод для получения списка туристов
    private static List<Tourist> getTourists() {
        return List.of(
                new Tourist("Name", "C1", "C2", "C3"),
                new Tourist("Olesia", "Iran", "Kyrgystan", "United Arab Emirates", "France", "Italy", "Portugal", "Spain"),
                new Tourist("Bilbo Baggins", "Italy", "Spain", "Turkey"),
                new Tourist("Tatyana", "Italy", "Spain", "Italy", "Greece", "Turkey"),
                new Tourist("Anton", "Germany", "Nederland", "Turkey", "Georgia"),
                new Tourist("Sergei_B", "Tunis", "Turkey", "China", "Vietnam"),
                new Tourist("Galina", "Italy", "France", "Italy"),
                new Tourist("Anatoly", "Montenegro", "Albania", "Greece", "Italy"),
                new Tourist("Andrii", "UK", "Ireland", "Spain"),
                new Tourist("Liubov", "Croatien", "Slovenien", "Spain", "France", "Egypt"),
                new Tourist("Liam", "Spain", "Portugal", "Morocco", "Cyprus"),
                new Tourist("Emma", "Greece", "Turkey", "Croatia", "Montenegro"),
                new Tourist("Mia", "Italy", "Malta", "Spain", "Turkey"),
                new Tourist("Noah", "Turkey", "Greece", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Montenegro", "Albania", "Greece"),
                new Tourist("Lucas", "Portugal", "Spain", "France", "Italy"),
                new Tourist("Amelia", "Greece", "Cyprus", "Spain", "Italy"),
                new Tourist("Oliver", "Spain", "Italy", "Turkey", "Greece"),
                new Tourist("Isabella", "France", "Spain", "Italy", "Greece"),
                new Tourist("Ethan", "Italy", "Greece", "Spain", "Croatia"),
                new Tourist("Ava", "Greece", "Turkey", "Spain", "Italy"),
                new Tourist("Liam", "Spain", "Italy", "Morocco", "Greece"),
                new Tourist("Sophia", "Italy", "Spain", "Turkey", "Greece"),
                new Tourist("Jackson", "Greece", "Spain", "Italy", "Croatia"),
                new Tourist("Olivia", "Croatia", "Greece", "Italy", "Montenegro"),
                new Tourist("Logan", "Spain", "Greece", "Italy", "Turkey"),
                new Tourist("Emma", "Greece", "Italy", "Spain", "Cyprus"),
                new Tourist("Aiden", "Italy", "Greece", "Spain", "Turkey")
        );
    }

    public static void main(String[] args) {

        // Получаем список туристов
        List<Tourist> tourists = getTourists();

        // Задача 1: Найдем наиболее популярные страны
        System.out.println("Наиболее популярные страны:");
        Map<String, Long> countryPopularity = tourists.stream()
                .flatMap(t -> t.getCountries().stream()) // Извлекаем все страны из списка туристов
                .collect(Collectors.groupingBy(country -> country, Collectors.counting())); // Считаем количество каждой страны
        countryPopularity.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue())) // Сортируем по убыванию популярности
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " посещений"));

        // Задача 2: Кто из клиентов посетил наибольшее количество стран?
        System.out.println("\nТурист, посетивший наибольшее количество стран:");
        Tourist mostVisitedTourist = tourists.stream()
                .max(Comparator.comparingInt(t -> t.getCountries().size())) // Находим туриста с максимальным количеством уникальных стран
                .orElseThrow(() -> new RuntimeException("Нет туристов в базе данных"));
        System.out.println(mostVisitedTourist.getName() + " посетил " + mostVisitedTourist.getCountries().size() + " стран.");
    }
}
