package DataStructures_Algorithms.Inventory_Management_System;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private long currentId = 1000;
    private Map<Long, Product> inventory = new HashMap<>();

    public long addProduct(Product product) {
        product.setProductID(++currentId);
        long Id = product.getProductID();
        inventory.put(Id, product);
        return Id;
    }

    public void updateProduct(long productId, Product product) {
        product.setProductID(productId);
        inventory.put(productId, product);
    }

    public void deleteProduct(long productId) {
        inventory.remove(productId);
    }

    public Product getProduct(long productId) {
        return inventory.get(productId);
    }
}
