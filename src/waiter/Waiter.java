package waiter;



import delivery.DeliveryStrategy;
import order.Order;
import order.OrderObserver;

import java.util.ArrayList;
import java.util.List;


public class Waiter {
    private final Order order;
    private final DeliveryStrategy deliveryStrategy;
    private final List<OrderObserver> observers;

    public Waiter(Order order, DeliveryStrategy deliveryStrategy) {
        this.order = order;
        this.deliveryStrategy = deliveryStrategy;
        this.observers = new ArrayList<>();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void takeOrder() {
        order.processOrder();
        deliveryStrategy.deliver();
        notifyObservers("order.Order has been placed and is being processed.");
    }

    private void notifyObservers(String message) {
        for (OrderObserver observer : observers) {
            observer.update(message);
        }
    }
}
