package orders;

public class Main {
    static void main() {
        var order = new Order(1, "Айтиев Максим",
                999.99, OrderStatus.NEW);
        System.out.println(order);

        Order processing = order.changeStatus(OrderStatus.PROCESSING);
        System.out.println(processing);

        Order shipped = processing.changeStatus(OrderStatus.SHIPPED);
        System.out.println(shipped);

        Order delivered = shipped.changeStatus(OrderStatus.DELIVERED);
        System.out.println(delivered);
    }
}