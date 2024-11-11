package homework_40.ait.supermarket_linked_list.test;

import classwork_40.ait.supermarket.dao.Supermarket;
import classwork_40.ait.supermarket.dao.SupermarketImpl;
import classwork_40.ait.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketLinkedListTest {

    Supermarket supermarket;
    Product[] products;
    LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl();

        products = new Product[5];
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));

        for (Product p : products) {
            supermarket.addProduct(p);
        }
    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(products[3]));
        Product product1 = new Product(666666, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product1));
        assertEquals(6, supermarket.skuQuantity());
        Product product2 = new Product(666666, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(supermarket.addProduct(product2)); // с одинаковым баркодом
        Product product3 = new Product(777777, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(supermarket.addProduct(product3));
    }

    @Test
    void testAddProduct() {
    }

    @Test
    void removeProduct() {
    }

    @Test
    void findByBarCode() {
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByBrand() {
    }

    @Test
    void findProductsWithExpiredDate() {
    }

    @Test
    void skuQuantity() {
    }

    @Test
    void iterator() {
    }
}