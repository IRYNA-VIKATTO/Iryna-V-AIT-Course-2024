package homework_32.ait.product.dao;

import homework_32.ait.product.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface SupermarketInterface {

    void addProduct(Product product);  // C - Create
    Product findProductById(String id);  // R - Read
    List<Product> findProductsByExpirationDate(LocalDate date);  // поиск по сроку годности
    boolean updateProduct(String id, String newName, double newPrice, LocalDate newExpirationDate);  // U - Update
    boolean deleteProduct(String id);  // D - Delete
    double getTotalPrice();  // общая стоимость всех товаров
    double getAveragePrice();  // средняя стоимость товаров
    ArrayList<Product> getAllProducts();  // Получение всех товаров
}
