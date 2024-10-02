import java.util.Scanner;

public class PartOfDay {

    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время : ");
        int num = scanner.nextInt();

        System.out.println(getPartOfDay(num));
    }
    public static String getPartOfDay(Integer hour){

        if (hour > 6 && hour <= 12){
            return "Доброе утро !";
        }else if (hour> 12 && hour <= 18){
            return "Добрый день !";

        }else if(hour >18 && hour <= 24){
            return  "Добрый вечер !";

        }else if (hour > 0 && hour <= 6){
            return " Доброй ночи !";
        }else{
            return "Время указано не верно";
        }
    }
}
