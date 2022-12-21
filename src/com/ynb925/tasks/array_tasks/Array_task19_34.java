package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.34 Напишите метод, который принимает в качестве параметра массив целых чисел
 * и возвращает число ячеек массива, содержащих значения большие среднего арифметического массива.
 */
public class Array_task19_34 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        algebraicMiddle(array);
    }

    public static void algebraicMiddle(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int mid = sum / array.length;
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > mid) answer++;
        }
        System.out.println(answer);
    }
}
