package com.ynb925.tasks.array_tasks;

import java.util.Random;

/**
 * Задание 19.17 Напишите метод, который получает в качестве параметра массив и заполняет
 * его положительными случайными двузначными числами так,
 * чтобы первая и вторая половины массива были идентичными.
 * In.   {0,0,0,0,0,0,0}
 * Out {15, 22, 88, 12, 15, 22, 88}
 */
public class Array_task19_17 {
    public static void main(String[] args) {
        int[] array = new int[10];
        arrayMethod(array);
    }

    public static void arrayMethod(int[] array) {
        Random random = new Random();
        int arrayHalf = array.length / 2;

        for (int i = 0; i < arrayHalf; i++) {
            array[i] = random.nextInt(10, 100);
        }

        for (int i = 0,j = arrayHalf; i < arrayHalf; i++,j++) {
            array[j] = array[i];
        }


        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
