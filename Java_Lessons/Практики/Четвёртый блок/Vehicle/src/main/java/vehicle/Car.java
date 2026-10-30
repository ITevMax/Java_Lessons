package vehicle;

public class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String brand, int maxSpeed, int numberOfDoors) {
        super(brand, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s\n" +
                        "Max speed: %d\n" +
                        "Number of doors: %d\n",
                brand, maxSpeed, numberOfDoors);
    }
}