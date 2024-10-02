import ArrayMethods.ArrayMethods;

public class ArrayMethodsApple {

        public static void main(String[] args) {
            //create array with random number
            int[] myArray = ArrayMethods.fillArray(0, 100, 10);

            //
            ArrayMethods.printArray(myArray);

            //
            ArrayMethods.bubbleSort(myArray);

            //
            ArrayMethods.printArray(myArray);

            int[] newArray = ArrayMethods.fillArray(1,20,6);
            ArrayMethods.printArray(newArray);
            ArrayMethods.reverseArray(newArray);
            ArrayMethods.printArray(newArray);

        }
}
