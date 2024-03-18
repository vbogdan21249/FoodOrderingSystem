import cart.*;
import delivery.*;
import order.*;
import waiter.*;
import kitchen.*;
import Client.Client;

public class Main {
    public static void main(String[] args) {
        // Creating components
        Order order = new Order();
        DeliveryStrategy deliveryStrategy = new CourierDeliveryStrategy();
        Waiter waiter = new Waiter(order, deliveryStrategy);
        Cart cart = new Cart();
        Kitchen kitchen = new Kitchen();

        // Creating observers (clients)
        OrderObserver client1 = new Client("John");
        OrderObserver client2 = new Client("Alice");
        waiter.addObserver(client1);
        waiter.addObserver(client2);

        cart.addItem("Pizza");
        cart.addItem("Drink");
        cart.addItem("Salad");

        waiter.takeOrder();

        kitchen.prepareOrder();
    }
}
