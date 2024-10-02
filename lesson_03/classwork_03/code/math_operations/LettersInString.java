package math_operations;

import java.util.Scanner;

public class LettersInString {
// Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string :");
        String str = scanner.nextLine();

        System.out.println(str);

        int l = str.length();

        System.out.println(l);

        int i = 0;
        // Leonid
        // 012345
        while ( i < l ){
            System.out.println(str.charAt(i));
            i++;// i=i+1

        }
    }
}
