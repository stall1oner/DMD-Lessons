package com.ynb925.tasks.array_tasks;

/**
 * Задание 19.6
 * Напишите метод, который получает в качестве параметра массив, который выводит на экран
 * содержащиеся в нем значения в одну строку через пробел между значениями.
 */
public class Array_task19_6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayFunc(array);
    }

    private static void arrayFunc(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}