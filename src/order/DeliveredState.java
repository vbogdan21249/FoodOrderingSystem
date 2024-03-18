package order;
public class DeliveredState implements OrderState {
    private final Order order;

    public DeliveredState(Order order) {
        this.order = order;
    }

    @Override
    public void handleState() {
        System.out.println("order.Order has been delivered.");
    }
}
