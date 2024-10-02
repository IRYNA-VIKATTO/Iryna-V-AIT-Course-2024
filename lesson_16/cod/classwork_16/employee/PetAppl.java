package classwork_16.employee;
//В классе PetAppl создано несколько экземпляров домашних животных.
// Отобразить прожитый день.

import classwork_16.employee.model.Employee;
import classwork_16.employee.model.Pet;

public class PetAppl {
    public static void main(String[] args) {


        Pet e1 = new Pet(1,"cat",2,"Tom");
        Pet e2 = new Pet(2,"dog",4,"Archi");
        Pet e3 = new Pet(3,"mause",1,"Jeri");


        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());


        System.out.println("My pet day : ");

        e1.sleep();
        e1.eats();
        e1.walk();
        e1.play();
        e1.makeSound();
        e1.eats();
        e1.sleep();

    }

}
