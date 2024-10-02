public class Task1 {

    //Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
    //Найдите минимальный элемент массива и его индекс.
    //Каков будет результат, если в массиве несколько одинаковых минимальных элементов?
    //Найдите максимальный элемент массива и его индекс.
    //Поменяйте местами минимальный и максимальный элементы, распечатайте массив.

    public static void main(String[] args) {

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int minOfArray = array[0];//guess
        int indexOfMinElement = 0;

        for ( int i =0; i < array.length; i++) {

            if (array[i] < minOfArray) {
                minOfArray = array[i];
                indexOfMinElement = i;

            }

        }



            System.out.println(" Min element of array = "+ minOfArray +", index of min element = " + indexOfMinElement);


    }
}
