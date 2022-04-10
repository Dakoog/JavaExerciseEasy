package java_basic.dayThird.task9;

import java_basic.daySecond.helper.StringHelper;

public class OrderItem {
    private static final String SEPARATOR = "\t |";
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getAmount() {
        return quantity * price;
    }

    public boolean isCorrect() {
        return StringHelper.isValid(productName) && quantity > 0 && price > 0;
    }
    public void print(){
        StringBuilder sb = new StringBuilder();
        sb.append(productName).append(SEPARATOR);
        sb.append(price).append(" zł.").append(SEPARATOR);
        sb.append(quantity).append(" pcs").append(SEPARATOR);
        sb.append(getAmount()).append(" zł").append(SEPARATOR);
        System.out.println(sb);
    }
}
