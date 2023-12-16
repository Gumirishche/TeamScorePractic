package tasks4.third.model;

public class Supplier {
    private final int maxVolume;

    private int currentVolume;
    private final double price;

    private double totalPrice = 0;

    public Supplier(int maxVolume, double price) {
        this.maxVolume = maxVolume;
        this.price = price;
        currentVolume = maxVolume;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public double getPrice() {
        return price;
    }

    public void costOfVolume(int volume) {
        if (volume <= currentVolume) {
            totalPrice = totalPrice + volume * price;
            currentVolume = currentVolume - volume;
            return;
        }
        System.out.println("Нет такого кол-ва бензина у этого поставщика. V= " + currentVolume);
    }

    public int gasSold() {
        return maxVolume - currentVolume;
    }
}
