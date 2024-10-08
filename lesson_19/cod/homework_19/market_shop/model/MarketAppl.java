package homework_19.market_shop.model;

import java.util.ArrayList;
import java.util.List;

public class MarketAppl {

    public static void main(String[] args) {
        // Создаем список продуктов
        Product[] products = new Product[5];

        products[0] = new MeatFood(15.99, "Chicken Breast", 123456789L, "2024-12-01", "Chicken");
        products[1] = new MeatFood(10.49, "Beef Steak", 987654321L, "2024-11-20", "Beef");
        products[2] = new MilkFood(2.99, "Milk", 456789123L, "2024-10-20", "Cow", 3.5);
        products[3] = new MilkFood(4.59, "Goat Cheese", 321654987L, "2024-12-10", "Goat", 10.0);
        products[4] = new Food(1.99, "Bread", 111222333L, "2024-11-01");

        // Печатаем все продукты
        printAllProducts(products);

        // Считаем и выводим сумму всех цен
        double totalPrice = calculateTotalPrice(products);
        System.out.println("Total price: " + totalPrice);
    }

    // Метод для печати всех продуктов
    public static void printAllProducts(Product[] products) {
        System.out.println("Products list:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Метод для расчета общей суммы всех продуктов
    public static double calculateTotalPrice(Product[] products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

}
