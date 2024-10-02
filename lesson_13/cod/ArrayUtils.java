public class ArrayUtils {

    //Написать метод copyOfArray.
    // Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
    // Метод должен создать новый массив длиной newLength.
    // В новый массив должны быть скопированы элементы из входящего массива:
    // Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

    // Метод копирования массива с заданной длиной нового массива
    public static int[] copyOfArray(int[] array, int newLength) {
        // Создаем новый массив длиной newLength
        int[] newArray = new int[newLength];

        // Копируем элементы из старого массива в новый (до минимума из длин)
        for (int i = 0; i < newLength & i < array.length; i++) {
            newArray[i] = array[i];
        }

        return newArray; // Возвращаем новый массив
    }
    // Метод для печати массива
    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        // Исходный массив
        int[] array = {0, 1, 2, 3, 4, 5, 6};

        // Вызов метода copyOfArray для копирования первых 3 элементов
        int[] newArray = copyOfArray(array, 3);

        // Печать нового массива
        System.out.print("Новый массив: ");
        printArray(newArray);
    }
}
