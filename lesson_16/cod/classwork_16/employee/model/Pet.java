package classwork_16.employee.model;

public class Pet {

    // Создать класс Pet (Домашнее животное) с приватными полями:
    //
    //идентификатор
    //вид
    //возраст
    //кличка
    //Стандартные методы:
    //
    //конструктор на всех полях;
    //геттеры и сеттеры на всех полях;
    //метод toString.
    //Дополнительные методы:
    //
    //спать
    //есть
    //делать звук
    //играть
    //гулять
    private int id;
    private String view;
    private int age;
    private String nickname;

    //construktor


    public Pet(int id, String view, int age, String nickname) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickname = nickname;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", view='" + view + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public void sleep(){
        System.out.println("Pet is sleeping.....");
    }

    public void eats(){
        System.out.println("Pet eats.");
    }

    public void makeSound(){
        System.out.println("Pet makes a sound.");
    }

    public void play(){
        System.out.println("Pet playing");
    }

    public void walk(){
        System.out.println("Pet walking");
    }

}
