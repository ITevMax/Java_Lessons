package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine().trim();
        var words = str.split("\s+");

        var maxLongWord = "";
        for (var word : words) {
            if (maxLongWord.length() < word.length()) maxLongWord = word;
        }

        System.out.printf("Самое длинное слово в предложении: %s длиной %d", maxLongWord, maxLongWord.length());
    }
}