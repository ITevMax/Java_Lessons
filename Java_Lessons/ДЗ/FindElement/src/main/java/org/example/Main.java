package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        var numberFind = scanner.nextInt();

        var matrix = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

        var isFind = false;
        outerLoop: for (var numbers : matrix) {
            for (var number : numbers) {
                if (number == numberFind) {
                    isFind = true;
                    break outerLoop;
                }
            }
        }

        System.out.printf("Число %d " + (isFind ? "" : "не ") + "найдено!", numberFind);
    }
}