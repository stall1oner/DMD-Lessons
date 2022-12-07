package com.ynb925.tasks.array_tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Задание 18.18 Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива следующим образом:
 * в первой строке -значения из первой половины массива, начиная с «начала));
 * во второй строке -значения из второй половины массива, начиная с «КОНЦЮ).
 */
public class Array_task18_18 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random rnd = new Random();
        System.out.println("Enter array size");

        int[] newArr = new int[Integer.parseInt(reader.readLine())];

        int halfArrSize = newArr.length / 2;

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = rnd.nextInt(10, 100);
        }

        for (int i = 0; i < halfArrSize; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
        for (int i = newArr.length - 1; i > halfArrSize - 1; i--) {
            System.out.print(newArr[i] + " ");
        }
    }
}
