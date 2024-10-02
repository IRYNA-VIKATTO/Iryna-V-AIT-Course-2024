public class PriceOfElectricity {

    // Анна использует различные электроприборы в своем доме.
    // У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт.
    // Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро.
    // Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption)
    // Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)


        public static void main(String[] args) {
            // Потребляемая мощность приборов в Вт
            int fridgePower = 150;  // Холодильник (Вт)
            int acPower = 2000;     // Кондиционер (Вт)

            // Стоимость 1 кВт·ч в евро
            double pricePerKwh = 0.15;

            // Вызов метода для вычисления потребления электроэнергии в час
            double hourlyConsumption = calculateHourlyConsumption(fridgePower, acPower);
            System.out.println("Общее потребление электроэнергии в час: " + hourlyConsumption + " кВт·ч");

            // Предполагаем, что приборы работают 24 часа в сутки, 30 дней в месяц
            int hoursPerDay = 24;
            int daysPerMonth = 30;

            // Вызов метода для вычисления стоимости электроэнергии за месяц
            double monthlyCost = calculateMonthlyCost(hourlyConsumption, pricePerKwh, hoursPerDay, daysPerMonth);
            System.out.println("Общая стоимость электроэнергии в месяц  : " + monthlyCost + " евро");
        }

        // Метод для вычисления потребления электроэнергии в час (в кВт·ч)
        public static double calculateHourlyConsumption(int fridgePower, int acPower) {
            // Переводим мощность из Вт в кВт (1 кВт = 1000 Вт)
            return (fridgePower + acPower) / 1000.0;
        }

        // Метод для вычисления месячной стоимости электроэнергии
        public static double calculateMonthlyCost(double hourlyConsumption, double pricePerKwh, int hoursPerDay, int daysPerMonth) {
            // Общее потребление электроэнергии за месяц (кВт·ч)
            double totalConsumption = hourlyConsumption * hoursPerDay * daysPerMonth;
            // Стоимость электроэнергии за месяц
            return totalConsumption * pricePerKwh;
        }


}
