package OOP;
public class Product {
    private String name;
    private String code;
    private double price;
    private String description;
    private boolean availability;

    // Конструктор класу
    public Product(String name, String code, double price, String description, boolean availability) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.description = description;
        this.availability = availability;
    }

    //Геттери
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public boolean getAvailability() {
        return availability;
    }

    //Сеттери
    public void setName(String name) {
        this.name = name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
