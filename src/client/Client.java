package Client;
import order.OrderObserver;

public class Client implements OrderObserver {
    private final String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }
}
