package homework_32.ait.product.dao;


import homework_32.ait.product.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SupermarketImpl implements SupermarketInterface{

    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product findProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }


    @Override
    public List<Product> findProductsByExpirationDate(LocalDate date) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getExpirationDate().isEqual(date)) {
                result.add(product);
            }
        }
        return result;
    }

    @Override
    public boolean updateProduct(String id, String newName, double newPrice, LocalDate newExpirationDate) {
        Product product = findProductById(id);
        if (product != null) {
            product.setName(newName);
            product.setPrice(newPrice);
            product.setExpirationDate(newExpirationDate);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteProduct(String id) {
        return products.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public double getTotalPrice() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    @Override
    public double getAveragePrice() {
        return products.isEmpty() ? 0 : getTotalPrice() / products.size();
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
