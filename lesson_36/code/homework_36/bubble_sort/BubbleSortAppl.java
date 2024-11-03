package homework_36.bubble_sort;

public class BubbleSortAppl {

    public static void main(String[] args) {

        int a = 0;
        int b = 1000;
        int n = 10;

        int[] array = fillArray(a, b, n);
        int count = bubbleSort(array);
        System.out.println("Quantity of elements: " + n + ", operations: " + count);

        int n1 = 100;
        array = fillArray(a, b, n1);
        int count1 = bubbleSort(array);
        System.out.println("Quantity of elements: " + n1 + ", operations: " + count1);
        System.out.println("Elements increase in " + n1/n + " times, operations increase in " + count1/count + " times.");

        int n2 = 1000;
        array = fillArray(a, b, n2);
        int count2 = bubbleSort(array);
        System.out.println("Quantity of elements: " + n2 + ", operations: " + count2);
        System.out.println("Elements increase in " + n2/n1 + " times, operations increase in " + count2/count1 + " times.");
    }

    // сортировка методом BubbleSort сравниваем по 2 элемента, i - й с i + 1 -ым
    private static int bubbleSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    // переставим элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        printArray(arr);
        return count;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    //  - заполнение массива случайными натуральными числами из интервала от a до b
    public static int[] fillArray(int a, int b, int length){
        int[] res = new int[length];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        return res;
    }

}
