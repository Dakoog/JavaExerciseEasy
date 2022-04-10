package java_basic.dayThird.task9;

public class Order {
    private int maxOrderItem;
    private OrderItem[] orderItems;

    public Order(int maxOrderItem){
        this.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }
}
