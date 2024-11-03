package classwork_34.time.test;

import classwork_34.time.utils.DateOperation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @Test
    void getAge() {
        assertEquals(63, DateOperation.getAge("1961-04-12"));
        assertEquals(62, DateOperation.getAge("1961-11-28"));
    }

    @Test
    void sortStringDates() {
        String[] dates = {"2023-05-01", "2021-12-15", "2022-01-01", "2020-11-30"};
        String[] expectedSortedDates = {"2020-11-30", "2021-12-15", "2022-01-01", "2023-05-01"};

        assertArrayEquals(expectedSortedDates, DateOperation.sortStringDates(dates), "Dates should be sorted in ascending order");
    }
}