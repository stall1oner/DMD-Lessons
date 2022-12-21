package com.ynb925.tasks.array_tasks;

/**
 * /**
 * Задание 19.40 Напишите метод, который принимает в качестве параметра массив целых чисел и возвращает новый массив,
 * который содержит те же значения, что и массив, полученный в качестве параметра, но в обратном порядке. Например,
 * если в качестве параметра получен массив 1, 3, 6, 2, 7 -метод возвращает массив 7, 2, 6, 3, 1.
 */
public class Array_task19_40 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] reverseArr = new int[array.length];

        for (int i = 0, j = reverseArr.length; i < array.length; i++, j--) {
            reverseArr[j - 1] = array[i];
        }
        for (int i = 0; i < reverseArr.length; i++) {
            System.out.print(reverseArr[i] + " ");
        }
    }
}
