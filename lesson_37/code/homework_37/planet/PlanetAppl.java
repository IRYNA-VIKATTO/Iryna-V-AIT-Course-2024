package homework_37.planet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {

    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();

        // Добавление планет
        planets.add(new Planet("Mercury", 57.91, 3.3011e23, 0));
        planets.add(new Planet("Venus", 108.2, 4.8675e24, 0));
        planets.add(new Planet("Earth", 149.6, 5.972e24, 1));
        planets.add(new Planet("Mars", 227.9, 6.4171e23, 2));
        planets.add(new Planet("Jupiter", 778.5, 1.8982e27, 79));
        planets.add(new Planet("Saturn", 1433.5, 5.6834e26, 82));
        planets.add(new Planet("Uranus", 2872.5, 8.6810e25, 27));
        planets.add(new Planet("Neptune", 4497.1, 1.02413e26, 14));

        // Вывод изначального списка планет
        System.out.println("Initial list of planets:");
        planets.forEach(System.out::println);

        // Сортировка по расстоянию до Солнца (порядок в Солнечной системе)
        System.out.println("\nSorted by distance from the Sun:");
        planets.sort(Comparator.comparingDouble(Planet::getDistanceFromSun));
        planets.forEach(System.out::println);

        // Сортировка по алфавиту
        System.out.println("\nSorted by name (alphabetically):");
        planets.sort(Comparator.comparing(Planet::getName));
        planets.forEach(System.out::println);

        // Сортировка по массе
        System.out.println("\nSorted by mass:");
        planets.sort(Comparator.comparingDouble(Planet::getMass));
        planets.forEach(System.out::println);

        // Сортировка по количеству спутников
        System.out.println("\nSorted by number of moons:");
        planets.sort(Comparator.comparingInt(Planet::getNumberOfMoons));
        planets.forEach(System.out::println);
    }

}
