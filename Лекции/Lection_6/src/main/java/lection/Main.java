package lection;
import java.io.File;

public class Main {
    static void main() {
        var file1 = new File("C:\\Users\\...");
        var file2 = new File("data.txt");
        System.out.println("Абсолютный путь: " + file2.getAbsolutePath());
        System.out.println("Относительный путь: " + file2.getPath());
        System.out.println("Рабочее пространство: " + System.getProperty("user."));
    }
}