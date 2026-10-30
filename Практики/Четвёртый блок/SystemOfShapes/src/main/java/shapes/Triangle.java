package shapes;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Стороны должны быть положительными");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException(
                    "Такой треугольник не существует"
            );
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public void displayInfo() {
        System.out.printf("Периметр фигуры: %.2f\n" +
                        "Площадь фигуры: %.2f\n" +
                        "Стороны треугольника: %.2f %.2f %.2f\n",
                        calculatePerimeter(), calculateArea(), a, b, c);
    }
}