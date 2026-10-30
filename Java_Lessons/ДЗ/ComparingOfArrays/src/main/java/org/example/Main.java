package org.example;

public class Main {
    static void main() {
        var array = new int[]{12, -5, 47, 3, 0, -81, -2};

        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;
        var maxIndex = 0;
        var minIndex = 0;
        for (var i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            } else if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.printf("Максимальное число равно %d по индексу %d\n", max, maxIndex);
        System.out.printf("Минимальное число равно %d по индексу %d\n", min, minIndex);
    }
}