package homework_32.ait.product.test;

import homework_32.ait.product.dao.SupermarketImpl;
import homework_32.ait.product.model.Food;
import homework_32.ait.product.model.MeatFood;
import homework_32.ait.product.model.MilkFood;
import homework_32.ait.product.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SupermarketImplTest {

    private SupermarketImpl supermarket;
    private Product milk, bread, meat;

    @BeforeEach
    void setUp() {

        supermarket = new SupermarketImpl();
        milk = new MilkFood("001", "Milk", 2.5, LocalDate.of(2023, 12, 20));
        bread = new Food("002", "Bread", 1.0, LocalDate.of(2023, 12, 15));
        meat = new MeatFood("003", "Meat", 5.5, LocalDate.of(2023, 12, 22));
        supermarket.addProduct(milk);
        supermarket.addProduct(bread);
        supermarket.addProduct(meat);
    }
    @Test
    void addProductTest() {
        assertEquals(3, supermarket.getAllProducts().size());
    }

    @Test
    void findProductByIdTest() {
        assertEquals(milk, supermarket.findProductById("001"));
        assertNull(supermarket.findProductById("999"));
    }

    @Test
    void findProductsByExpirationDateTest() {
        List<Product> productsExpiringOnDate;
         productsExpiringOnDate = (List<Product>) supermarket.findProductsByExpirationDate(LocalDate.of(2023, 12, 15));
        assertEquals(1, productsExpiringOnDate.size());
        assertEquals(bread, productsExpiringOnDate.get(0));
    }

    @Test
    void updateProductTest() {
        assertTrue(supermarket.updateProduct("001", "Updated Milk", 3.0, LocalDate.of(2023, 12, 25)));
        Product updatedProduct = supermarket.findProductById("001");
        assertEquals("Updated Milk", updatedProduct.getName());
        assertEquals(3.0, updatedProduct.getPrice());
    }

    @Test
    void deleteProductTest() {
        assertTrue(supermarket.deleteProduct("002"));
        assertNull(supermarket.findProductById("002"));
        assertEquals(2, supermarket.getAllProducts().size());
    }

    @Test
    void getTotalPriceTest() {
        assertEquals(9.0, supermarket.getTotalPrice(), 0.01);
    }

    @Test
    void getAveragePriceTest() {
        assertEquals(3.0, supermarket.getAveragePrice(), 0.01);
    }
}