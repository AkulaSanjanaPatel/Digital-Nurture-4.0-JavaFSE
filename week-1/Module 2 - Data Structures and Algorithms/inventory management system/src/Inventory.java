import java.util.*;

class Inventory {
    Map<Integer, Product> inventory = new HashMap<>();

    void addProduct(Product product) {
        inventory.put(product.productId, product);
    }

    void updateProduct(int productId, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.quantity = quantity;
            p.price = price;
        }
    }

    void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    Product getProduct(int productId) {
        return inventory.get(productId);
    }

    void printAllProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
