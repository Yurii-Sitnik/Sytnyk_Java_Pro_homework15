package coffe.order;

import java.util.*;

public class CoffeeOrderBoard {

    private final List<Order> orderList = new ArrayList<>();

    public void add(Order order) {

        if (orderList.contains(order) || order.getNumberOrder() == 0) {
            throw new IllegalArgumentException("Wrong ! You entered an invalid numId.");
        }
        try {
            orderList.add(order);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        Collections.sort(orderList);
    }

    public void deliver() {
        orderList.remove(0);
    }

    public void deliver(Integer num) {
        for (Order order : orderList) {
            if (order.getNumberOrder() == num) {
                orderList.remove(order);
                break;
            }
        }
    }

    public void draw() {
        String showTitle = "ID | Client\n";
        StringBuilder stringBuilder = new StringBuilder();
        for (Order order : orderList) {
            stringBuilder.append("\n").append(order);
        }
        System.out.println(showTitle + stringBuilder);
    }
}










