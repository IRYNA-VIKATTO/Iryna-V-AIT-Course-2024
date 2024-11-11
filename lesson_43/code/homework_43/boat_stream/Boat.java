package homework_43.boat_stream;

public class Boat {
    private String manufacturer; // Производитель (верфь)
    private String flag;         // Страна (флаг)
    private int year;            // Год выпуска
    private double length;       // Длина яхты
    private String material;     // Материал корпуса (дерево, пластик, металл)
    private double price;        // Стоимость яхты

    // Конструктор
    public Boat(String manufacturer, String flag, int year, double length, String material, double price) {
        this.manufacturer = manufacturer;
        this.flag = flag;
        this.year = year;
        this.length = length;
        this.material = material;
        this.price = price;
    }

    // Геттеры для доступа к полям
    public String getManufacturer() {
        return manufacturer;
    }

    public String getFlag() {
        return flag;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "manufacturer='" + manufacturer + '\'' +
                ", flag='" + flag + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
