package homework_38.temperature;

import java.time.LocalDate;
import java.util.LinkedList;

public class TemperatureAnalysis {

    public static void main(String[] args) {
        // Данные для последней недели октября
        LinkedList<DayTemperature> octoberTemperatures = new LinkedList<>();
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 25), 13.5));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 26), 12.3));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 27), 14.0));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 28), 11.8));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 29), 10.4));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 30), 12.0));
        octoberTemperatures.add(new DayTemperature(LocalDate.of(2024, 10, 31), 13.0));

        // Данные для первой недели ноября
        LinkedList<DayTemperature> novemberTemperatures = new LinkedList<>();
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 1), 12.5));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 2), 13.8));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 3), 14.3));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 4), 10.9));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 5), 11.4));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 6), 9.6));
        novemberTemperatures.add(new DayTemperature(LocalDate.of(2024, 11, 7), 8.9));

        // Объединяем данные октября и ноября в один список
        LinkedList<DayTemperature> allTemperatures = new LinkedList<>(octoberTemperatures);
        allTemperatures.addAll(novemberTemperatures);

        // Расчет средней температуры
        double averageTemperature = calculateAverageTemperature(allTemperatures);
        System.out.println("Средняя температура за прошедшие две недели: " + averageTemperature + "°C");

        // Нахождение дня с минимальной температурой
        DayTemperature minTemperatureDay = findMinTemperatureDay(allTemperatures);
        if (minTemperatureDay != null) {
            System.out.println("День с минимальной температурой: " + minTemperatureDay);
        }

        // Нахождение дня с максимальной температурой
        DayTemperature maxTemperatureDay = findMaxTemperatureDay(allTemperatures);
        if (maxTemperatureDay != null) {
            System.out.println("День с максимальной температурой: " + maxTemperatureDay);
        }
    }

    // Метод для расчета средней температуры
    public static double calculateAverageTemperature(LinkedList<DayTemperature> temperatures) {
        if (temperatures.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (DayTemperature temp : temperatures) {
            sum += temp.getTemperature();
        }
        return sum / temperatures.size();
    }

    // Метод для поиска дня с минимальной температурой
    public static DayTemperature findMinTemperatureDay(LinkedList<DayTemperature> temperatures) {
        if (temperatures.isEmpty()) {
            return null;
        }

        DayTemperature minTemperatureDay = temperatures.get(0);
        for (DayTemperature temp : temperatures) {
            if (temp.getTemperature() < minTemperatureDay.getTemperature()) {
                minTemperatureDay = temp;
            }
        }
        return minTemperatureDay;
    }

    // Метод для поиска дня с максимальной температурой
    public static DayTemperature findMaxTemperatureDay(LinkedList<DayTemperature> temperatures) {
        if (temperatures.isEmpty()) {
            return null;
        }

        DayTemperature maxTemperatureDay = temperatures.get(0);
        for (DayTemperature temp : temperatures) {
            if (temp.getTemperature() > maxTemperatureDay.getTemperature()) {
                maxTemperatureDay = temp;
            }
        }
        return maxTemperatureDay;
    }

}
