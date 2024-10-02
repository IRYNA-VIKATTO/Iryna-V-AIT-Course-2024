import java.util.Scanner;

public class WasteSorting {

    // Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
    //
    //упаковки в желтый бак
    //пищевые отходы в коричневый бак
    //бумага в зеленый бак
    //прочие отходы в черный бак Используйте цифры для кодирования вариантов действий.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("Добро пожаловать в бот для сортировки мусора!");
        System.out.println("Выберите тип мусора:");
        System.out.println("1 - Упаковки");
        System.out.println("2 - Пищевые отходы");
        System.out.println("3 - Бумага");
        System.out.println("4 - Прочие отходы");

        // Чтение выбора пользователя
        choice = scanner.nextInt();

        // Определение бака по выбору пользователя
        switch (choice) {
            case 1:
                System.out.println("Упаковки выбрасываются в ЖЕЛТЫЙ бак.");
                break;
            case 2:
                System.out.println("Пищевые отходы выбрасываются в КОРИЧНЕВЫЙ бак.");
                break;
            case 3:
                System.out.println("Бумага выбрасывается в ЗЕЛЕНЫЙ бак.");
                break;
            case 4:
                System.out.println("Прочие отходы выбрасываются в ЧЕРНЫЙ бак.");
                break;
            default:
                System.out.println("Некорректный выбор. Пожалуйста, выберите число от 1 до 4.");
        }


    }
}
