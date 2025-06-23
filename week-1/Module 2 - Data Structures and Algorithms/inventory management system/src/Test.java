public class Test {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Mouse", 20, 250.00);
        Product p2 = new Product(102, "Keyboard", 15, 550.50);
        Product p3 = new Product(103, "Monitor", 10, 3500.00);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("All products after adding:");
        inventory.printAllProducts();

        inventory.updateProduct(102, 12, 520.00);
        System.out.println("\nAfter updating product 102:");
        inventory.printAllProducts();

        inventory.deleteProduct(101);
        System.out.println("\nAfter deleting product 101:");
        inventory.printAllProducts();

        System.out.println("\nFetching product 103:");
        System.out.println(inventory.getProduct(103));
    }
}
