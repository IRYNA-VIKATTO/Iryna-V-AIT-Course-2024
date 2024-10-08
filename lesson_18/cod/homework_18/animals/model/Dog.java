package homework_18.animals.model;

//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
//порода
//рост
//вес
public class Dog extends Pet {

    private String breed;
    private double height;
    private double weight;

    public Dog(int id, String view, double age, String nickName, String breed, double height, double weight) {
        super(id, view, age, nickName);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                "} " + super.toString();
    }


    public void voice() {
        System.out.println("Gav, gav!");
    }

}
