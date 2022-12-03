package com.ynb925.tasks.array_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.15 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -значения из четных ячеек массива;
 * • во второй строке -значения из нечетных ячеек массива.
 * <p>
 * write size of array:
 * 4
 * test0| 91
 * test1| 71
 * test2| 34
 * test3| 76
 * <p>
 * 0| 91
 * 2| 34
 * <p>
 * 1| 71
 * 3| 76
 */
public class Array_task18_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Enter num");
        int[] newArr = new int[scanner.nextInt()];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rnd.nextInt(0, 99);
            System.out.println(newArr[i]);
        }
        System.out.println();
        for (int i = 0; i < newArr.length; i += 2) {
            System.out.println(newArr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < newArr.length; i += 2) {
            System.out.println(newArr[i] + " ");
        }

    }
}