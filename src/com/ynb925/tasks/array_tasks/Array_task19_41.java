package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.41 Напишите метод, который принимает в качестве параметра массив целых чисел и возвращает новый массив
 * с переставленными первой и второй половинами.
 * Например, если в качестве параметра получен массив 1, 3, 6, 8, 2, 7
 * -метод возвращает массив 8, 2, 7, 1, 3, 6.
 */
public class Array_task19_41 {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 8, 2, 7,};
        arrayHalfFunc(array);
    }

    public static void arrayHalfFunc(int[] array) {
        int arrayHalf = array.length / 2;
        int[] newArray = new int[array.length];

        for (int i = 0, j = array.length; i < arrayHalf; i++, j--) {
            newArray[i + arrayHalf] = array[i];
            newArray[i] = array[arrayHalf + i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}

