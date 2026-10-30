package org.example;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine().toLowerCase();
        Dictionary<Character, Integer> dict = new Hashtable<>();
        for (var letter : str.toCharArray()) {
            if (!Character.isAlphabetic(letter)) continue;
            if (dict.get(letter) != null)
                dict.put(letter, dict.get(letter) + 1);
            else
                dict.put(letter, 1);
        }

        var keys = dict.keys();

        while (keys.hasMoreElements()) {
            var key = keys.nextElement();
            System.out.printf("%c: %d\n", key, dict.get(key));
        }
    }
}