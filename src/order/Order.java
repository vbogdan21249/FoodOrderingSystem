package order;

public class Order {
    private OrderState state;

    public Order() {
        state = new ProcessingState(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder() {
        state.handleState();
    }
}
