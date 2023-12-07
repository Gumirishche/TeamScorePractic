package task2.third;

public class Supplier {
    private int inn;
    private String name;
    private String address;

    public Supplier(int inn, String name, String address) {
        this.inn = inn;
        this.name = name;
        this.address = address;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
