package homework_32.ait.product.model;

import java.time.LocalDate;

public class Food extends Product{
    public Food(String id, String name, double price, LocalDate expirationDate) {
        super(id, name, price, expirationDate);
    }
}
