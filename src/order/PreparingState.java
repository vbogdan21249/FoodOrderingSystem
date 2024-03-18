package order;

public class PreparingState implements OrderState {
    private final Order order;

    public PreparingState(Order order) {
        this.order = order;
    }

    @Override
    public void handleState() {
        System.out.println("order.Order is being prepared...");
        order.setState(new DeliveredState(order));
    }
}
