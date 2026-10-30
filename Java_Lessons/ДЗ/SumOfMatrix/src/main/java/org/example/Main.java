package org.example;

public class Main {
    static void main() {
        var matrix = new int[][]{
                                    {0, 5, 10, 15},
                                    {20, 25, 30, 35},
                                    {40, 45, 50, 55},
                                    {60, 65, 70, 75}
                                };

        var sum = 0;
        for (var numbers : matrix) {
            for (var number : numbers) {
                sum += number;
                System.out.print(number + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма элементов матрицы равна " + sum);
    }
}