public class Numbers {
//Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

    public static void main(String[] args) {
        int i = 1;//параметр цикла
        int y = 100;//КОНЕЧНОЕ ЧИСО

        while (  i< y){
            if ( i% 5 == 0 ) {
                System.out.print(i + " ");
            }
            i++;// постфиксная операция увеличивает на 1
        }


    }


}
