package homework_31.country;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;


class CountryTest {

    Country[] countries;

    @BeforeEach
    void setUp() {
        countries = new Country[5];
        countries[0] = new Country("Germany", 83000000);
        countries[1] = new Country("Australia", 25000000);
        countries[2] = new Country("China", 1400000000);
        countries[3] = new Country("Brazil", 211000000);
        countries[4] = new Country("Canada", 38000000);
    }

    public void printArray(Object[] array, String titleOfReport) {
        System.out.println("_____________" + titleOfReport + "_________________");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    @Test
    void testComparable() {
        printArray(countries, "List of countries as is");
        Arrays.sort(countries); // Сортировка по названию (по умолчанию)
        printArray(countries, "List of countries sorted by name");
        Country pattern = new Country("France", 0); // Пример для поиска
        int index = Arrays.binarySearch(countries, pattern);
        System.out.println(index >= 0 ? "Country found at index: " + index : "Country not found, but it could be at index: " + (-index - 1));
    }

    @Test
    void testComparatorByPopulation() {
        Comparator<Country> comparatorByPopulation = Comparator.comparingLong(Country::getPopulation);
        Arrays.sort(countries, comparatorByPopulation); // Сортировка по населению
        printArray(countries, "List of countries sorted by population");

        Country pattern = new Country("Unknown", 211000000); // Пример для поиска
        int index = Arrays.binarySearch(countries, pattern, comparatorByPopulation);
        if (index >= 0) {
            System.out.println("Find country with population: " + pattern.getPopulation() + " on index: " + index);
        } else {
            System.out.println("Country with population " + pattern.getPopulation() + " not found, but it could be at index " + (-index - 1));
        }
    }

    @Test
    void testArrayCopy() {
        Country[] countriesCopy = Arrays.copyOf(countries, countries.length * 2);
        printArray(countriesCopy, "countriesCopy as is");
        System.out.println(countriesCopy.length);

        Comparator<Country> comparatorByName = Comparator.nullsLast(Comparator.comparing(Country::getName));
        Arrays.sort(countriesCopy, comparatorByName); // Сортировка по названию с поддержкой null
        printArray(countriesCopy, "countriesCopy after sorting by name");

        Country pattern = new Country("Italy", 0);
        int index = Arrays.binarySearch(countriesCopy, 0, countries.length, pattern, comparatorByName);
        System.out.println(index >= 0 ? "Country found: " + pattern.getName() : "Country not found, could be at index: " + (-index - 1));
    }

    @Test
    void testInsertKeepSorting() {
        Arrays.sort(countries); // Сортировка по умолчанию (название)
        printArray(countries, "Native sorting");

        // Увеличиваем до 6 элементов
        Country[] countriesCopy6 = Arrays.copyOf(countries, countries.length + 1);
        Country newCountry = new Country("France", 67000000);

        int index = Arrays.binarySearch(countriesCopy6, 0, countriesCopy6.length - 1, newCountry);
        index = index >= 0 ? index : -index - 1; // Определяем корректный индекс для вставки

        System.arraycopy(countriesCopy6, index, countriesCopy6, index + 1, countriesCopy6.length - index - 1); // Сдвигаем элементы вправо
        countriesCopy6[index] = newCountry; // Вставляем новый элемент
        countries = countriesCopy6; // Обновляем массив

        printArray(countries, "List with added country");
    }
}


