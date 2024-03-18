package order;

public class ProcessingState implements OrderState {
    private final Order order;

    public ProcessingState(Order order) {
        this.order = order;
    }

    @Override
    public void handleState() {
        System.out.println("order.Order is processing...");
        order.setState(new PreparingState(order));
    }
}
