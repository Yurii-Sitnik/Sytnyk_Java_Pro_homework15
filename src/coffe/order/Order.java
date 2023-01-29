package coffe.order;


import java.util.Objects;

public class Order implements Comparable<Order> {
    private int numberOrder;
    private String peopleName;

    public Order(int numberOrder, String peopleName) {
        this.numberOrder = numberOrder;
        this.peopleName = peopleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return numberOrder == order.numberOrder && Objects.equals(peopleName, order.peopleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder, peopleName);
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public String getPeopleName() {
        return peopleName;
    }

    @Override
    public int compareTo(Order o) {
        return this.numberOrder - o.getNumberOrder();
    }

    @Override
    public String toString() {
        return numberOrder + " | " + peopleName + "\n";
    }
}


