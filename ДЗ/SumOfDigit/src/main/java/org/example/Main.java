package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        var number = scanner.nextInt();
        var stringNumber = Integer.toString(number);
        var sum = 0;
        for (var i = 0; i < stringNumber.length(); i++){
            sum += Character.getNumericValue(stringNumber.charAt(i));
        }
        System.out.printf("Сумма цифр числа %d равна %d", number, sum);
    }
}