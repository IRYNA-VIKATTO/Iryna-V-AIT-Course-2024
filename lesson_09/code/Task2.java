public class Task2 {

    //**Задача 2.**
    //Задача о "вкраплениях".
    //Имеется массив целых чисел, в котором несколько раз встречается число X.
    //Выясните, сколько раз это число встречается в массиве?
    // На каких местах массива оно стоит?
    public static void main(String[] args) {

        int[] array = {75, 34, -15, -123,-145 , 57, -145, 86, 77,-145, 48, -59};

        int[] arrayOfIndex = new int [array.length];

        int x = -145;
        int count = 0;

        int j = 0 ;// индекс для массива индексов

        for (int i = 0; i < array.length; i++){
            if (array[i] == x){
               count++;
                System.out.print(i + " ");
                arrayOfIndex[j] = i;//
                j++;//

            }

        }
        System.out.println();

        System.out.println(count);

        for (int  i = 0; i < j ; i++){
            System.out.print(arrayOfIndex[i] + " ");
        }

    }
}
