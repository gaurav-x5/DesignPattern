public class Main {
    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();

        order.showCurrentStatus();

        order.transitionToNextState();
        order.showCurrentStatus();

        order.transitionToNextState();
        order.showCurrentStatus();

        order.transitionToNextState();
        order.showCurrentStatus();

        order.transitionToNextState();
        order.showCurrentStatus();

        order.transitionToNextState();
        order.showCurrentStatus();
    }
}