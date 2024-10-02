package ArrayMethods;


public class ArrayMethods {
//=================================================================
// babbl sort
//- сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
//- цикл должен идти слева направо
//- упорядоченные элементы выключаются из цикла


public static void bubbleSort(int[] array){
    for ( int i = 0 ; i < array.length; i++){
        for (int j = 0; j < array.length - 1 -i ; j++){
            if (array[j] > array[j + 1]){ //compe 2 elements of array;if left> right=> swap
                //swapping
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

//======================================================================
    // array tur arrayd, revers
    // step1 - method swap
public static void swap(int[] array, int i , int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
    //step2 - reverse array
public static void reverseArray(int[] array){
    for (int i = 0 , j = array.length - 1 ; i < j; i++, j--) {
        swap(array, i, j);

    }
}


//========================================================================
    //  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
//  - заполнение массива случайными целыми числами из интервала от a до b +
//  - печать массива целых чисел +
// - поиск элемента
    // 0(long(n))
    // binary search

public static int binarySearch(int[] array, int n){
    int leftIndex = 0;
    int rightIndex = array.length -1;

    while (leftIndex <= rightIndex){
        int midIndex = (leftIndex + rightIndex) / 2;
        if (array[midIndex]==n) {
            return midIndex;
        } else if (n < array[midIndex]) {
            rightIndex = midIndex -1;//правую половину надо отбросить

        }else {
           leftIndex = midIndex + 1; //левую половину надо отбросить
        }
    }
    return -leftIndex-1;// если не нашлось

}





    // 0(n) чем больше элементов массива ТЕМ ДОЛЬШЕ РАБОТАЕТ МЕТОД

    // linear search, return index( if element absent return -1)
    public static int linearSearch(int[] array, int n){
        for ( int i = 0 ; i < array.length; i++){
            if (array[i]==n){
                return i;// go out from method
            }
        }
        return  -1;
    }



//---------------------------------------
    //fill array
    // a- left border,b - right border,n - quantity
    public static int[] fillArray(int a, int b, int n){
        int[] res = new int[n];
        for ( int i = 0 ; i < res.length; i++){
            res[i] = (int)(Math.random()*(b - a + 1) + a);//случайные числа
        }
        return res;
    }


    //print array
    public static void printArray(int[] array ){
        for ( int i = 0 ;i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("_________________________________");

    }




   // search in array
   public static boolean serchInArray(int[] array, int n) {
       for (int i = 0; i < array.length; i++) {
           if (array[i] == n) {
               return true;
           }
       }
       return false;
   } //end of method



        // Метод для начисления процентов
    public static double[] calculatePercent(double[] balances, double percent) {
        double[] newBalances = new double[balances.length];
        for (int i = 0; i < balances.length; i++) {
            // Начисляем X процентов на каждый баланс
            newBalances[i] = balances[i] + (balances[i] * percent / 100);
        }
        return newBalances;
    }

        // Метод для печати массива типа double
    public static void printArrayDouble(double[] array) {
        for (double element : array) {
            System.out.printf("%.2f ", element); // Выводим с округлением до двух знаков
        }
        System.out.println();
    }

    // Метод для нахождения суммы всех элементов массива целых чисел
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element; // Суммируем элементы массива
        }
        return sum; // Возвращаем общую сумму
    }

    // Метод для нахождения среднего арифметического значения массива чисел с плавающей запятой
    public static double averageValue(double[] array) {
        double sum = 0.0;
        for (double element : array) {
            sum += element; // Суммируем элементы массива
        }
        return sum / array.length; // Возвращаем среднее значение
    }


}
