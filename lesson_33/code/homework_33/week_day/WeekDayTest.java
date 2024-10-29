package homework_33.week_day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WeekDayTest {
    @Test
    void testAddDays() {
        assertEquals(WeekDay.THURSDAY, WeekDay.MONDAY.addDays(10), "Monday + 10 days should be Thursday");
        assertEquals(WeekDay.TUESDAY, WeekDay.SUNDAY.addDays(2), "Sunday + 2 days should be Tuesday");
        assertEquals(WeekDay.FRIDAY, WeekDay.FRIDAY.addDays(0), "Friday + 0 days should be Friday");
        assertEquals(WeekDay.THURSDAY, WeekDay.SATURDAY.addDays(5), "Saturday + 5 days should be Thursday");

        // Дополнительные случаи для проверки отрицательных значений
        assertEquals(WeekDay.TUESDAY, WeekDay.THURSDAY.addDays(-2), "Thursday - 2 days should be Tuesday");
        assertEquals(WeekDay.SATURDAY, WeekDay.SUNDAY.addDays(-1), "Sunday - 1 day should be Saturday");

        // Проверка добавления недельного количества дней (должен вернуться к начальному дню)
        assertEquals(WeekDay.MONDAY, WeekDay.MONDAY.addDays(7), "Monday + 7 days should be Monday");
        assertEquals(WeekDay.SATURDAY, WeekDay.SATURDAY.addDays(14), "Saturday + 14 days should be Saturday");
    }

  
}