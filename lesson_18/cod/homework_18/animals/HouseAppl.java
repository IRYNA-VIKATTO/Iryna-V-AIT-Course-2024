package homework_18.animals;
// Создайте HouseAppl, в котором есть метод main.
// Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.


import homework_18.animals.model.Cat;
import homework_18.animals.model.Dog;
import homework_18.animals.model.Pet;

public class HouseAppl{

    public static void main(String[] args) {
        HouseAppl house = new HouseAppl();


        Cat cat1 = new Cat(1,"Кот",2,"Барсик","Сиамский",0.25,5);
        Cat cat2 = new Cat(2,"Кошка",1.5,"Ева","Сиамская",0.23,3.5);
        Cat cat3 = new Cat(3,"Кот",4,"Вася","Дворняга",0.30,6);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        Dog dog1 = new Dog(1,"Пес",2,"Гучи","Овчарка",0.65,30);
        Dog dog2 = new Dog(2,"Собака",2,"Рута","Овчарка",0.59,23);
        System.out.println(dog1);
        System.out.println(dog2);

        cat1.display();
        cat1.voice();
        cat2.display();
        cat2.voice();
        cat3.display();
        cat3.voice();
        dog1.display();
        dog1.voice();
        dog2.display();
        dog2.voice();




    }


}
