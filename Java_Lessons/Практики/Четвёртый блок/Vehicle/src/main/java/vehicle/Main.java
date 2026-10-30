package vehicle;

public class Main {
    static void main() {
        var forward = new Bicycle("Forward", 30, "City");
        var bugatti = new Car("Bugatti", 410, 2);
        var ural = new Motorcycle("Ural", 60, 100);

        forward.displayInfo();
        bugatti.displayInfo();
        ural.displayInfo();

        var vehicles = new Vehicle[] {forward, bugatti, ural};
    }
}
