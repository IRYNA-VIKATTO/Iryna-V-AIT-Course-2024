public class MaxElement {
    //адан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
    // Найдите максимальный элемент массива и его индекс.
    // Поставьте этот элемент в начало массива вместо имеющегося.
    public static void main(String[] args) {

        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83};

        int maxOfArray = array[0]; // guess
        int indexOfMaxElement = 0; // guess

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxOfArray) {
                maxOfArray = array[i];
                indexOfMaxElement = i;

            }
        }

        System.out.println("Max element of array = " + maxOfArray + ", index of max element= " + indexOfMaxElement);
        System.out.println();

        // Меняем местами первый элемент и максимальный элемент
        int temp = array[0];
        array[0] = array[indexOfMaxElement];
        array[indexOfMaxElement] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", "); // Добавляет запятую после каждого элемента, кроме последнего
            }
        }



    }


}


