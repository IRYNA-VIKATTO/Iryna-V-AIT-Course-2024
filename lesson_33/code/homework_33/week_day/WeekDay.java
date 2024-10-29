package homework_33.week_day;

public enum WeekDay {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String name;

    // Конструктор для инициализации имени дня недели
    WeekDay(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "name='" + name + '\'' +
                '}';
    }

    public int ordinalValue() {
        return this.ordinal();
    }

    public static WeekDay valueOfDay(String name) {
        return WeekDay.valueOf(name.toUpperCase());
    }

    // Метод, позволяющий прибавить дни к текущему дню недели
    public WeekDay addDays(int quantity) {
        int currentOrdinal = this.ordinal();
        int newOrdinal = (currentOrdinal + quantity) % WeekDay.values().length;

        // Коррекция, если newOrdinal отрицательный
        if (newOrdinal < 0) {
            newOrdinal += WeekDay.values().length;
        }

        return WeekDay.values()[newOrdinal];
    }
}
