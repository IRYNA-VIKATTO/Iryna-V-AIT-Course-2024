package methods;

public class Kolobok {

    public static void main(String[] args) {

        System.out.println("колобок бежит по лесу");

        //звери хотят съесть колобка
        System.out.println("говорит волк колобку");
        introduce();

        System.out.println("говорит медведь колобку");
        introduce();

        System.out.println("говорит лиса колобку");
        introduce();

        System.out.println("лиса съела колобка");
    }//end of main

    public static void introduce(){
        System.out.println("Я тебя съем !");
    }
}//end of class
