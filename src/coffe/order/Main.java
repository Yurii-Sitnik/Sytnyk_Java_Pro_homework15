package coffe.order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add(new Order(1, "Bob"));
        coffeeOrderBoard.add(new Order(3, "TOM"));
        coffeeOrderBoard.add(new Order(4, "Mark"));
        coffeeOrderBoard.add(new Order(6, "Evgeniy"));
        coffeeOrderBoard.add(new Order(5, "Anatoliy"));
        coffeeOrderBoard.add(new Order(2, "Egor"));

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(6);
        coffeeOrderBoard.draw();
    }
}
