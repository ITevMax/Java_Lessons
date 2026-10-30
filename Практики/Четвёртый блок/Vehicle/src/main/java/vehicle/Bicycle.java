package vehicle;

public class Bicycle extends Vehicle{
    public final String type;

    public Bicycle(String brand, int maxSpeed, String type) {
        super(brand, maxSpeed);
        this.type = type;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s\n" +
                        "Max speed: %d\n" +
                        "Type of bicycle: %s\n",
                brand, maxSpeed, type);
    }
}