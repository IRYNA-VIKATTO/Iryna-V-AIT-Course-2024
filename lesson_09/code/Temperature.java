public class Temperature {
    //Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
    // Выведите на печать температуру, которая была во вторник и затем в четверг.
    // Найти среднюю температуру за прошлую неделю.

    public static void main(String[] args) {

                // Массив данных о температуре за неделю (пн, вт, ср, чт, пт, сб, вс)
                double[] temperatures = {16.5, 17.0, 15.8, 17.3, 14.9, 14.5, 16.0};

                // Вывод температуры во вторник и четверг
                System.out.println("Temperature on Tuesdday: " + temperatures[1] + "°C");
                System.out.println("Temperature on Thursday: " + temperatures[3] + "°C");

                // Вычисление средней температуры за неделю
                double sum = 0;
                for (double temp : temperatures) {
                    sum += temp;
                }

                double averageTemperature = sum / temperatures.length;
                System.out.println("Average temperature for the past week: " + averageTemperature + "°C");

    }
}
