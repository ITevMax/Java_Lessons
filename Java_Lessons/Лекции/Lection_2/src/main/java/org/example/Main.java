package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    static void main() {
        /*
        Классы-обёртки
        int     => Integer
        long    => Long
        double  => Double
        boolean => Boolean
        byte    => Byte
        short   => Short
        char    => Character
        float   => Float

        List<int> <-- Нельзя!!!
        List<Integer>
        Integer.ParseInt();
        Есть возможность у обёрток возвращать null
         */

        Integer x = 5; // = Integer.valueOf(5); <- Autoboxing
        x++; //
        int y = x;

        List<Integer> nums = new ArrayList<Integer>(); //Не int!!!
        nums.add(42); //boxing и тут

        Integer a = 127, b = 127;
        System.out.println(a == b); //true

        Integer c = 128, d = 128;
        System.out.println(c == d); //false - два объекта!
        System.out.println(c.equals(d)); //true - сравнивать только так!!!

        int n = Integer.parseInt("42"); //Строка => число
        double = Double.parseDouble("3.14");

        String s = String.valueOf(n); //Число => строка
        String r = String.format("n=%d, d=%.2f", n, d);

        int[] numbers;
        String[] args;
        boolean bits;

        int[] numbers = new int[100];
        String[] args = new String[1];
        boolean[] bits = new boolean[0];

        int[] numbers = new int[] {1, 2, 3, 4, 5};
        boolean[] booleans = new boolean[]{true, false};
        char[] digits = {
                '0', '1', '2', '3', '4',
                '5', '6', '7', '8', '9'
        };

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = {{1, 2}, {3, 4}};

        int[] firstRow = matrix2[0];
        int someElement = matrix2[1][1];

        int[][] triangle = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12},
                {13, 14},
                {15}};

        int secondRowLength = triangle[1].length;


        maxArray(new int[] {1, 2, 3});
        maxVarargs(1, 2, 3);

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        boolean equals1 = Arrays.equals(a, b); //Так работает для одномерных массивов
        boolean equals1 = Arrays.deepEquals(a, b); //Так работает для многомерных массивов

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));


        String hello = " Hello ";
        String specialChars = "\r\n\t \"\\ ";
        String empty = "";

        char[] charArray = {'a', 'b', 'c'};
        String string = new String(charArray);
        char[] charsFromString = string.toCharArray();

        String zeros = "\u0000 \u0000";


        String s = "СтрокиНеИзменяемы";

        int length = s.length();
        char firstChar = s.charAt(0);
        boolean endsWithTable = s.endsWith("table");
        boolean containsIs = s.contains("Is");

        String substring = s.substring(0, 6) //<= Является новым объектом!
        String afterReplace = s.replace("Неи", "И");
        String allCapitals = s.toUpperCase();

        String hello = "Hello";
        String world = "world!";

        String helloWorld = hello + world;

        StringBuilder sb = new StringBuilder();
        sb.append(hello);
        sb.append(world);
        String helloWorld = sb.toString();

        boolean referenceEquals = s1 == s2; //Неправильно (если JIT-компиляция)
        boolean contentEquals = s1.equals(s2);
        boolean ignoreCase = s1.equalsIgnoreCase(s2);

        String s1 = "Hello";
        String s2 = "Hello";
        s1 == s2; //true

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        s3 == s4; //false!


        if (weatherIsGood) {
            walkInThePark();
        } else {
            learnJavaOnUlearn();
        }

        if (needReturn) return;

        //Предложение:
        if (weatherIsGood){
            System.out.println("Weather is good");
        } else{
            System.out.println("Weather is bad");
        }

        //Выражение:
        System.out.println("Weather is " + (weatherIsGood ? "good" : "bad"));


        switch (day){ //Сюда можно засовывать Enum, строки, числа, char-ы
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Другой день");
        }


        String dayType = switch (day) { //break не нужен при стрелочном синтаксисе.
            case 1, 2, 3, 4, 5 -> "Рабочий день"; //Появился в Java 14
            case 6, 7 -> "Выходной";
            default -> "Неизвестно";
        };

        String result = switch (day) {
            case 1 -> {
                System.out.println("Начало недели");
                yield "Понедельник":
            }
            case 2 -> "Вторник";
            default -> "Другой день";
        };

        //Java 21
        Object obj = "Hello";
        String result = switch (obj) {
            case Integer i -> "Число: " + i;
            case String s -> "Строка: " + s;
            case null -> "Null-объект";
            default -> "Неизвестно";
        };


        //Циклы
        while (haveTime() && haveMoney()) {
            goShopping();
        }

        do {
            goShopping();
        } while (haveTime() && haveMoney());


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (;;){ //Бесконечный цикл
            break;
        }

        String[] names = {"Анна", "Борис", "Виктор"};
        for (String name : names) {
            System.out.println(name);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 5;
        boolean found = false;

        outerLoop: for (int i = 0; i < matrix.length; i++) {
            for (int j; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    break outerLoop;
                }
                System.out.println("Проверяем: " + matrix[i][j]);
            }
        }

        System.out.println("Найдено: " + found);
    }
    static int maxArray (int[] numbers) {/*Some code*/}

    static int maxVarargs (int ... numbers) {/*Some code*/}

    int sum(int a, int b) {
        return a + b;
    }

    void printHello() {
        System.out.println("Hello");
    }

    int getNumber(boolean flag) {
        if (flag) {
            return 10;
        } else { //Обязателен!
            return 20;
        }
    }

    void validateUser(User user) {
        if (user == null) {
            return; //Выход, если пользователь null
        }
        if (user.getAge() < 18) {
            return; //Выход, если возраст меньше 18
        }

        processUser(user);
    }

    void processData(List<String> data) {
        if (data == null || data.isEmty()) {
            return; //Если нет данных - выходим сразу
        }

        for (String item : data) {
            //Сложная обработка
        }
    }
}