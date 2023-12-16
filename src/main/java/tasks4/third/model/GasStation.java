package tasks4.third.model;

public class GasStation {
    private final int[] costOfDelivery;

    public GasStation(int[] costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }

    public int[] getCostOfDelivery() {
        return costOfDelivery;
    }
}
