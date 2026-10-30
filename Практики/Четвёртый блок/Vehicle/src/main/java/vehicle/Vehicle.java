package vehicle;

public class Vehicle {
    public final String brand;
    int maxSpeed;

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s\n" +
                           "Max speed: %d\n",
                            brand, maxSpeed);
    }
}