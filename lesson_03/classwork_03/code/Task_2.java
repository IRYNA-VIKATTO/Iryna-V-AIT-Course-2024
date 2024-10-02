public class Task_2 {

    //Объявите две переменные целого типа a и b и присвойте им произвольные значения натуральных чисел.
    //  Создайте третью переменную res и выведите ее значение на экран таким образом:
    //  Если a = b, то res будет равно (a + b) * 5 a если нет, то (a - b) * 5.

    public static void main(String[] args) {

        int a = 76;
        int b = 85;


        int res;

        if ( a == b){
            res = (a + b) * 5;
            System.out.println("если a = b  , то res = "+ res);


        }else {
            res = (a - b) * 5;
            System.out.println("усли a  не равно b то res ="+ res);
        }
    }

}
