import ArrayMethods.ArrayMethods;

public class ArrayMethodsAppl {
    public static void main(String[] args) {

        int [] myArray ={10,20,30,40,50};

        System.out.println(ArrayMethods.linearSearch(myArray,10));
        System.out.println(ArrayMethods.linearSearch(myArray,100));

        System.out.println("------------------------------");

        int index =ArrayMethods.binarySearch(myArray, 30);
        System.out.println(index);
    }
}
