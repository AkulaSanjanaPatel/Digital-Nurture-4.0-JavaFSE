public class Test {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1001, "Alice", 250.0),
            new Order(1002, "Bob", 150.0)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) System.out.println(o);

        Order[] ordersForBubble = orders.clone();
        OrderSorter.bubbleSort(ordersForBubble);
        System.out.println("\nSorted by Bubble Sort:");
        for (Order o : ordersForBubble) System.out.println(o);

        Order[] ordersForQuick = orders.clone();
        OrderSorter.quickSort(ordersForQuick, 0, ordersForQuick.length - 1);
        System.out.println("\nSorted by Quick Sort:");
        for (Order o : ordersForQuick) System.out.println(o);
    }
}
