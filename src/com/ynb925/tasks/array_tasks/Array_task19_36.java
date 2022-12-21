package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.36 Напишите метод, который принимает в качестве параметра
 * массив целых чисел и возвращает максимальное значение массива.
 */
public class Array_task19_36 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrayMaxValue(array);
    }

    public static void arrayMaxValue(int[] array) {
        int maxValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

    }
}

/*

    public static int biggestValue(int[] array) {
        int bigValue = array[0];

        for (int j : array) {
            if (bigValue < j) {
                bigValue = j;
            }
        }
        return bigValue;
    }
}
*/
