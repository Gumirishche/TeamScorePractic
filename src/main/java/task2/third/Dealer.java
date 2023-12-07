package task2.third;

public class Dealer extends Supplier{
    private String nameOfManufacturer;
    private double percent;

    public Dealer(int inn, String name, String address, String nameOfManufacturer, double percent) {
        super(inn, name, address);
        this.nameOfManufacturer=nameOfManufacturer;
        this.percent = percent;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
