package homework_29.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;
class CarTest {
    Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[5];
        cars[0] = new Car("Model X", "Red", 60000, 2021);
        cars[1] = new Car("Model S", "Black", 80000, 2019);
        cars[2] = new Car("Model 3", "White", 35000, 2023);
        cars[3] = new Car("Model Y", "Blue", 45000, 2020);
        cars[4] = new Car("Model Z", "Grey", 70000, 2018);
    }

    @Test
    void getModel() {
    }

    @Test
    void sortCarByYearTest() {
        Arrays.sort(cars); // сортировка по году
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }

    @Test
    void sortCarByPriceTest() {
        Arrays.sort(cars, Comparator.comparingDouble(Car::getPrice)); // сортировка по цене
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getPrice() <= cars[i + 1].getPrice());
        }
    }

    @Test
    void sortCarByColorTest() {
        System.out.println("---------- List cars as is --------------");
        printCars(); // print as is

        Arrays.sort(cars, Comparator.comparing(Car::getColor)); // sorting by Color

        System.out.println("---------- List cars sorted by color --------------");
        printCars(); // print after sorting

        // Assertion to verify sorting by color
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getColor().compareTo(cars[i + 1].getColor()) <= 0);
        }
    }

    @Test
    void sortCarByModelTest() {
        System.out.println("---------- List cars as is --------------");
        printCars(); // print as is

        Arrays.sort(cars, Comparator.comparing(Car::getModel)); // sorting by Model

        System.out.println("---------- List cars sorted by model --------------");
        printCars(); // print after sorting

        // Assertion to verify sorting by model
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getModel().compareTo(cars[i + 1].getModel()) <= 0);
        }
    }
    // Utility method to print cars
    void printCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}