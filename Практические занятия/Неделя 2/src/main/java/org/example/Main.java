package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        /*int[] array = new int[10];
        array = new int[]{1, 2, 3, 4, 5};
        String[] array2 = new String[10];
        Random random = new Random();
        //array[0] = 10;
        //array[1] = 20;
        for (int i = 0; i < array.length; i++) {
            *//*array[i] = i * 10;
            array[i] = random.nextInt(0, 10);*//*
            array2[i] = String.format("%d. %d", i + 1, random.nextInt(10, 20));
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        for (int item : array) {
            list.add(item);
        }


        */
        /*
        for (int i; i < list.length; i++){
            list.add(random.nextInt());
        }
        */

        /*int[] nums = {4, 8, 15, 16, 23, 42};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int number : nums) {
            if (max < number) max = number;
            if (min > number) min = number;
            sum += number;
        }

        for (int i = 0, j = nums.length - 1; i < j; i++, j--){
            //
        }

        System.out.printf("Максимум: %d\nМинимум: %d\nСумма: %d\nСреднее арифметическое: %.2f", max, min, sum, (double)sum / nums.length);*/

        /*String sentence = " Java    это    круто ".trim();
        String[] array = sentence.split("\\s+");
        System.out.println(array.length);*/
/*
        String str = "";
        for (int i = 0; i < 1000; i++) {
            str += i; //Долго и неправильно
        }
        System.out.println(str);
        */
        /*
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++){
            builder.append(i)
        }
        System.out.println(builder);*/
/*
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            int stringSum = 0;
            int columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                stringSum += matrix[i][j];
                columnSum += matrix[i][j];
            }
            System.out.println(stringSum);
            System.out.println(columnSum);
            System.out.println();
        }*/
/*
        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();
        int secret = random.nextInt(1,101);
        while (true){
            int input = scanner.nextInt();
            if (input > secret) System.out.println("Твоё число больше");
            if (input < secret) System.out.println("Твоё число меньше");
            if (input == secret) {
                System.out.println("Ура!!! Ты угадал!!!");
                break;
            }
        }*/

        //average(new int[] {1, 2, 3, 4, 5});
        //average(1, 2, 3, 4, 5);

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(a.equals(b));
    }

    static double average(int ... marks) {
        double sum = 0;
        for (int item : marks){
            sum += item;
        }
        return sum / marks.length;
    }
}
