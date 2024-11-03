package homework_37.computer;

public class Computer {

    private String brand;
    private int ramSize; // in GB
    private int ssdSize; // in GB

    public Computer(String brand, int ramSize, int ssdSize) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
    }

    public String getBrand() {
        return brand;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getSsdSize() {
        return ssdSize;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", RAM=" + ramSize + "GB" +
                ", SSD=" + ssdSize + "GB" +
                '}';
    }
}
