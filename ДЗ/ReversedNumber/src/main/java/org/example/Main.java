package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        var number = scanner.nextInt();
        System.out.println("Вы ввели: " + number);
        var str = Integer.toString(number);
        var reversed = new StringBuilder(str).reverse().toString();
        number = Integer.parseInt(reversed);
        if (str.length() != 3)
            System.out.println("Число не является трёхзначным");
        else
            System.out.println("Число после перестановки: " + number);
    }
}