package homework_44.tourist_and_countries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tourist {
    private String name;
    private Set<String> countries;

    // Конструктор
    public Tourist(String name, String... countries) {
        this.name = name;
        this.countries = new HashSet<>(Arrays.asList(countries)); // Используем Set для уникальности стран
    }

    public String getName() {
        return name;
    }

    public Set<String> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return name + " -> " + countries;
    }
}
