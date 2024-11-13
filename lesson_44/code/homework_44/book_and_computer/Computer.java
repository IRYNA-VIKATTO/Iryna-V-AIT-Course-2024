package homework_44.book_and_computer;

public class Computer {
    private String model;
    private String cpu;
    private int ram; // в гигабайтах
    private int hdd; // в гигабайтах
    private double price;


    public Computer(String model, String cpu, int ram, int hdd, double price) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("model='").append(model).append('\'');
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", hdd=").append(hdd);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
