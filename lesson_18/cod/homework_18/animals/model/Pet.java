package homework_18.animals.model;

import java.time.LocalDate;

//  В классе Pet имеются поля:
//
//id
//вид
//возраст
//кличка
public abstract class Pet {


    private int id; // defaulf modificator -not presence
    private String view;
    private double age;
    private String nickName;

    public Pet(int id, String view, double age, String nickName) {
        this.id = id;
        this.view = view;
        this.age = age;
        this.nickName = nickName;
    }

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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public void display() {
        System.out.println("ID: " + id + ", view: " + view + ", age: "
                + age + ", nickname: " + nickName);
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void play() {
        System.out.println("Playing");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void voice() {
        System.out.println("Make sound");
    }



}
