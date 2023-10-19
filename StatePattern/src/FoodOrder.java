public class FoodOrder {

    private FoodOrderState foodOrderState = new OrderInitiatedState();


    public void setState(FoodOrderState foodOrderState) {
        this.foodOrderState = foodOrderState;
    }

    public FoodOrderState getFoodOrderState() {
        return this.foodOrderState;
    }

    public void transitionToNextState() {
        foodOrderState.transitionToNext(this);
    }

    public void showCurrentStatus() {
        foodOrderState.showStatus();
    }
}
