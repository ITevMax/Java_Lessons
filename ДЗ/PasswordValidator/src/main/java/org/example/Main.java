package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        var password = scanner.nextLine();
        var isLongerThan8 = password.length() >= 8;
        var containsDigit = false;
        var containsUpperCase = false;
        for (var symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) containsDigit = true;
            if (Character.isUpperCase(symbol)) containsUpperCase = true;
        }
        if (isLongerThan8 && containsDigit && containsUpperCase)
            System.out.println("Пароль валиден");
        else {
            System.out.println("Пароль не валиден");
            if (!isLongerThan8)
                System.out.println("Пароль меньше 8 символов!");
            if (!containsDigit)
                System.out.println("Нет цифр!");
            if (!containsUpperCase)
                System.out.println("Нет заглавных букв!");
        }
    }
}