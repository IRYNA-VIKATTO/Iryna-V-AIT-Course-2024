import java.util.Random;

public class CoinFlipSimulation {
    //Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
    // Запишите результаты в массив.
    // Рассчитайте вероятность выпадения орла и решки.

    public static void main(String[] args) {
        int[] results = new int[100]; // Массив для хранения результатов (1 - орел, 0 - решка)
        int heads = 0; // Количество выпадений орла
        int tails = 0; // Количество выпадений решки

        Random random = new Random(); // Генератор случайных чисел

        // Симуляция 100 подбрасываний монетки
         for (int i = 0; i < 100; i++){
            results[i] = random.nextInt(2); // Генерация случайного числа (0 или 1)
            if (results[i] == 1) {
                heads++; // Увеличение счётчика орлов
            } else {
                tails++; // Увеличение счётчика решек
            }
        }
        // Расчет вероятностей
        double headsProbability = (double) heads / 100;
        double tailsProbability = (double) tails / 100;

        // Вывод результатов
        System.out.println("Количество выпадений орла: " + heads);
        System.out.println("Количество выпадений решки: " + tails);
        System.out.printf("Вероятность выпадения орла: %.2f%%\n", headsProbability * 100);
        System.out.printf("Вероятность выпадения решки: %.2f%%\n", tailsProbability * 100);
    }
}
