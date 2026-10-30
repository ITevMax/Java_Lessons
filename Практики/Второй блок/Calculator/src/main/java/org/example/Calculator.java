package org.example;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args){
        var scanner = new Scanner(System.in);
        while (true)
            System.out.println(calculate(scanner.nextLine()));
    }

    public static String calculate(String input) {
        var arr = input.split(" ");
        var isNumber = true;
        for (var s : (arr[0] + arr[2]).toCharArray())
            if (!(Character.isDigit(s) || s == '.' || s == '-')) {
                isNumber = false;
                break;
            }
        if (isNumber)
            return Double.toString(calculate(Double.parseDouble(arr[0]),
                    Double.parseDouble(arr[2]), arr[1]));
        else
            return calculate(arr[0], arr[2], arr[1]);
    }

    private static String calculate(String a, String b, String operation) {
        if (operation.equals("+")) return a + b;
        else {
            for (var letter : b.toCharArray()) {
                if (!a.contains(String.valueOf(letter))) throw new IllegalArgumentException();
                else
                    a = a.replaceFirst(String.valueOf(letter), "");
            }
            return a;
        }
    }

    private static double calculate(double a, double b, String operation) {
        switch (operation){
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "%": return a % b;
            default: return Double.NaN;
        }
    }

    public static int getNumbers(int a, int b) {
        var number = Math.abs(a + b);
        var str = Integer.toString(number);
        var numberOfEvens = 0;
        for (var ch : str.toCharArray()) {
            var digit = Integer.parseInt(String.valueOf(ch));
            if (digit % 2 == 0) numberOfEvens += 1;
        }
        return numberOfEvens;
    }

    public static String getMinimalType(String input) {
        if (input.length() <= 4 && Byte.MIN_VALUE <= Short.parseShort(input)
                && Short.parseShort(input) <= Byte.MAX_VALUE)
            return "Byte";
        else if (input.length() <= 6 && Short.MIN_VALUE <= Integer.parseInt(input)
                && Integer.parseInt(input) <= Short.MAX_VALUE)
            return "Short";
        else if (input.length() <= 11 && Integer.MIN_VALUE <= Long.parseLong(input)
                && Long.parseLong(input) <= Integer.MAX_VALUE)
            return "Int";
        else
            return "Long";
    }
}