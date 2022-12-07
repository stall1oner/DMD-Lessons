package com.ynb925.tasks.array_tasks;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.12 Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры. После заполнения класс должен
 * вывести на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */

public class Array_task_18_12tooMuchMethods {
    public static void main(String[] args) {
        random();
        System.out.println(random());


    }

    public static int arrayTask() {
        int[] values = {};
        int length = values.length;
        length = scannerInt();


        for (int i = 0; i < 5; i++) {

        }

        return length;
    }

    public static int scannerInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        return scanner.nextInt();
    }

    public static int random() {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
       // return random.nextInt(diff + 1);
        return random.nextInt(diff + 1);
    }

}
