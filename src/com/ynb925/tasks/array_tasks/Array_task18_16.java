package com.ynb925.tasks.array_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.16 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.  После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * • в первой строке -четные значения, содержащиеся в массиве;
 * • во второй строке -нечетные значения, содержащиеся в массиве.
 * wrk cycle count:
 * 5
 * print all arr nums
 * index: 0| 39
 * index: 1| 71
 * index: 2| 31
 * index: 3| 51
 * index: 4| 90
 * <p>
 * print res: even nums
 * evenindex: 4| 90
 * <p>
 * print res: odd nums
 * oddindex: 0| 39
 * oddindex: 1| 71
 * oddindex: 2| 31
 * oddindex: 3| 51
 */
public class Array_task18_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter Num");

        int[] newArr = new int[scanner.nextInt()];

        for (int i = 0; i < newArr.length; i++) {              //  make arr by random !!!
            newArr[i] = rnd.nextInt(10, 100);
            System.out.println(i + " : " + newArr[i]);
        }
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {         //  check even nums
            if (newArr[i] % 2 == 0) {
                System.out.print("Even" + i + " : " + newArr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {            // check odd nums
            if (newArr[i] % 2 != 0) {
                System.out.print("Odd" + i + " : " + newArr[i] + " ");
            }
        }
    }
}