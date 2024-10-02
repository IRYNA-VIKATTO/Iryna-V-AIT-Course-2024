import java.util.Scanner;

public class Time {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите часы : ");
        int hour = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите минуты : ");
        int min = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите секунды : ");
        int sec = scanner2.nextInt();

        int totalSeconds = calculateSeconds( min,  hour, sec);
        System.out.println("Всего  с начала суток прошло секунд: "+ totalSeconds);
    }

    public static int calculateSeconds(int min , int hour, int sec ) {
         int totalSeconds = hour * 3600 +  min * 60 + sec;
        return totalSeconds;
    }
}
