package homework_42.country_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryCounter {
    public static void main(String[] args) {
        // Создание Map, где ключом является континент, а значением - список стран
        Map<String, List<String>> countriesByContinent = new HashMap<>();

        // Заполняем Map с континентами и соответствующими странами
        countriesByContinent.put("Africa", Arrays.asList("Nigeria", "Egypt", "South Africa", "Kenya", "Ethiopia"));
        countriesByContinent.put("Asia", Arrays.asList("China", "India", "Japan", "South Korea", "Indonesia"));
        countriesByContinent.put("Europe", Arrays.asList("Germany", "France", "Italy", "Spain", "Poland"));
        countriesByContinent.put("North America", Arrays.asList("United States", "Canada", "Mexico", "Cuba", "Jamaica"));
        countriesByContinent.put("South America", Arrays.asList("Brazil", "Argentina", "Chile", "Colombia", "Peru"));
        countriesByContinent.put("Oceania", Arrays.asList("Australia", "New Zealand", "Fiji", "Papua New Guinea"));
        countriesByContinent.put("Antarctica", Arrays.asList("Antarctica"));  // Для простоты, только один пункт

        // Подсчёт количества стран на каждом континенте
        System.out.println("Количество стран на континентах:");
        countriesByContinent.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().size()) // Формируем строку с континентом и количеством стран
                .forEach(System.out::println);

        // Дополнительно, если хочется вывести сами страны
        System.out.println("\nСтраны по континентам:");
        countriesByContinent.forEach((continent, countries) -> {
            System.out.println(continent + ": " + countries);
        });
    }

}
