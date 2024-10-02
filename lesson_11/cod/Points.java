import java.util.Random;

public class Points {


        public static void main(String[] args) {
            // Инициализируем генератор случайных чисел
            Random random = new Random();

            // Переменная для хранения общего количества очков
            int totalPoints = 0;

            // Флаг для проверки, было ли попадание в центр мишени
            boolean hitCenter = false;

            // Моделирование 10 выстрелов
            for (int i = 1; i <= 10; i++) {
                // Генерация случайных очков от 0 до 10
                int points = random.nextInt(11); // nextInt(11) генерирует числа от 0 до 10 включительно
                System.out.println("Выстрел " + i + ": " + points + " очков");

                // Добавляем очки к общему количеству
                totalPoints += points;

                // Проверяем, было ли попадание в центр мишени
                if (points == 10) {
                    hitCenter = true;
                }
            }

            // Вывод общего количества очков
            System.out.println("Общее количество очков: " + totalPoints);

            // Проверка, было ли попадание в центр мишени
            if (hitCenter) {
                System.out.println("Стрелок попал в центр мишени хотя бы один раз.");
            } else {
                System.out.println("Стрелок не попал в центр мишени.");
            }
        }



}
