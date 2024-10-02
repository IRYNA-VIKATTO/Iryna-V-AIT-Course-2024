import java.util.Scanner;

public class Cinema {

    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст : ");
        int age = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Студент? ");
        boolean student = scanner1.nextBoolean();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Вип?");
        boolean vip = scanner2.nextBoolean();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Базовая цена билета");
        double standartTicketPrice = scanner3.nextDouble();


        System.out.println("К оплатe: "+ calculateTicketPrice(age,student,vip,standartTicketPrice));

    }
    public static double calculateTicketPrice(Integer age , Boolean student , Boolean vip, Double standartTicketPrice){

        boolean pensionAge;
        if (age >= 67 ){
            pensionAge = true;

        }else {
            pensionAge = false;
        }

        if (student){
            standartTicketPrice = standartTicketPrice*0.9;
        }
        if (pensionAge){
            standartTicketPrice = standartTicketPrice*0.75;
        }

        if (vip){
            standartTicketPrice = standartTicketPrice*1.25;
        }
        return standartTicketPrice;
    }
}
