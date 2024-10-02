package classwork_16.employee.model;
//Создать класс Студент (Student) с приватными полями:
//
//идентификатор
//имя
//фамилия
//год рождения
//специализация
//Стандартные методы:
//
//конструктор на всех полях;
//геттеры и сеттеры на всех полях;
//метод отображения.
//Дополнительные методы:
//
//учиться
//взять отпуск
//сдать экзамен
public class Student {
    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String specialization;

    //construktor

    public Student(int id, String name, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }


    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void study(){
        System.out.println("Student study .");
    }

    public void vacation(){
        System.out.println("Student took a vacation.....");
    }

    public void exam(){
        System.out.println("Student passed the exam !");
    }
}