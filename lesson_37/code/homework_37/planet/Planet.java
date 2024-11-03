package homework_37.planet;

public class Planet {

    private String name;
    private double distanceFromSun; // Расстояние до Солнца в миллионах километров
    private double mass; // Масса в килограммах
    private int numberOfMoons; // Количество спутников

    public Planet(String name, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{name='" + name + "', distanceFromSun=" + distanceFromSun +
                " million km, mass=" + mass + " kg, numberOfMoons=" + numberOfMoons + '}';
    }
}
