package homework_39.currency;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        // Используем HashSet для хранения уникальных валют
        Set<Currency> currencySet = new HashSet<>();

        // Добавляем валюты в HashSet
        for (Currency currency : Currency.values()) {
            currencySet.add(currency);
        }

        // Выводим все валюты и их курсы
        System.out.println("Доступные валюты и их курсы к евро:");
        for (Currency currency : currencySet) {
            System.out.println(currency + ": " + currency.getRateToEuro() + " к евро");
        }

        Scanner scanner = new Scanner(System.in);

        // Пользователь выбирает валюту для конвертации
        System.out.print("\nВведите код валюты для конвертации в евро: ");
        String currencyCode = scanner.next().toUpperCase();

        // Проверяем, существует ли введённая валюта в Currency
        boolean isCurrencyValid = false;
        Currency selectedCurrency = null;
        for (Currency currency : Currency.values()) {
            if (currency.name().equals(currencyCode)) {
                selectedCurrency = currency;
                isCurrencyValid = true;
                break;
            }
        }

        if (!isCurrencyValid) {
            System.out.println("Ошибка: валюта не найдена.");
            return;
        }

        // Запрашиваем количество валюты
        System.out.print("Введите количество " + selectedCurrency + ": ");
        double amount = scanner.nextDouble();

        // Рассчитываем эквивалент в евро
        double resultInEuro = amount / selectedCurrency.getRateToEuro();
        System.out.printf("Вы получите: %.2f EUR\n", resultInEuro);
    }
}

