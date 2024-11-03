package homework_36.binary_search;

import java.util.Arrays;

public class BinarySearchCountOperations {

    static int count = 0;

    public static void main(String[] args) {
        int a = 1; // from
        int b = 10; // to

        int n = 10; // number of elements
        int[] arr1 = fillArray(a, b, n);
        Arrays.sort(arr1);
        printArray(arr1);
        int index = binarySearch(arr1, 5);
        System.out.println("Index = " + index);
        System.out.println("Count = " + count);

        n = 100; // number of elements
        arr1 = fillArray(a, b, n);
        Arrays.sort(arr1);
        printArray(arr1);
        index = binarySearch(arr1, 5);
        System.out.println("Index = " + index);
        System.out.println("Count = " + count);

        n = 1000; //  number of elements
        arr1 = fillArray(a, b, n);
        Arrays.sort(arr1);
        printArray(arr1);
        index = binarySearch(arr1, 5);
        System.out.println("Index = " + index);
        System.out.println("Count = " + count);


    }

    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            count++;
            int midIndex = (leftIndex + rightIndex) / 2;
            if(array[midIndex] == n){
                return midIndex;
            } else if (n < array[midIndex]) {
                rightIndex = midIndex - 1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex + 1; // левую половину надо отбросить
            }
        }
        return -leftIndex - 1; // если элемент не нашёлся
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
