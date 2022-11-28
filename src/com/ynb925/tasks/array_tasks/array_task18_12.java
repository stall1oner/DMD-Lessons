package com.ynb925.tasks.array_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.12 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */

public class array_task18_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите число для размера массива: ");
        int[] numArr = new int[scanner.nextInt()];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(100, 1000);
            System.out.print(numArr[i] + " ");
        }
    }
}
/*      Мой говнокод
        int[] values = new int[1];
        int length = values.length;
        length = scanner.nextInt();
        values = new int[length];



        Random random = new Random();
        int rnd = random.nextInt(100,999);


        for (int i = 0; i < length; i++) {
            values[i] = rnd;
            rnd += rnd;
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }*/