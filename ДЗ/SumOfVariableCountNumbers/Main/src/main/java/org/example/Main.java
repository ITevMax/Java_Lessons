package org.example;

public class Main {
    static void main() {
        var numbers = new int[]{5, 10, 15, 20};
        System.out.println(sum(numbers));
    }

    static int sum(int ... numbers) {
        var sum = 0;
        for (var number : numbers) sum += number;
        return sum;
    }
}