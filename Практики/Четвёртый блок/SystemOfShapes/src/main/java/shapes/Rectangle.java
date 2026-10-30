package shapes;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0)
            throw new IllegalArgumentException("Стороны должны быть положительными");

        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    public void displayInfo() {
        System.out.printf("Периметр фигуры: %.2f\n" +
                        "Площадь фигуры: %.2f\n" +
                        "Длина: %.2f\n" +
                        "Ширина: %.2f\n",
                calculatePerimeter(), calculateArea(), length, width);
    }
}