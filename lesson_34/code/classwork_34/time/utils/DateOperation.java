package classwork_34.time.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class DateOperation {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    //  Этот метод принимает дату рождения в виде стринга,
//    и возвращающий возраст.

    public static int getAge(String birthDateString) {

        LocalDate birthDate = LocalDate.parse(birthDateString, DATE_FORMATTER);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public static String[] sortStringDates(String[] dateStrings) {
        LocalDate[] dates = Arrays.stream(dateStrings)
                .map(date -> LocalDate.parse(date, DATE_FORMATTER))
                .toArray(LocalDate[]::new);

        Arrays.sort(dates);

        return Arrays.stream(dates)
                .map(date -> date.format(DATE_FORMATTER))
                .toArray(String[]::new);
    }
}
