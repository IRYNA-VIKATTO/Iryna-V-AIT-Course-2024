public class ConditionsEx {
//Проверка положительное или отрицательное число.
//Проверка четное или нечетное целое число.
//Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
//прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".

    public static void main(String[] args) {

        int x = 56;

        if (x > 0) {
            System.out.println("x = " + x + " is positive number");
        }
        if (x < 0) {
            System.out.println("x = " + x + " is negative number");
        }
        //полный условный оператор

        x = -234; //переопределил значение переменной

        if (x >= 0) {
            System.out.println("x = " + x + " is positive number");

        } else {
            System.out.println("x = " + x + " is negative number");
        }

        x = 13;
        if ( x % 2 ==0) {

            System.out.println(" x=  " + x + " is even");
        } else {
            System.out.println("x= "+ x + " is odd");
        }

        int age = 20;

        if ( age >= 18 ){
            System.out.println("Вам разрешено действовать самостоятельно");
        }else{
            System.out.println(" Вам надо прийти с опекуном");
        }
    }
}
