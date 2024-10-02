package classwork_16.employee;

import classwork_16.employee.model.Pet;
import classwork_16.employee.model.Student;

//В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.
public class StudentAppl {

    public static void main(String[] args) {

        Student s1 = new Student(1,"Pol","Pit",2002,"IT");
        Student s2 = new Student(2,"Luka","Ivanoff",2001,"IT");
        Student s3 = new Student(3,"Olga","Jolie",2002,"IT");


        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println("learning process : ");

        s1.study();
        s1.exam();
        s1.vacation();
    }



}
