package org.example;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;

public class Main {
    static void main() {
        /*
        IO.println("Hello and welcome!");
        int a = 5;
        int b = a;
        b = 7;
        int[] a = {1, 2, 3};
        int[] b = a;
        b[0] = 99;
        System.out.println(a);

        boolean isValid = true;
        boolean bigger = 10 > 5; // true
        if (isValid && !bigger) {}

        byte b = 127; //Один байт занимает (от -128 до 127)
        short s = 0; //-32768 >> 32767
        int i = 60000; //-2 147 483 648 >> 2 147 483 647
        long l = 1_000_000_000_000_000L; //-9 223 372 036 854 775 808 >> 9 223 372 036 854 775 807

        String s = new String("abc"); //Объект в куче
        s = null; //Ссылок больше нет, сборщик мусора удалит переменную из памяти

        boolean isValid = true;
        boolean bigger = 10 > 5; // true
        if (isValid && !bigger) {}

        int hex = 0xFF; //255
        int bin = 0b1010; //10

        int x = Integer.MAX_VALUE;
        x += 1; //Переполнение произойдёт без ошибки!!!
        System.out.println(x); //Выведет минимальное значение int-а

        char letter = 'A'; //16 бит: Код UTF-16
        System.out.println((int)letter); //65

        char next = (char)(letter + 1); //'B'
        int digit = '7' - '0'; //7 - так парсят цифры

        //Сравнение дробных чисел
        System.out.println(0.1 + 0.2); //0.30000000000000004
        System.out.println(0.1 + 0.2 == 0.3); //false

        double a = 0.1, b = 0.2;
        System.out.println(Math.abs(a + b - 0.3) < 1e-9); //true - эпсилон

        //Преобразование без кастов:
        //byte -> short -> int -> long -> float -> double

        //Касты:
        int n = 257;
        byte b = (byte)n; //1 - биты отрезаны
        int m = (int)2.99; //2 - Усечение к нулю

        long r = Math.round(3.99); //4 - округление

        char c = 'A';
        int code = c;
        char back = (char)(c + 1); //'B'

        Math.max(3, 7);  //7
        Math.min(3, 7);  //3
        Math.abs(-42);   //42
        Math.pow(2, 10); //1024.0
        Math.sqrt(16);   //4.0
        Math.round(2.5); //3
        Math.floor(2.7); //2
        Math.ceil(2.1);  //3.0

        BigInteger a = new BigInteger("9999999999999999999999999999999"); //Безразмерный, ссылочный тип.
                                                                              // Работает на массивах
        BigInteger b = BigInteger.TEN;

        BigInteger sum = a.add(b); //Оператора + нет
        BigInteger prod = a.multiply(b);

        BigDecimal price = new BigDecimal("0.10");
        BigDecimal bad = new BigDecimal(0.1); //Так не делать

        System.out.println(price); //0.10
        System.out.println(price); //0.1000000000...

        String a = "Java"; //Литерал - без new
        String b = "Java";
        System.out.println(a == b); //true, так как при компиляции ссылка будет одна на объект

        String c = a.toUpperCase(); //Создаёт таким образом копию на a
        System.out.println(c); //JAVA. a не будет тронуто
         */

    }

    /*
    static void addFirst(int[] data) {
        data[0] += 1;
    }

    int[] scores = {10, 20};
    addFirst(scores);
    System.out.println(scores[0]); //11!
     */
}
