package shapes;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("Радиус должен быть положительным");

        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayInfo() {
        System.out.printf("Периметр фигуры: %.2f\n" +
                        "Площадь фигуры: %.2f\n" +
                        "Радиус: %.2f\n",
                calculatePerimeter(), calculateArea(), radius);
    }
}