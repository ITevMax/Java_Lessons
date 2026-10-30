package vehicle;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String brand, int maxSpeed, int engineCapacity) {
        super(brand, maxSpeed);
        this.engineCapacity = engineCapacity;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s\n" +
                        "Max speed: %d\n" +
                        "Capacity of engine: %d\n",
                brand, maxSpeed, engineCapacity);
    }
}