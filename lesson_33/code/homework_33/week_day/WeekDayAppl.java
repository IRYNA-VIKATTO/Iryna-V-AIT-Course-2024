package homework_33.week_day;

public class WeekDayAppl {
    public static void main(String[] args) {
        // Показать все дни недели
        System.out.println("-------values() of Enum-------------");
        for (WeekDay day : WeekDay.values()) {
            System.out.println(day + " (ordinal: " + day.ordinal() + ")");
        }

        // Показать toString()
        System.out.println("-------------toString()-------------");
        String str = WeekDay.FRIDAY.toString();
        System.out.println("toString() for FRIDAY: " + str);

        // Показать ordinal()
        System.out.println("-------------ordinal()-------------");
        int mondayOrdinal = WeekDay.MONDAY.ordinal();
        System.out.println("Ordinal of MONDAY: " + mondayOrdinal);

        // Показать valueOf()
        System.out.println("-------------valueOf()-------------");
        WeekDay parsedDay = WeekDay.valueOfDay("WEDNESDAY");
        System.out.println("Parsed from string 'WEDNESDAY': " + parsedDay);

        // Демонстрация метода addDays
        System.out.println("-------------addDays()-------------");
        WeekDay startDay = WeekDay.MONDAY;
        int daysToAdd = 10;
        WeekDay resultDay = startDay.addDays(daysToAdd);
        System.out.println("Starting day: " + startDay + ", after adding " + daysToAdd + " days: " + resultDay);
    }


}
