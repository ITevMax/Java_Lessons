package shapes;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.printf("Периметр фигуры: %.2f\n" +
                          "Площадь фигуры: %.2f\n",
                          calculatePerimeter(), calculateArea());
    }
}