package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.39
 * Напишите метод, который принимает в качестве параметра массив целых чисел и «переворачивает» его.
 * Например, если в качестве параметра получен массив 1, 3, 6, 2, 7, после окончания работы метода
 * содержимое массива будет 7, 2, 6, 3, 1.
 */
public class Array_task19_39 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayReverser(array);
    }

    public static void arrayReverser(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
