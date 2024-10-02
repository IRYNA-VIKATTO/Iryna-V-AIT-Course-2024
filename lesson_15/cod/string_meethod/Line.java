package string_meethod;

public class Line {
    public static void main(String[] args) {
        String text = "Я горжусь тем, что изучаю Java! Java — самый известный язык программирования!!!";
        //Распечатать последнюю символьную строку.
        System.out.println(text.charAt(text.length() - 1));  // Последний символ

        //Найдите позицию подстроки «Java» в строке.
        int positionJava = text.indexOf("Java");
        System.out.println(positionJava);  // Первая позиция подстроки "Java"

        //Посмотрите, содержит ли заданную строку подстроку «Java».
        String str = "Java";

        boolean checker = text.contains(str);  // Проверяем, содержится ли подстрока "Java"
        System.out.println(checker);  // Выводит true, если строка содержит "Java"

        //Замените все символы «о» на «а»
        String replacedText = text.replace('о', 'а');
        System.out.println(replacedText);

        //Привести текст к верхнему регистру:
        String upperText = text.toUpperCase();
        System.out.println(upperText);

        //Привести текст к нижнему регистру:
        String lowerText = text.toLowerCase();
        System.out.println(lowerText);

        //Вырезать подстроку «Java» с помощью метода substring():
        int startIndex = text.indexOf("Java");
        String javaSubstring = text.substring(startIndex, startIndex + "Java".length());
        System.out.println(javaSubstring);

        //Проверить, заканчивается ли строка подстрокой «!!!»:
        boolean endsWithExclamations = text.endsWith("!!!");
        System.out.println(endsWithExclamations);  // true, если строка заканчивается "!!!"

        //Проверить, начинается ли строка подстрокой «Я горжусь»:
        boolean startsWithPhrase = text.startsWith("Я горжусь");
        System.out.println(startsWithPhrase);  // true, если строка начинается с "Я горжусь"

    }

}
