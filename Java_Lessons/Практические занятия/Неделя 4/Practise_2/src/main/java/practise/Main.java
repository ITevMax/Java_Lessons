package practise;

public class Main {
    static void main() {
        var item = new Auto("Яблоко", 10, AutoCategory.Fruits);
        var item2 = new Auto("Яблоко", 10, AutoCategory.Fruits);
        System.out.println(item.equals(item2));
        System.out.println(item);
    }
}