package shapes;

public class Main {
    static void main(String[] args) {
        double totalArea = 0;

        var circle = new Circle(5);
        var rect = new Rectangle(2, 5);
        var triangle = new Triangle(3, 4, 5);

        circle.displayInfo();
        rect.displayInfo();
        triangle.displayInfo();

        var shapes =  new Shape[] { circle, rect, triangle };

        System.out.printf("Общая площадь: %.2f%n", totalArea);
    }
}