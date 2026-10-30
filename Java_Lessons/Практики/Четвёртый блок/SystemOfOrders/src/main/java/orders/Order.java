package orders;

public final class Order {
    private final int orderId;
    private final String customerName;
    private final double amount;
    private final OrderStatus status;

    public Order(int orderId, String customerName, double amount, OrderStatus status) {
        if (orderId <= 0)
            throw new IllegalArgumentException("ID заказа должно быть положительным");

        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public Order changeStatus(OrderStatus newStatus) {
        return new Order(orderId, customerName, amount, newStatus);
    }

    public String toString() {
        return String.format(
                "Заказ №%d\n" +
                "Заказчик: %s\n" +
                "Стоимость: %.2f\n" +
                "Статус заказа: %s\n",
                orderId, customerName, amount, status
        );
    }
}