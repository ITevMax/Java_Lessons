package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        var year = scanner.nextInt();
        var age = 2026 - year;
        if (5 <= age % 10 || age % 10 == 0 ||
            11 <= age % 100 && age % 100 <= 14)
            System.out.printf("Вам %d лет", age);
        else if (age % 10 == 1)
            System.out.printf("Вам %d год", age);
        else
            System.out.printf("Вам %d года", age);
    }
}
