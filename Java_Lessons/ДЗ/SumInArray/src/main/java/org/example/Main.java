package org.example;

import java.util.Random;

public class Main {
    static void main(String[] args) {
        var random = new Random();
        var array = new int[10];
        for (var i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }

        var sum = 0;
        for (var number : array) {
            System.out.printf("%d ", number);
            sum += number;
        }

        System.out.printf("\nСумма элементов: %d\n", sum);
        System.out.printf("Среднее арифметическое: %.1f\n", (double)sum / array.length);
    }
}