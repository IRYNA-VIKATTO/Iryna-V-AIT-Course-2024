package homework_40.ait.supermarket_linked_list.dao;

import classwork_40.ait.supermarket.model.Product;

public interface Supermarket extends Iterable<Product> {

    boolean addProduct(homework_40.ait.supermarket_linked_list.model.Product product);

    boolean addProduct(Product product);
    homework_40.ait.supermarket_linked_list.model.Product removeProduct(long barCode);
    homework_40.ait.supermarket_linked_list.model.Product findByBarCode(long barCode);
    Iterable<homework_40.ait.supermarket_linked_list.model.Product> findByCategory(String category);
    Iterable<homework_40.ait.supermarket_linked_list.model.Product> findByBrand(String brand);
    Iterable<homework_40.ait.supermarket_linked_list.model.Product> findProductsWithExpiredDate();
    int skuQuantity();
}
