package homework_30.date_string_sort.test;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            // Разбиваем строки на составляющие: день, месяц, год
            String[] date1Parts = s1.split("-");
            String[] date2Parts = s2.split("-");

            // Сравниваем годы
            int yearComparison = Integer.compare(Integer.parseInt(date1Parts[2]), Integer.parseInt(date2Parts[2]));
            if (yearComparison != 0) {
                return yearComparison;
            }

            // Сравниваем месяцы
            int monthComparison = Integer.compare(Integer.parseInt(date1Parts[1]), Integer.parseInt(date2Parts[1]));
            if (monthComparison != 0) {
                return monthComparison;
            }

            // Сравниваем дни
            return Integer.compare(Integer.parseInt(date1Parts[0]), Integer.parseInt(date2Parts[0]));
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}
