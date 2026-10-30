package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        var stringNumber = scanner.nextLine();

        var isDouble = false;
        if (stringNumber.contains("."))
            isDouble = true;
        System.out.println("Тип: " + (isDouble? "Double" : "Integer"));
        var number = isDouble? Double.parseDouble(stringNumber)
                : Integer.parseInt(stringNumber);
        System.out.print("Значение: ");
        if (isDouble)
            System.out.println(number);
        else
            System.out.println((int)number);

        System.out.println("Увеличенное на 10%: " + number * 1.1);
    }
}